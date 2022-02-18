package com.example.ProjectDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class TestClass {

    @Autowired
    DemoService demoServiceMock;

    @Test
    public void test() {

        demoServiceMock.getQuote();
    }

}
