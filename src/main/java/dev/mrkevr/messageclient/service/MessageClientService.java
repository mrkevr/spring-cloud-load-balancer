package dev.mrkevr.messageclient.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageClientService {

	private final WebClient.Builder webClientBuilder;

	public String hello() {
		
		WebClient webClient = webClientBuilder.build();
		
		String response = webClient.get()
				.uri("http://message-service/messages/hello")
				.retrieve().toEntity(String.class)
				.block()
				.getBody();

		return response;
	}
}
