package com.javaLearning;

public class NumberToWords {
    public static void main(String [] args){
        getDigitCount(0);
        getDigitCount(123);
        getDigitCount(-12);
        getDigitCount(5200);
        reverse(-121);
        reverse(1212);
        reverse(1234);
        reverse(100);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    public static void numberToWords(int number){
        int reversedNumber = reverse(number);
        String numberInWords = "";
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        while (reversedNumber != 0) {
            int num = reversedNumber % 10;
            reversedNumber /= 10;
            switch (num) {
                case 0:
                    numberInWords = numberInWords + "Zero ";
                    break;
                case 1:
                    numberInWords = numberInWords + "One ";
                    break;
                case 2:
                    numberInWords = numberInWords + "Two ";
                    break;
                case 3:
                    numberInWords = numberInWords + "Three ";
                    break;
                case 4:
                    numberInWords = numberInWords + "Four ";
                    break;
                case 5:
                    numberInWords = numberInWords + "Five ";
                    break;
                case 6:
                    numberInWords = numberInWords + "Six ";
                    break;
                case 7:
                    numberInWords = numberInWords + "Seven ";
                    break;
                case 8:
                    numberInWords = numberInWords + "Eight ";
                    break;
                case 9:
                    numberInWords = numberInWords + "Nine ";
                    break;
                default:
                    break;
            }
        }
        System.out.printf(numberInWords);
        if (getDigitCount(reverse(number)) != getDigitCount(number)) {
            for (int i = getDigitCount(reverse(number)); i < getDigitCount(number); i++) {
                System.out.printf("Zero ");
            }
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        int originalNumber = number;
        while(number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if (number < 0)
            return -1;
        if (number == 0) {
            return 1;
        }
        else{
            int counter = 0;
            while (number != 0){
                number /= 10;
                counter++;
            }
            return counter;
        }
    }
}