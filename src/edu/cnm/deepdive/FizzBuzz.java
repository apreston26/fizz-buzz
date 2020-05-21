package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    for(int counter = 1; counter <= 100; counter++){
      boolean counterIsFizz = (counter % 3 == 0); //this could be written in a if statement but its easier
      boolean counterIsBuzz = (counter % 5 == 0);
      boolean counterIsFizzBuzz;
      if (counterIsFizz && counterIsBuzz)  {
        System.out.println("fizzbuzz");
      }else if (counterIsFizz){
        System.out.println("fizz");
      }else if (counterIsBuzz){
        System.out.println("buzz");
      }else {
        System.out.println(counter);
      }

      }

      }
    }


