create table users (primary key name, passwd);
insert into users set name='parrt', passwd='foobar';
insert into users set name='tombu', passwd='spork';
// search by non primary key (does linear walk of rows)
print select name, passwd from users where passwd='spork';
