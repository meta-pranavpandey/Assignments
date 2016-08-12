/* SELECT DATABSE TO USE */
USE LIS;

/* Insert data into table members */
INSERT INTO members(member_name,addressline1,adddessline2,category) VALUES ("Pranav","Lucknow","Uttar Pradesh","Premium Member");
INSERT INTO members(member_name,addressline1,adddessline2,category) VALUES ("Rohit","Jaipur","Uttar Pradesh","Premium Member");
INSERT INTO members(member_name,addressline1,adddessline2,category) VALUES ("Nikhil","Jaipur","Uttar Pradesh","Premium Member");

/* Insert data into table subjects */
INSERT INTO subjects(subject_name) VALUES ("Science");
INSERT INTO subjects(subject_name) VALUES ("Maths");
INSERT INTO subjects(subject_name) VALUES ("English");
INSERT INTO subjects(subject_name) VALUES ("Hindi");

/* Insert data into table publishers */
INSERT INTO publishers(publisher_name,publisher_id) VALUES ("Sanjeev Publications","1");
INSERT INTO publishers(publisher_name,publisher_id) VALUES ("S.Chand Publications","2");
INSERT INTO publishers(publisher_name,publisher_id) VALUES ("TMH Publications","3");

/* Insert data into table authors */
INSERT INTO authors(author_name,author_id) VALUES ("V. Ramchandran","1");
INSERT INTO authors(author_name,author_id) VALUES ("Kuldeep Chakraborty","2");
INSERT INTO authors(author_name,author_id) VALUES ("Rashmi Bansal""3");

/* Insert data into table titles */
INSERT INTO titles(title_name,subject_id,publisher_id) VALUES ("The Everday Guide",2,3);
INSERT INTO titles(title_name,subject_id,publisher_id) VALUES ("The Monk who sold his Ferrari",4,2);
INSERT INTO titles(title_name,subject_id,publisher_id) VALUES ("Rich Da, Poor Dad",1,1);

/* Insert data into table books */
INSERT INTO books(title_id,purchase_date,price,status) VALUES (1,'2014/05/18',599,"available");
INSERT INTO books(title_id,purchase_date,price,status) VALUES (2,'2014/06/11',235,"not available");
INSERT INTO books(title_id,purchase_date,price,status) VALUES (1,'2015/02/18',485,"available");

/* Insert data into table book_issue */
INSERT INTO book_issue(issue_date,accession_no,member_id,due_date) VALUES ('2014/05/21',1,2,'2014/05/29');
INSERT INTO book_issue(issue_date,accession_no,member_id,due_date) VALUES ('2014/06/20',2,2,'2014/07/29');
INSERT INTO book_issue(issue_date,accession_no,member_id,due_date) VALUES ('2015/03/18',3,1,'2015/03/28');

/* Insert data into table title_author */
INSERT INTO title_author(title_id,author_id) VALUES (1,2);
INSERT INTO title_author(title_id,author_id) VALUES (2,1);
INSERT INTO title_author(title_id,author_id) VALUES (3,2);

/* Insert data into table book_return */
INSERT INTO book_return(return_date,accession_no,member_id,issue_date) VALUES ('2014/05/27',1,2,'2014/05/21');
INSERT INTO book_return(return_date,accession_no,member_id,issue_date) VALUES ('2014/07/29',2,2,'2014/06/20');
 
/* Update data of column adddessline2 of table members */
SET SQL_SAFE_UPDATES = 0;
UPDATE members SET adddessline2="Jaipur";

/* Update data of column adddessline1 of table members WHERE category = 'Premium Member'*/
UPDATE members SET addressline1 = 'EPIP, Sitapura' WHERE category = 'Premium Member';

/* Remove the foriegn key constraints */
SET foreign_key_checks = 0;

/* Delete all rows from publishers table */
TRUNCATE TABLE publishers;

/* Re-implement the foriegn key constraints */
SET foreign_key_checks = 1;

/* Insert the sample data back in Publishers table using substitution variables */
SET @name="Oxford Publications";
INSERT INTO publishers(publisher_name) VALUES (@name);

SET @name="Raining Publications";
INSERT INTO publishers(publisher_name) VALUES (@name);

SET @name="Meta Publications";
INSERT INTO publishers(publisher_name) VALUES (@name);

/* Remove the foriegn key constraints */
SET foreign_key_checks = 0;

/* Delete those rows of Titles table belonging to Publisher with publisher_id = 1 */
DELETE FROM titles WHERE publisher_id = 1;

/* Re-implement the foriegn key constraints */
SET foreign_key_checks = 1;