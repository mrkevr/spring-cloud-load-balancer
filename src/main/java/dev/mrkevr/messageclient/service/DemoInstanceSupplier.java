package dev.mrkevr.messageclient.service;

import java.util.List;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Data
@RequiredArgsConstructor
public class DemoInstanceSupplier implements ServiceInstanceListSupplier {

	private final String serviceId;

	@Override
	public Flux<List<ServiceInstance>> get() {

		return Flux.just(List.of(
				new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8081, false),
				new DefaultServiceInstance(serviceId + "2", serviceId, "localhost", 8082, false),
				new DefaultServiceInstance(serviceId + "3", serviceId, "localhost", 8083, false)
				));
	}
	@Override
	public String getServiceId() {
		return this.getServiceId();
	}
}
