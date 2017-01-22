import java.util.ArrayList;

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
    //ls command of the current directory in 
    public static void listDirectory(){
        System.out.println(VFD.dirContent(VFD.currentDir));
    }
    
}
