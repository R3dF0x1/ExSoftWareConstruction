package cbsc.cha2;

import java.util.Random;
public class BinaryOperation_1 {	  	
	public static void main(String[] args) {
		short m=0, n=0,v=0;  		
		char o='+';
		String [] e = new String[50];	
		Random random = new Random();
		short ov = (short) random.nextInt(2);  	// 随机产生运算符
		
		for (int i=0;i<50; i++){
			m = (short)random.nextInt(101);		// 随机产生运算数
			if (ov == 1){
				do {
					n = (short)random.nextInt(101);
					v = (short) (m + n);
				} while (100 < v || v < 0);			
				o = '+';
			} else {
				do {
					n = (short)random.nextInt(101);
					v = (short) (m - n);
				} while (100 < v || v < 0);
				o = '-';
			}			
			e[i]=""+m+o+n+"=";
		}
		for (int i=0;i<50; i++){
			System.out.println(""+(i+1)+":\t"+e[i]);
		}
	}
}