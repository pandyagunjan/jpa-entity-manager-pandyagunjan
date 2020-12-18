package runner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import runner.entities.Artist;
import runner.services.ArtistService;
import java.util.List;

@RestController
public class ArtistController {


    @Autowired
    private ArtistService artistService;


    @GetMapping(value = "/home")
    public String displayHome() {
        return "Hello World";
    }


    @GetMapping(value = "/artist/read/{id}")
    public ResponseEntity<Artist> readById(@PathVariable Integer id) {
        return new ResponseEntity<>(artistService.readById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/artist/readAll")
    public ResponseEntity<List<Artist>> readAll() {
        return new ResponseEntity<>(artistService.readAll(), HttpStatus.OK);
    }
    @PostMapping(value = "/artist/create")
    public ResponseEntity<Artist> create(@RequestBody Artist artist) {
        return new ResponseEntity<>(artistService.create(artist), HttpStatus.CREATED);
    }

    @PutMapping(value = "/artist/update/{id}")
    public ResponseEntity<Artist> update(@RequestBody Artist artist,@PathVariable Integer id) {
        return new ResponseEntity<>(artistService.update(id,artist), HttpStatus.OK);
    }

    @DeleteMapping(value = "/artist/delete/{id}")
    public ResponseEntity<Artist> deleteById(@PathVariable Integer id) {
        return new ResponseEntity<>(artistService.deleteById(id), HttpStatus.OK);
    }


}
