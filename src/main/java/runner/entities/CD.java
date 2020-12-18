package runner.entities;

import javax.persistence.*;

@Entity
public class CD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  //  @Column(name="id")
    private Integer id;
    private String title;
    private String description;
    private Integer yearofrelease;
    private String artist;
    private Double price;
   // @ManyToMany
  //  private Artist artistOne;

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", yearOfRelease=" + yearofrelease +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }
}
