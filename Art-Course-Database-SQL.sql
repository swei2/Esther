/******************************************************************************/
/*																				                                    */
/*	Kroenke, Auer, Vandenberg, and Yoder			*/
/*	Database Concepts (8th Edition) Chapter 01		         	*/
/*															                                      			  */
/*  Art_Course_Database Queries													                      */
/*																				                                    */
/*	These are the Oracle Database XE SQL code solutions	     		        	*/
/*																				                                    */
/******************************************************************************/

/*****   Art Course Database CREATE TABLE statements   *******************************/

/*       See the files:	 DBC-e08-ODB-Art-Course-Database-Create-Tables.sql  	*/

/*****   Art Course Database INSERT statements   *************************************/

/*       See the files:	 DBC-e08-ODB-Art-Course-Database-Insert-Data.sql		  */

/*****   CUSTOMER DATA   ******************************************************/

SELECT * FROM CUSTOMER;

/*****   COURSE DATA   ********************************************************/

SELECT * FROM COURSE;

/*****   ENROLLMENT DATA   ****************************************************/

SELECT * FROM ENROLLMENT;

/*****   Art Course List Query [Figure 1-15]   ********************************/

SELECT	 CUSTOMER.CustomerLastName,
         CUSTOMER.CustomerFirstName, CUSTOMER.Phone,
         COURSE.CourseDate, ENROLLMENT.AmountPaid,
		     COURSE.Course, COURSE.Fee
FROM	   CUSTOMER, ENROLLMENT, COURSE
WHERE	   CUSTOMER.CustomerNumber=ENROLLMENT.CustomerNumber
	 AND   COURSE.CourseNumber=ENROLLMENT.CourseNumber;

/*****   Amount Due Query [Figure 1-16]   *************************************/

SELECT	 CUSTOMER.CustomerLastName,
         CUSTOMER.CustomerFirstName,CUSTOMER.Phone,
    		 COURSE.Course, COURSE.CourseDate, COURSE.Fee, ENROLLMENT.AmountPaid,
	       (COURSE.Fee-ENROLLMENT.AmountPaid) AS AmountDue
FROM	   CUSTOMER JOIN ENROLLMENT
			     ON CUSTOMER.CustomerNumber = ENROLLMENT.CustomerNumber
    		 JOIN COURSE
		     	ON ENROLLMENT.CourseNumber = COURSE.CourseNumber
WHERE    (COURSE.Fee - ENROLLMENT.AmountPaid)>0
ORDER BY CUSTOMER.CustomerLastName;

/*****   Course Parameter Query [Figure 1-23]   *******************************/

SELECT	 CUSTOMER.CustomerLastName,
         CUSTOMER.CustomerFirstName,
         COURSE.Course, COURSE.CourseDate, COURSE.Fee, ENROLLMENT.AmountPaid,
	(COURSE.Fee-ENROLLMENT.AmountPaid) AS AmountDue
FROM	   CUSTOMER, ENROLLMENT, COURSE
WHERE	   CUSTOMER.CustomerNumber=ENROLLMENT.CustomerNumber
	 AND   COURSE.CourseNumber=ENROLLMENT.CourseNumber
	AND COURSE.Course LIKE '%&EnterPartOfCourseName%';


/******************************************************************************/








