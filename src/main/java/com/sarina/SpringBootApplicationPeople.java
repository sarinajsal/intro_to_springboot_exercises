package com.sarina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcOperationsDependsOnPostProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
    public class SpringBootApplicationPeople {
    static List<Person> peoples = new ArrayList<>();

    public static void main(String[] args) {

        SpringApplication.run(SpringBootApplicationPeople.class, args);

        Person me = new Person(1, "sarina", 22);
        Person robyn = new Person(2, "robyn", 22);
        peoples.add(me);
        peoples.add(robyn);
        List<Person> people = List.of(me, robyn);


    }

    @GetMapping(path = "getEveryone")
    public List<Person> getAllPeople() {
        return peoples;
    }

//    @GetMapping(path = "people")
//    List<Person> people() {
////        Person me = new Person(1, "Sarina", 22);
////        Person robyn = new Person(2, "Robyn", 22);
//        return List.of(me, robyn);
//    }

    @GetMapping(path = "string")
    String string() {
        return "hi";
    }


        @GetMapping("people/{id}")
        public Person getPersonById(@PathVariable("id") Integer id) {
            for (Person person:peoples) {
                if (person.getId() == id){
                    return person;
                }
            }
        return null;
            // filter list and return person that matches id otherwise return null
        }



    // All your code should be inside this one class
    // add @RestController to you expose methods as REST services to clients
    // create a static List of type person with few people inside
    // create a class called Person with following properties: id, name, age


    static class Person {
        private int id;
        private String name;
        private int age;

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id && age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age);
        }





    }
}



