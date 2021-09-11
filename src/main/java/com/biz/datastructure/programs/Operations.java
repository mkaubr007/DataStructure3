package com.biz.datastructure.programs;

public class Operations {
    public int treeCount(int number) {
        int intSum = 0;
        if(number == 0 || number == 1) {
            return 1;
        } else if(number == 2) {
            return 2;
        } else {
            for(int i = 0; i < number; i++) {
                intSum = intSum + treeCount(i) * treeCount(number - i - 1);
            }
            return intSum;
        }

    }
}
