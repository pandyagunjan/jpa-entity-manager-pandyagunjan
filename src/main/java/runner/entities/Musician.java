package runner.entities;

import javax.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Musician {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String first_name;
    private String last_name;
    private String instrument;
    //(cascade=CascadeType.ALL)
  //  @JoinColumn(name="cd_id",referencedColumnName="id")
   // @Column(name="cd_id")
    @ManyToMany(cascade=ALL,fetch=FetchType.EAGER,mappedBy = "musicians")
    private Set<CD> cds= new HashSet<>();
    //private List<CD> cds;

    public Musician() {
    }

    public Set<CD> getCds() {
        return cds;
    }

    public void setCds(Set<CD> cds) {
        this.cds = cds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", instrument='" + instrument + '\'' +
                '}';
    }
}
