package com.mvrsoftware.rebrickable.adapter;


import com.mvrsoftware.rebrickable.model.BrickSet;
import com.mvrsoftware.rebrickable.service.RebrickableService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class RebrickableApiAdapter {

    private final String apiKey="";
    private final WebClient webClient;

    public RebrickableApiAdapter(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://rebrickable.com/api/v3/lego").build();
    }

    public Mono<String> someRestCall(String name) {
        Mono<String> responseMono = this.webClient.get()
                .uri("/sets/?key="+apiKey)
                .retrieve()
                .bodyToMono(String.class);

        responseMono.doOnNext(response -> {
                    System.out.println(response);
                }).subscribe();

        return responseMono;
    }
    public BrickSet getSet(int setId) {
        BrickSet brickSet = new BrickSet();
        return brickSet;
    }
}
