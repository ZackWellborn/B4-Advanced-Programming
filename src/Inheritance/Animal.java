
//constructador

public class Animal {
    private String color;
    private String call;
    private String name;

    //declarator?????
    public Animal(String color, String call, String name) {
        this.color = color;
        this.call = call;
        this.name = name;
    }
    // gettrerer
    public String getColor() {
        return color;
    }
    public String getCall() {
        return call;
    }

    public String getName() {
        return name;
    }
    
    //setterer
    public void setColor(String color) {
        this.color = color;
    }
    public void setCall(String call) {
        this.call = call; 
    }

    public void setName(String name) {
        this.name = name;
    }
    public String printInfo() {
        String info = "This animal's color is " + color + "\nTheir call is " + call + "\nThis animal is called " + name;
        return info; 
    }
}

