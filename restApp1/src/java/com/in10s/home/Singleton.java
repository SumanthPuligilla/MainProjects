/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in10s.home;

import static java.util.Collections.singleton;

/**
 *
 * @author Administrator
 */ class Singleton {
    
    private static  Singleton singleton =null;
    String s="";
    private Singleton(){
    
        s="Iam the Singleton class";
    }
     public static Singleton getInstance() 
    { 
        if (singleton == null) 
            System.out.println("This");
            singleton = new Singleton(); 
  
        return singleton; 
    }
    
}
class Main 
{ 
    public static void main(String args[]) 
    { 
        // instantiating Singleton class with variable x 
        Singleton x = Singleton.getInstance(); 
  
        // instantiating Singleton class with variable y 
        Singleton y = Singleton.getInstance(); 
  
        // instantiating Singleton class with variable z 
        Singleton z = Singleton.getInstance(); 
  
        // changing variable of instance x 
        x.s = (x.s).toUpperCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
        // changing variable of instance z 
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
    } 
}
