package com.mh.restapi03.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRespositoy productRespositoy;

    public Product addProduct(Product product){
        Product dbProduct = productRespositoy.save(product);
        return dbProduct;

    }
}
