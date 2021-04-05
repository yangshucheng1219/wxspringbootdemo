package com.imooc.demo.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * @author yangshucheng
 * @create 2021-04-03 11:06
 */

//@Configuration告诉spring容器来检索相关的类
@Configuration
//配置mybatis mapper的扫描路径
@MapperScan("com.imooc.demo.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    String jdbcDriver;
    @Value("${jdbc.url}")
    String jdbcUrl;
    @Value("${jdbc.username}")
    String jdbcUsername;
    @Value("${jdbc.password}")
    String jdbcPassword;
    //注册Bean，名为dataSource
    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        //关闭连接后不自动commit
        dataSource.setAutoCommitOnClose(false);
        return dataSource;

    }
}
