package com.utils.practice;

import com.utils.practice.utils.NumberUtil;
import com.utils.practice.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class UtilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilsApplication.class, args);
		Logger log = LoggerFactory.getLogger(UtilsApplication.class);

	/**
		 * method to extract name from full-name
		 */
		String name = StringUtil.getName("Firas Ahmed Mohammed AbdulGhaffar");

		//log.info("name: [{}]", name);


	/**
		 * method to a number
		 */
		int num = 0;
		boolean isCheck = NumberUtil.amountCheck(BigDecimal.valueOf(num));
		if (isCheck) {
			//log.info("number: [{}]", num);
		}


	/**
		 * method for list
		 */
		List<String> descriptions = Arrays.asList("One", "two", "three", "four");
		//List<String> descriptions = new ArrayList<>();
		List<String> myList = NumberUtil.getTransactionDescription("description", "this is a random description to test a method", descriptions);

		//log.info("List of descriptions: [{}]", myList);


	/**
		 * method to trim a string
		 */
		String word = "greetings from intellij";
		String hello = NumberUtil.transactionDescriptionSubString(word.trim(), 0, 2).trim();
		//log.info(hello);
		String description = "description";
		String newDesc = description.trim().length() > 22 ? "too large" : "good to go";


	/**
		 * regular expression
		 */

		String url = "https://www.baeldung.com/java-regex-s-splus";

		String[] splitUrl = url.split("\\s*");

		log.info("split url: [{}]", Arrays.asList(splitUrl));
	}
}
