package dev.mrkevr.messageclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.mrkevr.messageclient.service.MessageClientService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client/messages")
public class MessageClientController {

	private final MessageClientService messageClientService;

	@GetMapping
	String hello() {
		
		return messageClientService.hello();
	}
}
