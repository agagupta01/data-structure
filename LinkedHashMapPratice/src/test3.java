import java.util.ArrayList;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class test3 
{ 
    // Driver method 
    public static void main(String[] args) 
    { 
    	ArrayList<String> ab = new ArrayList<>();
    	ArrayList<String> c = new ArrayList<>();
    	boolean b = ab.containsAll(c);
    	System.out.println(b);
    } 
}
