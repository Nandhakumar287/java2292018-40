import java.io.*;
import java.util.*;
  public class alphanumaric{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter A String");
      String str=sc.nextLine();
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)>='a'&& str.charAt(i)<='z' || str.charAt(i)>='A'&& str.charAt(i)<='Z')
        {
          System.out.print(" ");
        }
		    else
		    {
			    System.out.print(str.charAt(i));
		    }	
      }
    }
  }  
