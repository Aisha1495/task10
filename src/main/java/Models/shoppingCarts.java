package Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class shoppingCarts {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;
    String name;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    Users customer;
    @ManyToOne
    @JoinColumn(name = "Product_id", referencedColumnName = "id")
    products Products;

    @ManyToOne
    @JoinColumn(name = "Order_id", referencedColumnName = "id")
    orders Orders;

    @ManyToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    payment Payment;

    @ManyToOne
    @JoinColumn(name = "rating_id", referencedColumnName = "id")
    ratings rating;
}
