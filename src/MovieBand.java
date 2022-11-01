import java.util.Scanner;

public class MovieBand {


    public static void main(String[] args) {
        double age;

        Scanner a = new Scanner(System.in);
        System.out.println("Enter your age");

        age = a.nextDouble();


        if (age >=21) {
            System.out.println("You get a Wristband");

        } else {
            System.out.println("you dont get wristband");
        }
    }
}

