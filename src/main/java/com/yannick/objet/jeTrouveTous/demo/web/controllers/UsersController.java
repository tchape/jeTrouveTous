package com.yannick.objet.jeTrouveTous.demo.web.controllers;

import com.yannick.objet.jeTrouveTous.demo.dao.UsersDao;
import com.yannick.objet.jeTrouveTous.demo.models.Users;
import com.yannick.objet.jeTrouveTous.demo.util.Utilitaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {

   /* @Autowired
    private UsersService UsersService;*/

    @Autowired
    UsersDao usersDao;

    @CrossOrigin
    @GetMapping()
    public List<Users> getAllUser(){
        return usersDao.findAll();
    }

    @GetMapping(value ="/{id}")
    public Users getUserbyId(@PathVariable Long id){
        return usersDao.findUsersByidUser(id);
    }

    @DeleteMapping(value ="/{id}")
    public void deleteUserbyId(@PathVariable Long id){
        Users users =  usersDao.findUsersByidUser(id);
        if(users != null){
            usersDao.delete(users);
        }
    }

    @CrossOrigin
    @PostMapping(value = "/usersByEmailAndPassword")
    public Users getUsersByEmailAndPassword(@RequestBody Users user){
        Users users = usersDao.findUsersByEmailAndPassword(user.getEmail(), user.getPassword());
        return users;
    }

    @CrossOrigin
    @PostMapping()
    public ResponseEntity<Void> saveUsers(@RequestBody Users users){
        Users id = (Users) usersDao.save(users);
        if(id != null){
            return Utilitaire.getInstance().getRequestReponseHeader(""+id, users);
        }
        return Utilitaire.getInstance().getRequestReponseHeader(null, null);
    }

}
