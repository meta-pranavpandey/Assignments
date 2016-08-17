/* Selecting the database */
USE LIS;

/* To display name of those members who belong to the category as to 
 * which member 'Jon Snow' belongs. Use subquery */
 SELECT m.member_name AS 'Member Name' FROM members m WHERE m.category = 
    (SELECT category FROM members c WHERE c.member_name = 'Jon Snow');

/* To display information on the books that have not been returned till date. 
 * The information should include issue date, title name, member name 
 * and due date. Use Corelated query */
 SELECT bi.issue_date AS 'Issue Date', t.title_name AS 'Title name',
    m.member_name AS 'Member Name', bi.due_date AS 'Due Date' FROM book_issue bi
    INNER JOIN members m ON bi.member_id = m.member_id
    INNER JOIN books b ON bi.accession_no = b.accession_no
    INNER JOIN titles t ON b.title_id = t.title_id
    WHERE (bi.issue_date, bi.accession_no, bi.member_id) NOT IN
    (SELECT br.issue_date, br.accession_no, br.member_id FROM book_return br);

/* To display information on the books that have been returned after 
 * their due dates. The information should include issue date, title name,
 * member name and due date. Use Corelated query */
 SELECT bi.issue_date AS 'Issue Date', t.title_name AS 'Title name',
    m.member_name AS 'Member Name', bi.due_date AS 'Due Date' FROM book_issue bi
    INNER JOIN members m ON bi.member_id = m.member_id
    INNER JOIN books b ON bi.accession_no = b.accession_no
    INNER JOIN titles t ON b.title_id = t.title_id
    WHERE (bi.issue_date, bi.accession_no, bi.member_id) IN
    (SELECT br.issue_date, br.accession_no, br.member_id FROM book_return br
        WHERE TIMESTAMPDIFF(DAY, bi.due_date, br.return_date) > 0);

/* To display information of those books whose price is equal to the 
 * booksmost expensive book purchase so far */
 SELECT b.accession_no AS 'Book Id', t.title_name AS 'Title Name'
    FROM books b
    INNER JOIN titles t ON b.title_id = t.title_id
    WHERE b.price = (SELECT MAX(price) FROM books);
    
/* To display the second maximum price of a book */
SELECT MAX(price) AS 'Second Max Price' FROM books
    WHERE price != (SELECT MAX(price) FROM books);