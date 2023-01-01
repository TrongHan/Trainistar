package com.example.demo.service;

import com.example.demo.entity.Rating;
import com.example.demo.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    private RatingRepository repository;

    public Rating saveRating(Rating rating){
        return repository.save(rating);
    }
    public List<Rating> saveRatings(List<Rating> ratings){
        return repository.saveAll(ratings);
    }
    public List<Rating> getRatings(){
        return repository.findAll();
    }
    public Rating getRatingById(String id){
        return repository.findById(id).orElse(null);
    }
    public String deleteRating(String id){
        repository.deleteById(id);
        return "Rating remove ||" + id;
    }
}
