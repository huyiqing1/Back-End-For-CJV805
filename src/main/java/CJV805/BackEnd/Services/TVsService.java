package CJV805.BackEnd.Services;

import CJV805.BackEnd.Models.Movies;
import CJV805.BackEnd.Models.TVs;
import CJV805.BackEnd.Models.TVsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TVsService {

    @Autowired
    private TVsRepository repository;

    public List<TVs> getTVs(){
        return repository.findAll();
    }

    public Optional<TVs> getTV(String id){
        return repository.findById(id);
    }
}
