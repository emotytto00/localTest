import java.util.Scanner;

public class VK1Sld36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your preferred language:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Farsi");
        System.out.println("4. Japanese");
        System.out.println("5. Russian");
        System.out.println("6. Chinese");
        int choice = scanner.nextInt();
        OutputGenerator outputGenerator = new OutputGenerator();
        switch (choice) {
            case 1:
                outputGenerator.generateOutput("en");
                break;
            case 2:
                outputGenerator.generateOutput("fi");
                break;
            case 3:
                outputGenerator.generateOutput("fa"); // Example: Arabic
                break;
            case 4:
                outputGenerator.generateOutput("jp"); // Example: Japanese
                break;
            case 5:
                outputGenerator.generateOutput("ru"); // Example: Russian
                break;
            case 6:
                outputGenerator.generateOutput("zh"); // Example: Chinese
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }



}