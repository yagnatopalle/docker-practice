package org.example.docker.api;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Greeter {

    private final String dateTime;

    public String sayHello() {

        return "Hello World! The Localtime in Sydney is: " + dateTime;

    }
}
