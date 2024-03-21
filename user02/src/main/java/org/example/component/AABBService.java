package org.example.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;


@Qualifier("AABBService")
public class AABBService {

    @Autowired(required = false)
    AA aa;

    @Autowired(required = false)
    BB bb;

}
