create table shareDoc(
	s_no number(4) primary key,
	s_title varchar2(20 char) not null,
	s_txt varchar2(500 char) not null,
	s_date date not null
);

create sequence shareDoc_seq;

select * from SHAREDOC;

select * from (select rownum as rn, s_no, s_title, s_date from (select rownum, s_no, s_title, s_date from SHAREDOC where n_title like #{))