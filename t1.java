import java.io.*;
import java.util.*;
  

class MyFilenameFilter implements FilenameFilter {
    
    String initials;
    
    public MyFilenameFilter(String initials)
    {
        this.initials = initials;
    }
    
    public boolean accept(File dir, String name)
    {
        return name.startsWith(initials);
    }
}
public class t1 {
    
    public static void main(String[] args)
    {
        String b;
        // Create an object of the File class
        // Replace the file path with path of the directory
        File directory = new File("C:/Users/91623/Desktop");
  
   Scanner sc=new Scanner(System.in);
   b=sc.next();
        MyFilenameFilter filter
            = new MyFilenameFilter(b);
  
        String[] flist = directory.list(filter);
  
        if (flist == null) {
            System.out.println(
                "Empty directory or directory does not exists.");
        }
        else {
            for (int i = 0; i < flist.length; i++) {
                System.out.println(flist[i]+" found");
            }
        }
    }
}