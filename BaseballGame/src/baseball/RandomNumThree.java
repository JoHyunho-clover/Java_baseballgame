package baseball;

import java.util.Random;

//��ǻ�Ϳ��� ������ ���ڸ� �̴µ� ���δٸ� �����̸� 1~9������ ���ڷ� �̷���� 3�ڸ����ڸ� �̱� ���� Ŭ����
public class RandomNumThree {
	public static int[] threerandomnum() {
		int []randarrnum= {0,0,0};
		for(int i=0;i<3;i++) {
			Random random = new Random(); //���� ��ü ����(����Ʈ �õ尪 : ����ð�)
			if(i==1) {
				while(true) {
					int randnum=random.nextInt(9)+1;
					if(randarrnum[0]!=randnum) {
						randarrnum[i]=randnum;
						break;
					}
				}
			}else if(i==2){
				while(true) {
					int randnum=random.nextInt(10);
					if(randarrnum[0]!=randnum&&randarrnum[1]!=randnum) {
						randarrnum[i]=randnum;
						break;
					}
				}
			}
			else {
				randarrnum[0]=random.nextInt(10);
			}
		}
		return randarrnum;
	}
	
}
