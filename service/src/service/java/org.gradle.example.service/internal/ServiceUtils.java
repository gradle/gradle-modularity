package org.gradle.example.service.internal;

import org.apache.http.client.methods.HttpGet;

public class ServiceUtils {
    public static final String CONSTANT = "FOO";

    public void doRequest() {
        HttpGet httpget = new HttpGet(
                "https://www.google.com/search?hl=en&q=gradle");
    }
}
