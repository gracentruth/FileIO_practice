import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)throws IOException{
        String path= Paths.get(".").toAbsolutePath().toString();
        String filename=path+"/data.txt";

        File file = new File(filename);

        // 1. FileReader로 한 글자씩 읽어오기
        FileReader reader=new FileReader(file);

        int a=0;

        while((a=reader.read())!=-1){
            System.out.println((char)a);
        }
        //

    }


}
