import java.util.*;

import javax.lang.model.util.*;
import javax.swing.text.html.parser.Element;

import org.jsoup.*;
import org.jsoup.nodes.Document;
public class App {
    public static void main(String[] args) throws Exception {
        int i=0;
        int[] seq = new int[5];
        System.out.println("enter 5 numbers");
       getInputs(seq, 5);
       String url =  "http://oeis.org/search?fmt=text&q=" + Arrays.toString(seq).replaceAll("\\[|\\]|\\s", "");
       Document doc = Jsoup.connect(url).get();

        String body = doc.select("body").text();
        String seqStr = body.substring(body.indexOf("%S")+10, body.indexOf("%T"));
        String title = body.substring(body.indexOf("%N")+10, body.indexOf("%C"));
        System.out.println(title); 
        System.out.println(seqStr);
    }


    public static void getInputs(int[] seq, int size){
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<size){
            try{
                seq[i] = sc.nextInt();
                i++;
            }catch(InputMismatchException e){
                System.out.println("enter a valid number");
                sc.next();
                continue;
                
            }
        }
    }
}