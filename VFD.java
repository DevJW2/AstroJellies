import cs1.Keyboard;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class VFD{
    public static String currentDir = "root";
    public static String currentComputer = "home";
    public static String pastDir = "";
    public static String[][] lockedFiles = new String[3][2];


    public static String getcurrentDir(){
	return currentDir;
    }

    //check the current directory
    public static void checkState(){
	System.out.println(currentDir);
    }

    //Check directories, and the paths they can take
    //2D array? maybe? rows with currentdir.equals and the columns with the input.equals???
    public static Boolean checkDir(String input){
	if(currentComputer.equals("home")){
	if (currentDir.equals("root") && (input.equals("tutorial") || input.equals("user"))){
	    return true;
	}
	else if(currentDir.equals("tutorial") && (input.equals("largeTextFile.txt") || input.equals("playGame.exe"))){
	    return true;
	}
	}
	else if(currentComputer.equals("43comp")){
	    if(currentDir.equals("root") && (input.equals("file") || input.equals("anotherfile"))){
		return true;
	    }
	}
	else if(currentComputer.equals("75comp")){
	    if(currentDir.equals("root") && (input.equals("something") || input.equals("anothersomething"))){
		return true;
	    }
	}
	else if(currentComputer.equals("99comp")){
	    if(currentDir.equals("root") && (input.equals("End.exe"))){
		return true;
	    }
	}

	return false;
    }
    //the content of the actual directories
    //make better? Arrays?
    public static String dirContent(String input){
	if (currentComputer.equals("home")){
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
	}
	else if(currentComputer.equals("43comp")){
	    if (input.equals("root")){
		String retStr = "";
		retStr += "shift2\n";
		retStr += "emrmamknsrcpdgtcqctcl";
		return retStr;
	    }
	}
	else if(currentComputer.equals("75comp")){
	    if(input.equals("root")){
		String retStr = "";
		retStr += "something\n";
		retStr += "anothersomething";
		return retStr;
	    }
	    }
	else if(currentComputer.equals("99comp")){
	    if(input.equals("root")){
		String retStr = "";
		retStr += "End.exe";
		return retStr;
	    }
	}



	return "Nothing in here";
    }

    public static String contentFile(String input, String extension)throws FileNotFoundException{
	//Name, Password, respectively
	lockedFiles[0][0] = "playGame.exe";
	lockedFiles[0][1] = "password";
	lockedFiles[1][0] = "End.exe";
	lockedFiles[1][1] = "endgame";

	if(extension.equals(".txt")){
	    Scanner thing = new Scanner(new File(input));
	    while (thing.hasNextLine())
	    {
		System.out.println(thing.nextLine());
	    }
	}
	//LOCKED FILES + EXECUTABLE FILES
	else if(extension.equals(".exe")){
	    for(int i = 0; i < lockedFiles.length; i++){
		//can be a separate class/method ---------------
		if(input.equals(lockedFiles[i][0])){
		    System.out.println("LOCKED FILE");
		    System.out.println("Password is: password for playGame.exe");
		    System.out.println("Password is: endgame for End.exe");
		    System.out.print("Enter Password:");
		    String pass = Keyboard.readString();
		  if(pass.equals(lockedFiles[i][1])){
			    System.out.println("Processing Password.....");
			    System.out.println("Unlocking...");
			    System.out.println("Proceeding....");
			    System.out.println("Password Is Correct");
			//----------------
			if(input.equals("playGame.exe")){
			    System.out.println("You have Finished Tutorial");//switch computers
			    System.out.println("You are now ready... Hacker");
			    System.out.println("");
			    System.out.println("System Reboot...");
			    System.out.println("Flying through Data Space");
			    System.out.println("ERROROROROROROROROROROROR");
			    System.out.println("Just kidding");
			    System.out.println("Entering Random Enemy Computer..");
			    currentComputer = "43comp";
			    currentDir = "root";
			    pastDir = "root";
			    return "";
			}
		      else if(input.equals("End.exe")){
			    System.out.println("Congratuatations on solving our puzzles, you have now reached the last frontier");
			    System.out.println("Welcome to End Game");
			    return "";
			}
		  }
		    else{
			       System.out.println("WRONG PASSWORD");
		        return "";
		    }
		}

	  }
	  System.out.println("This is an executable file that can be accessed without a lock");
	}
	  return "contentFile";
    }

}
