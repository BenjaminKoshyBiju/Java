import java. net.*;
import java.io.*;
public class Server
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss=new ServerSocket(4999);
        Socket s=ss.accept();
        System.out.println("Connection success!!");
        InputStreamReader is=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(is);
        String str=bf.readLine();
        System.out.println(""+str);
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("hii");
        pr.flush();
    }
}