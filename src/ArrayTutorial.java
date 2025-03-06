import java.util.Arrays;
import java.util.Scanner;
public class ArrayTutorial {
    public static void main(String[]Args){
       /* String[] car;
        int size;
        String[] car = {"Toyota", "Hyundai", "Tata", "Maruti", "Jeep"};
        System.out.println(car[2]);
        int length = car.length;
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            Arrays.sort(car);
            System.out.println(car[i]);*/

            //ACCEPTING USER INPUT

        /*String[] car;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of cars you need : ");
        size = sc.nextInt();
        sc.nextLine();
        car = new String[size];
        for(int i = 0; i<car.length;i++) {
            System.out.print("enter the car company names");
            car[i] = sc.nextLine();
        }
        for(int j = 0; j<car.length; j++){
            System.out.println(car[j]);
        }
        sc.close();*/

        //SEARCHING AN ARRAY

        /*int target = 2;
        int [] numbers;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size : ");
        size = sc.nextInt();
        numbers = new int[size];
        for (int j = 0; j< numbers.length;j++){
            System.out.print("enter the number to check ");
            numbers[j] = sc.nextInt();
        }
        for(int i = 0; i< numbers.length; i++ ){
            if(target == numbers[i]){
                System.out.println("the number is at the index "+i);
            }
            else{
            System.out.println("not found");
            }
            sc.close();
        }*/

        //searching an string value from a string array
        String[] fruits;
        int size;
        String target;
        boolean istrue = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size please : ");
        size = sc.nextInt();
        sc.nextLine();
        System.out.print("enter target ");
        target = sc.nextLine();

        fruits = new String[size];


        for(int i = 0; i< fruits.length; i++) {
            System.out.print("enter the fruits name: ");
            fruits[i] = sc.nextLine();
        }
        for(int i = 0; i<fruits.length;i++) {
            if (fruits[i].equals(target)) {
                System.out.println("the fruit is at index " + i);
                istrue = true;
                break;
            }
        }
            if(!istrue){
                System.out.println(" no number found in array");
            }
            else {
                System.out.println("something wrong");

        }
        sc.close();

        }
        }


