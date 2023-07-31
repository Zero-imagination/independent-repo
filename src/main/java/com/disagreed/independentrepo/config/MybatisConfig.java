package com.disagreed.independentrepo.config;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement(mode = AdviceMode.PROXY)
@MapperScan(basePackages = {"com.disagreed.independentrepo.repository.mybatis"})
public class MybatisConfig {

    /**
     * Transaction manager data source transaction manager.
     *
     * @param dataSource the data source
     * @return the data source transaction manager
     */
    @Bean
    @Primary
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * Sql session factory sql session factory.
     *
     * @return the sql session factory
     * @throws Exception the exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setVfs(SpringBootVFS.class);
        sessionFactory.setTypeHandlersPackage(
                "com.disagreed.independentrepo.repository.mybatis.handler"
        );
        sessionFactory.setTypeAliasesPackage(
                "com.disagreed.independentrepo.model.entity"
        );

        SqlSessionFactory sqlSessionFactory = sessionFactory.getObject();
        if (sqlSessionFactory != null) {
            org.apache.ibatis.session.Configuration configuration = sqlSessionFactory.getConfiguration();
            configuration.setMapUnderscoreToCamelCase(Boolean.TRUE);
            // lazy loading
            configuration.getLazyLoadTriggerMethods().clear();
            configuration.setLazyLoadingEnabled(Boolean.TRUE);
        }

        return sessionFactory.getObject();
    }

}
