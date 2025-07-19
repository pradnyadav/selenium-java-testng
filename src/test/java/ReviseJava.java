import com.sun.jna.platform.linux.LibC;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ReviseJava {

    @Test
    //Write a program to swap two numbers without using a third variable.
    public void swapNumbers(){
        int a = 30;
        int b = 10;
        a = a + b;
        b= a-b;
        a=a-b;
        System.out.println("a = "+a +" b = "+b);

    }

    @Test
    //Write a program to check if a number is even or odd.
    public void toCheckOddEvenNumber(){
        // get number from user
        int num = 13;
        if (num % 2 == 0){
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
    

    @Test
    public void toUseSwitchCase(){
        int Day = 2;
        switch (Day){
            case 1:
                System.out.println("its  a Monday");
                break;
            case 2:
                System.out.println("its  a Tuesday");
                break;
            case 3:
                System.out.println("its  a Wednesday");
                break;
            case 4:
                System.out.println("its  a Thursday");
                break;
            case 5:
                System.out.println("its  a Friday");
                break;
            case 6:
                System.out.println("its  a Saturday");
                break;
            case 7:
                System.out.println("its  a Sunday");
                break;

        }

    }

    @Test
    public void fibonacciSeries(){
        System.out.println(" Fibonacci Series:- ");
        int sum=0, a=1, b=0;
        while (sum <=100){
            sum= a+b;
            System.out.println(" "+sum);
            a=b;
            b=sum;

        }
    }

    @Test
    //Star Pattern
    public void starPatterArray1(){
        System.out.println("Star Pattern");
        for(int i=1;i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println(" \n");
        }
    }

    public void starPatterArray2(){
        System.out.println("Star Pattern 2");
        for(int i=1;i<=5;i++){
            for(int j=1; j<=10; j++){
                if(j<5){
                    if (j>=i){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }

                }
                else{
                    if (j>=i){
                        System.out.print("   ");
                    }
                    else {
                        System.out.print(" * ");
                    }

                }


            }
            System.out.println(" \n");
        }
    }

    @Test
    public void pattern(){
        System.out.println("Star Pattern 2");
        for(int i=5;i>=0;i--){
            for(int j=0;j<5;j++){
                if(j<i){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }

            }
            System.out.println("\n");
        }

    }

    @Test
    public void primeNumber(){
       int primenumber = 5;
       boolean isprime = true;
       if (primenumber<=1){
           isprime = false;
       } else {
           for (int i=2; i<primenumber;i++){
               if(primenumber%i == 0){
                   isprime= false;
                   break;
               }

           }
           
       }
       if (isprime){
           System.out.println( "yes its a prime number");
       }
       else{
           System.out.println( "No its not a prime number");
       }
    }

    @Test
    public void reverseStringArray(){

        String str1= "Pradnya";
        String str1Reverse= " ";
        for (int i= str1.length()-1; i>=0; i--){
            str1Reverse = String.valueOf(str1.charAt(i));
            System.out.print(str1Reverse);
        }
        str1="Preetam";
        StringBuffer str2 = new StringBuffer(str1);
        str2.reverse();
        System.out.println("\n" +str2);


    }

    @Test
    public void largestAndSmallestNumber(){

        int a[]= {22,15,9,2,50,63};
        for (int i=0; i<(a.length-1);i++){
            for (int j= (i+1);j<a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }

        }
        System.out.println("Largest Element = "+a[0] +"\n"+ "Smallest Element "+a[a.length-1]);
    }

    @Test
    public void palindrome(){
        // method 1 #################################
        StringBuffer str1= new StringBuffer("madam");
        StringBuffer str2 = new StringBuffer(str1);
        str2.reverse();
        System.out .println(str2);
        if (str1.toString().equals(str2.toString())){
            System.out.println(str1 + " is a Palindrome");
        }
        else {
            System.out.println(str1 + " is not a Palindrome");
        }

        // method 2 ####################################
        String str3= "eye";
        String str4 = (new StringBuilder(str3)).toString();
        System.out .println(str4);
        if (str3.equals(str4)){
            System.out.println(str3 + " is a Palindrome");
        }
        else {
            System.out.println(str3 + " is not a Palindrome");
        }

    }

//    @Test
//    public void testOverriding(){
//        Vehicle vehicle = new Vehicle();
//        vehicle.wheels();
//        vehicle.colour();
//
//        Car car= new Car();
//        car.wheels();
//        car.colour();
//        car.windshield();
//
//        Vehicle v1= new Car();
//        v1.wheels();
//    }

    @Test
    public void exceptionHandling(){
        int a= 10;
        int b= 0;
        int c;
    try{
        c=a/b;
        System.out.println(c);
    } catch (Exception e) {
        System.out.println("no division by 0");
    }
    }

    @Test
    public void hashMapPractice(){
        HashMap <String,String > HSMP1= new HashMap<>();
        HSMP1.put("Japan","Pradnya");
        HSMP1.put("India","Pradnya");
        HSMP1.put("Pakistan","Pradnya");
        HSMP1.put("Chennai","Pradnya");
        HSMP1.put("USA","Preetam");
        HSMP1.put("Germany","Pradnya");
        HSMP1.put("Poland","Anya");
        HSMP1.put("Italy","Pradnya");

        System.out.println(HSMP1);
        System.out.println(" --------------------------------------------------");

        TreeMap<Integer, String> array2= new TreeMap<>();
        array2.put(20, "abc");
        array2.put(12, "abc");
        array2.put(2, "abc");
        array2.put(22, "abc");
        array2.put(28, "abc");
        array2.put(30, "abc");
        System.out.println(array2);



    }

    @Test
    public void validateLeaveListFromDateIsToday() {
        // Step 1: Format today's date as seen on OrangeHRM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Change format if needed
        String expectedDate = LocalDate.now().format(formatter);
        System.out.println(expectedDate);
    }

}
