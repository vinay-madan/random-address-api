package com.example.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Locale;

@Service
public class AddressServiceImpl implements AddressService {

    @Value( "${country.locale:en-US}" )
    private String countryLocale;

    private Faker faker;


    @Autowired
    private ObjectMapper objectMapper;


     @PostConstruct
    private void fill() {
        this.faker = generateFaker();
    }

    @Value( "${country.locale}" )
    private Faker generateFaker() {

          return faker = new Faker(new Locale(countryLocale));
    }


    @Override
    public JsonNode getRandomAddress() {

        ArrayNode address = objectMapper.createArrayNode();

         address.add(objectMapper.createObjectNode()
                    .put("house", faker.address().streetAddressNumber())
                    .put("street", faker.address().streetAddress())
                    .put("postalcode", faker.address().zipCode())
                    .put("city", faker.address().city())
                    .put("state",faker.address().state())
                    .put("statecode",faker.address().stateAbbr())
                    .put("country",faker.address().country())
                    .put("countrycode",faker.address().countryCode()));

        return address;


    }


}
