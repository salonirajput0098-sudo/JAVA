import java.util.Scanner;

// QUESTION 1 (Original)
// Given price = 850, quantity = 4, discount = 200,
// delivery charge = 100. Calculate total price and final bill.

class Main {
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

public class QUETIONS {
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


// Q11. Write a Java program to input two numbers
// and display the greater number using the ternary operator.

class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int greater = (a > b) ? a : b;

        if (a == b) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Greater number is: " + greater);
        }
    }
}


// Q12. Write a Java program to input two numbers and print
// their sum, difference, product, quotient, remainder and increment.

class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));

        if (b != 0) {
            System.out.println("Quotient = " + (a / b));
            System.out.println("Remainder = " + (a % b));
        } else {
            System.out.println("Division by zero is not possible.");
        }

        a++;
        System.out.println("Increment of first number = " + a);
    }
}


// Q13. Write a Java program to input a character and check
// whether it is an uppercase English letter using relational operators.

class UppercaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is an uppercase English letter.");
        } else {
            System.out.println("It is not an uppercase English letter.");
        }
    }
}


// Q14. Write a Java program to input a person's age and citizenship
// status and display voting eligibility using logical operators.

class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you an Indian citizen? (true/false): ");
        boolean citizen = sc.nextBoolean();

        if (age >= 18 && citizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}


// Q15. Write a Java program to input three integers and find
// the smallest number using nested ternary operator.

class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int smallest = (a < b)
                ? ((a < c) ? a : c)
                : ((b < c) ? b : c);

        System.out.println("Smallest number is: " + smallest);
    }
}


// Main class
public class AllPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA PROGRAMS =====");
        System.out.println("1. Greater Number");
        System.out.println("2. Arithmetic Operations");
        System.out.println("3. Uppercase Check");
        System.out.println("4. Voting Eligibility");
        System.out.println("5. Smallest Number");

        System.out.print("Enter question number (1-5): ");
        int choice = sc.nextInt();

        sc.close();

        switch (choice) {
            case 1:
                GreaterNumber.main(new String[0]);
                break;
            case 2:
                ArithmeticOperations.main(new String[0]);
                break;
            case 3:
                UppercaseCheck.main(new String[0]);
                break;
            case 4:
                VotingEligibility.main(new String[0]);
                break;
            case 5:
                SmallestNumber.main(new String[0]);
                break;
            default:
                System.out.println("Invalid choice! Please enter 1 to 5.");
        }
    }
}

// QUESTION 16
// Write a Java program to calculate the result of 7 >> 2
// and 28 << 2 using shift operators.

class Q1_ShiftOperators {
    public static void main(String[] args) {
        int a = 7;
        int b = 28;

        System.out.println("7 >> 2 = " + (a >> 2));
        System.out.println("28 << 2 = " + (b << 2));
    }
}


// QUESTION 17
// Write a Java program to check whether a number is even or odd
// using the bitwise AND (&) operator without using the modulus operator.

class Q2_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}

//WITHOUT USING IF ELSE


class _EvenOddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n & 1) == 0 ? "Even" : "Odd";

        System.out.println("Number is " + result);
    }
}


// QUESTION 18
// Write a Java program to perform bitwise AND, OR, and XOR
// operations on two integers where a = 5 and b = 9.

class Q3_BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("AND = " + (a & b));
        System.out.println("OR = " + (a | b));
        System.out.println("XOR = " + (a ^ b));
    }
}


