package baseball;

//�迭�� ���ϱ� ���� Ŭ����
public class ComparisonArray {
	int []num1;
	int []num2;
	int result[]= {0,0}; //��Ʈ����ũ ��
	public ComparisonArray(int []num1,int []num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public int[] action() {
		int i=0;
		int j=0;
		//������ �迭�� ���ϳ��� �����ư��鼭 ��Ʈ����ũ�� ���� ������ ã�´�.
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