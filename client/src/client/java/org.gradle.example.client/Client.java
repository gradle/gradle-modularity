package org.gradle.example.client;

import org.gradle.example.service.Service;

public class Client {
    Service service;

    public void clientMethod() {
        System.out.println("FOO");
        HttpGet httpget = new HttpGet(
                "https://www.google.com/search?hl=en&q=gradle");
    }
}
