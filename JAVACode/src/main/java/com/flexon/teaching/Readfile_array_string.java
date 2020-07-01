package com.flexon.teaching;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class Readfile_array_string {
	
	
	public static void main(String[] args) throws IOException {
		
		File inputfile = new File("/Users/shrinapatel/testfile.txt");
		Scanner readfiledata = new Scanner(inputfile);
	
		
		while(readfiledata.hasNextLine())
		{
			//System.out.println(readfiledata.nextLine().split(";"));
			String currentLine = readfiledata.nextLine();
		    String[] words = currentLine.split(" ");  
		    List<String> num = new ArrayList<>();
		    for(String a : words){
		      // System.out.println(a);
		    if(a.length()>3) {
		    	//System.out.println(a);
		    	num.add(a);
		    }
		    
		       
		        }	
		    HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
		    
		    for(String a : num) {
		        //System.out.println(a);
		        if(hash_map.containsKey(a))
		        {
		        	Integer count = hash_map.get(a);
		        	hash_map.put(a, count+1);
		        } else {
		        	hash_map.put(a, 1); 
		        }
		    }
		    Iterator it = hash_map.entrySet().iterator();
		    List<String> Finalwords = new ArrayList<>();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        //System.out.println(pair.getValue());
		        if((int)pair.getValue() >= 5) {
		        	//System.out.println(pair.getKey().toString());
		        	StringBuilder input1 = new StringBuilder();
		        	input1.append(pair.getKey().toString());
		        	//System.out.println("Reverse words: " +input1.reverse());
		        	Finalwords.add(input1.reverse().toString());
		        	
		        }
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		    for(String a : Finalwords) 
		    {
		    	System.out.println(a);
		    }
		    
		}
		
		readfiledata.close();
	
		
	}
	

}
		
