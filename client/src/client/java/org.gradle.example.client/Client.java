package org.gradle.example.client;

import org.gradle.example.service.Service;
import org.gradle.example.service.internal.ServiceUtils;

public class Client {
    Service service;

    public void clientMethod() {
        System.out.println(ServiceUtils.CONSTANT);
    }
}
