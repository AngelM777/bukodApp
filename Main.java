import java.util.*;

//BUKOD APP//

class Main {
  public static void main(String[] args) {

    Intro intro = new Intro();
    intro.ask();

     System.out.println("===========================================");
     System.out.println("===========================================");

    Organization org = new Organization();
    org.ask();
    
    System.out.println("===========================================");
     System.out.println("===========================================");
    
    System.out.println("I'd love to ask you some questions first.");
    
    
    Profile profile = new Profile();
    profile.survey();

    Address address = new Address();
    address.ask();

    System.out.println("===========================================");
     System.out.println("===========================================");
    
    //Gala
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("There is a holiday gala in December. How much USD would you like to donate?");

    int donate = scanner.nextInt();
   
    Donation donation = new Donation(donate);
    
    System.out.println("Thank you for your donation of $" + donation.money + "!");

    System.out.println("===========================================");
     System.out.println("===========================================");
    
    //Auction

    Scanner scanner2 = new Scanner(System.in);
      
   System.out.println("There is an auction in December. Which item would you like to donate?");

    String item = scanner2.nextLine();
    
    Auction auction = new Auction(item);
    
    System.out.println("Thank you for your " + auction.object + "!");

    System.out.println("===========================================");
     System.out.println("===========================================");
    
    //Workshop

    Scanner scanner3 = new Scanner(System.in);

    System.out.println("We are having a team-bonding workshop next month. How many hours can you spare to help out?");

    int time = scanner3.nextInt();
    
    Workshop workshop = new Workshop(time);
    
    System.out.println("Wow, " + workshop.time + " hour(s)? You're amazing!");

    System.out.println("===========================================");
     System.out.println("===========================================");
    
  //Suggested Friends
    
    Members members = new Members();
    members.ask();

    System.out.println("===========================================");
     System.out.println("===========================================");

  //Total Gifts

    ArrayList<User> gifts = new ArrayList<>();

    Major microsoft = new Major("Microsoft");
    Major jpmorgan = new Major("JP Morgan");
    Major robinhood = new Major("Robinhood");
    Major tdbank = new Major("TD Bank");
    Major wellsfargo = new Major("Wells Fargo");
    Major bankofamerica = new Major("Bank of America");
    
    gifts.add(microsoft);
    gifts.add(jpmorgan);
    gifts.add(robinhood);
    gifts.add(tdbank);
    gifts.add(wellsfargo);
    gifts.add(bankofamerica);

    System.out.println("We were able to raise $100 million this year. Thank you to our corporate sponsors:");
    
    for (User user : gifts) {
    user.survey();
      
    }

    System.out.println("===========================================");
     System.out.println("===========================================");
    
    System.out.println("Thanks so much for joining Bukod and for committing to " + workshop.time + " hours, donating $" + donation.money + ", and giving away your " + auction.object + ". We look forward to seeing you soon!");

     System.out.println("===========================================");
     System.out.println("===========================================");

    int[] monthlyDonors = {213, 324};


    try{
    getThirdElement(monthlyDonors);
    } catch (Exception ex) {
    System.out.println("caught!");
    ex.printStackTrace();
    }   
    
  }
    public static void getThirdElement(int[] monthlyDonors) {
    System.out.println(monthlyDonors[3]);
  }
}