package com.modernjava.parallelStream;

import lombok.Data;

@Data
public class Sum {

    private int total;

    public void performSum(int input) {

        total+= input;
    }
}
