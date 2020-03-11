package my_project;
import java.util.Scanner;

public class Test {
	public void sum(int a,int b){
		int temp;
		temp = a + b;
		System.out.println("a+b="+temp);
	}
    public static void main(String[]args){
    	Scanner in = new Scanner(System.in);
    	int num;
    	num = in.nextInt();
    	in.close();
    	System.out.println("num="+num);
        Test sum = new Test();
        sum.sum(5,2);
    }
}
