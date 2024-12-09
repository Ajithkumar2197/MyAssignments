package week1.day2;

public class CheckNumberIsPositive {
	int version =10;
public void checkIsPositive() {
	if(version > 0) {
		System.out.println(version +" is Positive");
	} else {
		System.out.println(version +" is Negative");
	}
}
public static void main(String[] args) {
	CheckNumberIsPositive positive =new CheckNumberIsPositive();
	CheckNumberIsPositive negative =new CheckNumberIsPositive();
	positive.version=11;
	positive.checkIsPositive();
	negative.version=-10;
	negative.checkIsPositive();
		
}
}
