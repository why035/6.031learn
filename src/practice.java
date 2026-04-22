import java.util.Scanner;
public class practice {
public static void main(String[]args0) {
	Scanner sc=new Scanner(System.in);
	System.out.print("请输入第一个整数：");
	int number1=sc.nextInt();
	System.out.print("请输入第二个整数：");
	int number2=sc.nextInt();
	int add=number1+number2;
	int sub=number1-number2;
	int mul=number1*number2;
	double div=0.0;
	if (number2!=0) {
		div=(double)number1/number2;
		
	}else {
		System.out.println("除数不能为零，除数运算取消");
		
	}
	System.out.println("两位数之和："+add);
	System.out.println("两位数之差："+sub);
	System.out.println("两位数之积；"+mul);
	if(number2!=0) {
		System.out.println("两位数之商；"+div);
		
	}
	System.out.println("/n1到100的偶数如下；");
	for(int i=1;i<=100;i++) {
		System.out.println(i+"");
	}
}
}
