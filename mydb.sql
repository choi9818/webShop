create table t_member(
	id varchar(20) primary key,
	pwd varchar2(20),
	name varchar2(50),
	email varchar2(20),
	joinDate date
);

insert into t_member values('choi','1234','최수','email@',sysdate);

select * from t_member;

insert into member
values(1, '1234', 'choi', '010-1234',
'서울시 광진구', 'chwechoi@');