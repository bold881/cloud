package cn.pigeoninfo.clienttwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class ClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientTwoApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@GetMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "unknown") String name) {
		return "hi " + name + ", I am from port:" + port;
	}

}

