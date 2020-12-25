package runner.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
public class CD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  //  @Column(name="id")
    private Integer id;
    private String title;
    private String description;
    private Integer yearofrelease;
    private Double price;
    @JsonBackReference
    @ManyToMany(cascade=ALL,fetch=FetchType.LAZY)//,mappedBy = "cd")
    private Set<Musician> musicians = new HashSet<>();

    public Set<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(Set<Musician> musicians) {
        this.musicians = musicians;
    }

    public CD() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYearofrelease() {
        return yearofrelease;
    }

    public void setYearofrelease(Integer yearOfRelease) {
        this.yearofrelease = yearOfRelease;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
