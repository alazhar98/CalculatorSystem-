import Calculators.*;
import Data.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
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
            switch (choice) {
                case 1: {
                    System.out.println("Enter initial velocity(u)");
                    double u = scanner.nextDouble();
                    System.out.print("Enter acceleration (a): ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter time (t): ");
                    double t = scanner.nextDouble();
                    MotionData motionData = new MotionData(u, a, t, "Motion Data");
                    Calculator calculator = new FinalVelocityCalculator(motionData);
                    calculator.calculator();
                    break;
                }
                case 2: {
                    System.out.println("Enter int initial velocity (u): ");
                    double u = scanner.nextDouble();
                    System.out.println("Enter acceleration (a): ");
                    double a = scanner.nextDouble();
                    System.out.println("Enter time(t): ");
                    double t = scanner.nextDouble();
                    double displacement = (u * t) + 0.5 * a * t * t;
                    System.out.println("Displacement (s) : " + displacement);
                    break;
                }
                case 3: {
                    System.out.println("Enter initial velocity (u): ");
                    double u = scanner.nextDouble();
                    System.out.print("Enter acceleration (a): ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter displacement (s): ");
                    double s = scanner.nextDouble();
                    double vSquared = (u * u) + 2 * a * s;
                    System.out.println("Final Velocity Squared (v²) = " + vSquared);
                    break;

                }
                case 4:{
                    System.out.print("Enter radius (r): ");
                    double r = scanner.nextDouble();
                    CircleData circleData = new CircleData(r, "Circle Data");
                    Calculator calculator = new AreaOfCircleCalculator(circleData);
                    calculator.calculator();
                    break;
                }
                case 5:{
                    System.out.print("Enter principal (P): ");
                    double P = scanner.nextDouble();
                    System.out.print("Enter rate (R): ");
                    double R = scanner.nextDouble();
                    System.out.print("Enter time (T): ");
                    double T = scanner.nextDouble();
                    PhysicsData physicsData = new PhysicsData(0, new MotionData(0, 0, 0, "Physics Data"));
                    InterestData interestData = new InterestData(P, R, T, physicsData);
                    Calculator calculator = new SimpleInterestCalculator(interestData);
                    calculator.calculator();
                    break;
                }
                case 6:{
                    System.out.print("Enter mass (m): ");
                    double m = scanner.nextDouble();
                    System.out.print("Enter acceleration (a): ");
                    double a = scanner.nextDouble();
                    MotionData motionData = new MotionData(0, a, 0, "Motion Data");
                    PhysicsData physicsData = new PhysicsData(m, motionData);
                    Calculator calculator = new ForceCalculator(physicsData);
                    calculator.calculator();
                    break;
                }
                case 7:{
                    System.out.print("Enter mass (m): ");
                    double m = scanner.nextDouble();
                    System.out.print("Enter volume (V): ");
                    double v = scanner.nextDouble();
                    double density = m / v;
                    System.out.println("Density = " + density);
                    break;
                }
            }
        }

    }
}