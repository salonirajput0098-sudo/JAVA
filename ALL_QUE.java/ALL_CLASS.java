// QUESTION 1 (Original)
// Given price = 850, quantity = 4, discount = 200,
// delivery charge = 100. Calculate total price and final bill.

 class M {
   public static void main(String[] args) {
  int price = 850;
  int quantity = 4;
  int discount = 200;
  int delivery = 100;

  int totalPrice = price * quantity;
  int finalBill = totalPrice - discount + delivery;

 System.out.println("Total Price = " + totalPrice);
 System.out.println("Final Bill = " + finalBill);
 }
}

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