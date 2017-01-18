public class Decryptor{
    public static int currentMode = 0;
    public static String inputString = "";
    public static int inputHash = 0;
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void setupEr(){
      System.out.println("Do you wish to encrypt or decrypt or brute force a message?");
      System.out.println("Enter either 'encrypt' or 'decrypt' or 'brute'.");
    }
    public static void stringSet(String input){
      inputString = input;
    }
    public static void hashSet(int hash){
      inputHash = hash;
    }
    public static int modeSelector(String mode){
      if (mode.equals("encrypt")){
        currentMode=1;
      }
      else if (mode.equals("decrypt")){
        currentMode=2;
      }
      else if (mode.equals("brute")){
        currentMode=0;
      }
      return currentMode;
    }
    public static void solveCode(){
    String ans="";
      if (currentMode==2){
        System.out.println("Decrypting.../n");
        for (int x =0; x<27;x++){
          if(x+inputHash>26){
            ans = Character.toString(inputString.charAt(x+inputHash-26));
          }
          else{
            ans=Character.toString(inputString.charAt(x+inputHash));
          }
          System.out.print(ans);
        }

      }
      else if (currentMode==0){
        System.out.println("Decrypting through brute-force.../n");
        for (int q=0;q<27;q++){
          for (int x =0; x<27;x++){
            if(x+q>26){
              ans = Character.toString(inputString.charAt(x+q-27));
              }
            else{
             ans=Character.toString(inputString.charAt(x+q));
            }
           System.out.print(ans);
        }
        System.out.println(" ");
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
        System.out.print(ans);
      }
    }
}
}
