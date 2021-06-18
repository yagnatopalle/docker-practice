package org.example.docker.api;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GreeterTest {

    @Test
    public void testSayHello() {

        String dateTime = LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String resultString = "Hello World! The Localtime in Sydney is: " + dateTime;

        Greeter greeter = new Greeter(dateTime);
        Assert.assertTrue(resultString.equalsIgnoreCase(greeter.sayHello()));

    }

}