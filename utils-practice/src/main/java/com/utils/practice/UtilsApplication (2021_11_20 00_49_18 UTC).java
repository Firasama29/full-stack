package com.utils.practice;

import com.utils.practice.utils.NumberUtil;
import com.utils.practice.utils.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

//		log.info("split url: [{}]", Arrays.asList(splitUrl));


//		System.out.println(convertStringToArray("hello", 0, 2));

		String list = "001002003004005";
		String[] stringArray = list.split("");
		List<String> items = new ArrayList<>();
//		List<String> items = new ArrayList<>(Arrays.asList(stringArray));
		for (int i = 0; i < list.length(); i++) {
			if (!StringUtils.isEmpty(list)) {
				items.add(convertStringToArray(list, i++, 3));

			}
		}

		String something = "001002003004";

//		System.out.println(Optional.ofNullable(something).map(String::trim).orElse(null));
//
		System.out.println(items);
		int i = 1;
		if(i > 10) {
			String[] newArray = convertToArray(list, 3);
			System.out.println(Arrays.asList(newArray));
		} else {
			String[] newArray = convertToArray(list, 4);
			System.out.println(Arrays.asList(newArray));
		}
	}


	private static String convertStringToArray(String myString, int start, int length) {
		return myString.substring(start, Math.min(start + length, myString.length()));
	}

	public static List<String> getList(String list) {
		List<String> items = new ArrayList<>();
		if (!StringUtils.isEmpty(list)) {
			items = Arrays.asList(list.split("\\s*,\\s*"));
		}
		return items;
	}

	public static String[] convertToArray(String something, int length) {
		int i;
		List<String> items = new ArrayList<>();
		for (i = 0; i < something.length(); i++) {
			if (!StringUtils.isEmpty(something)) {
				items.add(convertStringToArray(something, i++, length));
				return items.toArray(new String[i]);
			}

		}
		return null;
	}
}
