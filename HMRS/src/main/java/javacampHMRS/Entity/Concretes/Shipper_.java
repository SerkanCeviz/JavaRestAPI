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
@Table(name = "shippers")
@Getter
@Setter
public class Shipper_ implements Serializable {

    @Id
    @Column(name = "shipper_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shipperId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "phone")
    private String phone;
}
