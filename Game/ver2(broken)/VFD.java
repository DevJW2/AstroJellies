import java.util.ArrayList;

public class VFD{
    //arraylist with all directories, later on
    public static String currentDir = "root";

    public static String getcurrentDir(){
	return currentDir; 
    }
    
    public static void checkState(){
	System.out.println(currentDir);
    }

    
    public static Boolean checkDir(String input){
	if (currentDir.equals("root") && (input.equals("tutorial") || input.equals("user"))){
	    return true; 
	}
	return false;
    }
    
    public static String dirContent(String input){
	if(input.equals("root")){
	    String retStr = "";
	    retStr += "user\n";
	    retStr += "tutorial";
	    return retStr;  
	}
	else if(input.equals("tutorial")){
	    String retStr = "";
	    retStr += "largeTextFile.txt\n";
	    retStr += "playGame.exe";
	    return retStr;
	}
	return "Nothing in here";
    }


}
