class Major extends User {

    String name;
  
    public Major(String name){
      this.name = name;
    }
  
  
    @Override
    public void survey(){
      System.out.println( this.name );
    }
  
  
  }