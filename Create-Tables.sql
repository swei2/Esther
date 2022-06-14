/****************************************************************************/
/*																			*/
/*	Kroenke, Auer, Vandenberg, and Yoder 					*/
/*	Database Concepts (8th Edition) Chapter 03 	       		*/
/*																			*/
/*	James River Jewelry Database Create Tables								*/
/*																			*/
/*	These are the Oracle Express 11g R2 SQL code solutions			*/
/*																			*/
/****************************************************************************/

CREATE TABLE CUSTOMER(
	CustomerID			Int				NOT NULL,
	LastName			Char(35)			NOT NULL,
	FirstName			Char(25)			NOT NULL,
	Phone				Char(12)			NULL,
	EmailAddress			VarChar(100)		NULL,
	CONSTRAINT			CUSTOMER_PK			PRIMARY KEY(CustomerID)
	);

CREATE SEQUENCE seqCID INCREMENT BY 1 START WITH 1;

CREATE TABLE ITEM(
	ItemNumber			Int					NOT NULL,
	ItemDescription		VarChar(255)		NOT NULL,
	Cost				Numeric(9,2)		NOT NULL,
	ArtistLastName		Char(35)			NULL,
	ArtistFirstName		Char(25)			NULL,
	CONSTRAINT			ITEM_PK				PRIMARY KEY(ItemNumber)
	);

CREATE SEQUENCE seqIID INCREMENT BY 1 START WITH 1;

CREATE TABLE PURCHASE(
	InvoiceNumber		Int					NOT NULL,
	InvoiceDate			Date				NOT NULL,
	PreTaxAmount		Numeric(9,2)		NOT NULL,
	CustomerID			Int					NOT NULL,
	CONSTRAINT			PURCHASE_PK			PRIMARY KEY(InvoiceNumber),
	CONSTRAINT 			PURCHASE_CUSTOMER_FK  FOREIGN KEY (CustomerID)
								REFERENCES CUSTOMER(CustomerID)
	);

CREATE SEQUENCE seqPID INCREMENT BY 1 START WITH 1001;

CREATE TABLE PURCHASE_ITEM (
	InvoiceNumber		Int					NOT NULL,
	InvoiceLineNumber	Int					NOT NULL,
	ItemNumber			Int					NOT NULL,
	RetailPrice			Numeric(9,2)		NOT NULL,
	CONSTRAINT 			PURCHASE_ITEM_PK	
							PRIMARY KEY(InvoiceNumber, InvoiceLineNumber),
	CONSTRAINT			PURCHASE_ITEM_PURCHASE_FK  
							FOREIGN KEY (InvoiceNumber)
								REFERENCES PURCHASE(InvoiceNumber)
										ON DELETE CASCADE,
	CONSTRAINT			PURCHASE_ITEM_ITEM_FK  FOREIGN KEY (ItemNumber)
								REFERENCES ITEM(ItemNumber)
	);

/********************************************************************/