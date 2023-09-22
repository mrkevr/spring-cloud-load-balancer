package dev.mrkevr.messageclient.config;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.mrkevr.messageclient.service.DemoInstanceSupplier;

@Configuration
public class ServerInstanceConfig {

	@Bean
	ServiceInstanceListSupplier serviceInstanceListSupplier() {
		return new DemoInstanceSupplier("message-service");
	}
}
