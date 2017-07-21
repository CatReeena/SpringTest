package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * Created by Shera on 07.07.2017.
 */
@Configuration
@ComponentScan
public class AppConfig {

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setPersistenceUnitName("Local");
//        return em;
//    }

    @Bean
    public CinemaDAOHibernate returnDao()
    {
        return new CinemaDAOHibernate();
    }
}
