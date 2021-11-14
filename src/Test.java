import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double cutNum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("以下输入两个同学的零花钱（单位：元）（double类型）");
		System.out.println("请输入第一个同学的零花钱");
		double stu1 = input.nextDouble();
		System.out.println("请输入第二个同学的零花钱");
		double stu2 = input.nextDouble();
		
		Money m1 = new Money(stu1);
		Money m2 = new Money(stu2);
		
		System.out.println("第一个同学的零花钱为");
		System.out.println(m1);
		System.out.println("第二个同学的零花钱为");
		System.out.println(m2);
		
		
		System.out.println("现减少第一个同学的零花钱，请输入要减少的金额（实数）");
		cutNum = input.nextDouble();
		
		while (cutNum > m1.yuan + (double)(m1.jiao)/10 + (double)(m1.jiao)/100) {
			System.out.println("削减金额超过第一个同学的零花钱本金，请重新输入");
			cutNum = input.nextDouble();
		}
		
		Money t = new Money(cutNum);
		m1.cut(t);
		
		
		System.out.println("减少后，第一个同学的零花钱为");
		System.out.println(m1);
	}

}
