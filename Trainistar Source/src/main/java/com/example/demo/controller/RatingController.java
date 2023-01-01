package com.example.demo.controller;

import com.example.demo.entity.Rating;
import com.example.demo.repository.RatingRepository;
import com.example.demo.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    private RatingService service;
    @Autowired
    private RatingRepository ratingRepository;

    @PostMapping("/addRating")
    public Rating addRating(@RequestBody Rating rating)
    {
        return service.saveRating(rating);
    }
    @PostMapping("/addRatings")
    public List<Rating> addRating(@RequestBody List<Rating> ratings){
        return service.saveRatings(ratings);
    }
    @GetMapping("/ratings")
    public List<Rating> getAllRating(){
        return service.getRatings();
    }
    @GetMapping("/rating/{id}") // id =1 => /rating/1
    public Rating findById(@PathVariable String id){
        return service.getRatingById(id);
    }
    // (@PathVariable String id, @RequestBody body)


    @DeleteMapping("/rating/{id}")
    public String deleteRating(@PathVariable String id ){
        return service.deleteRating(id);
    }

}

// api/4
