package com.yannick.objet.jeTrouveTous.demo.dao;

import com.yannick.objet.jeTrouveTous.demo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;


public interface UsersDao extends JpaRepository<Users,Long> {

        List<Users> findAllByOrderByNomAsc();
        Users findUsersByEmailAndPassword(String email, String password);
        Users save(Users users);
        void delete(Users users);
        Users findUsersByidUser(Long id);
}
