package com.company.topic3;

public class Operations {
    	static void printAritmeticOperations(){
          int a = 10;
          int b = 15;
            System.out.println("Adunarea: " + (a + b));
            System.out.println( "Scaderea: " + (a - b));
            System.out.println("Inmultirea: " + (a * b));
        }
    	static void printLogicOperations(){
            boolean c = true;
            boolean d = false;
            System.out.println( "And: " + ( c && d));
            System.out.println( " Or: " + ( c || d));
            System.out.println( "Negatia: " + !( c && d));
        };
    	static void printRelationarOperations() {
            int z = 60;
            double x = 5;
            System.out.println("Egalitate: " + (z == x));
            System.out.println("Diferenta: " + (z != x));
            System.out.println(" Mai mare:" + (z > x));
        }
        static void useForAndWhile(){
           int num = 1;
           int lim = 12;
           while ( num <= lim) {
               System.out.print(num + " ");
               num++;
           }
            System.out.println(" While");

               for (int i = 5;  i <= lim; i++){
                   System.out.print(i + " ");
               }
               System.out.println(" For ");
        };
}
