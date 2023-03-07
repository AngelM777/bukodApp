import java.util.*;

//Members class

class Members extends Question {

  @Override
  public void ask(){   

    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Here is a list of suggested members of the organization whom you may already know. Please enter a number to add them to your branch and say hi!\n"
                   + "1) Anna C.\n"
                   + "2) Blake G.\n"
                   + "3) Tyler U.\n"
                   + "and any other number for none");

    int choice = scanner.nextInt();
   
    switch(choice) {
      case 1: System.out.println("Added Anna! You have 3 friends in common.");
          break;
      case 2: System.out.println("Added Blake! You have 6 friends in common.");
          break;
      case 3: System.out.println("Added Tyler! You have 309 friends in common.");
          break;
      default: System.out.println("Refresh later to check for more connections.");
          break;
    }

  }
}