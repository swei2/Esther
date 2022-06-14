SELECT * FROM CUSTOMER;

/*****   COURSE DATA   ********************************************************/

SELECT * FROM COURSE;

/*****   ENROLLMENT DATA   ****************************************************/

SELECT * FROM ENROLLMENT;

/*****   Art Course List Query */

SELECT	 CUSTOMER.CustomerLastName,
         CUSTOMER.CustomerFirstName, CUSTOMER.Phone,
         COURSE.CourseDate, ENROLLMENT.AmountPaid,
		     COURSE.Course, COURSE.Fee
FROM	   CUSTOMER, ENROLLMENT, COURSE
WHERE	   CUSTOMER.CustomerNumber=ENROLLMENT.CustomerNumber
	 AND   COURSE.CourseNumber=ENROLLMENT.CourseNumber;

/*****   Amount Due Query */

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

/*****   Course Parameter Query */

SELECT	 CUSTOMER.CustomerLastName,
         CUSTOMER.CustomerFirstName,
         COURSE.Course, COURSE.CourseDate, COURSE.Fee, ENROLLMENT.AmountPaid,
	(COURSE.Fee-ENROLLMENT.AmountPaid) AS AmountDue
FROM	   CUSTOMER, ENROLLMENT, COURSE
WHERE	   CUSTOMER.CustomerNumber=ENROLLMENT.CustomerNumber
	 AND   COURSE.CourseNumber=ENROLLMENT.CourseNumber
	AND COURSE.Course LIKE '%&EnterPartOfCourseName%';








