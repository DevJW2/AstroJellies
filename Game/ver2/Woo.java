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
	//fix help
	//create tools super class
	//make puzzles
	
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
		    System.out.print("hacker@" + VFD.currentComputer+ ":" + VFD.currentDir + "$");
		    System.out.print("");

		    //Test COMMANDS
		    String userInput = Keyboard.readString();
		    try{
		    //Test for CD
		    if(userInput.substring(0,2).equals("cd")){
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

		    
		    //Test for open
		     else if(userInput.substring(0,4).equals("open")){
			Commands.openFile(userInput.substring(5),userInput.substring(userInput.substring(5).length() + 1));

		     }
		    
		    //Test for SSH
    
		     else if(userInput.substring(0,3).equals("ssh") && (!VFD.currentComputer.equals("home"))){
			 if(userInput.substring(4).length() == 12 && userInput.substring(4,11).equals("hacker@")){
			     Commands.connectComputer(userInput.substring(4));
			 }
			 else{
			     System.out.println("Please enter in the correct format");
			 }
		     }

		     else if(userInput.equals("netview") && (!VFD.currentComputer.equals("home"))){
			 Commands.networkMap();
		     }

		    
		    else{
		        System.out.println("Please insert a viable command");
			System.out.println("Try using the help command...");
		    }
		    }
		    catch(Exception e){
			System.out.println("Please insert a viable command");
			System.out.println("Try using the help command...");
		    }
		}

	}
    	//END GAME LOOP-----------------------------------------------

}
