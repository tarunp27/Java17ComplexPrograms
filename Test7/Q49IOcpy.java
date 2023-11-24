package Test7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
//**************************************************************************************
// how to create symbolic link in windows
//C:\Users\tarun>mklink /D "C:\Users\tarun\d221204A" "C:\Users\tarun\D221204"     (target file) (source file)
//**************************************************************************************
public class Q49IOcpy {
    public static void main(String[] args) throws Exception {
        Path p1 = Paths.get("c:\\Users\\tarun\\d221204A\\test49.txt");
        Path p2 = Paths.get("c:\\Users\\tarun\\d221204A\\test49A.txt");
//        copy1(p1, p2);
        if (Files.isSameFile(p1, p2)) {
            System.out.println("file copied");
        } else {
            System.out.println("unable to copy file");
        }
    }

    public static void copy1(Path p1, Path p2) throws Exception {
        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
    }


}
