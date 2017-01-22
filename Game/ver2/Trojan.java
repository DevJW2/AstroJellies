import cs1.Keyboard;
import java.util.Scanner;
import java.io.File;

public class Trojan implements VirusCreator {

  private int ID = 1;
  private String type = "Trojan";

  public int virusID(){
    return ID;
  }

  public String virusType(){
    return type;
  }

  public boolean testVulnerability(Object file){
    return false;
  }

  public void activateVirus(){
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
