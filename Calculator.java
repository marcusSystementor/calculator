import java.util.Scanner;

// En väldigt enkel miniräknare.

public class Calculator {
    
     // Instansvariabler
     Scanner scanner = new Scanner(System.in);
     boolean runMenu = true;
     int choice;


     // Startmenyn
    public void startMenu() {

       
        do {
            System.out.println("Välj ett av alternativen nedan");
            System.out.println("Tryck 1 för att addera två tal");
            System.out.println("Tryck 2 om du vill subtrahera två tal");
            System.out.println("Tryck 3 om du vill multiplicera två tal");
            System.out.println("Tryck 4 om du vill dividera två tal");
            System.out.println("Tryck 5 för att avsluta");
            choice = scanner.nextInt();

            if (choice == 5) {
                runMenu = false;
            }
            else {
             
            // Skicka valet användaren gör till metoden enterNumbersAndGetResult()
             enterNumbersAndGetResult(choice);
            }

    } while (runMenu);

    }
           // Användaren får mata in två nummer som sedan skickas till olika metoder beroende på choice
           // Resultatet visas av en System.out.println, sedan kommer man åter till startMenu();
           public void enterNumbersAndGetResult(int choice) {

            System.out.println("Mata in två tal");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Resultatet av addition är " + addNumbers(number1, number2));
                
            }
            else if (choice == 2) {
                System.out.println("Resultatet av subtraktion är " + subtractNumbers(number1, number2));
            }
            else if (choice == 3) {
                System.out.println("Resultatet av multiplikation är " + multiplyNumbers(number1, number2));
            }
            else {
                System.out.println("Resultatet av division är " + divideNumbers(number1, number2));
            }
           
    }

    public int addNumbers(int a, int b) {

        return a + b;

    }

    public int subtractNumbers(int a, int b) {

        return a - b;
    }

    public int divideNumbers(int a, int b) {
        return a / b;
    }

    public int multiplyNumbers(int a , int b) {
        return a * b;
    }

    
}
