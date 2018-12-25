package cn.kry.sceuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class Sb2scEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sb2scEurekaApplication.class, args);
    }
}
public class ScEurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScEurakaApplication.class, args);
	}

}

