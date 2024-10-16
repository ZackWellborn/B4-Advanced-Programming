public class Bird extends Classification {
    private int wingspan;
    private int flySpeed;
    
      //declarator?????
    public Bird(String color, String call, String name, boolean hasWings, boolean isColdBlooded, int wingspan, int flySpeed) {
        super(color, call, name, isColdBlooded, hasWings);
        this.wingspan = wingspan;
        this.flySpeed = flySpeed;
    }
    // gettrerer
    public int getWingspan() {
        return wingspan;
    }

    public int getFlySpeed() {
        return flySpeed;
    }
  
    //setterer
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public String printInfo() {
        String info = super.printInfo() + "\nThe wingspan of this bird is " + wingspan + " feet \nTheir top flying speed is " + flySpeed + " mph";
        return info; 
    }
    
    
}

