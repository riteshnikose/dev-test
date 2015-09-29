package com.jcs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dev {

	public static void main(String[] args) {	         
					String city = null;
			        System.out.println("please enter city name");
			        try{
			        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			        	city = br.readLine();
			        }
			        catch(IOException ioe){
			        	System.out.println("IO error cannot able to read city name");
			        }
			        new Parser(city);
			        //System.out.println("Write CSV file:");
	}
}