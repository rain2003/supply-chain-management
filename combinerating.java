package project;

import java.util.Scanner;

public class combinerating implements feedback{

    @Override
    public void review() {
        System.out.println("How was the product : ");
        String r ;
        Scanner sc2 = new Scanner(System.in);
        sc2.nextLine();
        System.out.println("thanks !!");
    }

    @Override
    public void Rating() {
        System.out.println("Give product Rating out of (5): ");
        String r ;
        Scanner sc2 = new Scanner(System.in);
        sc2.nextLine();
        System.out.println("thanks !!");
    }}
