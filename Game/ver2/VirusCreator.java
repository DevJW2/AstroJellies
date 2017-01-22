public interface VirusCreator {

  int virusID();
  int virusStrength();
  String virusType();

  //checks if virusStrength is greater than that of file
  boolean testVulnerability(Object file);


  //mini game required to activate the Virus
  void activateVirus();


}
