create table users (primary key name, passwd);
insert into users set name='parrt', passwd='foobar';
insert into users set name='tombu';
p = select passwd, name from users; // reverse column order
print p;
