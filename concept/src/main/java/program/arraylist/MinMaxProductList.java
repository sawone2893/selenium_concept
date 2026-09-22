package program.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxProductList {
	
	public static List<Long> maxMin(List<String> operations,List<Integer> nums){
		
		int opsCount=operations.size();
		int numCount=nums.size();
		List<Integer> data=new ArrayList<>();
		List<Long> maxMinPro=new ArrayList<>();
		if(opsCount==numCount) {
			for(int i=0;i<opsCount;i++) {
				if(operations.get(i).equalsIgnoreCase("push")) {
					data.add(nums.get(i));
				}else if(operations.get(i).equalsIgnoreCase("pop")) {
					data.remove(data.size()-1);
				}
				System.out.println("Data after: "+operations.get(i)+" ="+data);
				long min=Collections.min(data);
				long max=Collections.max(data);
				maxMinPro.add(min*max);
				
			}
		}
		return maxMinPro;
	}
	
	public static void main(String args[]) {
		List<Integer> nums=Arrays.asList(10, 5, 20, 8);
		List<String> ops=Arrays.asList("push","push","push","pop");
		System.out.println(MinMaxProductList.maxMin(ops, nums));
	}

}
