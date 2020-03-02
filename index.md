## Welcome to IPA Finder

I make this code to find IP Address

### Markdown

Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```java
Syntax highlighted code block
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
	        JOptionPane.showMessageDialog(null,systemipaddress,pubip , JOptionPane.INFORMATION_MESSAGE);;
	       
	    } 
	} 

```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/mypablo/Dota2Blog/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
