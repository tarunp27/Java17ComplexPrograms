package Test7;

import java.io.*;

public class Q33IOCPY {
    public static void main(String[] args) throws Exception {
        copy("c:\\Users\\tarun\\test2.txt","c:\\Users\\tarun\\test4.txt");
        File f = new File("C:\\Users\\tarun\\Practice");
        var f1 = f.getParent();
        var f2 = f.getParentFile();
        System.out.println(f1);
        System.out.println(f2);
        File f3 = new File("C:\\Users\\tarun\\d221204\\test\\5d");
        File f4 = new File("C:\\Users\\tarun\\d221204");
        File f5 = new File("C:\\Users\\tarun\\d221204\\test");
        File f6 = new File("C:\\Users\\tarun\\d221204\\test2\\5D");
// mkdir and mkdires
        if(f3.mkdir()) {
            System.out.println("Directory created for mkdir 1");
        }
        if(f4.mkdir()) {
            System.out.println("Directory created for mkdir 2");
        }
        if(f5.mkdir()) {
            System.out.println("Directory created for mkdir 3");
        }
        if(f6.mkdirs()) {
            System.out.println("Directory created for mkdirs 4");
        }
    }

    public static void copy(String fileName1, String fileName2) throws Exception {
        try (InputStream is = new FileInputStream(fileName1);
             OutputStream os = new FileOutputStream(fileName2);) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
            System.out.println(bytesRead);
        }
    }
}
