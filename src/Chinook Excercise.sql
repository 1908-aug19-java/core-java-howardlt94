select *
from "Employee";

select *
from "Employee"
where "LastName" = 'King';

select *
from "Album"
order by "Title" desc;

select *
from "Customer"
order by "City";

select *
from "Invoice" 
where "BillingAddress" like 'T%';

select max("Milliseconds")
from "Track";

select avg("Total")
from "Invoice";

select count("EmployeeId")
from "Employee";


INSERT INTO "Genre" ("GenreId", "Name") VALUES (26, N'GangsterRap');
INSERT INTO "Genre" ("GenreId", "Name") VALUES (27, N'SoftJazz');
INSERT INTO "Genre" ("GenreId", "Name") VALUES (28, N'Country');


INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES (9, N'Hoawrd', N'Andrew', N'General Manager', '1994/10/15', '2002/8/14', N'11120 Jasper Ave NW', N'Beijing', N'AB', N'China', N'T5K 2N1', N'+1 (626) 428-9482', N'+1 (626) 428-3457', N'howard@chinookcorp.com');
INSERT INTO "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email") VALUES (10, N'Tiff', N'Nancy', N'Sales Manager', 1, '1994/3/18', '2002/5/1', N'825 8 Ave SW', N'Virginia', N'AB', N'United States', N'T2P 2T3', N'+1 (403) 626-3443', N'+1 (626) 262-3322', N'tiffany@chinookcorp.com');


INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES (60, N'howard', N'tran', N'Riotur', N'Pra?a Pio X, 119', N'Rio de Janeiro', N'RJ', N'Brazil', N'20040-020', N'+55 (21) 2271-7000', N'+55 (21) 2271-7070', N'roberto.almeida@riotur.gov.br', 3);
INSERT INTO "Customer" ("CustomerId", "FirstName", "LastName", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId") VALUES (61, N'tiff', N'yu', N'Qe 7 Bloco G', N'Bras?lia', N'DF', N'Brazil', N'71020-677', N'+55 (61) 3363-5547', N'+55 (61) 3363-7855', N'fernadaramos4@uol.com.br', 4);


UPDATE "Customer"
SET "FirstName" = 'Robert', "LastName" = 'Walter'
WHERE "FirstName" = 'Aaron', "LastName" = 'Mitchell';

update "Customer"
set "LastName"= 'Walter'
where "LastName" = 'Mitchell';


select "Customer"."FirstName","Invoice"."CustomerId"
from "Customer"
inner join "Invoice"
on "Invoice"."CustomerId" = "Customer"."CustomerId";


select "Customer"."CustomerId", "Customer"."FirstName","Customer"."LastName","Invoice"."Total","Invoice"."InvoiceId"
from "Customer"
full outer join "Invoice"
on "Customer"."CustomerId" = "Invoice"."CustomerId";



select "Artist"."Name", "Album"."Title"
from "Artist"
right join "Album" on "Artist"."ArtistId" = "Album"."ArtistId";


select "Artist"."Name"
from "Artist"
cross join "Album"
order by "Artist"."Name";

select "Employee"."FirstName", "Invoice"."Total"
  

 select "Customer"."FirstName" || "Customer"."LastName" as Full_Name, "Invoice"."Total" as Total
 from "Customer"
 join "Invoice" on "Invoice"."CustomerId"= "Customer"."CustomerId";
 

select "Employee"."FirstName" || "Employee"."LastName" as Employee, MAX("Invoice"."Total") as TotalSales
from "Employee"
inner join "Customer" on "Customer"."FirstName" = "Employee"."FirstName"
inner join "Invoice" on "Customer"."CustomerId" = "Invoice"."CustomerId";
