import java.util.ArrayList;

public class VFD{
    //arraylist with all directories, later on
    public static String currentDir = "root";
    public static String prompt = "hacker@home:";

    public static String getcurrentDir(){
	return currentDir; 
    }
    public static String getPrompt(){
	prompt += currentDir + "$";
	return prompt;
    }
    
    public static void checkState(){
	System.out.println(currentDir);
    }

    public static String rootDirectory(){
	String retStr = "";
	retStr += "user\n";
	retStr += "tutorial";
	return retStr;	
	
	
    }
    public static String tutorialD(){
	String retStr = "";
	retStr += "largeTextFile.txt\n";
	retStr += "playGame.exe";
	return retStr;
    }
}
