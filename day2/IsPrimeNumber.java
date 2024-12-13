package week1.day2;

public class IsPrimeNumber {
	boolean isPrime=true;
	
	public boolean isPrime(int n)	{
		
		for(int i = 2; i<n-1;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
				
			}
		}
		
		return isPrime;
		
	}
	public static void main(String[] args) {
		IsPrimeNumber num= new IsPrimeNumber();
		System.out.println(num.isPrime(13));
	}
}
