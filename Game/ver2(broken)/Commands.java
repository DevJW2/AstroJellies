import java.util.ArrayList;

public class Commands{

    public static void changeDirectory(String input){
       	ArrayList<String> dirPaths = new ArrayList<String>();
	dirPaths.add("root");
	dirPaths.add("tutorial");

	if((dirPaths.contains(input)) && (input != VFD.currentDir)){
	    VFD.currentDir = input;
	}
    }
    public static void listDirectory(){
	if (VFD.currentDir.equals("root")){
	    System.out.println(VFD.rootDirectory());
	    }
	else if(VFD.currentDir.equals("tutorial")){
	    System.out.println(VFD.tutorialD());
	}
    }
    
}
