package com.example.web;

import com.example.exception.ApplicationNotFoundException;
import com.example.service.AddressService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/randomizer")
public class ApiController {

    private AddressService addressService;

    @Autowired
    public void setAddressService(AddressService addressService) { this.addressService = addressService; }

    @GetMapping("/address")
    public ResponseEntity<JsonNode> getAllTickets() {

        try {

            JsonNode node = addressService.getRandomAddress();
            return new ResponseEntity<>(node, HttpStatus.OK);

            } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }

    }

}