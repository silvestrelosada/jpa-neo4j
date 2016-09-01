package com.company.test.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableExperimentalNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// tag::config[]
@EnableScheduling
@EnableTransactionManagement
@Configuration
@EnableExperimentalNeo4jRepositories(basePackages = "com.company.test.graph.repository")
public class Neo4jConfig  {

	    /**
	     * Creates a neo4j configuration, falling back to embedded if config details not present
	     */

	    @Bean
	    public SessionFactory sessionFactory() {
	        return new SessionFactory( "com.company.test.graph.domain");
	    }
	    
		@Bean
		public Neo4jTransactionManager transactionManager() {
			return new Neo4jTransactionManager(sessionFactory());
		}

}

