import java.util.Scanner;

public class PTbac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constant:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        if (a != 0){
            double result = -b/a;
            System.out.printf("The solution is: %f", result);
        }else {
            double result;
            System.out.println("The solution is all x!");
        }
    }
}
