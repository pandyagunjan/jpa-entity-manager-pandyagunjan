package runner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runner.entities.Musician;
import runner.services.MusicianService;
import java.util.List;
@RequestMapping("/musician")
@RestController
public class MusicianController {


    @Autowired
    private MusicianService artistService;

    @GetMapping(value = "/home")
    public String displayHome() {
        return "Hello World";
    }

    @GetMapping(value = "/read/{id}")
    public ResponseEntity<Musician> readById(@PathVariable Integer id) {
        return new ResponseEntity<>(artistService.readById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/readAll")
    public ResponseEntity<List<Musician>> readAll() {
        return new ResponseEntity<>(artistService.readAll(), HttpStatus.OK);
    }
    @PostMapping(value = "/create")
    public ResponseEntity<Musician> create(@RequestBody Musician artist) {
        return new ResponseEntity<>(artistService.create(artist), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Musician> update(@RequestBody Musician artist, @PathVariable Integer id) {
        return new ResponseEntity<>(artistService.update(id,artist), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Musician> deleteById(@PathVariable Integer id) {
        return new ResponseEntity<>(artistService.deleteById(id), HttpStatus.OK);
    }


}
