package com.mvrsoftware.rebrickable.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RebrickableRestTemplateTest {

    @Test
    public void testGetColors () throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String rebrickableUrl = "https://rebrickable.com/api/v3/lego/colors/?key=";
        ResponseEntity<String> response = restTemplate.getForEntity(rebrickableUrl , String.class);
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
        System.out.println(response);
    }
}
