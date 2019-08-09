package com.company;

import javax.jws.soap.SOAPBinding;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class B {
    public static void main (String [] args) {
        System.out.println("Name " + "Ivan" + "hi");
        String name = "Ivan";
       String s = String.format("Name -%s hi his age %d !!!!", name, 22);
       System.out.println(s);
        System.out.println(new Random()
        .ints('a', 'z')
               .limit (1256)
        .mapToObj(h-> "" +(char)h)
                .collect (Collectors.joining()));
    }
}






