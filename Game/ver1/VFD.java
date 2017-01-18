public class VFD{
    //arraylist with all directories, later on
    public static String currentDir = "hacker@home:root$";
    public static int currentLayer = 0;
    
    public static String getcurrentDir(){
        return currentDir;
    }
    
    public static void checkState(){
        System.out.println(currentDir);
    }
    
    public static String rootDirectory(){
        currentLayer = 0;
        String retStr = "";
        retStr += "user\n";
        retStr += "tutorial";
        return retStr;
        
    }
    public static String tutorialD(){
        currentLayer = 1;
        String retStr = "";
        retStr += "largeTextFile.txt\n";
        retStr += "playGame.exe";
        return retStr;
    }
}
