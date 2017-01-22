public interface VirusCreator {

  int virusID();
  String virusType();


  boolean testVulnerability(Object file);

  //mini to activate the Virus
  void activateVirus();




}
