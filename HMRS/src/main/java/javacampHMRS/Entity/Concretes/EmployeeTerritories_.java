package javacampHMRS.Entity.Concretes;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "employee_territories")
@Getter
@Setter
public class EmployeeTerritories_  implements Serializable {

    @Id
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "territory_id")
    private int territoryId;
}
