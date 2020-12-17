package controllers;

import entities.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.CDService;

@RestController
public class CDController {
    @Autowired
    private CDService cdService;

//
//    public CDController(CDService service)
//    {
//        this.service=service;
//    }

    @PostMapping(value = "/create")
    public ResponseEntity<CD> create(@RequestBody CD cd) {
        return new ResponseEntity<>(cdService.create(cd), HttpStatus.CREATED);
    }


    @GetMapping(value = "/read/{id}")
    public ResponseEntity<CD> readById(@PathVariable Integer cd_id) {
        return new ResponseEntity<>(cdService.readById(cd_id), HttpStatus.OK);
    }


    @GetMapping(value = "/home")
    public String displayHome() {
        return "Hello World";
    }
}
