package com.mh.restapi03.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespositoy extends JpaRepository<Product,Long> {
}
