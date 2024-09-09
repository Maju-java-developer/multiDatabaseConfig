package co.sapphire.multidatabaseconfig.MySQlDBResources.enttiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
@SecondaryTable(name = "USER_DETAILS", pkJoinColumns = @PrimaryKeyJoinColumn(name = "userId"))
public class UserEntity {
    @Id
    private Integer userId;
    private String userName;

    @Column(table = "USER_DETAILS", name = "ADDRESS")
    private String address;

    @Column(table = "USER_DETAILS", name = "CONTACT")
    private String contact;

    @ElementCollection
    @CollectionTable(name = "user_phones", joinColumns = @JoinColumn(name = "userId"))
    @MapKeyColumn(name = "type")
    @Column(name = "phone_number")
    private Map<String, String> phoneNumbers = new HashMap<>();
}
