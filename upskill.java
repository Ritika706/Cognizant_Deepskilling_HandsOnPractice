// 1-HELLO WORLD
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2-SIMPLE CALCULATOR
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        String op = sc.next();
        switch(op) {
            case "+": 
            System.out.println(a+b); 
            break;
            case "-": 
            System.out.println(a-b);
             break;
            case "*": 
            System.out.println(a*b); 
            break;
            case "/": 
            System.out.println(a/b);
             break;
        }
    }
}

// 3-EVEN OR ODD
import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n%2==0 ? "Even" : "Odd");
    }
}

// 4-LEAP YEAR
import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println("Leap Year");
        else System.out.println("Not Leap Year");
    }
}

// 5-MULTIPLICATION TABLE
import java.util.Scanner;
class Table {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for(int i=1;i<=10;i++) System.out.println(n+" x "+i+" = "+n*i);
    }
}

// 6-DATA TYPES
class DataTypes {
    public static void main(String[] args) {
        int i=10; float f=3.14f; double d=9.99; char c='A'; boolean b=true;
        System.out.println(i+" "+f+" "+d+" "+c+" "+b);
    }
}

// 7-TYPE CASTING
class Casting {
    public static void main(String[] args) {
        double d=9.75; int i=(int)d;
        System.out.println(i);
        int x=5; double y=(double)x;
        System.out.println(y);
    }
}

// 8-OPERATOR PRECEDENCE
class Precedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println(result); // 20
    }
}

// 9-GRADE CALCULATOR
import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        int marks = new Scanner(System.in).nextInt();
        if(marks>=90) System.out.println("A");
        else if(marks>=80) System.out.println("B");
        else if(marks>=70) System.out.println("C");
        else if(marks>=60) System.out.println("D");
        else System.out.println("F");
    }
}

// 10-NUMBER GUESSING
import java.util.*;
class Guess {
    public static void main(String[] args) {
        int num = new Random().nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            guess = sc.nextInt();
            if(guess<num) System.out.println("Too low");
            else if(guess>num) System.out.println("Too high");
        } while(guess!=num);
        System.out.println("Correct!");
    }
}


// 11-FACTORIAL
import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), fact=1;
        for(int i=1;i<=n;i++) fact*=i;
        System.out.println(fact);
    }
}


// 12-METHOD OVERLOAD
class Overload {
    static int add(int a,int b){return a+b;}
    static double add(double a,double b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
    public static void main(String[] args){
        System.out.println(add(2,3));
        System.out.println(add(2.5,3.5));
        System.out.println(add(1,2,3));
    }
}


// 13-FIBONACCI
import java.util.Scanner;
class Fibonacci {
    static int fib(int n){ return n<=1?n:fib(n-1)+fib(n-2); }
    public static void main(String[] args){
        int n=new Scanner(System.in).nextInt();
        System.out.println(fib(n));
    }
}

// 14-ARRYS SUM AND AVERAGE
import java.util.Scanner;
class ArraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] arr=new int[n]; int sum=0;
        for(int i=0;i<n;i++){arr[i]=sc.nextInt(); sum+=arr[i];}
        System.out.println("Sum="+sum+" Avg="+(sum/(double)n));
    }
}

// 15-REVERSE STRING
import java.util.Scanner;
class Reverse {
    public static void main(String[] args){
        String s=new Scanner(System.in).nextLine();
        System.out.println(new StringBuilder(s).reverse());
    }
}


//16- PALINDROME
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args){
        String s=new Scanner(System.in).nextLine().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev)?"Palindrome":"Not Palindrome");
    }
}

// 17-CAR CLASS
class Car {
    String make, model; int year;
    Car(String m,String mo,int y){make=m;model=mo;year=y;}
    void displayDetails(){System.out.println(make+" "+model+" "+year);}
    public static void main(String[] args){
        Car c=new Car("Honda","Civic",2020); c.displayDetails();
    }
}

// 18-INHERITANCE
class Animal { void makeSound(){System.out.println("Animal sound");} }
class Dog extends Animal { void makeSound(){System.out.println("Bark");} }
class Test {
    public static void main(String[] args){
        new Animal().makeSound(); new Dog().makeSound();
    }
}

// 19-INTERFACE
interface Playable { void play(); }
class Guitar implements Playable { public void play(){System.out.println("Strum");} }
class Piano implements Playable { public void play(){System.out.println("Keys");} }
class Test {
    public static void main(String[] args){
        Playable g=new Guitar(); g.play();
        Playable p=new Piano(); p.play();
    }
}

// 20-TRY-CATCH
import java.util.Scanner;
class Divide {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        try{System.out.println(a/b);}catch(ArithmeticException e){System.out.println("Cannot divide by zero");}
    }
}

// 21-CUSTOM EXCEPTION
class InvalidAgeException extends Exception { InvalidAgeException(String msg){super(msg);} }
class Test {
    public static void main(String[] args){
        int age=15;
        try{ if(age<18) throw new InvalidAgeException("Age < 18"); }
        catch(InvalidAgeException e){System.out.println(e.getMessage());}
    }
}

// 22-FILE WRITING
import java.io.*;
import java.util.Scanner;
class WriteFile {
    public static void main(String[] args)throws Exception{
        String s=new Scanner(System.in).nextLine();
        FileWriter fw=new FileWriter("output.txt");
        fw.write(s); fw.close();
        System.out.println("Written");
    }
}

// 23-FILE READING
import java.io.*;
class ReadFile {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("output.txt"));
        String line; while((line=br.readLine())!=null) System.out.println(line);
        br.close();
    }
}

// 24-ARRAYLIST
import java.util.*;
class StudentList {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Alice"); list.add("Bob");
        for(String s:list) System.out.println(s);
    }
}

// 25-HASHMAP
import java.util.*;

class StudentMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        // Adding entries
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        // Display all entries
        System.out.println("Student Records:");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        // Retrieve by ID
        System.out.print("Enter student ID to search: ");
        int id = sc.nextInt();
        if(map.containsKey(id)) {
            System.out.println("Student Name: " + map.get(id));
        } else {
            System.out.println("ID not found.");
        }
    }
}
