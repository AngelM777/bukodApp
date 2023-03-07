import java.util.*;

//intro class

class Profile extends User {

 

  @Override
  public void survey(){   

    Scanner scanner = new Scanner(System.in);

    System.out.println("How old are you?");

    int age = scanner.nextInt();

     if (age < 5) {
      System.out.println("You are too young.");
    } else if (age >= 5) {
      System.out.println("Great! I have updated your profile.");
    }
      // } else if (choice == "n") {
      //   System.out.println("Ok, please enter the correct age.");
      //   int correct = scanner.nextInt();
      //   System.out.println("I have successfully updated your age to" + correct);
      // } else {
      // System.out.println("Please enter 'y' or 'n'.");
       
      
       
    // } else {
    //   survey();
    // }

    // System.out.println("You are" + age + "years old. Is that correct? Enter 'y' or 'n'");

    // String choice = scanner.nextLine();

    //  if (choice == "y") {
    //   System.out.println("Great. I have updated your profile.");
    // } else if (choice == "n") {
    //   System.out.println("Ok, please enter the correct age.");
    //   int correct = scanner.nextInt();
    //   System.out.println("I have successfully updated your age to" + correct);
    // } else {
    //   System.out.println("Please enter 'y' or 'n'.");
    // }

    
 }
}
