package com.company.test.graph.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.company.test.graph.domain.Movie;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author mh
 * @since 24.07.12
 */
// tag::repository[]
@Repository
public interface MovieRepository extends Neo4jRepository<Movie> {
    Movie findByTitle(@Param("title") String title);

    @Query("MATCH (m:Movie) WHERE m.title =~ ('(?i).*'+{title}+'.*') RETURN m")
    Collection<Movie> findByTitleContaining(@Param("title") String title);

    @Query("MATCH (m:Movie)<-[:ACTED_IN]-(a:Person) RETURN m.title as movie, collect(a.name) as cast LIMIT {limit}")
    List<Map<String,Object>> graph(@Param("limit") int limit);
}