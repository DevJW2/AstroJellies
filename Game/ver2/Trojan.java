public class Trojan implements VirusCreator {

  private int ID = 1;
  private int strength = 10;
  private String type = Trojan;

  public int virusID(){
    return ID;
  }

  public int virusStrength(){
    return strength;
  }

  public String virusType(){
    return type;
  }

  public boolean testVulnerability(Object file){
    if (this.strength > file.strength){
      return true;
    }
  }

  public void ActivateVirus(){

  }





}
