import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountNumbers {

    public static int countNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));
        String s = br.readLine();
        int res=0;
        String[]str=s.split("\s");
        for(String txt:str){
            if(!txt.startsWith("#") && !txt.isEmpty()){
                res+=Integer.parseInt(txt);
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countNumbers());
    }
}
