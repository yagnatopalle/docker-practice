package org.example.docker.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {

   public static void main(String[] args) {

        Greeter greeter = new Greeter(LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        System.out.println(greeter.sayHello());
    }
}
