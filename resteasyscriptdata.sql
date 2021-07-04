/* creating the Database for RestEasy-Application*/
create database resteasydb;
use resteasydb;

 /* Select query to view the table */
select * from Customer;
select * from menu;
select * from address;
select * from restaurants;
select * from cart;
select * from Orders;
/* to show tables */
show tables;
/* inserting the values in Restaurants */
insert into restaurants values (1,"hyderabad","adigas",4,'veg'),
                                (2,"bhainsa","udipi",4.5,'non-veg'),
                                (3,"nirmal","rotighar",3.5,'veg'),
                                (4,"nizambad","punjabirasoi",5,'non-veg');
/* inserting data into menu */
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(5,"manchuria","non-veg","https://b.zmtcdn.com/data/dish_photos/10c/f9d49f08b5fdb355b78c0f55b7dc610c.jpg",250,3);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(4,"panner butter masala","veg","https://b.zmtcdn.com/data/dish_photos/ece/429ec6ddd1350367aae4aea48a031ece.jpg",290,1);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(5,"chicken manchuria","non-veg","https://b.zmtcdn.com/data/dish_photos/d64/e673e4ea04065492a29c71e19cb18d64.jpg",300,2);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(6,"chiclen","non-veg","https://b.zmtcdn.com/data/dish_photos/d64/e673e4ea04065492a29c71e19cb18d64.jpg",250,3);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(7,"panner","veg","https://b.zmtcdn.com/data/dish_photos/6b9/e7d7087eec9db28532e1b24e5f8706b9.jpg",280,4);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(8,"burger","non-veg","https://b.zmtcdn.com/data/pictures/chains/2/97262/924d6db7dee0bb80abc31170174d0df6_o2_featured_v2.jpg",400,1);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(9,"veg-role","veg","https://b.zmtcdn.com/data/dish_photos/363/66e764e26dd78aa8f1ea52bee8abc363.jpg?output-format=webp",150,3);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(10,"cutlet","veg","https://c.ndtvimg.com/2019-01/js2vgrc8_egg-bhurji-for-weight-loss_625x300_03_January_19.jpg",80,14);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(11,"fried-rice","veg","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0544Loq3O5I9LoO0LbgvRrFQHPch5ZHCImw&usqp=CAU",180,1);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(12,"egg-biryani","non-veg","https://b.zmtcdn.com/data/dish_photos/f3a/a01d4321d86a35e39c160b6285ec0f3a.jpg",250,2);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(13,"fish curry"," non-veg","https://b.zmtcdn.com/data/dish_photos/5b2/87b51dbe8d5ea0db8b9102b80cf235b2.jpg?output-format=webp",300,3);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(14,"geelebi","veg","https://b.zmtcdn.com/data/pictures/5/19207785/da19b0a9e52cb0fed252d1b353862f07_o2_featured_v2.jpg",150,1);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(15,"Geelebi","veg","https://b.zmtcdn.com/data/pictures/5/19207785/da19b0a9e52cb0fed252d1b353862f07_o2_featured_v2.jpg",150,4);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(16,"chicken","non-veg","https://www.bing.com/th?id=OIP.ErI0Yltnyv66YPpCnqCOHgHaE8&w=149&h=92&c=8&rs=1&qlt=90&o=6&dpr=2.25&pid=3.1&rm=2",150,1);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(17,"idly","veg","https://www.bing.com/th?id=OIP.AgaH5bQ7CUjx70jLjuM-WAHaE8&w=143&h=95&c=8&rs=1&qlt=90&o=6&dpr=2.25&pid=3.1&rm=2https://www.bing.com/th?id=OIP.AgaH5bQ7CUjx70jLjuM-WAHaE8&w=143&h=95&c=8&rs=1&qlt=90&o=6&dpr=2.25&pid=3.1&rm=2",100,2);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(18,"chicken biryani","non-veg","https://www.bing.com/th?id=OIP.ErI0Yltnyv66YPpCnqCOHgHaE8&w=149&h=92&c=8&rs=1&qlt=90&o=6&dpr=2.25&pid=3.1&rm=2",200,3);
insert into menu (food_id,item_name,category,image,price,restaurants_restaurantid) values(19,"halwa","veg","https://www.bing.com/th?id=AMMS_5733c484c89debb8e0d1a63b3c55310f&w=197&h=118&c=7&rs=2&qlt=80&o=6&cdv=1&dpr=2.25&pid=16.1",160,4);
 
 




