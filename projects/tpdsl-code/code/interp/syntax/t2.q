create table users (primary key name, passwd);
insert into users set name='parrt', passwd='foobar';
insert into users set name='tombu', passwd='spork';
// search by primary key 
print select passwd from users where name='parrt';
