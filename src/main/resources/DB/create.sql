--Now we have a place to store all our data when it comes time to test.
--We just need to instruct H2 to create a database for us with these tables.

SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS restaurants (
 id int PRIMARY KEY auto_increment,
 name VARCHAR,
 address VARCHAR,
 zipcode VARCHAR,
 phone VARCHAR,
 website VARCHAR,
 email VARCHAR
);

CREATE TABLE IF NOT EXISTS foodtypes (
 id int PRIMARY KEY auto_increment,
 name VARCHAR
);

CREATE TABLE IF NOT EXISTS reviews (
 id int PRIMARY KEY auto_increment,
 writtenby VARCHAR,
 content VARCHAR,
 rating VARCHAR,
 restaurantid INTEGER
);

CREATE TABLE IF NOT EXISTS restaurants_foodtypes (
 id int PRIMARY KEY auto_increment,
 foodtypeid INTEGER,
 restaurantid INTEGER
);