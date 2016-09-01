package com.company.test.graph.repository;


import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.company.test.graph.domain.Person;


/**
 *
 * @author pdtyreus
 */
@Repository
public interface PersonRepository extends Neo4jRepository<Person> {
    
}