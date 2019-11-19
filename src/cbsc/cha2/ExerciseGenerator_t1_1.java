package cbsc.cha2;

import java.util.Random;
/*
 *针对任务1完成的代码
 *增加结果约束，单独打印结果
 *使用者读题、判断结果
 *This is for CH2 Branch
 */
public class ExerciseGenerator_t1_1 {	
	public static void generateExerciseOfAdditionEquations (){
		int m,n,v;
		for(int i=0;i<50;i++){
			n=generateOperand();
			do{
				m=generateOperand();
				v=m+n;
			}while (v >= 100);
			System.out.println((i+1)+ ": "+n+" + "+m+" = "+v);  // 不同的语言实现不一样
		}
	}

	public static int generateOperand(){
	// 生成100以内的整数
		Random random = new Random();
		return (short)random.nextInt(101);
	}
	public static void printHeader(){
		System.out.println("------------------------------------");
		System.out.println("- 程序输出50道100以内的加法运算的口算题 -");
		System.out.println("------------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHeader();
		generateExerciseOfAdditionEquations();
	}

}