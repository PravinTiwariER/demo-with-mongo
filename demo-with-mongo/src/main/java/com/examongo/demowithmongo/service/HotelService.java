package com.examongo.demowithmongo.service;

import com.examongo.demowithmongo.model.Hotels;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    public Hotels createHotel(Hotels hotels);
    public List<Hotels> getAllHotels();
    public Optional<Hotels> getHotelById(String id);
    public Hotels getHotelByName(String name);
    public Hotels updateHotel(Hotels hotel);
    public void deleteHotelById(String id);
    public List<Hotels> getHotelsByCity(String city);
//    this is demo for test
    //this change is for test from remote to local 

}
