package com.ariel.testexceptionhandler.service;

import com.ariel.testexceptionhandler.exceptions.NumberBiggerThan100Exception;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public int sumNumbers(int number1, int number2) {

        int sum = number1 + number2;

        if (sum > 100) {
            throw new NumberBiggerThan100Exception("Sum is bigger than 100.  Sum result is: " + sum);
        }

        return sum;

    }

}
