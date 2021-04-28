package com.maxhayday.springcloud.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maxhayday.springcloud.model.Person;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class HelloController {

    @PostMapping("/person")
    public Person printPerson(@RequestBody Person person){
        System.out.println(person);
        return person.withAge(120).withName("John");
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello spring MVC";
    }

    @GetMapping("/hi/{name}/{id}")
    public String helloWithName(@PathVariable String name, @PathVariable int id) {
        return name.toUpperCase(Locale.ROOT) + " " + id;
    }

    @GetMapping("/stas")      //http://localhost:8080/api/stas?age=13
    public String stas(@RequestParam("age") int age) {
        return "STAS" + age;
    }

    @SneakyThrows
    public static void main(String[] args) {
        Person person = Person.builder().age(12).name("Stepa").build();
        String json = new ObjectMapper().writeValueAsString(person);
        System.out.println(json);
    }
}
