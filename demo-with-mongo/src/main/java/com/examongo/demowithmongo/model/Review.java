package com.examongo.demowithmongo.model;

import lombok.Data;

@Data
public class Review {
    private String userName;
    private int rattings;
    private boolean approved;
}
