/******************************************************************************/
/*																			                                      */
/*	Kroenke, Auer, Vandenberg, and Yoder 					*/
/*	Database Concepts (8th Edition) Chapter 03 	       		*/
/*																			                                      */
/*	Pet-Database Create Tables												                        */
/*																			                                      */
/*	These are the Oracle Express Database 11g R2 SQL code solutions	                    */
/*																			                                      */
/******************************************************************************/

CREATE TABLE PET_OWNER(
	OwnerID					        Int				      NOT NULL,
	OwnerLastName			      Char(25)		    NOT NULL,
	OwnerFirstName		      Char(25)		    NOT NULL,
	OwnerPhone				      Char(12)		    NULL,
	OwnerEmail				      VarChar(100)	  NULL,
	CONSTRAINT				      OWNER_PK		    PRIMARY KEY(OwnerID)
	);
  
CREATE SEQUENCE seqPOID INCREMENT BY 1 START WITH 1;   

CREATE TABLE BREED(
	BreedName				        VarChar(100)	  NOT NULL,
	MinWeight				        Numeric(4,1)	  NULL,
	MaxWeight				        Numeric(4,1)	  NULL,
	AverageLifeExpectancy	  Numeric(4,1)	  NULL,
	CONSTRAINT				      BREED_PK		    PRIMARY KEY(BreedName)
	);

CREATE TABLE PET (
	PetID					          Int				      NOT NULL,
	PetName					        Char (50)		    NOT NULL,
	PetType					        Char (25)		    NOT NULL,
	PetBreed				        VarChar(100)	  NULL,
	PetDOB					        Date            NULL,
	OwnerID					        Int				      NOT NULL,
	CONSTRAINT				      PET_PK			    PRIMARY KEY(PetID),
	CONSTRAINT 				      PET_OWNER_FK 	  FOREIGN KEY(OwnerID)
                REFERENCES PET_OWNER(OwnerID)
											ON DELETE CASCADE
	);
  
CREATE SEQUENCE seqPETID INCREMENT BY 1 START WITH 1;    

CREATE TABLE PET_3(
	PetID					          Int				      NOT NULL,
	PetName					        Char (50)		    NOT NULL,
	PetType					        Char (25)		    NOT NULL,
	PetBreed				        VarChar(100)	  NULL,
	PetDOB					        Date		        NULL,
	PetWeight				        Numeric(4,1)	  NULL,
	OwnerID					        Int				      NOT NULL,
	CONSTRAINT				PET_3_PK		          PRIMARY KEY(PetID),
	CONSTRAINT 				PET_3_OWNER_FK	FOREIGN KEY(OwnerID)
                REFERENCES PET_OWNER(OwnerID)
											ON DELETE CASCADE
	);

CREATE SEQUENCE seqPET3ID INCREMENT BY 1 START WITH 1;  

ALTER TABLE PET
	ADD CONSTRAINT PET_BREED_FK FOREIGN KEY(PetBreed)
		REFERENCES BREED(BreedName)
		/* 	ON UPDATE CASCADE not supported by Oracle and
		therefore omitted; can be done with triggers */ ;

ALTER TABLE PET_3
	ADD CONSTRAINT PET_3_BREED_FK FOREIGN KEY(PetBreed)
		REFERENCES BREED(BreedName)
		/* 	ON UPDATE CASCADE not supported by Oracle and
		therefore omitted; can be done with triggers */ ;




/********************************************************************************/