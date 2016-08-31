package com.company.test.config;


import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableExperimentalNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.data.neo4j.web.support.OpenSessionInViewInterceptor;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// tag::config[]
//@EnableScheduling
//@EnableTransactionManagement
//@Configuration
//@EnableExperimentalNeo4jRepositories(basePackages = "com.company.test.graph.repository")
//public class Neo4jConfig  extends WebMvcConfigurerAdapter {
//
//    @Bean
//    public OpenSessionInViewInterceptor openSessionInViewInterceptor() {
//        OpenSessionInViewInterceptor openSessionInViewInterceptor =
//            new OpenSessionInViewInterceptor();
//        openSessionInViewInterceptor.setSessionFactory(getSessionFactory());
//        return openSessionInViewInterceptor;
//    }
//
//    @Override
//        public void addInterceptors(InterceptorRegistry registry) {
//        registry.addWebRequestInterceptor(openSessionInViewInterceptor());
//    }
//    
//    public SessionFactory getSessionFactory() {
//        return new SessionFactory( "com.company.test.graph.domain");
//    }
//    @Bean(name="neo4jTransactionManager")
//    @Qualifier("neo4jTransactionManager")
//	public Neo4jTransactionManager transactionManager() throws Exception {
//		return new Neo4jTransactionManager(getSessionFactory());
//	}
//    
//}
public class Neo4jConfig {
	
}

