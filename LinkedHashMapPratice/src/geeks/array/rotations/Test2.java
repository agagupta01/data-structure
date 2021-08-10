package geeks.array.rotations;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		
		String result = "";
		String inputString = "GGGGrrrrrrrrrrrrrrt";
		
        char [] tmp = inputString.toCharArray();
        
        TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
        
        for(int i = 0 ; i < tmp.length ; i++){
            if(map.get(tmp[i]) != null){
                int count = map.get(tmp[i]);
                map.put(tmp[i], ++count);
            } else {
                map.put(tmp[i], 1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet())  {
            result = result + entry.getValue(); 
            result = result + entry.getKey();

        }
        System.out.println(result);

	}
	
	

}
