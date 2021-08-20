package baseball;

//배열을 비교하기 위한 클래스
public class ComparisonArray {
	int []num1;
	int []num2;
	int result[]= {0,0}; //스트라이크 볼
	public ComparisonArray(int []num1,int []num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public int[] action() {
		int i=0;
		int j=0;
		//서로의 배열을 값하나씩 번갈아가면서 스트라이크와 볼의 유무를 찾는다.
		while(i<3) {
			while(j<3) {
				if(i==j) {
					if(num1[i]==num2[j]) {
						result[0]+=1;
					}
				}else {
					if(num1[i]==num2[j]) {
						result[1]+=1;
					}
				}
				j++;
			}
			i++;
			j=0;
		}
		return result;
	}
}