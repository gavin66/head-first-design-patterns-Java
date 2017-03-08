package headfirst.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Gavin on 2017/3/8.
 */
public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/Gavin/IdeaProjects/head-first-design-patterns-Java/LICENSE")));

            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }

            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
