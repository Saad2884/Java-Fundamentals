import java.io.*;
import java.util.*;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SE_1.Java fundamentals/CopyFileInput.txt"));
        PrintWriter out = new PrintWriter("SE_1.Java fundamentals/CopyFileOutput.txt");
        String inputData;
        while (in.hasNextLine()) {
        inputData = in.nextLine();
        out.println("Copy: " + inputData);
        }
        in.close();
        out.close();
        }
}
