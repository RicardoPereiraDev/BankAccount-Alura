package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);

        //Declarar as variaveis:

        double initialBalance = 1000.00;
        double updateBalance=0;

        int numberOfOptional=0;

        //Inicializar os dados do cliente:
        System.out.println();
        System.out.println("*******************************************************");
        System.out.println("Initial data of client: ");
        System.out.println();

        System.out.print("Name:                 Ricardo David ");
        System.out.println();

        System.out.print("Type of Bank Account: Current ");
        System.out.println();

        System.out.println("Initial Balance:      1000€");
        System.out.println("*****************************************************");


        while(numberOfOptional !=4){

            System.out.println();
            System.out.println("Operações");
            System.out.println();

            System.out.println("""
                    1-Verify Balance
                    2-Receive money in Balance
                    3-Withraw money of Balance
                    4-Exit
                     
                    Digite a opção desejada:
                    """
            );

            numberOfOptional= sc.nextInt();

            if(numberOfOptional == 1){
                System.out.println("The actual balance is = " + initialBalance );
            }
            else if(numberOfOptional == 2){
                System.out.println("Inform how much money do you want receive?");
                double moneyToReceive = sc.nextDouble();
                updateBalance = moneyToReceive + initialBalance;
                System.out.println("Update balance is: " + updateBalance);
            }
            else if(numberOfOptional == 3) {
                System.out.println("Inform the quantity of money that you want transfer?");

                double withdrawMoney = sc.nextDouble();

                if(withdrawMoney > updateBalance) {
                    System.out.println("Is not possible because your updapte balance is less than you want take.");
                }
                else {
                    double newUpdateBalance = updateBalance - withdrawMoney;
                    System.out.println("The new update balance now is : " + newUpdateBalance);
                }

            }
            else if(numberOfOptional != 4) {
                System.out.println("Invalid option");
            }
            else{
                System.out.println("Session close");
            }
        }
    }
}