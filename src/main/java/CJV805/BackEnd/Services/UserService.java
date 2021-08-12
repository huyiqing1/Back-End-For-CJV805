package CJV805.BackEnd.Services;

import CJV805.BackEnd.Models.UserModel;
import CJV805.BackEnd.Models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService {

    @Autowired
    private UserRepository repository;

    public UserModel addUser(UserModel user){
        UserModel insertedUser = repository.insert(user);
        return insertedUser;
    }

    public List<UserModel> getUsers(){
        return repository.findAll();
    }

    public Optional<UserModel> getUser(String id){
        return repository.findById(id);
    }
}
