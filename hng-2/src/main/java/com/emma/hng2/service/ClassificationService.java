package com.emma.hng2.service;

import com.emma.hng2.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassificationService {

    @Autowired
    private RestTemplate restTemplate;

    public static int[] splitNumber(int number) {
        List<Integer> digits = new ArrayList<>();

        while (number > 0) {
            digits.add(0, number % 10); // Extract last digit and add at the beginning
            number /= 10; // Remove last digit
        }

        // Convert List to int array
        return digits.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Count the number of digits

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            sum += (int) Math.pow(digit, digits); // Raise to the power of total digits and sum
            num /= 10; // Remove last digit
        }

        return sum == originalNum;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;

        // Find all divisors and sum them (excluding the number itself)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false; // Prime numbers start from 2

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }

    public ResponseDto getNumberClassification(Integer number) {

        boolean isPrime = isPrime(number);
        boolean isPerfect = isPerfect(number);

        Integer digitSum = digitSum(number);
        String response = restTemplate.getForObject(String.format("http://numbersapi.com/%d/math", number), String.class);

        List<String> properties = getProperties(number);
        return new ResponseDto(number, Boolean.toString(isPrime), Boolean.toString(isPerfect), properties, digitSum, response);
    }

    private List<String> getProperties(Integer number) {
        List<String> prop = new ArrayList<>();

        if (isArmstrong(number)) {
            prop.add("armstrong");
        }

        if (number % 2 == 0) {
            prop.add("even");
        } else {
            prop.add("odd");
        }
        return prop;
    }

    private Integer digitSum(Integer number) {
        int[] split = splitNumber(number);
        int sum = 0;
        for (int num : split) {
            sum += num;
        }
        return sum;
    }
}
