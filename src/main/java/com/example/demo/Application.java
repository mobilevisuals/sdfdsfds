package com.example.demo;

import domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//https://spring.io/guides/gs/consuming-rest/
@SpringBootApplication
public class Application {


	public static void main(String args[]) {
		SpringApplication.run(Application.class);
                 RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        String test= quote.toString();
                   String test2= quote.toString();
                
	}

	/*@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
                    //Retrieve a representation by doing a GET on the URL . The response (if any) is converted and returned.
                    
			Quote quote = restTemplate.getForObject(
					"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			 String test= quote.toString();
                        System.out.println(quote.toString());
		};*/
                
                /*
                Parameters:
url - the URL
responseType - the type of the return value
Returns:
the converted object
                */
                
	//}
}
