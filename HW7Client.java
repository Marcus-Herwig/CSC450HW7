import java.io.InputStream;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class HW7Client
{
    public static void main(String[] args) throws Exception
    { 
        Socket chatClient =new Socket("127.0.0.1",2222); 
        Scanner getName = new Scanner(System.in);
        Scanner getServerString = new Scanner(chatClient.getInputStream());    
        System.out.println(getServerString.nextLine());
        String serverInput = getName.nextLine();
        PrintStream serverPrint = new PrintStream(chatClient.getOutputStream());
        serverPrint.println(serverInput);
        System.out.println("connection closing...");
    }
}