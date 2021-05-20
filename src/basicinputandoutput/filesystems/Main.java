package basicinputandoutput.filesystems;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {

//            Path fileToCreate = FileSystems.getDefault().getPath("examples", "file4.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate =  FileSystems.getDefault().getPath("examples", "dir4");
//            Path dirToCreate = FileSystems.getDefault().getPath("examples", "dir2/dir3/dir4/dir5/dir6");
//
//            Files.createDirectory(dirToCreate);
            Path filePath = FileSystems.getDefault().getPath("examples", "dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = "  + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());
            System.out.println("Is regular file = " + attrs.isRegularFile());
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1","file1copy.txt");
//            Files.deleteIfExists(fileToDelete);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

//        Path path = FileSystems.getDefault().getPath("WorkingDirectory.txt");
//        printFile(path);
////            Path filePath = FileSystems.getDefault().getPath("files","Subdirectory.txt");
//        Path filePath = Paths.get(".", "files", "Subdirectory.txt");
//        printFile(filePath);
////            filePath = Paths.get("D:\\, "Examples", Subdirectory.txt");
//        filePath = Paths.get("/home/lenovo/IdeaProjects/javamasterclass/src/basicinputandoutput/filesystems/files/Subdirectory.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//        // D:\Examples\.\subfolder\..\directory
//        // D: \Examples\directory
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "Subdirectory.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("/Volumes/Test/ING","abcdef", "Whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exits = " + Files.exists(filePath));
//
//        System.out.println("Exists = " + Files.exists(path4));
//    }
//
//    private static void printFile(Path path) {
//        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
