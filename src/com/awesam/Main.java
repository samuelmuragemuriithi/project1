package com.awesam;

import java.util.*;

public class Main {
    static void createGroup() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the name of your group: ");
        String groupName = scanner.nextLine();
        System.out.print("Enter number of members: ");
        int size = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numbers.size() < size) {
            int random = randomGenerator.nextInt(size);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print("member "+i+ ":"+"Enter your Name: ");
            String Name = scanner.next();
            System.out.print("Enter Amount: ");
            int Amount = scanner.nextInt();

            if (Amount< 500) {
                System.out.println("Kindly recharge full amount");
                i--;
            }
            else {
                System.out.println("You will withdraw on day:"+numbers.get(i));
            }

        }
        System.out.print("if done press 1 and 2 otherwise: ");
        int end = scanner.nextInt();
        if (end!=1)createGroup();
    }

    static void spin() {

        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            x.add(i);
        }
        Random randomGenerator = new Random();
        int random = x.get(randomGenerator.nextInt(10));
        if (random==0){
            System.out.println("you will withdraw today");
            x.remove(Integer.valueOf(0));
        } if (random==1){
            System.out.println("you will withdraw tomorrow");
            x.remove(Integer.valueOf(1));
        } if (random==2){
            System.out.println("you will withdraw 2");
            x.remove(Integer.valueOf(2));
        } if (random==3){
            System.out.println("you will withdraw 3");
            x.remove(Integer.valueOf(3));
        } if (random==4){
            System.out.println("you will withdraw 4");
            x.remove(Integer.valueOf(4));
        } if (random==5){
            System.out.println("you will withdraw 5");
            x.remove(Integer.valueOf(5));
        } if (random==6){
            System.out.println("you will withdraw 6");
            x.remove(Integer.valueOf(6));
        } if (random==7){
            System.out.println("you will withdraw 7");
            x.remove(Integer.valueOf(7));
        } if (random==8){
            System.out.println("you will withdraw 8");
            x.remove(Integer.valueOf(8));
        } if (random==9){
            System.out.println("you will withdraw 9");
            x.remove(Integer.valueOf(9));
        } if (random==10){
            System.out.println("you will withdraw 10");
            x.remove(Integer.valueOf(10));
        }

    }

    static Integer[] shuffle(int size) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numbers.size() < size) {
            int random = randomGenerator.nextInt(size);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }
        Integer[] array = numbers.toArray(new Integer[0]);
        return array;
    }



    public static void main(String[] args) {
        System.out.println( Arrays.toString(shuffle(5)));
        createGroup();
    }

}


