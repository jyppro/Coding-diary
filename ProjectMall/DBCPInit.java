package com.dbshop;

import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;


@WebServlet("/DBCPInit")
public class DBCPInit extends HttpServlet {
	@Override
	public void init() throws ServletException {
		loadJDBCDriver();
		initConnectionPool();
	}
	
	private void loadJDBCDriver() {
		String driverClass = getInitParameter("jdbcDriver");
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
	
	private void initConnectionPool(){
		try{
			String jdbcUrl = getInitParameter("jdbcUrl");
			String username = getInitParameter("dbUser");
			String password = getInitParameter("dbPass");
			
			ConnectionFactory connFactory = new DriverManagerConnectionFactory(jdbcUrl, username, password);			
			
			PoolableConnectionFactory poolableConnFactory = new PoolableConnectionFactory(connFactory, null);
			
			poolableConnFactory.setValidationQuery("select 1");
			
			GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
			poolConfig.setTimeBetweenEvictionRunsMillis(1000L * 60L * 5L);
			
			poolConfig.setTestWhileIdle(true);
			
			poolConfig.setMinIdle(4);
			
			poolConfig.setMaxTotal(50);
			
			GenericObjectPool<PoolableConnection> connectionPool = new GenericObjectPool<>(poolableConnFactory, poolConfig);
			poolableConnFactory.setPool(connectionPool);
			
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			
			PoolingDriver driver = (PoolingDriver)DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			
			String poolName = getInitParameter("poolName");
			driver.registerPool(poolName, connectionPool);
		}catch (Exception e) {
			
		}
	}

}
