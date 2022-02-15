package com.sarina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
    @SpringBootApplication
    @RestController
    public class SpringBootApplicationCounter {
        public static void main(String[] args) {
            SpringApplication.run(SpringBootApplicationCounter.class, args);
        }

        // All your code should be inside this one class
        // add @RestController to you expose methods as REST services to clients
        // create a variable static int count = 0;

        static int count = 4;

        // All methods should have a @GetMapping
        // Create a method to get current count. i.e localhost:8080/current-count
        @GetMapping(path = "currentCount")
        int currentCount() {
            return count;
        }


        // Create method to increment the count. i.e localhost:8080/increment-count

        @GetMapping(path = "incrementCount")
        int incrementCount() {
            int countPlus = count++;
            return countPlus;
        }

        // Create method to decrement the count. i.e localhost:8080/decrement-count

        @GetMapping(path = "decrementCount")
        int decrementCount() {
            int countMinus = count--;
            return countMinus;


            // Test your api with chrome
        }
    }

