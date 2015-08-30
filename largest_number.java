import java.util.Scanner;
public class largest_number {
  public static void main(String[] args) {
    int number;
    Scanner input = new Scanner(System.in);
    int counter = 1;
    System.out.println("Enter a number");
    number = input.nextInt();
    int largest = number;

    while (counter < 10){
      System.out.println("Enter a number");
      number = input.nextInt();
      if(number > largest)
      largest = number;
      counter++;
    }
      System.out.println("Largest number is "+largest);
  }
}
