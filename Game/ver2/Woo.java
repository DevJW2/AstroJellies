import cs1.Keyboard;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Woo{

    public static boolean value = true;
    //prints out ASCII
    public static void main(String[] args) throws FileNotFoundException{
	Scanner input = new Scanner(new File("title.txt"));
	while (input.hasNextLine())
	    {
		System.out.println(input.nextLine());
	    }
	

	//THINGS TO DO
	//CREATE NETWORK MANAGER - MAP OF GAME - SUPER CLASS, NEW INSTANCE EACH RUN, 2D ARRAY
	//CREATE TIP BOT
	//IMPLEMENT FEDERICOS DECRYPTOR
	//GET ALL COMMANDS WORKING
	//VIRUS CREATOR, TRIES TO WORK WITH THE FIRST PUZZLE, CREATE ONE VIRUS
	//THAT DETECTS VULNERABILITES, USING INTERFACES
	//CREATE TUTORIAL
	//INITIATE OPEN SCENE

	//WITH OPENING FILES
	//CREATE stealth lost scenario
	


	
	//INTRO-----------------------------------------------
		System.out.println("Welcome....");
		System.out.print("Please enter you name: ");
		String name = Keyboard.readString();
		System.out.println("Welcome Hacker: " + name);
		System.out.println("---------------------------------");
		System.out.println("BACKSTORY");
		System.out.println("---------------------------------");
		System.out.println("Initiating Game....");
		System.out.println("Loading Tutorial....");
		System.out.println("");
		System.out.println("Entering root directory..");
		System.out.println("");
		System.out.println("TRY: help");
	//END INTRO-----------------------------------------------

	//START GAME LOOP-----------------------------------------------
		while(value == true){
		    System.out.println("-----------------------------");
		    System.out.print("hacker@home:" + VFD.currentDir + "$");
		    System.out.print("");
		    
		    //Test COMMANDS
		    String userInput = Keyboard.readString();
		    if(userInput.length() < 2){
			System.out.println("Please insert a viable command");
			System.out.println("Try using the help command...");
			
		    }
		    //Test for CD
		    else if(userInput.substring(0,2).equals("cd")){
			System.out.println("");
			Commands.changeDirectory(userInput.substring(3));
		    }

		    
		    //Test for LS
		    else if(userInput.equals("ls")){
			Commands.listDirectory();
			}
		    //Test for HELP
		    else if(userInput.equals("help")){
			System.out.println("");
			System.out.println("list directory files: ls");
			System.out.println("--------------------------");
			System.out.println("change directory: cd ....");
			System.out.println("---------------------------");
			System.out.println("NOT PART OF GAME");
			System.out.println("---ADMIN---");
			System.out.println("To exit out of loop: exit");
		    }
		    //Test for EXIT
		    else if(userInput.equals("exit")){
			value = false;
		    }
		    else{
		        System.out.println("Please insert a viable command");
			System.out.println("Try using the help command...");
		    }
		}

	}
    	//END GAME LOOP-----------------------------------------------

}
