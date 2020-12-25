package runner.controllers;

import runner.entities.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runner.services.CDService;

import java.util.List;
import java.util.Optional;
@RequestMapping("/cd")
@RestController
public class CDController {
    @Autowired
    private CDService cdService;

//
//    public CDController(CDService service)
//    {
//        this.service=service;
//    }

//    @GetMapping(value = "/home")
//    public String displayHome() {
//        return "Hello World";
//    }
//

    @GetMapping(value = "/read/{id}")
    public ResponseEntity<CD> readById(@PathVariable Integer id) {
        return new ResponseEntity<>(cdService.readById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/readAll")
    public ResponseEntity<List<CD>> readAll() {
        return new ResponseEntity<>(cdService.readAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Optional<CD>> create(@RequestBody CD cd) {
        return new ResponseEntity<>(cdService.create(cd), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<CD> update(@RequestBody CD cd,@PathVariable Integer id) {
        return new ResponseEntity<>(cdService.update(id,cd), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<CD> deleteById(@PathVariable Integer id) {
        return new ResponseEntity<>(cdService.deleteById(id), HttpStatus.OK);
    }

}
