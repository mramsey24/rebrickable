package com.mvrsoftware.rebrickable.adapter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.publisher.Mono;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RebrickableApiAdapterTest {

    @Autowired
    private RebrickableApiAdapter adapter;

    @Test
    public void testApiCall() throws Exception {
        //Given
        int setId = 7623;

        //When
        Mono<String> resultMono = adapter.someRestCall("sets");
        resultMono.doOnSuccess(response -> {
            System.out.println(response);
           // ClientResponse clientResponse = resultMono.
            //int statusCode = clientResponse.statusCode().value();
            //System.out.println("Status Code: " + statusCode);
        }).subscribe();
        //System.out.println(result.toString());

        //Then
        assertThat(resultMono).isNotNull();
    }
}
