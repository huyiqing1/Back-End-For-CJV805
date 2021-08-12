package CJV805.BackEnd.Services;

import CJV805.BackEnd.Models.Movies;
import CJV805.BackEnd.Models.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository repository;

    public List<Movies> getMovies(){
        return repository.findAll();
    }

    public Optional<Movies> getMovie(String id){
        return repository.findById(id);
    }
}
