import cs1.Keyboard;

public class Decryptor extends Tools{
    public static int more = 0;
    public static int currentMode = 0;
    public static String inputString = "";
    public static int inputHash = 0;
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void setupEr(){
      System.out.println("Do you wish to encrypt or decrypt or brute force a message?");
      System.out.println("Enter y to confirm");
    }
    public static void completeUpdate(String input){
      if (input.substring(0,1).equals("y")){
            System.out.println("Please enter string you wish to decrypt.");
            more=1;
            modeSelector("d");
          }
      else if (input.substring(0,1).equals("b")){
            System.out.println("Functionality not available in prototype.  Sorry!");
          }
    else {
      System.out.println(input);
      System.out.println("Functionality not available in prototype.  Sorry!");
      more=0;
    }
        }
    public static void stringSet(String input){
      inputString = input;
    }
    public static void hashSet(String hash){
      inputHash = Integer.parseInt(hash);
    }
    public static int modeSelector(String mode){
      if (mode.equals("e")){
        currentMode=1;
      }
      else if (mode.equals("d")){
        currentMode=2;
      }
      else if (mode.equals("b")){
        currentMode=0;
      }
      return currentMode;
    }
    public static String solveCode(){
    String ans="";
    String fans="";
      if (currentMode==2){
        System.out.println("Decrypting...");
        for (int q=0; q<inputString.length();q++){
        for (int x=0; x<alphabet.length();x++){
          if (alphabet.substring(x,x+1).equals(inputString.substring(q,q+1))){
            fans+=alphabet.substring(x+inputHash,x+inputHash+1);
          }
}
}
      }
      else if (currentMode==0){
        System.out.println("Decrypting through brute-force...");
        for (int q=0;q<27;q++){
          for (int x =0; x<27;x++){
            if(x+q>26){
              ans = Character.toString(inputString.charAt(x+q-27));
              }
            else{
             ans=Character.toString(inputString.charAt(x+q));
            }
           fans+=ans;
        }
      }
    }
    else{
      System.out.println("Encrypting.../n");
      for (int x =0; x<27;x++){
        if(x-inputHash<0){
          ans = Character.toString(inputString.charAt(27-(x-inputHash)));
        }
        else{
          ans=Character.toString(inputString.charAt(x-inputHash));
        }
        fans+=ans;
      }
    }
    return fans;
}
}
