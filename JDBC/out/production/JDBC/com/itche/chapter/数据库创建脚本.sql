DROP TABLE news PURGE;
DROP SEQUENCE news_seq;
CREATE SEQUENCE news_seq;
 CREATE TABLE news(
   nid NUMBER,
   title VARCHAR2(30),
   read  NUMBER,
   price NUMBER,
   content CLOB,
   pubdate DATE,
   CONSTRAINT pk_nid PRIMARY KEY(nid)
 );
update news set title='MLDN重大新闻',content='据说四月的最低温度为1度',read=99998 where nid=5;