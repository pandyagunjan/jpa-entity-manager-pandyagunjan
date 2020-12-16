package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer cd_id;
    String title;
    String description;
    Integer yearOfRelease;
    String artist;
    Double price;

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
        return "Cd{" +
                "cd_id=" + cd_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }
}
