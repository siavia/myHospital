/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhospital;

/**
 *
 * @author Administrator
 */
import java.sql.*;

public class DBProcess {
    Connection connection = null;
    ResultSet rs = null;
    //sqlserver数据库url
    String urlSqlServer = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=MyHospital";
    
    public DBProcess() {
		try {
			//sqlserver数据库设置驱动程序类型
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        System.out.println("sqlserver数据库驱动加载成功");
		}
		catch(java.lang.ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void connect(){
		try{
			//sqlserver数据库
			connection = DriverManager.getConnection(urlSqlServer);
			//注意这里的句子写为connection = DriverManager.getConnection(urlSqlServer,'对应用户名','密码');语法上也没问题
                        //但是，没这个必要。用户的验证是在服务->选定驱动程序->连接设置 这里才会用到用户名和密码
			if(connection!=null){
	                    System.out.println("数据库连接成功");
	                 }
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
    
    public void disconnect(){
		try{
			if(connection != null){
			    connection.close();
			    connection = null;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
    
    // 执行查询
    public ResultSet executeQuery(String sql) {
		try {
                        System.out.println("executeQuery(). sql = " + sql);
                        if(connection != null){
                            PreparedStatement pstm = null;
                            pstm = connection.prepareStatement(sql);
			    rs = pstm.executeQuery();
                        }
                        else
                            System.out.println("connection == null !");
		} 
		catch(SQLException ex) { 
			ex.printStackTrace();
		}
		return rs;
    }
    
    //执行增、删、改语句的方法
    public int executeUpdate(String sql) {
		int count = 0;
		connect();
		try {
			Statement stmt = connection.createStatement();
			count = stmt.executeUpdate(sql);
		} 
		catch(SQLException ex) { 
			System.err.println(ex.getMessage());		
		}
		disconnect();
		return count;
    }
        //executeUpdate 的返回值是一个整数，指示受影响的行数（即更新计数）。
	//executeUpdate用于执行 INSERT、UPDATE 或 DELETE 语句
	//以及 SQL DDL（数据定义语言）语句，例如 CREATE TABLE 和 DROP TABLE。 
}

    
    

