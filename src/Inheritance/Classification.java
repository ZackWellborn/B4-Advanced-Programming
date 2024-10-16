public class Classification extends Animal {
    private boolean isColdBlooded;
    private boolean hasWings;
    
      //declarator?????
    public Classification(String color, String call, String name, boolean hasWings, boolean isColdBlooded) {
        super(color, call, name);
        this.hasWings = hasWings;
        this.isColdBlooded = isColdBlooded;

    }
    // gettrerer
    public boolean getHasWings() {
        return hasWings;
    }
    public boolean getIsColdBlooded() {
        return isColdBlooded;
    }
    
    //setterer
    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }
    public void setIsColdBlooded(boolean isColdBlooded) {
        this.isColdBlooded = isColdBlooded; 
    }

    public String printInfo() {
       // super(info);
        String info =  super.printInfo() + "\nIs this animal cold-blooded? " + isColdBlooded + "\nDo they have wings? " + hasWings;
        return info; 
    }
    
    
}
