import java.util.Scanner;

// BASIC JAVA PROGRAMS
// Write a Java program to print "Hello World!" on the screen.

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// Write a Java program to add two numbers.

class Sum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
    }
}

// Write a Java program to add five numbers input by the user.

class SumFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        System.out.print("Enter fifth number: ");
        int e = sc.nextInt();

        System.out.println("Sum = " + (a + b + c + d + e));
    }
}

// QUESTION 1 (Original)
// Given price = 850, quantity = 4, discount = 200,
// delivery charge = 100. Calculate total price and final bill.

// class Main {
// public static void main(String[] args) {
// int price = 850;
// int quantity = 4;
// int discount = 200;
// int delivery = 100;

// int totalPrice = price * quantity;
// int finalBill = totalPrice - discount + delivery;

// System.out.println("Total Price = " + totalPrice);
// System.out.println("Final Bill = " + finalBill);
// }
// }

// QUESTION 2 (Original)
// Basic salary = 45000; HRA = 20%, DA = 10%, PF = 12%.
// Calculate Gross Salary and Net Salary.

public class ALL_CLASS {
    public static void main(String[] args) {
        double basic = 45000;
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.12;

        double gross = basic + hra + da;
        double net = gross - pf;

        System.out.println("Basic Salary = " + basic);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("PF = " + pf);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}

// QUESTION 3 (Original)
// Print this star pattern WITHOUT using loops.

class StarPattern {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    }
}

// QUESTION 4
// Input product price and quantity.
// Total Cost = Price * Quantity.

class TotalCostInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = price * quantity;

        System.out.println("Total Cost = " + total);
    }
}

// QUESTION 5
// Input basic salary and calculate HRA, DA, PF, Gross and Net Salary.

class SalaryInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.12;
        double gross = basic + hra + da;
        double net = gross - pf;

        System.out.println("Basic Salary = " + basic);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("PF = " + pf);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}

// QUESTION 6
// Input two numbers and swap them using a third variable.

class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

// QUESTION 7
// Input two integers and check whether both are divisible by 5
// using the logical AND operator (&&).

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("Both numbers are divisible by 5.");
        } else {
            System.out.println("Both numbers are not divisible by 5.");
        }
    }
}

// QUESTION 8
// Input age and check voting eligibility using a relational operator. using
// if-else statement.

class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}

// QUESTION 10
// Input three integers and check whether they can form a triangle.
// All sides must be positive, and the sum of any two sides
// must be greater than the third side.

class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a) {
            System.out.println("These sides can form a triangle.");
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }
}

// for print
class World {
    public static void main(String[] args) {
        System.out.println("im learning java");
    }
}

// for print hello world

class sample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// FOR Relational Operator without if else statement
class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int a = sc.nextInt();
        System.out.println("You entered: " + (a >= 18));
    }
}

// FOR Relational Operator with if else statement

class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");

        int marks = sc.nextInt();
        if (marks >= 35) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }
    }
}

// Without if else statement

class maks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");

        int marks = sc.nextInt();
        String result = (marks >= 35) ? "You passed the exam." : "You failed the exam.";
        System.out.println(result);
    }
}
