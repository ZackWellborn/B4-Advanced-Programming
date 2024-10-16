public class Hierarchy {
    public static void main(String[] args) {
        // Create an instance of Fish
        Fish swordFish = new Fish("blue", "blub", "Swordfish", true, false, "Xiphias gladius", 80);
        Bird raven = new Bird("black", "caw", "raven", false, true, 4, 25);
    
        System.out.println("A swordfish's call is " + swordFish.getCall());    // Inherited from Animal
        System.out.println("The swordfish's color is " + swordFish.getColor());   // Inherited from Animal
        System.out.println("The genus of a swordfish is " + swordFish.getGenus() + "\n");     // Inherited from Fish
      
 //each level of the hierarchy has their own "printInfo" function which returns a string of all the basic info
        
        System.out.println("Here's some basic info on a swordfish: \n" + swordFish.printInfo() + "\n"); 
        System.out.println("Now here's some basic info on a raven: \n" + raven.printInfo() + "\n");

        System.out.println("Does a swordfish have wings? \n" + swordFish.getHasWings());
        System.out.println("What if swordfish evolved to grow wings?");
        swordFish.setHasWings(true);
        System.out.println("Now do swordfish have wings? \n" + swordFish.getHasWings());
    }

//lol;lmao,
    
    
}
