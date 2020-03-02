import java.net.*; 
import java.io.*; 
import java.util.*; 
import java.net.InetAddress; 
import javax.swing.JOptionPane;

public class IPAFinder {

	 public static void main(String args[]) throws Exception 
	    {
		 
		 	String pubip, sysip;
		 	pubip = " Public IP Address: ";
		 	sysip="System IP Address : ";
		 
		 
	         //Prints System IP Address
		 
	        InetAddress localhost = InetAddress.getLocalHost(); 
	        JOptionPane.showMessageDialog(null,localhost.getHostAddress(), sysip , JOptionPane.INFORMATION_MESSAGE);
	        
	  
	         // Find public IP address 
	        String systemipaddress = ""; 
	        try
	        { 
	            URL url_name = new URL("http://bot.whatismyipaddress.com"); 
	  
	            BufferedReader sc = 
	            new BufferedReader(new InputStreamReader(url_name.openStream())); 
	  
	            
	            systemipaddress = sc.readLine().trim(); 
	        } 
	        catch (Exception e) 
	        { 
	            systemipaddress = "Cannot Execute Properly"; 
	        } 
	        //Prints public ip address
	        JOptionPane.showMessageDialog(null,localhost.getHostAddress(),pubip , JOptionPane.INFORMATION_MESSAGE);
	        
	    } 
	} 
