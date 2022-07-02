#Select product with product name that begins with ‘C’.
select ProductId, ProductName, Price from myshop.products where ProductName Like 'C%';

#Select product with the smallest price.
select ProductId, ProductName, Price from myshop.products where Price = (select min(Price) from myshop.products); 

#Select cost of all products from the USA.
select ProductId, ProductName, Price, Country 
from myshop.products Join myshop.suppliers 
  On myshop.products.SupplierId = myshop.suppliers.SupplierId 
where myshop.suppliers.country="USA";

#Select suppliers that supply Condiments.
select ProductId, SupplierName, CategoryName 
from myshop.products 
Join myshop.suppliers 
  On myshop.products.SupplierId = myshop.suppliers.SupplierId
Join myshop.categories 
  On myshop.products.CategoryID = myshop.categories.CategoryID
where CategoryName="Condiments";

#Add to database new supplier with name: ‘Norske Meierier’, city: ‘Lviv’, country: ‘Ukraine’ which
#will supply new product with name: ‘Green tea’, price: 10, 
#and related to category with name: ‘Beverages’.
INSERT INTO myshop.suppliers (SupplierName, City, Country)
VALUES
	('Norske Meierier', 'Lviv', 'Ukraine');
    
INSERT INTO myshop.products (ProductName, SupplierId, CategoryId, Price)
VALUES
	('Green tea', 6, 6, 10.00);
    
INSERT INTO myshop.categories (CategoryName)
VALUES
	('Beverages');


