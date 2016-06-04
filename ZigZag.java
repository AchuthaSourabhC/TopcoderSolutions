import java.io.*;
import java.util.*;
import java.lang.Math;
 
public class ZigZag{
 
 	public int longestZigZag(int [] sequence){
 List<Boolean> temp = new ArrayList<>();

 		if(sequence.length == 1 ){
 			return sequence.length;
 		}

 		for(int  i = 0; i < sequence.length-1; i++){
 			if(sequence[i+1] - sequence[i] > 0){
 				temp.add(true);
 			}else if( sequence[i+1] - sequence[i] < 0){
 				temp.add(false);
 			}
 		}

 		int count = 0;
 		if(temp.size() >= 1){
	 		Boolean search = !(temp.get(0));
	 		count = 1;
	 		int i = 1;
	 		int len = temp.size();
	 		while(i < len){
	 			if(search == temp.get(i)){
	 				count++;
	 				search = !(search);
	 			}
	 			i++;
	 		} 	
	 	}
 		
 		return (count + 1);
 

 	}

}