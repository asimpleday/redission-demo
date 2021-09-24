package com.itheima.redission.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description:
 * @Version: V1.0
 */
@SpringBootTest
class RMapOpertionsTest {

    @Autowired
    RMapOpertions rMapOpertions;

    @Test
    void rMapOper() {
        rMapOpertions.rMapOper();
    }
}
