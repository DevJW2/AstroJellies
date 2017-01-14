public class Commands{

    public static void changeDirectory(String input){
	if(input == "/root" && (input != VFD.currentDir )){
	    VFD.currentDir = "root";
	    
	}
	else if(input == "/tutorial" && (input != VFD.currentDir)){
	    VFD.currentDir = "tutorial";
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
