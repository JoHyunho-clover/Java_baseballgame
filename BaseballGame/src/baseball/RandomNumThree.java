package baseball;

import java.util.Random;

//컴퓨터에서 랜덤된 숫자를 뽑는데 서로다른 숫자이며 1~9까지의 숫자로 이루어진 3자리숫자를 뽑기 위한 클래스
public class RandomNumThree {
	public static int[] threerandomnum() {
		int []randarrnum= {0,0,0};
		for(int i=0;i<3;i++) {
			Random random = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)
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
