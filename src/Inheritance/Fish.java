public class Fish extends Classification {
    private String genus;
    private int swimSpeed;
    
      //declarator?????
    public  Fish(String color, String call, String name, boolean hasWings, boolean isColdBlooded, String genus, int swimSpeed) {
        super(color, call, name, isColdBlooded, hasWings);
        this.genus = genus;
        this.swimSpeed = swimSpeed;
    }
    // gettrerer
    public String getGenus() {
        return genus;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }
  
    //setterer
    public void setGenus(String genus) {
        this.genus = genus;
    }
   
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
    
    public String printInfo() {
        String info = super.printInfo() + "\nThe scientific name (genus) of this fish is " + genus + "\nThe maximum swim speed of this fish is " + swimSpeed + " mph";
        return info; 
    }
}

