package com.sarina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);

	}
//localhost:8080  - root path
	@GetMapping
	String greet(){
		return"Hello sarina";
	}

	@GetMapping(params = "name")
	String greetName(@RequestParam("name") String name){
		return"Hello " + name + " how are you today?";
	}

	//localhost:8080/ping  -  specifying a path
	@GetMapping(path = "ping")
	String ping(){
		return"pong";
	}
//	@GetMapping("people")
//	List <Person> getPerson(){
//		return List.of
//				(new Person("Alex", 24),
//						new Person("wendy",22));
//	}

//	static class Person {
//		private String name;
//		private Integer age;
//
//		Person(String name, Integer age) {
//			this.name = name;
//			this.age = age;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public Integer getAge() {
//			return age;
//		}
//
//		public void setAge(Integer age) {
//			this.age = age;
//		}
//
//		@Override
//		public String toString() {
//			return "Person{" +
//					"name='" + name + '\'' +
//					", age=" + age +
//					'}';
//		}
//
//		public Person() {
//			super();
//		}
//
//		@Override
//		public int hashCode() {
//			return super.hashCode();
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			return super.equals(obj);
//		}
	}




