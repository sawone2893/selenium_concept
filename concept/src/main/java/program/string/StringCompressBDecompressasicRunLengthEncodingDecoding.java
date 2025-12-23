package program.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressBDecompressasicRunLengthEncodingDecoding {
	public static String stringCompressGlobal(String str) {
		
		        Map<Character,Integer> data= new LinkedHashMap<>();
		        char[] chars=str.toCharArray();
		        StringBuilder sb= new StringBuilder();
		        for(char ch:chars){
		            data.put(ch,data.getOrDefault(ch,0)+1);
		        }
		        for(Map.Entry<Character,Integer> entry:data.entrySet()){
		            sb.append(entry.getKey());
		            sb.append(entry.getValue());
		        }
		        
		        return sb.toString();
	}
	
	public static String compressConsecutive(String str) {
		StringBuilder sb= new StringBuilder();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				sb.append(str.charAt(i));
				sb.append(count);
				count=1;
			}
		}
		
		return sb.toString();
	}
	
	public static String decompressString(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(i+1<str.length() && Character.isDigit(str.charAt(i+1))) {
				int count=Integer.parseInt(String.valueOf(str.charAt(i+1)));
				for(int j=0;j<count;j++) {
					sb.append(str.charAt(i));	
				}
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[]) {
		String str="a2b2c5D3e3a3";
		System.out.println(StringCompressBDecompressasicRunLengthEncodingDecoding.decompressString(str));
	}

}
