package br.com.cea.ApiCancelamentoViagemRis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableCaching
@EnableAsync
@EnableSwagger2
public class ApiCancelamentoViagemRisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCancelamentoViagemRisApplication.class, args);
	}

}
