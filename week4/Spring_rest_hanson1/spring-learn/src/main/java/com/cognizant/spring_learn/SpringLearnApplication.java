package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);

		// Hands-on 6
		displayCountries();

		/*
		// Hands-on 4
		displayCountry();

		// Hands-on 2
		displayDate();
		*/
	}

	//  Hands-on 6: Load list of countries from XML
	public static void displayCountries() {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		List<Country> countryList = context.getBean("countryList", ArrayList.class);

		LOGGER.debug("Country List: {}", countryList);

		LOGGER.info("END");
	}

	/*
	//  Hands-on 4: Load single country bean
	public static void displayCountry() {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		// Hands-on 5: Singleton vs Prototype
		Country country = context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);

		LOGGER.debug("Country : {}", country);
		LOGGER.debug("Another Country : {}", anotherCountry);

		LOGGER.info("END");
	}
	*/

	/*
	//  Hands-on 2: Load SimpleDateFormat from XML
	public static void displayDate() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date date = format.parse("31/12/2018");
			LOGGER.debug("Parsed Date: {}", date);
		} catch (ParseException e) {
			LOGGER.error("Parse Error", e);
		}
		LOGGER.info("END");
	}
	*/


}
