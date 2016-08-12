CREATE DATABASE IF NOT EXISTS lis;

USE lis;


/*Table to store the details about the subjects of the books */
CREATE TABLE IF NOT EXISTS subjects
(subject_id VARCHAR(20),
subject_name VARCHAR(20) NOT NULL,
PRIMARY KEY(subject_id)
);

/*Table to store details  of publishers */
CREATE TABLE IF NOT EXISTS publishers
(publisher_id  VARCHAR(20),
publisher_name VARCHAR(20) NOT NULL,
PRIMARY KEY (publisher_id)
);

/*Table to store details of the authors */
CREATE TABLE IF NOT EXISTS authors
(author_id VARCHAR(20),
author_name VARCHAR(20) NOT NULL,
PRIMARY KEY (author_id)
);

/*Table to store the details  of the members of the library*/
CREATE TABLE IF NOT EXISTS members
(member_id VARCHAR(20) ,
member_name VARCHAR(20) NOT NULL,
addressline1 VARCHAR(20) NOT NULL,
addressline2 VARCHAR(50) NOT NULL,
category VARCHAR(20) NOT NULL ,
PRIMARY KEY (member_id)
);


/*Table to store the details related to the title of the books */
CREATE TABLE IF NOT EXISTS titles
(title_id VARCHAR(20) ,
title_name VARCHAR(50) NOT NULL,
subject_id VARCHAR(20) NOT NULL, FOREIGN KEY (subject_id) REFERENCES subjects(subject_id),
publisher_id VARCHAR(20) ,FOREIGN KEY (publisher_id) REFERENCES publishers(publisher_id),
PRIMARY KEY (title_id)
);




/*Table to store the detail about the authors and related titles */

CREATE TABLE IF NOT EXISTS title_authors
(author_id VARCHAR(20) ,FOREIGN KEY (author_id) REFERENCES authors(author_id),
title_id VARCHAR(20) NOT NULL, FOREIGN KEY (title_id) REFERENCES titles(title_id),
PRIMARY KEY (title_id,author_id)
);

/*Table to store the book details */
CREATE TABLE IF NOT EXISTS books
(accession_no INT(20),
title_id VARCHAR(20) NOT NULL, FOREIGN KEY (title_id) REFERENCES titles(title_id),
purchase_date VARCHAR(20) NOT NULL,
price FLOAT(50)  NOT NULL,
status VARCHAR(20) NOT NULL,
PRIMARY KEY (accession_no)
);


/*Table to store returned book details */
CREATE TABLE IF NOT EXISTS book_return
(return_date DATE,
accession_no INT(20) NOT NULL, FOREIGN KEY(accession_no) REFERENCES books(accession_no),
member_id VARCHAR(20) NOT NULL,  FOREIGN KEY(member_id) REFERENCES members(member_id),
issue_date DATE NOT NULL,
PRIMARY KEY (return_date,accession_no,member_id)
);



/*Table to store the record of issued books to the specific members*/
CREATE TABLE IF NOT EXISTS book_issue
(issue_date DATE ,
accession_no INT(20) NOT NULL, FOREIGN KEY(accession_no) REFERENCES books(accession_no),
member_id VARCHAR(20) NOT NULL, FOREIGN KEY(member_id) REFERENCES members(member_id),
due_date DATE ,
PRIMARY KEY (issue_date,accession_no,member_id)
);


/* SHOW ALL TABLES IN DATABASE */
SHOW tables;

/* remove the foriegn key constraints */
SET FOREIGN_KEY_CHECKS = 0;

/*Alter the table and set default value*/
ALTER TABLE book_issue 

ALTER COLUMN issue_date 

SET DEFAULT '2016-10-09';



ALTER TABLE book_issue 

ALTER COLUMN due_date  

SET DEFAULT '2016-10-24';


/* DROP TABLE members */
DROP TABLE members;

/* re-implement the foriegn key constraints */
SET FOREIGN_KEY_CHECKS = 1;

/* SHOW ALL TABLES IN DATABASE */
SHOW tables;

/* CREATE TABLE members */
CREATE TABLE IF NOT EXISTS members
(member_id VARCHAR(20) ,
member_name VARCHAR(20) NOT NULL,
addressline1 VARCHAR(20) NOT NULL,
addressline2 VARCHAR(50) NOT NULL,
category VARCHAR(20) NOT NULL ,
PRIMARY KEY (member_id)
);

/* SHOW ALL TABLES IN DATABASE */
SHOW tables;

