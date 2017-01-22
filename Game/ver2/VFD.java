import java.util.ArrayList;

public class VFD{
    public static String currentDir = "root";
    public static String pastDir = "";


    public static String getcurrentDir(){
	return currentDir; 
    }

    //check the current directory 
    public static void checkState(){
	System.out.println(currentDir);
    }

    //Check directories, and the paths they can take
    public static Boolean checkDir(String input){
	if (currentDir.equals("root") && (input.equals("tutorial") || input.equals("user"))){
	    return true; 
	}
	return false;
    }
    //the content of the actual directories
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

    public static String dirContent(){
	
    }

}
