package CJV805.BackEnd.Controllers;

import CJV805.BackEnd.Models.UserModel;
import CJV805.BackEnd.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UsersController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public ResponseEntity getUsers(){
        return new ResponseEntity(service.getUsers(), HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity getUser(@PathVariable("id") String id){
        return new ResponseEntity(service.getUser(id), HttpStatus.OK);
    }

    @PostMapping(value = "/users/", consumes = {
            MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity createUser(@RequestBody UserModel user){
        return new ResponseEntity(service.addUser(user), HttpStatus.OK);
    }
}


