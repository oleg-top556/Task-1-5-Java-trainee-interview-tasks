Use myshop;

CREATE TABLE products (
  ProductId int NOT NULL AUTO_INCREMENT,
  ProductName varchar(100),
  SupplierId int ,
  CategoryId int,
  Price double,
  FOREIGN KEY (SupplierId) REFERENCES suppliers (SupplierId),
  FOREIGN KEY (CategoryId) REFERENCES categories (CategoryId),
  PRIMARY KEY (ProductId)
) ;

CREATE TABLE suppliers (
  SupplierId int NOT NULL AUTO_INCREMENT,
  SupplierName varchar(100),
  City varchar(45),
  Country varchar(45),
  PRIMARY KEY (SupplierId)
) ;

CREATE TABLE categories (
  CategoryId int NOT NULL AUTO_INCREMENT,
  CategoryName varchar(100),
  Description varchar(150),
  PRIMARY KEY (CategoryId)
) ;

Use myshop;
INSERT INTO myshop.products (ProductName, SupplierId, CategoryId, Price)
VALUES
	('Chais', 1, 1, 18.00),
	('Chang', 1, 1, 19.00),
	('Aniseed Syrup', 1, 2, 10.00),
	('Chef Anton’s Cajun Seasoning', 2, 2, 22.00),
	('Chef Anton’s Gumbo Mix', 2, 2, 21.35);
    
INSERT INTO myshop.suppliers (SupplierName, City, Country)
VALUES
	('Exotic Liquid', 'London', 'UK'),
	('New Orleans Cajun Delights', 'New Orleans', 'USA'),
	('Grandma Kelly’s Homestead', 'Ann Arbor', 'USA'),
    ('Tokyo Traders', 'Tokyo', 'Japan'),
    ('Cooperativa de Quesos ‘Las Cabras’', 'Oviedo', 'Spain');
    
INSERT INTO myshop.categories (CategoryName, Description)
VALUES
	('Beverages', 'Soft drinks, coffees, teas, beers, and ales'),
    ('Condiments', 'Sweet and savory sauces, relishes, spreads, and seasonings'),
    ('Confections', 'Desserts, candies, and sweet breads'),
    ('Dairy Products', 'Cheeses'),
    ('Grains/Cereals', 'Breads, crackers, pasta, and cereal');