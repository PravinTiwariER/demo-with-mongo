package com.examongo.demowithmongo.controller;

import com.examongo.demowithmongo.model.Hotels;
import com.examongo.demowithmongo.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("hotel")
public class HotelController {
    @Autowired
    private HotelService service;
    @PostMapping(path = "create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Hotels createHotels(@RequestBody Hotels hotel) {
        return service.createHotel(hotel);
    }

    @GetMapping(path = "get",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Hotels> getAllHotels(){
        return service.getAllHotels();
    }

    @GetMapping(path = "get/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotels getById(@PathVariable("id") String id) {
        Optional<Hotels> hotelDataOpt=service.getHotelById(id);
        return (hotelDataOpt.isPresent())? hotelDataOpt.get():null;
    }

    @GetMapping(path = "get/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotels getByName(@PathVariable("name") String name) {
        return service.getHotelByName(name);
    }

    @PutMapping(path = "update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotels updateHotel(@RequestBody Hotels hotel) {
        return service.updateHotel(hotel);
    }

    @DeleteMapping(path = "delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteHotelById(@PathVariable("id") String id) {
        service.deleteHotelById(id);
        return "Hotel Deleted With "+id;
    }

    @GetMapping(path = "gethotel/{city}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Hotels> getByCity(@PathVariable("city") String city){
        return service.getHotelsByCity(city);
    }

}
