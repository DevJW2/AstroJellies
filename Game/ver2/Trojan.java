import cs1.Keyboard;
import java.util.Scanner;
import java.io.File;

public class Trojan implements VirusCreator {

  private int ID = 1;
  private String type = "Trojan";
  private static String[] chars = {"@","#","$","%","^","&","*","9"};
  public static String[] Vuls = {};
  public static String userInput = Keyboard.readString();
  public static boolean userChoice = true;

  public int virusID(){
    return ID;
  }

  public String virusType(){
    return type;
  }

  public String[] getVuls(){
    return Vuls;
  }

  public static boolean getUserChoice(){
    return userChoice;
  }



  public boolean testVulnerability(Object file){
    return false;
  }

  public static String[] findVulnerabilities(){
    int numVul = (int)(Math.random() * 5 + 1);
    for (int i=0; i<=numVul; i++){
      int randpick = (int)(Math.random() * 7 + 1);
      Vuls[i] = chars[randpick];
    }
    return Vuls;
  }

  //confirm the user picked one of the vulnerabilities
  //use within Woo
  public static boolean testUserChoice(Object input){
    for (int i=0; i<Vuls.length+1; i++){
      if (input.equals(Vuls[i])){
        userChoice = true;
        return true;
         }
    }

    userChoice = false;
    return false;

  }

  //ask the user a question as an obstacle
  //use within woo, only after testUserChoice is true
  public static boolean exploitedVul(){
    System.out.println("Are trojans usually deployed as backdoors?(y/n)");
    if (userInput.equals("y")){
      userChoice = true;
      return true;
    }
    else {
      userChoice = false;
      return false;}
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
    Trojan test  = new Trojan();
    test.activateVirus();
  }





}
