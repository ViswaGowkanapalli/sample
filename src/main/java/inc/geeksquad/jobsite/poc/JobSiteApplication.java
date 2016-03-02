package inc.geeksquad.jobsite.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@RestController
@RequestMapping("/profiles")
public class JobSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobSiteApplication.class, args);
	}
	
	@RequestMapping(value="/test")
	public String getString(){
		return "{mallik:'vala'}";
	}
}
