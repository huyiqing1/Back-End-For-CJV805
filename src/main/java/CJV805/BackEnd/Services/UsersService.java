package CJV805.BackEnd.Services;

import CJV805.BackEnd.Models.UserModel;
import CJV805.BackEnd.Models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BCryptPasswordEncoder bcrypt;

    public UserModel addUser(UserModel user){

        String encodedPassword = bcrypt.encode(user.getPassword());
        user.setPassword(encodedPassword);

        UserModel insertedUser = repository.insert(user);

        return insertedUser;
    }

    public List<UserModel> getUsers(){
        return repository.findAll();
    }

    public Optional<UserModel> getUser(String id){
        return repository.findById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
