package com.cts;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Add
{
   public int getSum(int a,int b);
   
}
public class Test123 {
   public static void main(String[] args) {
       
       //Add add =( a, b) ->  a+b ;
     //  System.out.println(add.getSum(5, 6));
       
	   List<String> words = 
               Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
      words.forEach(System.out::println);
     
   }
}
