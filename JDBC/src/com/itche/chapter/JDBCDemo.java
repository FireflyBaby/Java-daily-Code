package com.itche.chapter;
import java.util.Arrays;
import java.util.Date;

import java.sql.*;

public class JDBCDemo {
    public static final String DBDRIVER="oracle.jdbc.driver.OracleDriver";
    public static final String DBURL="jdbc:oracle:thin:@localhost:1521:orcl";
    public static final String USER="scott";
    public static final String PASSWORD="tiger";
    public static void main(String[] args) throws Exception{
        //1.进行数据库驱动程序的加载
        Class.forName(DBDRIVER);//反射加载驱动程序
        //2.根据DriverManager类获取Connection接口实例
        Connection conn = DriverManager.getConnection(DBURL, USER, PASSWORD);
        conn.setAutoCommit(false);//取消自动提交
        Statement stmt = conn.createStatement();//创建数据库的操作对象
        try {
            stmt.addBatch("insert into news(nid,title) values(news_seq.nextval,'MLDN-A')");
            stmt.addBatch("insert into news(nid,title) values(news_seq.nextval,'MLDN-B')");
            stmt.addBatch("insert into news(nid,title) values(news_seq.nextval,'MLDN-C')");
            stmt.addBatch("insert into news(nid,title) values(news_seq.nextval,'MLDN-D')");
            stmt.addBatch("insert into news(nid,title) values(news_seq.nextval,'MLDN-E')");
            int[] result = stmt.executeBatch();
            System.out.println(Arrays.toString(result));
            conn.commit();
        }catch (Exception e){
            e.printStackTrace();
            conn.rollback();//回滚事务
        }
        conn.close();
    }
}
