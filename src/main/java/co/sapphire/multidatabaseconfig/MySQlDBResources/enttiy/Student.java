package co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    private Integer id;
    private String studentName;
    private String contact;
    private String address;
    private String department;
}
