package com.tarmac.janteloo.challenge.utils;

import org.springframework.web.client.RestTemplate;

public class HttpUtil {

    public static String performGet(String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
