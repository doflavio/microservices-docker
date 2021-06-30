package io.github.doflavio.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.doflavio.response.Cambio;

@FeignClient(name = "cambio-service")
public interface CambioProxy {
	
	@GetMapping(value = "/cambio-service/{amount}/{from}/{to}")
	public Cambio getCambio(
			@PathVariable("amount") Double amount,
			@PathVariable("from") String from,
			@PathVariable("to") String to
			);
}

//@FeignClient(name = "cambio-service", url = "localhost:8000")