package com.company;

import java.io.IOException;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int [] b = new int [5];// выделили память но не указали значения
        System.out.println(Arrays.toString(b));// преобразование массива к строке путём метода toString из класса Arrays ля нулевых значение, b-
}}


имеет значения по умолчанию, т.е. 0

