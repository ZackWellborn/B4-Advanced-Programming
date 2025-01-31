//java i/o yippee
import java.io.*;
// import java.util.Scanner; <- could add scanner to take user input and cipher it
public class MyProgram{
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static File input = new File("lol.txt");
    static File output = new File("lmaoutput.txt");
    
    
    
    public static void main(String[] args){

        //System.out.println("Welcome!!!\nType the message that you would like to be encoded with a Caesar Cipher.");
        String fullEncrypted = "test (this should be unciphered)\n";

        try (BufferedReader br = new BufferedReader(new FileReader(input))) {
            String line;
            // Read file line by line
            while ((line = br.readLine()) != null) {
    //5 is used as the key shift, but it could be any integer really
                fullEncrypted += seizerCipher(line, 5);
                fullEncrypted += "\n";
                //System.out.println(line); printing the line
            }
        } catch (IOException e) {
            e.printStackTrace();  // stupid exceptiommns
        }
        System.out.println(fullEncrypted);
        
        try (FileWriter fr = new FileWriter(output, true)) {
            fr.write(fullEncrypted);
            fr.close(); //closing the filewriter for safety (i think??)
        } catch (IOException e) {
            e.printStackTrace();// exceptiommns 2
            System.out.println("you're code broke lmao");
        }
        
        
    }
    
    
    public static String seizerCipher(String input, int shift) {

        //encrypted thing yes its mispelled 
        String encryped = "";
        boolean isUppercase = false;

        for (int i=0; i<input.length(); i++) {
            char indexChar = input.charAt(i);
            //checks to see if its a letter
            if (Character.isLetter(indexChar)) {
                //checks the case of the letter
                if(Character.isLowerCase(indexChar)) {
                isUppercase = false;
            } else {
                isUppercase = true;
            }
            //the character NEEDS to be set to lowercase because
            //uppercase letters aren't included in the alphabet String
            indexChar = Character.toLowerCase(indexChar);
            //get the index/position of the character
            int pos = alphabet.indexOf(indexChar);
            //shift the position
            int encryptPos = (pos + shift)%26;
            // set it
            char encryptChar = alphabet.charAt(encryptPos);
            //resets cases to their original stuff
            if (isUppercase == true) {
                encryptChar = Character.toUpperCase(encryptChar);
            } else{}
            encryped += encryptChar;
            } else {
    //we don't want to cipher non-alphabetical characters so we leave them
                encryped+= indexChar;
    //thinking about this im realizing this will probably 
    //break if you used like emojis or something 
            }
        }
        return encryped;
    }
}
