package chapters.chapter12.exercise12_26;

import java.io.File;

public class Exercise12_26 {
    public static void main(String[] args) {
        File createDir = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\exercise12_26\\createdDirectory");

        if(createDir.isDirectory()){
            System.out.println("Directory already exists...");
        }else {
            createDir.mkdirs();
            System.out.println("Directory " + (createDir.isDirectory() ? "" : "couldn't" ) + "created successfully");
        }

    }
}
