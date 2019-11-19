package cbsc.cha2;
import java.util.Random;
/*
 *针对任务1完成的代码
 */
public class ExerciseGenerator_t1 {	
	public static void generateExerciseOfAdditionEquations (){
		int m,n;
	
		for(int i=0;i<50;i++){
			n=generateOperand();
			m=generateOperand();
			System.out.println((i+1)+ ": "+n+" + "+m+" = ");  // 不同的语言实现不一样
		}
	}

	public static int generateOperand(){
	// 生成100以内的整数
		Random random = new Random();
		return (short)random.nextInt(101);
	}
	public static void printHeader(){
		System.out.println("------------------------------------");
		System.out.println("- 程序输出50道100以内的加法运算式的习题 -");
		System.out.println("------------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHeader();
		generateExerciseOfAdditionEquations();
	}

}
