package certus.edu.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroAdminConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroAdminConfigServerApplication.class, args);
	}

}
