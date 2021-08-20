package baseball;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		while(true) {
			//컴퓨터가 난수로 서로다른 1~9꺼지의 3자리 정수를 생성한다
			int []computernum= RandomNumThree.threerandomnum();
			while(true) {
				System.out.print("숫자를 입력해주세요 : ");
				int numbers=scanner.nextInt();
				//입력한 숫자를 배열로 바꾼다.
				ChangeTo b=new ChangeTo(numbers);
				int []usernum=b.array();
				//배열로 바꾼 것을 컴퓨터숫자랑 입력한 숫자랑 비교 한 결과를 배열로써 제공한다
				CalculatorStrikeBall a=new CalculatorStrikeBall(usernum,computernum);
				//0인덱스에는 스트라이크 1인덱스에는 볼이 들어있다.
				int []strikeballinfo=a.StrikeBall();
				if(strikeballinfo[0]==3) {
					System.out.println(strikeballinfo[0]+"스트라이크");
					System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
					break;
				}
				else if(strikeballinfo[1]==3) {
					System.out.println(strikeballinfo[1]+"볼");
				}else if(strikeballinfo[0]==0||strikeballinfo[1]==0){
					if(strikeballinfo[0]==0) {
						System.out.println(strikeballinfo[1]+"볼");
					}else if(strikeballinfo[1]==0){
						System.out.println(strikeballinfo[0]+"스트라이크");
					}
				}else if(strikeballinfo[0]==0&&strikeballinfo[1]==0) {
					System.out.println("Nothing");
				}
				else {
					System.out.println(strikeballinfo[1]+"볼"+strikeballinfo[0]+"스트라이크");
				}
			}
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			int number=scanner.nextInt();
			if(number==2) {
				break;
			}
		}
	}
}
