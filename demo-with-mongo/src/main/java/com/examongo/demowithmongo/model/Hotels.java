package com.examongo.demowithmongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "hotels")
@Data
public class Hotels {
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int pricePernight;
    private Address address;
    private List<Review> reviews;
}
