package br.edu.infnet.applocacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApplocacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplocacaoApplication.class, args);
	}

}
