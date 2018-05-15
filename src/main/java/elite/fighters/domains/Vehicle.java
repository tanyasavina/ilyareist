package elite.fighters.domains;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private int odometer;
    private String status;
    private String latLong;
    private String currentDriver;

    public String toString()
    {
        return this.name + " odometer" + this.odometer;
    }
}
