import java.util.*;

class Address extends Question {

    private String street;
  

   //Setter
    public Scanner scanner = new Scanner(System.in);

  @Override
  public void ask() {
    
    System.out.println("What is your street address?");

    String streetAddress = scanner.nextLine();

    System.out.println("Is " + streetAddress + " your street address? Enter 'y' ");

    String ans = scanner.nextLine();

    if (ans == "y") {
      System.out.println("Great! I have updated your profile.");
    // } else if (ans != "y") {
    //   what();
    }
                    
  }
     public void setstreet(String street) {
      this.street = street;
    }
  

  
   //Getter
  
    public String getstreet() {
      return street;
    }
  
 
    
  }

