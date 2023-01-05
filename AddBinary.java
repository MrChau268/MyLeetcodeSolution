package leetcode.no67;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class AddBinary {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		
		int aLength = a.length()-1;
		int bLength = b.length()-1;
		
		int carryNumber = 0;
		
		while(aLength >= 0 || bLength >=0){
			int sum = carryNumber;
			
			if(aLength >=0) {
				sum+=(a.charAt(aLength--)-'0');
			}
			
			if(bLength >=0) {
				sum+=(b.charAt(aLength--)-'0');
			}
			
			sb.insert(0, sum%2);
			carryNumber = (sum/2);
				
		}
	}
}
