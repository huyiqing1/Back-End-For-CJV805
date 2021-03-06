package CJV805.BackEnd.Controllers;

import CJV805.BackEnd.Services.TVsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TVsController {

    @Autowired
    private TVsService service;

    @GetMapping("/tvs")
    public ResponseEntity getTVs(){
        return new ResponseEntity(service.getTVs(), HttpStatus.OK);
    }

    @GetMapping("/tv/{id}")
    public ResponseEntity getTV(@PathVariable("id") String id) {
        return new ResponseEntity(service.getTV(id), HttpStatus.OK);
    }
}
