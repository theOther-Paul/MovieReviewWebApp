package dev.theOtherPaul.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//can be done the same for any property, as long as they are unique to the entry
@Repository
public interface MovieRepository extends MongoRepository <Movie, ObjectId>{
    Optional<Movie> findMovieByImdbId(String imdbId);
}
