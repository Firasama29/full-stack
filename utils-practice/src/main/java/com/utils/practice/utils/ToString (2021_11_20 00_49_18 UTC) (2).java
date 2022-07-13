package com.utils.practice.utils;

import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.util.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToString {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("001", "002", "003", "004");

        String transactionDescription = String.join("", stringList);

//        System.out.println(transactionDescription);

        String code = "001002003004";
        String codesString = StringUtils.substring(code, 3);
//        System.out.println("string" + codesString);
        List<String> codeList = Arrays.asList(codesString);

//        System.out.println("list" + codeList);
        String[] stringArr = {"001", "002", "003", "004"};
        String test = ConvertControlValuesToString(stringArr);
//        System.out.println("array " + test);
        String[] arr = ConvertControlValuesToArray(code, 3);
        for(int i = 0; i < code.length(); i++) {

            System.out.println("array :" + Arrays.asList(arr[i]));
        }


//        stringList.add(0, transactionDescriptionSubString(transactionDescription.trim(), 0, 22).trim());

    }

    public static String[] ConvertControlValuesToArray(String countriesCurrenciesMerchant, int length) {
//        List<String> countriesCurrenciesMerchantCategories = new ArrayList<>(Arrays.asList(countriesCurrenciesMerchantCategoriesList));
        String[] stringArr = null;
//        for(int i = 0; i < countriesCurrenciesMerchant.length(); i++) {
            countriesCurrenciesMerchant = countriesCurrenciesMerchant.substring(length);
//        }
//        String test = StringUtils.substring(countriesCurrenciesMerchant, 3);
        return stringArr;
    }

    public static String ConvertControlValuesToString(String[] countriesCurrenciesMerchantCategoriesList) {
        List<String> countriesCurrenciesMerchantCategories = new ArrayList<>(Arrays.asList(countriesCurrenciesMerchantCategoriesList));
        return String.join("", countriesCurrenciesMerchantCategories);
    }

    private static String transactionDescriptionSubString(String myString, int start, int length) {
        return myString.substring(start, Math.min(start + length, myString.length()));
    }
}
