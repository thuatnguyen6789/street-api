package com.example.streetapispringboot.controller;

import com.example.streetapispringboot.entity.Street;
import com.example.streetapispringboot.entity.enums.StreetStatus;
import com.example.streetapispringboot.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "api/v1/streets")
public class StreetApi {

    @Autowired
    private StreetRepository streetRepository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Street street) {
        Street street = new Street();
        street.setName(street.getName());
        street.setDescription(street.getDescription());
        street.setStatus(StreetStatus.USING);
        streetRepository.save(street);
        street.setCreatedAt(LocalDateTime.parse(street.getCreatedAt() == null ? "" : street.getCreatedAt().toString()));
        return new ResponseEntity<>(street, HttpStatus.OK);
    }
}

