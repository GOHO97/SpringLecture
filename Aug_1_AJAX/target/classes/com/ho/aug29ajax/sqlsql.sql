create table abcdefu(
	a_no varchar2(10 char) primary key,
	a_a varchar2(10 char) not null
);

create sequence abcdefu_seq;

insert into ABCDEFU values(abcdefu_seq.nextval, 'a');
insert into ABCDEFU values(abcdefu_seq.nextval, 'b');
insert into ABCDEFU values(abcdefu_seq.nextval, 'andyourmam');

select * from abcdefu;

select * from(select rownum as rn, a_no, a_a from(select * from abcdefu order by a_no)) where rn &gt;= ? and rn &lt;= ?  
