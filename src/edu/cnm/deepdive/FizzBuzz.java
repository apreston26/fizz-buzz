package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    for(int counter = 1; counter <= 100; counter++){
      System.out.println(getStatus(counter));
      }

    }

  static String getStatus(int value) {
    String status = "";
    boolean counterIsFizz = (value % 3 == 0); //this could be written in a if statement but its easier
    boolean counterIsBuzz = (value % 5 == 0);
    if (counterIsFizz){
      status += "fizz";
    }
    if (counterIsBuzz){
      status += "buzz";
    }
    if (status.isEmpty()){
      status += value;
    }
    return status;
  }
}


