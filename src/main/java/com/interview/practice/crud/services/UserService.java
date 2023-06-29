package com.interview.practice.crud.services;

import com.interview.practice.crud.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class UserService {

    public Map<Integer, User> users = new LinkedHashMap<>() {{
        put(1, new User(1, "Ashish", "Ashish@gmail.com"));
        put(2, new User(2, "Magyar", "Mag@gmail.com"));
        put(3, new User(3, "Sentinnel", "Sent@yahoo.com"));
        put(4, new User(4, "Cross", "Cross@yahoo.com"));
        put(5, new User(5, "Raptor", "Rap@gmail.com"));
        put(6, new User(6, "Cassidy", "Cass@gmail.com"));
    }};

    public Collection<User> getUsers() {
      return users.values();
    };

    public User getUserById(int id) {
        return users.get(id);
    };

    public ResponseEntity<String> createUser(User user) {
        if (users.containsKey(user.getId())) {
            return new ResponseEntity<>("This id is already in use.", HttpStatus.BAD_REQUEST);
        }

        users.put(user.getId(), user);
        return new ResponseEntity<>("User created", HttpStatus.CREATED);
    };

    public ResponseEntity<Object> updateUser(User user) {
        if (!users.containsKey(user.getId())) {
            return new ResponseEntity<>("Updated ID does not exist!", HttpStatus.BAD_REQUEST);
        }
        users.put(user.getId(), user);
        return new ResponseEntity<>(users.values(), HttpStatus.OK);
    };

    public ResponseEntity<Object> deleteUser(int id) {
        if (!users.containsKey(id)) {
            return new ResponseEntity<>("User with this id does not exist!", HttpStatus.BAD_REQUEST);
        }
        users.remove(id);
        return new ResponseEntity<>(users.values(), HttpStatus.OK);
    }
}
