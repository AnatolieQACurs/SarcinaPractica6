package com.company.topic4;

public class Methods {
   static int sum ( int primulNumar, int alDoileaNumar){
       int suma = 0;
       if (primulNumar > alDoileaNumar){
           System.out.println("Nu putem calcula suma");
           return suma;
       }
       else if (primulNumar == alDoileaNumar){
           System.out.println("Numerele sunt identice" );
           return primulNumar;
       }
       else {
           for (int i = primulNumar; i<= alDoileaNumar; i++){
               suma = suma + i;
           }
           System.out.println("For s-a finisat");
           System.out.println();
       }
       return suma;
   }
    static void sum(double a){
       double suma = 0;
       if (a > 0){
           while (a > 0){
               suma = suma + a;
               a--;
           }
           System.out.println("Ruzultatul este " + suma);
       }
       else if (a == 0){
           System.out.println("Suma  este zero ");
       }
       else {
           System.out.println("A<0 ");
           System.out.println("While sa finisat ");
    }
   }
}