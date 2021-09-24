package com.itheima.redission.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Version: V1.0
 */
@SpringBootTest
public class KeyOpertionsTest {

    @Autowired
    KeyOpertions keyOpertions;


    @Test
    void addData() {
        keyOpertions.addData();
    }

    @Test
    void foundedKeys() {
        keyOpertions.foundedKeys();
    }

    @Test
    void deleteKeys() {
        keyOpertions.deleteKeys();
    }

    @Test
    void addData2(){
        keyOpertions.addData2();
    }
}
