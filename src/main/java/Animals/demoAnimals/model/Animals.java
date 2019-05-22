package Animals.demoAnimals.model;

import javax.persistence.*;

@Entity
@Table (name ="animal_pa")
public class Animals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long  id;
    public   String name;
    public Double weight;

    public Animals( String name, Double weight) {
       this.name = name;
        this.weight = weight;
    }

    public Animals() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
