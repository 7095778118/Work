import java.io.*;  
import java.util.Scanner;  
public class filehandling
{  
public static void main(String args[])  
{  

// reading a file 
try  
{  
FileInputStream inputfile=new FileInputStream("inputfile.txt");       
Scanner scannerfile=new Scanner(inputfile);    

while(scannefile.hasNextLine())  
{  
System.out.println(sc.nextLine());      
//prints a single line   
}  
sc.close();     

// closes the scanner  
}  
catch(IOException e)  
{  
e.printStackTrace();  
}  


//writing to a file some random content
try  
{  
File outputfile = new File("outputfile.txt");
FileOutputStream outputstream = new FileOutputStream(outputfile);

OutputStreamWriter streamwrite = new OutputStreamWriter(outputstream);
for (int i = 0; i < 10; i++) {
  streamwrite.write("something");
}
outputstream.close();
}
catch(IOException e)  
{  
System.out.println(e);
}  


}  
}  
