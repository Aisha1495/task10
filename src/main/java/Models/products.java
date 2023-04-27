package Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class products {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Integer Id;
    String name;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    Users customer;

}
