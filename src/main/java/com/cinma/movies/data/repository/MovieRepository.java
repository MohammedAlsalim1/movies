package com.cinma.movies.data.repository;

import com.cinma.movies.data.documents.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepositry extends MongoRepository<Movie, ObjectId> {
}
