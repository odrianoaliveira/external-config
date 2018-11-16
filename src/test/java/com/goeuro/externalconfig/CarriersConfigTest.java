package com.goeuro.externalconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarriersConfigTest {

    @Autowired
    private CarriersConfig config;

    @Test
    public void test() {
        assertEquals(4, config.getSupported().size());
    }

}