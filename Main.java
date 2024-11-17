import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    boolean flag= true;

    while (flag){
        System.out.println("Select an option:");
        System.out.println("1. Final Velocity (v = u + at)");
        System.out.println("2. Displacement (s = ut + ½at²)");
        System.out.println("3. Final Velocity Squared (v² = u² + 2as)");
        System.out.println("4. Area of a Circle (A = πr²)");
        System.out.println("5. Simple Interest (SI = P × R × T ÷ 100)");
        System.out.println("6. Force (F = ma)");
        System.out.println("7. Density (Density = Mass ÷ Volume)");
        System.out.println("8. Compound Interest (CI = P × (1 + R ÷ 100)^T - P)");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Enter initial velocity(u)");
                double u = scanner.nextInt()
            }
        }
    }

}
