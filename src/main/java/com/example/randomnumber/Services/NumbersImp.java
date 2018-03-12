package com.example.randomnumber.Services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NumbersImp implements Numbers {

    int i;
    Random random;

    public NumbersImp() {
        this.i = 0;
        this.random = new Random();
    }

    @Override
    public int getNumber() {
        i = random.nextInt(50);
        return i+1;
    }
}
