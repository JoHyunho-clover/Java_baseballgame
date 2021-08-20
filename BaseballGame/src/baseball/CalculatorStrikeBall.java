package baseball;

public class CalculatorStrikeBall {
	int []arr1;
	int []arr2;
	public CalculatorStrikeBall(int []num1,int []num2) {
		arr2=num2;
		arr1=num1;
	}
	public int[] StrikeBall() {
		ComparisonArray a=new ComparisonArray(arr1,arr2);
		int []i=a.action();
		return i;
	}
}
