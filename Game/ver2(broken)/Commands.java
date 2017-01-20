import java.util.ArrayList;

public class Commands{

    public static void changeDirectory(String input){
	if(VFD.checkDir(input) && (input != VFD.currentDir)){
	    VFD.currentDir = input;
	}
	else if(input == ".."){
	    //the directory before
	}
	
    }
    public static void listDirectory(){
        System.out.println(VFD.dirContent(VFD.currentDir));

    }
    
}
