package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println(java.util.Arrays.asList(Month.values()));
        System.out.println("Please select a Month");
        String inputMonth = scanner.next();

//        if(scanner.next() == Month.getEnglishName()){
//        }
        Month.valueOf(inputMonth.toUpperCase());
        ArrayList<String> months = new ArrayList<>();

        switch (Month.valueOf(inputMonth.toUpperCase())){
            case JANUARY:
                months.add(Month.JANUARY.getEnglishName());
            case FEBUARY:
                months.add(Month.FEBUARY.getEnglishName());
            case MARCH:
                months.add(Month.MARCH.getEnglishName());
            case APRIL:
                months.add(Month.APRIL.getEnglishName());
            case MAY:
                months.add(Month.MAY.getEnglishName());
            case JUNE:
                months.add(Month.JUNE.getEnglishName());
            case JULY:
                months.add(Month.JULY.getEnglishName());
            case AUGUST:
                months.add(Month.AUGUST.getEnglishName());
            case SEPTEMBER:
                months.add(Month.SEPTEMBER.getEnglishName());
            case OCTOBER:
                months.add(Month.OCTOBER.getEnglishName());
            case NOVEMBER:
                months.add(Month.NOVEMBER.getEnglishName());
            case DECEMBER:
                months.add(Month.DECEMBER.getEnglishName());
                System.out.println(months);
        }

    }
}
