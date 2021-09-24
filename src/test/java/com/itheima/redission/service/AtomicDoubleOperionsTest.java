package com.itheima.redission.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AtomicDoubleOperionsTest {
    @Autowired
    private AtomicLongOpertions atomicLongOpertions;
    @Test
    public void test01(){
        atomicLongOpertions.atomicLongOper();
    }
}
