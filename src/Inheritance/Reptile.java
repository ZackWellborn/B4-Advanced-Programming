public class Reptile extends Classification {
    private boolean canSwim;
    private int legCount;
    
      //declarator?????
    public Reptile(String color, String call, String name, boolean hasWings, boolean isColdBlooded, boolean canSwim, int legCount) {
        super(color, call, name, isColdBlooded, hasWings);
        this.canSwim = canSwim;
        this.legCount = legCount;
    }


    // gettrerer
    public boolean getCanSwim() {
        return canSwim;
    }

    public int getLegCount() {
        return legCount;
    }
  

    //setterer
    public void setWingspan(boolean canSwim) {
        this.canSwim = canSwim;
    }
    
    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    //general info
    public String printInfo() {
        String info = super.printInfo() + "\nThis reptile can swim?  " + canSwim + "\nThis reptile has " + legCount + " legs";
        return info; 
    }
    
    
}

