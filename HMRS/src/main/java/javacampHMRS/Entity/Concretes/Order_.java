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
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order_ implements Serializable {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "required_date")
    private Date requiredDate;

    @Column(name = "shipped_date")
    private Date shippedDate;

    @Column(name = "ship_via")
    private int shipVia;

    @Column(name = "freight")
    private double freight;

    @Column(name = "ship_name")
    private String shipName;

    @Column(name = "ship_address")
    private String shipAddress;

    @Column(name ="ship_city")
    private String shipCity;

    @Column(name ="ship_region")
    private String shipRegion;

    @Column(name ="ship_postal_code")
    private String shipPostalCode;

    @Column(name = "ship_country")
    private String shipCountry;


}
