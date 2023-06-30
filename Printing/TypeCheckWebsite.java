import java.util.Scanner;

public class TypeCheckWebsite {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a URL");
        String url=scan.nextLine();
     
        String protocol=url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        }
            
        else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }
            
        
        
        String ext=url.substring(url.lastIndexOf(".")+1);
        
        if(ext.equals("com")){
            System.out.println("Commercial");}
            
        else if(ext.equals("org")){
            System.out.println("Organisation");

        }
            
        else if(ext.equals("net")){
            System.out.println("Network");

        }
        scan.close();
            
            
        
        
    }
    

    
}
