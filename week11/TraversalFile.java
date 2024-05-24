package week11;

import java.io.File;

public class TraversalFile{

    public static void printFileInfo(String filePath){

        File file = new File(filePath);

        if(file.exists()){
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("File Last Modified: " + file.lastModified());
            System.out.println("File Permissions: " + (file.canRead() ? "Readable " : "") + 
                                                      (file.canWrite() ? "Writable " : "") + 
                                                       (file.canExecute() ? "Executable " : ""));
        }
        else{
            System.out.println("File does not exist");
        }

    }

    public static void traversePath(String path){
        File file = new File(path);
        if(file.isFile()){
            printFileInfo(path);
        }
        else if(file.isDirectory()){
            System.out.println("Directory: " + path);
            File[] files = file.listFiles();
            if(files != null){
                for(File f : files){
                     traversePath(f.getAbsolutePath());
                }
            }
        }
        else{
            System.out.println("Invalid path");
        }
    }

    public static void main(String[] args) {
        String fileOrDirPath = "C:\\Users\\ASUS\\OneDrive - ADA University\\Desktop\\Sociology(Spring2024)";
        traversePath(fileOrDirPath);
    }
}