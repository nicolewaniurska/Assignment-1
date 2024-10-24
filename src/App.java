import java.util.Scanner;
// Används för att läsa användarinmatning

public class App {
    public static void main(String[] args) { // Definierar publik klass app och huvudmetod main
    Scanner scanner = new Scanner(System.in); // Gör att programmet kan ta emot input från användaren

    System.out.print("What is the employee's name?"); 
    String name = scanner.nextLine(); // Frågar användaren efter den anställdes namn och lagrar svaret i strängen name och scannern läser texten för användaren

    System.out.print("What is their hourly rate?");
    double hourlyRate = scanner.nextDouble(); // Frågar användaren efter den anst'lldes timlön och lagrar det i double variabeln

    System.out.print("How many hours did they work this month?");
    int hours = scanner.nextInt(); // Frågar användaren hur många timmar den anställde har arbetat under månaden och lagrar det som en int variabel

    PaymentSlip slip = new PaymentSlip(name, hourlyRate, hours); // Skapar ett nytt objekt av typen PaymentSlip med namn, timlön och arbetade timmar - betalningsunderlaget för den anställde

    double salaryBeforeTax = slip.calculateSalary(); // Beräknar anställdes bruttolön
    double salaryAfterTax = slip.calculateNetSalary(); // Beräknar anställdes nettolön

    System.out.println("\n----------------------");
    System.out.println("## PAYMENT INFORMATION ##");
    System.out.println("Name: \t\t" + slip.getName());
    System.out.println("Hourly rate: \t" + slip.getHourlyRate());
    System.out.println("Hours worked: \t" + slip.getHours());
    System.out.println("Salary before tax: $" + salaryBeforeTax);
    System.out.println("Salary after tax: $" + salaryAfterTax);
    System.out.println("\nif you have any questionsn regarding your salary, contact Bob");
    System.out.println("----------------------");
    // Skriver ut betalningsinformationen till konsolen
    scanner.close();
    }
}
