package sim;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SimLookUp {

	public static void main(String[] args) {
	
		HashSet<String> smart = new HashSet<String>();
		HashSet<String> globe = new HashSet<String>();
		HashSet<String> dito = new HashSet<String>();
		HashSet<String> sun = new HashSet<String>();
		HashSet<String> tnt = new HashSet<String>();
		
		sun.add("922");      smart.add("908");       globe.add("905");      tnt.add("907");
		sun.add("923");      smart.add("918");       globe.add("906");      tnt.add("909");
		sun.add("924");      smart.add("919");       globe.add("915");      tnt.add("910");
		sun.add("925");      smart.add("920");       globe.add("916");      tnt.add("912");
		sun.add("931");      smart.add("921");       globe.add("917");      tnt.add("930");
		sun.add("932");      smart.add("928");       globe.add("926");      tnt.add("938");
		sun.add("933");      smart.add("929");       globe.add("927");      tnt.add("946");
		sun.add("934");      smart.add("939");       globe.add("935");      tnt.add("948");
		sun.add("940");      smart.add("946");       globe.add("936");      tnt.add("950");
		sun.add("941");      smart.add("947");       globe.add("937");
		sun.add("942");      smart.add("949");       globe.add("945");
		sun.add("943");      smart.add("951");       globe.add("953");      dito.add("895");
		sun.add("973");      smart.add("961");       globe.add("954");      dito.add("896");
		sun.add("974");      smart.add("998");       globe.add("955");      dito.add("897");
                             smart.add("999");       globe.add("956");      dito.add("898");
		                                             globe.add("965");      dito.add("991");
		                                             globe.add("966");      dito.add("992");
	                                                 globe.add("967");      dito.add("993");
                                                     globe.add("975");      dito.add("994");
                                                     globe.add("976");
                                                     globe.add("977");
                                                     globe.add("978");
                                                     globe.add("979");
                                                     globe.add("995");
                                                     globe.add("996");
                                                     globe.add("997");
                                                     
                                                     
       Scanner in = new Scanner(System.in);
       System.out.print("Enter: ");
       
       
       try{
    	   String val = in.next();
    	   if(val == "" || val.equals("")) {
    		   System.out.println("No value.");
    	   }else {
    		   if(smart.contains(val)) {
    			   System.out.println("Smart");
    		   }else if(globe.contains(val)) {
    			   System.out.println("Globe");
    		   }else if(dito.contains(val)) {
    			   System.out.println("Dito");
    		   }else if(tnt.contains(val)) {
    			   System.out.println("TnT");
    		   }else if(sun.contains(val)) {
    			   System.out.println("Sun");
    		   }else {
    			   System.out.println("No Record");
    		   }
    		   in.close();
    	   }
    	   
       }catch(Exception e) {
    	   
       }
                                                 
                                                     
	}
}