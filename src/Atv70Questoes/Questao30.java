package Atv70Questoes;

import java.util.Scanner;
public class Questao30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which number do you want to print for the sequence?");
        int number = input.nextInt();
        int firtnumber = 0, secondnumber = 1;

        for(int i = 1; i <=number; i++){

            System.out.print(firtnumber );
            int next = firtnumber + secondnumber;
            firtnumber = secondnumber;
            secondnumber = next;

            if(i<number){
                System.out.print(", ");
            }
        }
    }
}




