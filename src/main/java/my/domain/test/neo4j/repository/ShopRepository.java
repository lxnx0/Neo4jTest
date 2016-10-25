package my.domain.test.neo4j.repository;

import org.springframework.stereotype.Repository;

import my.domain.test.neo4j.domain.Shop;

import org.springframework.data.neo4j.repository.GraphRepository;

@Repository
public interface ShopRepository extends GraphRepository<Shop> {  

}
