package com.example.ProjectDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class TestClass {

    @Mock
    DemoService demoServiceMock;

    @Test
    public void test() {
        System.out.println("Before ");
        demoServiceMock.getQuote();
        System.out.println("after");
    }

}
