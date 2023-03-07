import java.util.*;

//organization class

class Organization extends Question {

    //  private int answer;
  
    // public void setName(String name){
    //   this.name = name;
    // }
  
    //   public void setstageName(String stageName){
    //   this.stageName = stageName;
    // }
    // public int getage(){
    //   return age;
    // }
  
  
  @Override
  public void ask(){ 

    System.out.println("What are you interested in? Enter '1','2', '3', or '4'.");
    System.out.println("1) Women's health");
    System.out.println("2) Infrastructure Abroad");
    System.out.println("3) Community Organizing");
    System.out.println("4) Writing and Literature");

    Scanner scanner = new Scanner(System.in);

    int interests = scanner.nextInt();
    
    if (interests == 1) {
      System.out.println("I would like to introduce you to my friends at Planned Parenthoood.");
    } else if (interests == 2) {
      System.out.println("I would like to introduce you to my friends at Engineers Without Borders.");
    } else if (interests == 3) {
      System.out.println("I would like to introduce you to my friends at Northwest Bronx Community and Clergy Coalition");
    } else if (interests == 4) {
      System.out.println("I would like to introduce you to my friends at Kundiman");
    } else {
      System.out.println("Please enter 1, 2, 3, or 4.");
    }

  }
}