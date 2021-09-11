package com.biz.datastructure.programs;

import java.util.Scanner;

public class BinarySearchTree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of test cases: ");
        int n = scanner.nextInt();
        scanner.close();

        Operations operations = new Operations();

        //prints number of binary trees possible
        System.out.println("Number of binary trees possible: "
                + operations.treeCount(n));
    }
}