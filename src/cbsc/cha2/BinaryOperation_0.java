package cbsc.cha2;
import java.util.Random;
/* 产生50道100以内的算式，屏幕输出
 * 每产生一个有效的算式，就屏幕输出
 */
public class BinaryOperation_0 {	  	
	public static void main(String[] args) {
		short m=0, n=0,v=0;  		
		char o='+';		
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
			System.out.println(""+(i+1)+":\t"+m+o+n+"=");
		}
	}
}

