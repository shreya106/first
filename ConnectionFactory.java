package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {//driver and address of machine
private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
private static final String USER="hr";
private static final String PASS="hr";
private static Connection connection=null;
public static Connection getConnection() {
	try {
		connection=DriverManager.getConnection(URL,USER,PASS);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return connection;
}
public static void main(String[] args) {
	if(getConnection()!=null) {
		System.out.println("Connected");
	}else {
		System.out.println("Not connected");
	}
}


}
