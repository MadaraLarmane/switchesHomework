package com.company;
import java.util.Scanner;

public class Main {
    public static void workingDaySwitch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the day number");
        int dayNumb = input.nextInt();
        switch (dayNumb) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("It is a working day");break;
            case 6:
            case 7: System.out.println("It is holiday");break;
            default: System.out.println("Please choose a day number from 1 to 7!");
        }
    }

    public static void gradeSwitch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the grade level from A to F");
        char gradeLevel = input.next().charAt(0);
        switch (gradeLevel) {
            case 'A':
            case 'B': System.out.println("Perfect! You are so clever!");break;
            case 'C': System.out.println("Good! But You can do better!");break;
            case 'D':
            case 'E': System.out.println("It is not good! You should study!");break;
            case 'F': System.out.println("Fail! You need to repeat the exam!");break;
            default: System.out.println("Error! Please choose grade level from A to F!");
        }
    }
public static void calculationSwitch(){
Scanner input = new Scanner(System.in);
System.out.println("Please choose first number");
int numb1 = input.nextInt();
System.out.println("Please choose second number");
int numb2 = input.nextInt();
System.out.println("Please choose calculation option (+,-,/,*,%,p,b,s)");
char calculation = input.next().charAt(0);
switch (calculation) {
    case '+': System.out.println(numb1+"+"+numb2+"="+(numb1+numb2)); break;
    case '-': System.out.println(numb1+"-"+numb2+"="+(numb1-numb2)); break;
    case '/': System.out.println(numb1+"/"+numb2+"="+(numb1/numb2)); break;
    case '*': System.out.println(numb1+"*"+numb2+"="+(numb1*numb2)); break;
    case '%': System.out.println(numb1+"%"+numb2+"="+(numb1%numb2)); break;
    case 'p': System.out.println("First number is"+numb1+"Second number is"+numb2);
    case 'b': if (numb1>numb2) { System.out.println("Bigger number is "+(numb1));}
        else if (numb1<numb2){ System.out.println("Bigger number is "+numb2); }
        else { System.out.println("Numbers are equals");} break;
    case 's': if (numb1<numb2) { System.out.println("Smallest number is "+(numb1));}
        else if (numb1>numb2) { System.out.println("Smallest number is "+(numb2));}
        else { System.out.println("Numbers are equals");} break;
    default: System.out.println("Error! Please choose the right calculation option!");}
}

    public static void main(String[] args) {
        workingDaySwitch();
        gradeSwitch();
        calculationSwitch();

    }
}