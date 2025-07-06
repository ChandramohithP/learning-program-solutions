package com.cognizant.orm_learn;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//package com.cognizant.orm_learn;
//import org.slf4j.Logger;
//import com.cognizant.orm_learn.service.CountryService;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//@SpringBootApplication
//public class OrmLearnApplication {
//	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
//	private static CountryService countryService;
//	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
//		LOGGER.info("Inside main");
//		countryService = context.getBean(CountryService.class);
//		testGetAllCountries();
//	}
//	private static void testGetAllCountries() {
//		LOGGER.info("Start");
//		System.out.println(countryService.getAllCountries());
//		LOGGER.info("End");
//	}
//}
@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

//	@Autowired
//	private CountryRepository countryRepository;
	@Autowired
	private StockRepository stockRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		System.out.println("Countries containing 'ou':");
//		List<Country> countries = countryRepository.findByNameContaining("ou");
//		countries.forEach(c -> System.out.println(c.getCode() + " " + c.getName()));
//
//		System.out.println("\nCountries containing 'ou' sorted by name:");
//		countries = countryRepository.findByNameContainingOrderByNameAsc("ou");
//		countries.forEach(c -> System.out.println(c.getCode() + " " + c.getName()));
//
//		System.out.println("\nCountries starting with 'Z':");
//		countries = countryRepository.findByNameStartingWith("Z");
//		countries.forEach(c -> System.out.println(c.getCode() + " " + c.getName()));
//	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println("\nFacebook stock details - Sep 2019:");
		stockRepository.findByStCodeAndStDateBetween("FB",
						LocalDate.of(2019, 9, 1), LocalDate.of(2019, 9, 30))
				.forEach(s -> System.out.println(s.getStDate() + " " + s.getStOpen() + " " + s.getStClose()));

		System.out.println("\nGoogle stock where price > 1250:");
		stockRepository.findByStCodeAndStCloseGreaterThan("GOOGL", new BigDecimal("1250"))
				.forEach(s -> System.out.println(s.getStDate() + " " + s.getStClose()));

		System.out.println("\nTop 3 dates with highest volume:");
		stockRepository.findTop3ByOrderByStVolumeDesc()
				.forEach(s -> System.out.println(s.getStDate() + " " + s.getStVolume()));

		System.out.println("\n3 dates with lowest Netflix stock:");
		stockRepository.findTop3ByStCodeOrderByStCloseAsc("NFLX")
				.forEach(s -> System.out.println(s.getStDate() + " " + s.getStClose()));
	}

}
