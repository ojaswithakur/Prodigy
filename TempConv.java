import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for temperature and its unit
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        sc.nextLine(); // Consume the newline left by nextDouble()
        
        System.out.print("Enter the unit (Celsius, Kelvin, Fahrenheit): ");
        String unit = sc.nextLine().trim(); // Trim to remove any extra spaces
        
        // Perform the conversion based on the unit
        if (unit.equalsIgnoreCase("Celsius")) {
            double fahrenheit = temp * 9 / 5 + 32;
            double kelvin = temp + 273.15;
            System.out.println(temp + " Celsius is:");
            System.out.println(fahrenheit + " Fahrenheit");
            System.out.println(kelvin + " Kelvin");
        } else if (unit.equalsIgnoreCase("Kelvin")) {
            double celsius = temp - 273.15;
            double fahrenheit = (temp - 273.15) * 9 / 5 + 32;
            System.out.println(temp + " Kelvin is:");
            System.out.println(celsius + " Celsius");
            System.out.println(fahrenheit + " Fahrenheit");
        } else if (unit.equalsIgnoreCase("Fahrenheit")) {
            double celsius = (temp - 32) * 5 / 9;
            double kelvin = (temp - 32) * 5 / 9 + 273.15;
            System.out.println(temp + " Fahrenheit is:");
            System.out.println(celsius + " Celsius");
            System.out.println(kelvin + " Kelvin");
        } else {
            System.out.println("Invalid unit! Please enter Celsius, Kelvin, or Fahrenheit.");
        }
        
        sc.close();
    }
}
