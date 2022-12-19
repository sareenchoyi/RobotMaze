package recursion;


public class FactorialGenerator {
	public long nthFactorial(int n) {
		return computeFactorialRecurse(n);
		
	}
	
private long computeFactorialRecurse(int n) {
	assert(n >=0);
	if(n == 0) {
		
		return 1;
	}
	else {
		
		return n *computeFactorialRecurse(n-1);
	}
	

	
}
public static void main(String[] args) {
	FactorialGenerator Factorial = new FactorialGenerator(); 
	
	System.out.println(Factorial.nthFactorial(10)); 
	System.out.println(Factorial.nthFactorial(22)); 
	System.out.println(Factorial.nthFactorial(4)); 
	
	
	for(int i =1; i <= 32; i++) {
		
		System.out.println(i + "! =" + Factorial.nthFactorial(i));
		
	}

	System.out.println(Factorial.nthFactorial(-1));
	
}

}
