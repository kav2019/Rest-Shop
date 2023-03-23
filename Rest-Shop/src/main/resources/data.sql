
-- User
-- insert into users (username, password, email, balance, role, status) values ('Ivan', '12345', 'ivan@mail.ru', 100.0, 'admin', true);
-- insert into users (username, password, email, balance, role, status) values ('Pavel', '12345', 'pavel@mail.ru', 101.0, 'user', true);
-- insert into users (username, password, email, balance, role, status) values ('Marina', '12345', 'marina@mail.ru', 102.0, 'user', false);

-- Company
-- insert into company (title, description, logo, user_id) values ('PavelCompany', 'pavel shop', 'path', 2);
-- insert into company (title, description, logo, user_id) values ('PavelCompanyTwo', 'pavel shop two', 'path', 2);



-- Item
-- insert into item (title, description, price, quantiy, discount, review, rating, company) values ('PavelCompanyItem', 'pavel shop item', 52.4, 2, 0, 'good think', 4, 1);
-- insert into item (title, description, price, quantiy, discount, review, rating, company) values ('PavelCompanyItem2', 'pavel shop item2', 2, 2, 0, 'good think 2', 5, 2);
-- insert into item (title, description, price, quantiy, discount, review, rating, company) values ('PavelCompanyItem22', 'pavel shop item22', 2, 2, 0, 'good think 2', 5, 2);


-- Keyword
-- insert into keyword (item_id, word) values (1, 'pavel keyword');
-- insert into keyword (item_id, word) values (1, 'pavel keyword 2');
-- insert into keyword (item_id, word) values (1, 'pavel keyword 3');



-- Parametr
-- insert into parametr (item_id, key_parametr, value_parametr) values (1, 'pavel key parametr', 'pavel value parametr');
-- insert into parametr (item_id, key_parametr, value_parametr) values (1, 'pavel key parametr 2', 'pavel value parametr 2');


-- Order
insert into orders (item_id, user_id, datecreate) values (1, 1, now());
insert into orders (item_id, user_id, datecreate) values (1, 2, now());
insert into orders (item_id, user_id, datecreate) values (2, 2, now());