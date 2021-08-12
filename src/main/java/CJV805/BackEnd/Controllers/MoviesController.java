package CJV805.BackEnd.Controllers;

import CJV805.BackEnd.Models.Movies;
import CJV805.BackEnd.Services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MoviesController {

    @Autowired
    private MoviesService service;

    @GetMapping("/movies")
    public ResponseEntity getMovies() {
        return new ResponseEntity(service.getMovies(), HttpStatus.OK);
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity getMovie(@PathVariable("id") String id) {
        return new ResponseEntity(service.getMovie(id), HttpStatus.OK);
    }
}
