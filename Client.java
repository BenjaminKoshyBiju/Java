import java. net.*;
import java.io.*;
public class Client
{
    public static void main(String[] args) throws IOException
    {
        Socket s=new Socket("localhost",4999);
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("hello");
        pr.flush();
        InputStreamReader is=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(is);
        String str=bf.readLine();
        System.out.println(""+str);
    }
}