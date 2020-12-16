package entities;

import javax.persistence.*;

@Entity
public class CD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cd_id;
    private String title;
    private String description;
    private Integer yearOfRelease;
    private String artist;
    private Double price;
   // @ManyToMany
  //  private Artist artistOne;

    public Integer getCd_id() {
        return cd_id;
    }

    public void setCd_id(Integer cd_id) {
        this.cd_id = cd_id;
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

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
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
                "cd_id=" + cd_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }
}
