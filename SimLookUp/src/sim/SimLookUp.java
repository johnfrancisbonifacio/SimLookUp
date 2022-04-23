package sim;

import java.util.HashSet;
import java.util.Scanner;

public class SimLookUp {

	public static void main(String[] args) {

		HashSet<String> smart = new HashSet<String>();
		HashSet<String> globe = new HashSet<String>();
		HashSet<String> dito = new HashSet<String>();
		HashSet<String> sun = new HashSet<String>();
		HashSet<String> tnt = new HashSet<String>();
		
		
		
		
		globe.add("905");
		globe.add("906");
		globe.add("915");
		globe.add("916");
		globe.add("917");
		globe.add("926");
		globe.add("927");
		globe.add("935");
		globe.add("936");
		globe.add("937");
		globe.add("945");
		globe.add("953");
		globe.add("954");
		globe.add("955");
		globe.add("956");
		globe.add("965");
		globe.add("966");
		globe.add("967");
		globe.add("975");
		globe.add("976");
		globe.add("977");
		globe.add("978");
		globe.add("979");
		globe.add("995");
		globe.add("996");
		globe.add("997");
		smart.add("908");
		smart.add("918");
		smart.add("919");
		smart.add("920");
		smart.add("921");
		smart.add("928");
		smart.add("929");
		smart.add("939");
		smart.add("946");
		smart.add("947");
		smart.add("949");
		smart.add("951");
		smart.add("961");
		smart.add("998");
		smart.add("999");
		sun.add("922");
		sun.add("923");
		sun.add("924");
		sun.add("925");
		sun.add("931");
		sun.add("932");
		sun.add("933");
		sun.add("934");
		sun.add("940");
		sun.add("941");
		sun.add("942");
		sun.add("943");
		sun.add("973");
		sun.add("974");
		tnt.add("907");
		tnt.add("909");
		tnt.add("910");
		tnt.add("912");
		tnt.add("930");
		tnt.add("938");
		tnt.add("946");
		tnt.add("948");
		tnt.add("950");
		dito.add("895");
		dito.add("896");
		dito.add("897");
		dito.add("898");
		dito.add("991");
		dito.add("992");
		dito.add("993");
		dito.add("994");

		Scanner in = new Scanner(System.in);
		System.out.print("Enter:  ");

		try {
			String val = in.next();
			if (val == "" || val.equals("")) {
				System.out.println("No value.");
			} else {
				if (smart.contains(val)) {
					System.out.println("Smart");
				} else if (globe.contains(val)) {
					System.out.println("Globe");
				} else if (dito.contains(val)) {
					System.out.println("Dito");
				} else if (tnt.contains(val)) {
					System.out.println("TnT");
				} else if (sun.contains(val)) {
					System.out.println("Sun");
				} else {
					System.out.println("No Record");
				}
				in.close();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println('s');
		}

	}
}
