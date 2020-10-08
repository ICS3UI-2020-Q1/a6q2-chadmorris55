import java.util.Scanner;
/**
 * have user input 10 number, get them to input a number to find, find that number as many times as it appears in the array and tell the user where it is in the array
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    //creates the 10 element array 
    int [] numbers = new int [10];
    //asks user to input 10 numbers and records them
    System.out.println("Please enter in 10 integers to put into the array");
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
    }
    //asks user for a number to find and recordss it
    System.out.println("Please enter a number to find");
    int locate = input.nextInt();
    //loops until all numbers are accountedd for, if a number in the array is equal to the number that needs to be located, it prints out where it is located
    for (int j = 0;j < numbers.length; j++){
      if (numbers[j] == locate){
        System.out.println(numbers[j] + " is located at index " + j);
      }
    }
    
  }
}
