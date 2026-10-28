import java.util.Scanner;

// BASIC JAVA PROGRAMS
// Write a Java program to print "Hello World!" on the screen.

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }}


//self

class priya {
    public static void main(String[] args) {
        String str = "priya jaat";
        System.out.println("my name is " + str);
        }
}

//sum

class frinedd {
    public static void main(String[]args){
        int a =10;
        int b =20;
        int sum = a + b;
        System.out.println("Sum = " + sum); 

    }
}


class Main {
  public static void main(String[] args) {
    System.out.println(3);
    System.out.println(358);
    System.out.println(50000);
  }
}



class multi {
  public static void main(String[] args) {
    System.out.println(2 * 5);
  }
}



class miain {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome!");
  }
}

class fullname{
    public static void main (String[]args){
        String firstName = "saloni";
        String lastName = "rajput"; 
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

    }
}

// Write a Java program to declare and initialize variables of different data types.

class Mai {
  public static void main(String[] args) {
    final int MINUTES_PER_HOUR = 60;
    final int BIRTHYEAR = 1980;
    final String CURRENTYEAR = "saloni rajput";

    System.out.println(MINUTES_PER_HOUR);
    System.out.println(BIRTHYEAR);
    System.out.println(CURRENTYEAR);
  }
}



class Maing {
  public static void main(String[] args) {
    // Student data
    String studentName = "John Doe";
    int studentID = 15;
    int studentAge = 23;
    float studentFee = 75.25f;
    char studentGrade = 'B';
    
    // Print variables
    System.out.println("Student name: " + studentName);
    System.out.println("Student id: " + studentID);
    System.out.println("Student age: " + studentAge);
    System.out.println("Student fee: " + studentFee);
    System.out.println("Student grade: " + studentGrade);
  }
}




class Mainl {
  public static void main(String[] args) {
    // Create integer variables
    int length = 4;
    int width = 6;
    int area;

    // Calculate the area of a rectangle
    area = length * width;

    // Print variables
    System.out.println("Length is: " + length);
    System.out.println("Width is: " + width);
    System.out.println("Area of the rectangle is: " + area);
  }
}

//Data types in Java

class a {
  public static void main(String[] args) {
    int myNum = 5;               // integer (whole number)
    float myFloatNum = 5.99f;    // floating point number
    char myLetter = 'D';         // character
    boolean myBool = true;       // boolean
    String myText = "Hello";     // String    
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
  }
}


//Primitive Data Types in Java
class data {
  public static void main(String[] args) {
    byte myNum = 100;
    short myNumm = 5000;
    int myNummm = 100000;
    long myNummmm = 15000000000L;
    float myNummmmmm = 5.75f;
    double myNummmmmmmm = 19.99d;

    System.out.println(myNum);  
    System.out.println(myNumm);  
    System.out.println(myNummm);  
    System.out.println(myNummmm);  
    System.out.println(myNummmmmm);  
    System.out.println(myNummmmmmmm);  
  }
}

//Boolean Data Type in Java
class BooleanDataType { 
  public static void main(String[] args) {
    boolean isJavaFun = true;
    boolean isFishTasty = false;

    System.out.println(isJavaFun);     // Outputs true
    System.out.println(isFishTasty);   // Outputs false
  }
}

//Character Data Type in Java

class bhg{
  public static void main(String[] args) {
    char myVar1 = 65, myVar2 = 'H', myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);
  }
}


class mynum {
  public static void main(String[] args) {
    var myNum = 5;          // int
    var myDouble = 9.98;    // double
    var myChar = 'D';       // char
    var myBoolean = true;   // boolean
    var myString = "Hello"; // String

    System.out.println(myNum);
    System.out.println(myDouble);
    System.out.println(myChar);
    System.out.println(myBoolean);
    System.out.println(myString);
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

 class price{
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

public class StarPattern {
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


// Q1. Write a Java program to input two numbers
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


// Q2. Write a Java program to input two numbers and print
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


// Q3. Write a Java program to input a character and check
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


// Q4. Write a Java program to input a person's age and citizenship
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


// Q5. Write a Java program to input three integers and find
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

// BITWISE OPERATOR AND & OPERATOR

class  str{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter first number: ");
    int b = sc.nextInt();

    System.out.print("Enter first number: ");
    int result = a&b;

    System.out.println("the num is " + result);
    }
}

//BITWISE OR | OPERATOR

class  stri{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter first number: ");
    int b = sc.nextInt();

    System.out.print("Enter first number: ");
    int result = a|b;

    System.out.println("the num is " + result);
    }
}

//BITWISE XOR OPERATOR ''^''

class  string{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter first number: ");
    int b = sc.nextInt();

    System.out.print("Enter first number: ");
    int result = a^b;

    System.out.println(result = +a^b);
    }
}

//BITWISE NOT OPERATOR ()

class  string1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter first number: ");
    int result = ~a;

    System.out.println("the num is " + result);
    }
}

//BITWISE NOT OPERATOR IN CHAR (~ is symbol ko Tilde (टिल्ड) bolte he )

class  string2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first number");
    char result = ~'A';
    
    System.out.println(result);
    }
}


class Stringgg {
    public static void main(String[] args) {
        char letter = 'K';

        int result = ~letter;

        System.out.println("Character = " + letter);
        System.out.println("Result = " + result);
    }
}

//BITWISE LEFT SHIFT <<

class  string3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 21<<8;

    System.out.println("the num is " + result);
    }
}

//BITWISE RIGHT SHIFT >> 

class  string4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 24>>8;

    System.out.println("the num is " + result);
    }
}
//BITWISE RIGHT SIFT OPERATOR " >> "
class  string5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 40>>2;

    System.out.println("the num is " + result);
    }
}

// QUESTION 1
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


// QUESTION 2
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


// QUESTION 3
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

//TYPE CASTING 
//WIDENING CASTING
//int to double

class Q3_Bitwise {
    public static void main(String[] args) {
        int a = 5;
        double b = a;

        System.out.println(a);
        System.out.println(b);
    }
}
// 
class Q3_Bitwis{
    public static void main(String[] args) {
        char a = 'A';
        int x = a;
        double y = a;

        System.out.println(a);
        System.out.println(x);
        System.out.println(y);

    }
}

//NARROWING CASTING
class norrowing{
    public static void main(String[] args) {
        int x = 65;
        char a = (char)x;

        System.out.println(x);
        System.out.println(a);

    }
}

class norrowingg{
    public static void main(String[] args) {
        double x = 65.999999;
        int a = (int) x;

        System.out.println(x);
        System.out.println(a);

    }
}


