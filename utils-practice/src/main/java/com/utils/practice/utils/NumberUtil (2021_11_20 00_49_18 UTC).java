package com.utils.practice.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberUtil {

    private NumberUtil() {}

    public static String randomNumber() {
        return RandomStringUtils.randomNumeric(5);
    }

    public static boolean amountCheck(BigDecimal amount) {
        Integer fromAmountValue = Objects.isNull(amount) ? 0 : BigDecimal.ZERO.compareTo(amount);
        return Objects.isNull(amount) || fromAmountValue.equals(0);
    }

    public static List<String> getTransactionDescription(String transactionType, String transactionDescription, List<String> listOfTransactions) {
        List<String> transactionDescriptions = new ArrayList<>();
        List<String> transactionDescriptionListValues = new ArrayList<>();
        /**
         * if listOfTransactions in arguments is not empty
         *  AND does not contain transactionType (that is passed as argument)
         *  AND the length of transactionDescription (that is passed as argument) after being trimmed is not larger than 22, then
         */
        if (!listOfTransactions.isEmpty() && listOfTransactions.contains(transactionType) && transactionDescription.trim().length() > 22) {
            
            transactionDescriptions.add(0, transactionDescriptionSubString(transactionDescription.trim(), 0, 22).trim());
            if (transactionDescription.trim().length() > 23) {
                transactionDescriptions.add(1, transactionDescriptionSubString(transactionDescription.trim(), 23, 13).trim());
            }
            if (transactionDescription.trim().length() > 37) {
                transactionDescriptions.add(2, transactionDescriptionSubString(transactionDescription.trim(), 37, 3).trim());
            }
        } else {
            transactionDescriptions.add(transactionDescription.trim());
        }
        for (String value : transactionDescriptions) {
            if (StringUtils.isNotBlank(value)) {
                transactionDescriptionListValues.add(value);
            }
        }
        return transactionDescriptionListValues;

    }

    public static String transactionDescriptionSubString(String myString, int start, int length) {
        return myString.substring(start, Math.min(start + length, myString.length()));
    }


}
