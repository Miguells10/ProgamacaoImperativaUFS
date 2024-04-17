package Atv70Questoes;

import java.util.Scanner;

public class Questao42 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a x1: ");
        int x1 = input.nextInt();
        System.out.println("Enter a y1: ");
        int y1 = input.nextInt();
        System.out.println("Enter a x2: ");
        int x2 = input.nextInt();
        System.out.println("Enter a y2: ");
        int y2 = input.nextInt();

        float distance = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is: " + distance + "cm");


        input.close();


    }
}
