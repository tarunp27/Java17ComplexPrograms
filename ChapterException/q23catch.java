package ChapterException;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.sql.SQLException;
import java.time.Month;
import java.util.ArrayList;

class TideException extends Exception {}
class Error extends Exception{}

class Engine implements Closeable {
    public void close()  {
        System.out.println("Close method");
    }
}


public class q23catch {

    public void surf() throws RuntimeException {
        boolean ageChk = false;
        try {
//            throw new TideException();
            if (ageChk)
                throw new FileNotFoundException();
            else
                throw new SQLException();

        } catch (IllegalStateException | IOException | SQLException t) {}
    }

    public static void main(String[] args) {
        int grade = (Integer)null;
        System.out.println(grade);
    }
}
