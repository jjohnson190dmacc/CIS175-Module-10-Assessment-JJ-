package dmacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dmacc.repo.IToolRepo;

@SpringBootApplication
public class HardwareStoreApplication {
	
	@Autowired
	IToolRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(HardwareStoreApplication.class, args);
	}

}
