import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int randomNumber = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);

        System.out.print("Please input your number: ");

        int usersNumber = input.nextInt();


        System.out.println(randomNumber);
        while (usersNumber!= randomNumber){
            System.out.println("Incorrect number, please try again!");
            usersNumber = input.nextInt();

        }

        System.out.printf("Yes, you were right, it was %d", randomNumber);
    }

}