package javacampHMRS.Entity.Concretes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "territories")
@Getter
@Setter
public class Territory_ implements Serializable {

    @Id
    @Column(name = "territory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int territoryId;

    @Column(name = "territory_description")
    private String territory_description;

    @Column(name = "region_id")
    private int regionId;

}
