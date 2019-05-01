package com.yannick.objet.jeTrouveTous.demo.util;

import com.yannick.objet.jeTrouveTous.demo.models.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class Utilitaire {

    private static final Utilitaire INSTANCE = null;

    private Utilitaire(){

    }

   public static Utilitaire getInstance(){
        if(INSTANCE == null){
            return new Utilitaire();
        }
        return INSTANCE;
    }

    public ResponseEntity<Void> getRequestReponseHeader(String path, Object object){
        if(object == null){
            return ResponseEntity.noContent().build();
        }

        int id = 0;
        if(object instanceof Users){
            id = ((Users)object).getId();
        }
        if(path == null){

        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+path).buildAndExpand(id).toUri();
        return ResponseEntity.created(location).build();
    }

}
