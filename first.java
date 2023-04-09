package code.practice;
import java.io.Console;

    public class first {
        public static void main(String[] args){
        System.out.println("名前を教えてください");
        Console con=System.console();
        String str=con.readLine();
        System.out.println("よろしくお願いします！"+str+"さん。");
        }
    
    
    
}
