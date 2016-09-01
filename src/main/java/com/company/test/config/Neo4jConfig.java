package com.company.test.config;


import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// tag::config[]
@EnableScheduling
@EnableTransactionManagement
@Configuration
@EnableNeo4jRepositories(basePackages = "com.company.test.graph.repository")
public class Neo4jConfig  extends Neo4jConfiguration {



	    /**
	     * Creates a neo4j configuration, falling back to embedded if config details not present
	     */
//	    @Bean
//	    public org.neo4j.ogm.config.Configuration getConfiguration() {
//	        org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
//	        config.driverConfiguration()
//	        .setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
//	        .setURI("http://movies:d3v0gr4ap1cs@localhost:7474");
//	        return config;
//	    }


	    @Bean
	    public SessionFactory getSessionFactory() {
	        return new SessionFactory( "com.company.test.graph.domain");
	    }
	    @Bean
	    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
	    public Session getSession() throws Exception {
	        return super.getSession();
	    }
//    @Bean
//    public SessionFactory sessionFactory() {
//        // with domain entity base package(s)
//        return new SessionFactory("com.company.test.graph.domain");
//    }
//
//	@Bean
//	public Neo4jTransactionManager transactionManager() {
//		return new Neo4jTransactionManager(sessionFactory());
//	}

}

