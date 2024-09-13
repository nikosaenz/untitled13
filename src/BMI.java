//demo
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        final double POUNDS_TO_KILOGRAMS = 1 / 2.2;
        final double INCHES_TO_METERS = 0.0254;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter height in feet: ");
        int heightFeet = input.nextInt();

        System.out.print("Enter height in inches: ");
        int heightInches = input.nextInt();

        double weightKilograms = weightPounds * POUNDS_TO_KILOGRAMS;
        int totalInches = heightFeet * 12 + heightInches;
        double heightMeters = totalInches * INCHES_TO_METERS;

        double bmi = weightKilograms / (heightMeters * heightMeters);

        System.out.printf("BMI: %.2f\n", bmi);
    }
}