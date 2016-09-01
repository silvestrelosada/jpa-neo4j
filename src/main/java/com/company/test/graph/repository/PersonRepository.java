package com.company.test.graph.repository;


import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.company.test.graph.domain.Person;


/**
 *
 * @author pdtyreus
 */
@Repository
public interface PersonRepository extends GraphRepository<Person> {
    
}