package com.company;

///연속 부분의 최대합

import java.util.*;

public class Main {

    public static ArrayList<Integer> box = new ArrayList<>();
    public static int result = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //총 몇개의 숫자를 입력 받을 것인지
        int a;
        int b[];

        a = sc.nextInt();
        b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();

            if (i > 0 && b[i - 1] + b[i] > b[i]) b[i] += b[i - 1];

            if (b[i] > result) result = b[i];
        }

        System.out.println(result);

    }
}


