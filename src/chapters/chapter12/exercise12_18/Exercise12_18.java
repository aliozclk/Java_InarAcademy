package chapters.chapter12.exercise12_18;

import java.io.File;
import java.util.ArrayList;

public class Exercise12_18 {
    public static void main(String[] args) throws Exception {
        if(args.length != 1){
            throw new IllegalArgumentException("Illegal Argument...");
        }

        File dir = new File(args[0]);
        if(!dir.isDirectory()){
            throw new Exception(args[0] + " is not a directory");
        }

        //ArrayList<File> dirs = getDirs(dir);

    }

}
