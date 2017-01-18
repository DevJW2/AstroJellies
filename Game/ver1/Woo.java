import cs1.Keyboard;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Woo{

    //root, tutorial, home, etc
    public static boolean value = true;

    public static void main(String[] args) throws FileNotFoundException{
	Scanner input = new Scanner(new File("title.txt"));
    while (input.hasNextLine())
    {
	System.out.println(input.nextLine());
    }
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
		while(value == true){
		    System.out.println("-----------------------------");
		    System.out.print( VFD.getcurrentDir());
		    System.out.print("");

		    String userInput = Keyboard.readString();
		    if(userInput.equals("cd root")){
			System.out.println("");
			Commands.changeDirectory("root");
		    }

		    else if(userInput.equals("cd tutorial")){
			System.out.println("");
			Commands.changeDirectory("tutorial");
		    }
		    else if(userInput.equals("ls")){
			Commands.listDirectory();
			}
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
		    else if(userInput.equals("exit")){
			value = false;
		    }
		    else{
		        System.out.println("Please insert a viable command");
			System.out.println("Try using the help command...");
		    }
		}




		//set up basic tutorial
		//create basic puzzle
		//create basic commands
		//create VFD
		//Solve puzzle
		//go to scene 1

	}

}
