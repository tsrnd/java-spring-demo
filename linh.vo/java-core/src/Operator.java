
public class Operator {

	int data=50; // instance variable  
	static int m=100; // static variable 

	public static void main(String[] args) {
		System.out.println("Hello Java Core");
	}

	// Java Unary Operator Example: ++ and --
	void operator_1() {  
		int n=90; // local variable  
		System.out.println(n);

		int x=10;  
		System.out.println(x++); //10 (11)  
		System.out.println(++x); //12  
		System.out.println(x--); //12 (11)  
		System.out.println(--x); //10  
	}

	// Java Unary Operator Example: ++ and --
	void operator_2() {  
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a); //10+12=22  
		System.out.println(b++ + b++); //10+11=21  
	}

	// Java Unary Operator Example: ~ and !
	void operator_3() {  
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
	}

	// Java Arithmetic Operator Example
	void operator_4() {
		int a=10;  
		int b=5;  
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0  
	}

	// Java Arithmetic Operator Example: Expression
	void operator_5() {
		System.out.println(10*10/5+3-1*4/2);//21
	}

	// Java Left Shift Operator Example
	void operator_6() {
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
	}

	// Java Left Shift Operator Example
	void operator_7() {
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
	}

	// Java Shift Operator Example: >> vs >>>
	void operator_8() {
		//For positive number, >> and >>> works same  
		System.out.println(20>>2);//5
		System.out.println(20>>>2);//5
		//For negative number, >>> changes parity bit (MSB) to 0  
		System.out.println(-20>>2);//-5
		System.out.println(-20>>>2);//1073741819
	}

	// Java AND Operator Example: Logical && and Bitwise &
	void operator_9() {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a<c);//false && true = false  
		System.out.println(a<b&a<c);//false & true = false  
	}

	// Java AND Operator Example: Logical && vs Bitwise &
	void operator_10() {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked
	}

	// Java OR Operator Example: Logical || and Bitwise |
	void operator_11() {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a>b||a<c);//true || true = true  
		System.out.println(a>b|a<c);//true | true = true  
		//|| vs |  
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  
	}

	// Java Ternary Operator Example
	void operator_12() {
		int a=2;  
		int b=5;  
		int min=(a<b)?a:b;  
		System.out.println(min);  
	}

	// Java Assignment Operator Example
	void operator_13() {
		int a=10;  
		int b=20;  
		a+=4;//a=a+4 (a=10+4)  
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  //14
		System.out.println(b);  //16
	}

	// Java Assignment Operator Example
	void operator_14() {
		int a=10;  
		a+=3;//10+3  
		System.out.println(a);  
		a-=4;//13-4  
		System.out.println(a);  
		a*=2;//9*2  
		System.out.println(a);  
		a/=2;//18/2  
		System.out.println(a);  
	}

	// Java Assignment Operator Example: Adding short
	void operator_15() {
		short a=10;  
		short b=10;  
		a=(short)(a+b);//20 which is int now converted to short  
		System.out.println(a);  
	}
}
