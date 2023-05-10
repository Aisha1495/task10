package Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@Data
@MappedSuperclass
public class BaseEntity {

    Date createDate;
    Data updatedDate;
    Boolean isActive;
}
