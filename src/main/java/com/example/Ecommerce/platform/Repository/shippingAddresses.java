package com.example.Ecommerce.platform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface shippingAddresses extends JpaRepository<shippingAddresses, Integer> {

}
