drop table orders;
drop table orderlist;
drop table purchase;
drop table "order";


create table orders(
item_id char(10),
ocode char(10),
amount number,
primary key(item_id, ocode),
foreign key(ocode) references orderlist(ocode)
)

create table orderlist(
ocode char(10),
odate date,
address varchar2(18),
price number,
primary key(ocode)
)

insert into orderlist values('123456789', '2022/04/29', '°æÀÎ·Î', 330000);

insert into orders values('232435', '123456789', 3);
insert into orders values('456789', '123456789', 3);

select *
from orders
where ocode = '123456789';

