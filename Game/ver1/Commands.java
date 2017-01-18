public class Commands{

    public static void changeDirectory(String input){
	if(input == "root" && (input != VFD.currentDir )){
	    VFD.currentDir = "hacker@home:root$";
	    
	}
	else if(input == "tutorial" && (input != VFD.currentDir)){
	    VFD.currentDir = "hacker@home:root/tutorial$";
	}
    }
    public static void listDirectory(){
	if (VFD.currentDir.equals("hacker@home:root$")){
	    System.out.println(VFD.rootDirectory());
	    }
	else if(VFD.currentDir.equals("hacker@home:root/tutorial$")){
	    System.out.println(VFD.tutorialD());
	}
    }
    
}
