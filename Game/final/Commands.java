import java.util.ArrayList;
import java.io.FileNotFoundException;

//techincally could have this entire class in VFD... more organized I guess?
public class Commands{

    //cd command, changes directory, to user specified input
    public static void changeDirectory(String input){
	if(VFD.checkDir(input) && (input != VFD.currentDir)){
	    VFD.pastDir = VFD.currentDir;
	    VFD.currentDir = input;

	}
	else if(input.equals("..")){
	    VFD.currentDir = VFD.pastDir;
	}
    }
    public static void connectComputer(String input){
  NetworkManager computerNetwork = new NetworkManager();
  try{
      int xcoord = Integer.parseInt(input.substring(8,9));
      int ycoord = Integer.parseInt(input.substring(10,11));

      if(computerNetwork.testCoordinates(ycoord,xcoord)){
    VFD.currentComputer = "" + ycoord + xcoord + "comp";
    VFD.currentDir = "root";
    VFD.pastDir = "root";
      }
      else{

      }
  }
  catch(Exception e){
      System.out.println("please enter in the correct format");
  }
    }
    public static void networkMap(){
  NetworkManager computerNetwork = new NetworkManager();
  computerNetwork.printNetwork();
    }
    //ls command of the current directory in
    public static void listDirectory(){
        System.out.println(VFD.dirContent(VFD.currentDir));
    }
    //RULES FOR OPENING FILES
    //TXT: the only files that are openable by this command without any lock
    //OTHERS will have random chance of VIRUS attack: .exe, .png, .rtf, etc
    //
    public static void openFile(String input, String extension) throws FileNotFoundException{
	if(VFD.checkDir(input)){
	    VFD.contentFile(input, extension);
	}

    }

}
