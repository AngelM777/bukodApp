import java.util.*;

//intro class

class Intro extends Question {

  @Override
  public void ask(){   

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Bukod App! I'm Coco. What's your name?");

    String name = scanner.nextLine();

    System.out.println("Hello " + name + ", nice to meet you!");
    System.out.println("We have many friends that would like to invite you to events.");

    
    
 }
  
}