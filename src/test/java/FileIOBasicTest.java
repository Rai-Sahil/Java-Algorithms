import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIOBasicTest {
    public boolean WriteInFile(){
        try{
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\raisa\\IdeaProjects\\GenericsPractice\\src\\main\\resources\\BasicFileIO")
            );
            bw.write("Hello");
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    @Test
    public void writingTest(){
        WriteInFile();

        assertTrue(WriteInFile());
    }

}
