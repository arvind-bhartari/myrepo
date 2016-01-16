package com.test.spring;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mysql.jdbc.Driver;
import com.test.spring.utils.constants;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
public class HibernateConfig extends constants {
//
//	@Bean
//	public DataSource dataSource() throws SQLException {
//		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//		Driver driver = new Driver();
//		dataSource.setDriver(driver);
//		dataSource.setUrl(url);
//		dataSource.setUsername(username);
//		dataSource.setPassword(password);
//		return dataSource;
//	}
//
//	@Bean
//	public LocalSessionFactoryBean getSessionFactory() throws SQLException {
//		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//		factoryBean.setDataSource(dataSource());
//		factoryBean.setPackagesToScan(packagesToScan);
//		Properties hibernateProperties = new Properties();
//		hibernateProperties.put("hibernate.dialect", dialect);
//		hibernateProperties.put("hibernate.show_sql", showSql);
//		hibernateProperties.put("hibernate.hbm2ddl.auto", hbm2ddl_auto);
//		factoryBean.setHibernateProperties(hibernateProperties);
//		return factoryBean;
//	}
//
//	@Bean
//	public HibernateTransactionManager transactionManager() throws SQLException {
//		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//		transactionManager.setSessionFactory(getSessionFactory().getObject());
//		return transactionManager;
//	}
//
//	@Bean
//	public SessionFactory sessionFactory() throws SQLException {
//		return transactionManager().getSessionFactory();
//	}
//
}
