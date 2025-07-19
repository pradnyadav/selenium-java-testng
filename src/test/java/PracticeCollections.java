import org.testng.annotations.Test;

import java.util.*;
import java.util.HashSet;

public class PracticeCollections {

    @Test
    public void arrayTest(){
        List<String> animal = new ArrayList<String>();
        System.out.println(animal.isEmpty());
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Rat");
        animal.add("Snake");
        animal.add(3,"lion");
        for(int i=0;i<animal.size();i++){
            System.out.println(animal.get(i));
        }
        System.out.println("------------------------------------");
        animal = new LinkedList<String>();

        animal.add("Cat");
        animal.add("Dog");
        animal.add("Rat");
        animal.add("Snake");
        animal.add(3,"lion");
        for(int i=0;i<animal.size();i++){
            System.out.println(animal.get(i));
        }
//        System.out.println("------------------------------------");
//        ArrayList <String> bird = new ArrayList<String>();
//        bird.add("Crow");
//        bird.add("Swan");
//        bird.add("Sparow");
//        bird.add("peacock");
//        for(int i=0;i<bird.size();i++){
//            System.out.println(bird.get(i));
//        }
//        System.out.println("------------------------------------");
//
//        animal.addAll(bird);
//        for(int i=0;i<animal.size();i++){
//            System.out.println(animal.get(i));
//        }
        System.out.println("------------------------------------");

//        animal.remove(1);
//        for(int i=0;i<animal.size();i++){
//            System.out.println(animal.get(i));
//        }
//        System.out.println("------------------------------------");
//
//        animal.removeAll(animal);
//        for(int i=0;i<animal.size();i++){
//            System.out.println(animal.get(i));
//        }
//        System.out.println("------------------------------------");
////
//        bird.set(2,"Cow");
//        for(int i=0;i<bird.size();i++){
//            System.out.println(bird.get(i));
//        }
//        System.out.println("------------------------------------");
//        animal.clear();
//        for(int i=0;i<animal.size();i++){
//            System.out.println(animal.get(i));
//        }
//        System.out.println("------------------------------------");
        Collections.sort(animal);
        for(int i=0;i<animal.size();i++){
            System.out.println(animal.get(i));
        }
        System.out.println("------------------------------------");

        Collections.reverse(animal);
        for(int i=0;i<animal.size();i++){
            System.out.println(animal.get(i));
        }




    }

    @Test
    public void hashSetPractice(){

        // HashSet - No duplicates and no index based access & no garantee of order
        Set<String> car = new HashSet<String>();

        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("BMW");  // Duplicate
        car.add("Mazda");
        car.add("Audi");
        car.add("Maruti");
        car.add("Elentra");
        car.add("Hundai");

        System.out.println(car);
        System.out.println("------------------------------------------");

// LinkedHashSet - follows insertion order & no duplicates
//        car = new LinkedHashSet<String>();
//        car.add("Volvo");
//        car.add("BMW");
//        car.add("Ford");
//        car.add("BMW");  // Duplicate
//        car.add("Mazda");
//        car.add("Audi");
//        car.add("Maruti");
//        car.add("Elentra");
//        car.add("Hundai");
//
//        System.out.println(car);
//        System.out.println("------------------------------------------");

        // TreeSet - Follows sorting and no duplicates
//        car = new TreeSet<String>();
//        car.add("Volvo");
//        car.add("BMW");
//        car.add("Ford");
//        car.add("BMW");  // Duplicate
//        car.add("Mazda");
//        car.add("Audi");
//        car.add("Maruti");
//        car.add("Elentra");
//        car.add("Hundai");

//        System.out.println(car);
//        System.out.println("------------------------------------------");

//        List<String> animal = new ArrayList<String>();
//        animal.add("Snake");
//        animal.add("Cat");
//        animal.add("Dog");
//        animal.add("Rat");
//        animal.add("Snake");
//        animal.add(3,"lion");
//        System.out.println(animal);
//
//        System.out.println("------------------------------------");
//
//        TreeSet<String> vehicles = new TreeSet<String>();
//        vehicles.addAll(car);
//        vehicles.addAll(animal);
//        System.out.println(vehicles);
        System.out.println("------------------------------------");

        String S1= "Hello";
        String S2= "Hello";
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
        System.out.println("------------------------------------");

        StringBuffer S3= new StringBuffer("Hello");
        StringBuffer S4= new StringBuffer("Hello");
        System.out.println(S3==S4);
        System.out.println(S3.equals(S3));





    }

}
