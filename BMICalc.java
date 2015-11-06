import java.util.*;
public class BMICalc{
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds.");
        double weightInLb;
        weightInLb = input.nextDouble();
        double weightInKg;
        weightInKg = weightInLb*0.453592;
        System.out.println("Enter your height in inches.");
        double heightInIn;
        heightInIn = input.nextDouble();
        double heightInM;
        heightInM = heightInIn*0.0254;
        double bmi;
        bmi = weightInKg / Math.pow(heightInM,2);
        System.out.println("Your bmi is "+bmi);
    }
    
}
