package src.edu.handong.csee.java;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c08();
  }
  void c08(){
    Scanner s = new Scanner(System.in);
    int num1, num2, num3;
    int max_num, min_num;

    System.out.print("Enter first number > ");
    num1 = s.nextInt();
    System.out.print("Enter second number > ");
    num2 = s.nextInt();
    System.out.print("Enter third number > ");
    num3 = s.nextInt();

    if(num1 >= num2){
      if(num1 >= num3){
        max_num = num1;
        if(num2 >= num3){
          min_num = num3;
        }else{
          min_num = num2;
        }
      }else{
        max_num = num3;
        min_num = num2;
      }
    }else{
      if(num2 >= num3){
        max_num = num2;
        if(num3 >= num1){
          min_num = num1;
        }else{
          min_num = num3;
        }
        }else{
          max_num = num3;
          min_num = num1;
        }
      }

      System.out.println("Max number is " + max_num + ", Min number is " + min_num);
      
    }
  }
