select * from anyany2;

insert into ANYANY2 values('장준희', 24);

select rownum, a_name, a_age from(select * from ANYANY2 order by a_age) where rownum <=5;