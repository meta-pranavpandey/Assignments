
/* Selecting the databse */
USE LIS;

/* To display information on books issued for more than 2 months.
 * It should include member name, member id, title name, accession number
 * issue date, due date and issued for how many months and be sorted on 
 * member name and then on title name. */
SELECT m.member_name AS 'Member Name', bi.member_id AS 'Member ID',
    t.title_name AS 'Title', bi.accession_no AS 'Accession Number',
    bi.issue_date AS 'Issue Date', bi.due_date AS 'Due Date', br.return_date AS 'Return Date',
    TIMESTAMPDIFF(MONTH, bi.issue_date, IFNULL(br.return_date, CURRENT_TIMESTAMP)) AS 'Number of Months' 
    FROM book_issue bi
    INNER JOIN members m ON bi.member_id = m.member_id
    INNER JOIN books b ON bi.accession_no = b.accession_no
    INNER JOIN titles t ON b.title_id = t.title_id
    LEFT JOIN book_return br ON br.accession_no = bi.accession_no 
        AND br.member_id = bi.member_id AND br.issue_date = bi.issue_date
    WHERE TIMESTAMPDIFF(MONTH, bi.issue_date, IFNULL(br.return_date, CURRENT_TIMESTAMP)) > 2 
    ORDER BY m.member_name, t.title_name;
    
/* To display those rows from members table having maximum length for member name */
SELECT member_name, LENGTH(member_name) AS 'Length' FROM members 
    WHERE LENGTH(member_name) = (SELECT MAX(LENGTH(member_name)) FROM members);
    
/* To display count of number of books issued so far */
SELECT COUNT(accession_no) FROM book_issue;