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
		    System.out.print("hacker@" + VFD.currentComputer+ ":" + VFD.currentDir + "$ ");
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
	        	System.out.println("------------------------------------------------------");
			System.out.println("< > do not type this, type the info described in < >");
			System.out.println("");
			System.out.println("");
			System.out.println("------------------------------------------------------");
			System.out.println("Command: ls");
			System.out.println("list directory files");
			System.out.println("");
			System.out.println("------------------------------------------------------");
			System.out.println("Command: cd");
			System.out.println("change directory");
			System.out.println("Format: cd <type here>");
			System.out.println("REMEMBER: cd .. goes back a directory in UNIX");
			System.out.println("");
		        System.out.println("------------------------------------------------------");

			System.out.println("Command: open");
			System.out.println("opens any files: .exe, .txt, etc");
			System.out.println("Format: open <type here>");
			System.out.println("");
		      	System.out.println("------------------------------------------------------");
            System.out.println("Command: decryptor");
            System.out.println("WARNING: ONLY WORKS AFTER YOU BEAT TUTORIAL");
      			System.out.println("decrypts a string by using a given hash and running a Caesar cypher");
      			System.out.println("Format: decryptor");
      			System.out.println("");
      		      	System.out.println("------------------------------------------------------");
                  System.out.println("Command: trojan");
                  System.out.println("WARNING: ONLY WORKS AFTER YOU BEAT TUTORIAL");
                  System.out.println("WARNING: DEMO!");
            			System.out.println("sends trojan to target computer");
            			System.out.println("Format: send trojan");
            			System.out.println("");
            		      	System.out.println("------------------------------------------------------");
			System.out.println("Command: ssh");
			System.out.println("WARNING: ONLY WORKS AFTER YOU BEAT TUTORIAL");
			System.out.println("connects to any computer on the network map");
			System.out.println("Format: ssh hacker@[<xcoordinate>,<ycoordinate>]");
			System.out.println("");
	        	System.out.println("------------------------------------------------------");
			System.out.println("Command: netview");
			System.out.println("WARNING: ONLY WORKS AFTER YOU BEAT TUTORIAL");
			System.out.println("shows your network map");
			System.out.println("");
	        	System.out.println("------------------------------------------------------");
			System.out.println("---NOT PART OF THE GAME---");
			System.out.println("");
			System.out.println("Command: exit");
			System.out.println("To exit out of Game Loop");
			System.out.println("");
	        	System.out.println("------------------------------------------------------");

		    }



		    else if(userInput.equals("decryptor") && (!VFD.currentComputer.equals("home"))){
			    Decryptor.setupEr();
			    String userInputed = Keyboard.readString();
			    Decryptor.completeUpdate(userInputed);
			    if (Decryptor.more==1){
			      String userInuted = Keyboard.readString();
			      Decryptor.stringSet(userInuted);
			    if (Decryptor.currentMode==2){
				    System.out.println("Please enter the hash to decrypt your message:");
				    String userIuted = Keyboard.readString();
				    Decryptor.hashSet(userIuted);
			    }
			    System.out.println(Decryptor.solveCode());
			    }
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
           //checking for format
			 }
			 else{
			     System.out.println("Please enter in the correct format");
			 }
		     }

		    //Test for viewing network
		     else if(userInput.equals("netview") && (!VFD.currentComputer.equals("home"))){
			      Commands.networkMap();
		     }

		    //VIRUS CREATOR ----------------------------------------------------------------
		     else if(userInput.equals("send trojan")){
			 Vulndetector.findVulnerabilities();
			 System.out.println("Found " + Vulndetector.getVuls() + " vulnerabilities.");
			 System.out.println("Access them?(y/n)");
			 String userInputed = Keyboard.readString();
			 if (userInputed.equals("y")){
			     System.out.println("Which vulnerability would you like to access? (1-4)");
			     System.out.println("1. Denial of Access Attack");
			     System.out.println("2. MAC Address spoofing");
			     System.out.println("3. Man-In-The-Middle Attack");
			     System.out.println("4. Packet Injection");
			     System.out.print("Response: ");
			     //user inputs a vulernability
			     String userInpu = Keyboard.readString();
			     System.out.println("Functionality not available in prototype.  Sorry!");
			     /*
			       Vulndetector.testUserChoice(userInpu);
			       //check against Vuls to see if the user had a legitimate response
			       //if user did indeed have legit response, userChoice updates to true
			       if (Vulndetector.getUserChoice()){
			       Vulndetector.exploitedVul(userInpu);
			       //run exploitedVul as obstacle, if user is correct userChoice stays true
			       if (Vulndetector.getUserChoice()){
			       Vulndetector.activateVirus();
			       //if userChoice is still true now, we run activateVirus to finish the process
			       }
			       }
			       else if (userInputed.equals("n")) {
			       System.out.println("Please choose a valid vulnerability");
			       }

			       }

			       else if (userInput.equals("n")){
			       System.out.println("Decided not to access vulnerabilities");
			       }
			     */
			     if (userInputed.equals("n")) {
				 System.out.println("Please return a valid response.");
			     }

			 }
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
