
/** The ControlStatements class provides methods ...*/  
public class ControlStatements {
	
	public static void main(String[] args) {
		System.out.println("Control Statements");
	}
	
	// If-else Statement
	public static void if_Else_Statement() {
		int age = 20;
		if (age > 18) {
			System.out.println("Age is greater than 18");
		} else {
			System.out.println("Age is less than 18");
		}
	}
	
	// Switch Statement
	public static void switch_Statement() {
	    int number=20;  
	    switch(number){  
	    case 10: System.out.println("10");break;  
	    case 20: System.out.println("20");break;  
	    case 30: System.out.println("30");break;  
	    default:System.out.println("Not in 10, 20 or 30");  
	    } 
	    // The java switch statement is fall-through. It means it executes all statement after first match if break statement is not used with switch cases.
	}
	
	// For Loop Statement
	public static void forLoop_Statement() {
		for(int i=1; i<=10; i++){  
			System.out.println(i);  // Print 1-10
		}  

		int arr[] = {12,23,44,56,78};  
		for(int i:arr){  
			System.out.println(i);   // Print 12,23,44,56,78
		}  
	}
	
	// Labeled For Loop
	public static void labelForLoop_Statement() {
		aa:  
			for(int i=1;i<=3;i++){  
				// bb:
				for(int j=1;j<=3;j++){  
					if(i==2&&j==2){  
						break aa;  
						// break bb;
					}  
					System.out.println(i+" "+j);  
				}  
			}   
	}
	
	// If you use two semicolons ;; in the for loop, it will be infinitive for loop.
	// Now, you need to press ctrl+c to exit from the program.
	public static void infinitiveForLoop() {  
	    for(;;){  
	        System.out.println("infinitive loop");  
	    }  
	} 
	
	// While loop
	public static void while_Loop_Statement() {
		int i=1;  
		while(i<=10){  
			System.out.println(i);  
			i++;  
		} 
	}
	
	// do-while Loop
	public static void do_While_Loop_Statement() {
	    int i=1;  
	    do{  
	        System.out.println(i);  
	    i++;  
	    }while(i<=10);  
	}
	
	// When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
	// The Java break is used to break loop or switch statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.
	public static void break_Statement() {
	    for(int i=1;i<=10;i++){  
	        if(i==5){  
	            break;  
	        }  
	        System.out.println(i);  
	    } 
	}
	
	// The continue statement is used in loop control structure when you need to immediately jump to the next iteration of the loop. It can be used with for loop or while loop.
	// The Java continue statement is used to continue loop. It continues the current flow of the program and skips the remaining code at specified condition. In case of inner loop, it continues only inner loop.
	public static void continue_Statement() {
	    for(int i=1;i<=10;i++){  
	        if(i==5){  
	        	continue;  
	        }  
	        System.out.println(i);  
	    } 
	}
	
	/* 
	This  
	is  
	multiple line  
	comment 
	*/  
	
	/* Let's declare and 
	 print variable in java. */  
	
	/** 
	This  
	is  
	documentation  
	comment 
	*/  
	
	/** The add() method returns addition of given numbers.*/  
	public int addNumber(int a, int b){return a+b;}  
	/** The sub() method returns subtraction of given numbers.*/  
	public int subNumber(int a, int b){return a-b;}  
}
