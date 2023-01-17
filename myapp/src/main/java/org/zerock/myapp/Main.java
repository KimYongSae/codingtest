package org.zerock.myapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String word = br.readLine();
//    	String word = "baekjoon";

    	
    	int[] arr = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    	
    
    	
    	for(int i = word.length()-1; i>=0  ; i --) {
    	
    			arr[word.charAt(i)-97] = i;
    	}
    	
    	for(int i : arr) {
    		System.out.print(i + " ");
    	}
    	
    }
}
