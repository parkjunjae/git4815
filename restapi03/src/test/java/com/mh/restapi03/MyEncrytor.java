package com.mh.restapi03;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class MyEncrytor {
    //    @Value("${jasypt.encryptor.password}")
    private String password = "passw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rdpassw@rd";

    @Test
    void name() {
        System.out.println("실행됩니다." + password);

        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setPoolSize(4);
        encryptor.setPassword(password);
        encryptor.setAlgorithm("PBEWithMD5ANdTripleDES");

        String content = "jdbc:mysql://localhost:3307/mh?useSSL=false&allowPublicKeyRetrieval=true&characterEncoding=UTF-8&serverTimezone=UTC";
        String encString = encryptor.encrypt(content);
        String decString = encryptor.encrypt(encString);

        System.out.println(String.format("encString = %s decString = %s", encString, decString));


        content = "root";
        encString = encryptor.encrypt(content);
        decString = encryptor.encrypt(encString);

        System.out.println(String.format("encString = %s decString = %s", encString, decString));


        content = "1234";
        encString = encryptor.encrypt(content);
        decString = encryptor.encrypt(encString);

        System.out.println(String.format("encString = %s decString = %s", encString, decString));
    }

}
