package Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data

public class Users extends BaseEntity{

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;


    @Column
    String name;

    @Column
    Integer phoneNum;





}
