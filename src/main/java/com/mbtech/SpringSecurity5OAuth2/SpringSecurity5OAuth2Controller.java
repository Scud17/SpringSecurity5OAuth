package com.mbtech.SpringSecurity5OAuth2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurity5OAuth2Controller {
    @GetMapping("/")
    public ResponseEntity<String> index(){
        return ResponseEntity.ok("Hello");
    }
}
