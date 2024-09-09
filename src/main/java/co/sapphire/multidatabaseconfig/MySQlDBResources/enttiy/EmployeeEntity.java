package co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(
        name = "Employees",
        indexes = {
                @Index(name = "idx_emp_emp_cnic", columnList = "CNIC")
        },
        uniqueConstraints = {
//                @UniqueConstraint(name = "cnicUnique", columnNames = {"CNIC"}),
                @UniqueConstraint(name = "cnicUnique", columnNames = {"CNIC", "EMPLOYEE_NAME"})
        }
)
@Data
public class EmployeeEntity {

    @Id
    @Column(name = "EMPLOYEE_ID")
    private Integer empId;

    @Column(name = "EMPLOYEE_NAME")
    private String empName;

    @Column(name = "CNIC")
    private String empCnic;
}
