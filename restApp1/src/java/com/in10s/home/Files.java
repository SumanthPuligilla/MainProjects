/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in10s.home;

/**
 *
 * @author Administrator
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {
   public static void main(String[] args) {

       BufferedReader br = null;
       BufferedReader br2 = null;
       try{	
           br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\VODAFONE\\Configurations.properties"));		

           //One way of reading the file
	   System.out.println("Reading the file using readLine() methoeeed:");
	   String contentLine = br.readLine();
	   while (contentLine != null) {
	      System.out.println(contentLine);
	      contentLine = br.readLine();
	   }
           if(contentLine.contains("=")){
               
               
           }
           System.out.println("contentLine"+contentLine);
//           if(contentLine.contains("=")){
//           
//           
//           }
       } 
       catch (IOException ioe) 
       {
	   ioe.printStackTrace();
       } 
       finally 
       {
	   try {
	      if (br != null)
		 br.close();
	   } 
	   catch (IOException ioe) 
           {
		System.out.println("Error in closing the BufferedReader");
	   }
	}
   }
}
