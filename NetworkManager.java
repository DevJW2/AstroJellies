public class NetworkManager{
  
    static int[][] network = new int[10][10];
    public NetworkManager(){

	  network[3][4] = 1;
	  network[7][5] = 1;
	  network[9][9] = 1;

    }
    public static void main(String[] args){

	    printNetwork();
	    NetworkManager thing = new NetworkManager();
	    System.out.println(thing.testCoordinates(5,7));

    }

    public static void printNetwork(){

     for(int x = 0; x < 10; x ++){
	   System.out.print(x + "\t");
	   }

     System.out.println("\n");
     for(int i = 0; i < network.length; i++){
	      System.out.println("\n");
	      for(int n = 0; n < network[0].length; n++){
	      System.out.print(network[i][n]);
		    System.out.print("\t");
     }

	   System.out.println(i);

	  }
    }

    public Boolean testCoordinates(int xcord, int ycord){
	    if (network[xcord][ycord] == 1){
	    return true;
	   }
	    return false;
    }


}
