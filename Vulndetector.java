import cs1.Keyboard;
import java.util.Scanner;
import java.util.Arrays;

public class Vulndetector implements VirusCreator {

  private int ID = 1;
  private String type = "Trojan";
  private static String[] chars = {"@", "#", "$", "%", "^", "&", "*", "9"};
  public static String[] Vuls = new String[10];
//  public static String userInput = Keyboard.readString();
  public static boolean userChoice = true;

  public int virusID(){
    return ID;
  }

  public String virusType(){
    return type;
  }

  public static String[] getVuls(){
    return Vuls;
  }

  public static boolean getUserChoice(){
    return userChoice;
  }

  public String toString(){
    String retstr = "[";
    for (int i=0; i<chars.length; i++){
      retstr += chars[i];
    }
    retstr += "]";
    return retstr;
  }



  public static String[] findVulnerabilities(){
    int numVul = (int)(Math.random() * 5 );
    for (int i=0; i< numVul-1; i++){
      int randpick = (int)(Math.random() * chars.length) - 1;
      Vuls[i] = chars[randpick];
    }
    return Vuls;
  }

  //confirm the user picked one of the vulnerabilities
  //use within Woo
  public static void testUserChoice(Object input){
    for (int i=0; i<Vuls.length+1; i++){
      if (input.equals(Vuls[i])){
        userChoice = true;
         }
    }
    userChoice = false;
  }

  //ask the user a question as an obstacle
  //use within woo, only after testUserChoice is true
  public static void exploitedVul(Object input){
    System.out.println("Are trojans usually deployed as backdoors?(y/n)");
    if (input.equals("y")){
      userChoice = true;
    }
    else {
      userChoice = false;
  }
}
  //completes the decorrupting process
  //only use if testUserChoice and exploitedVul are both true and have been RUN
  //use within woo
  public static void activateVirus(){
    StringBuilder bar = new StringBuilder("\n[");

    System.out.println("\nDecorrupting file...");
    for(int i = 0; i < 50; i++){
        bar.append("=");
    }

    bar.append("]   100%     ");
    System.out.print(bar.toString());
    System.out.println("\n Your file has been decorrupted!");


  }

  public static void main(String[] args){
    Vulndetector test = new Vulndetector();
    test.findVulnerabilities();
    System.out.println(test.getVuls());
    System.out.println(chars);
    System.out.println(chars.length);
  }





}
