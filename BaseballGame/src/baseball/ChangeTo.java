package baseball;

//�Է��� ���ڸ� � ���� �迭�� �ٲٱ� ���� Ŭ����
public class ChangeTo {
	int num1;
	public ChangeTo(int num) {
		num1=num;
	}
	public int[] array() {
		int []arr= {0,0,0};
		int length =(int)(Math.log10(num1)+1); //int�� ������ �ڸ���
		int i=0;
		int num=num1;
		while(i<length) {
			if(num<10) {
				arr[i]=num;
			}
			else if(num<100) {
				arr[i]=num/10;
				num-=arr[i]*10;
			}
			else {
				arr[i]=num/100;
				num-=arr[i]*100;
			}
			i++;
		}
		return arr;
	}
	

}
