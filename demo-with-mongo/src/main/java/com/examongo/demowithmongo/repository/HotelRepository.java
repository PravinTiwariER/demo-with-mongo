package com.examongo.demowithmongo.repository;

import com.examongo.demowithmongo.model.Hotels;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface HotelRepository extends MongoRepository<Hotels,String> {
    Hotels findByName(String name);
    @Query(value = "{'address.city':?0}")
    List<Hotels> findByCity(String city);
}
