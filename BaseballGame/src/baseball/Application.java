package baseball;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		while(true) {
			//��ǻ�Ͱ� ������ ���δٸ� 1~9������ 3�ڸ� ������ �����Ѵ�
			int []computernum= RandomNumThree.threerandomnum();
			while(true) {
				System.out.print("���ڸ� �Է����ּ��� : ");
				int numbers=scanner.nextInt();
				//�Է��� ���ڸ� �迭�� �ٲ۴�.
				ChangeTo b=new ChangeTo(numbers);
				int []usernum=b.array();
				//�迭�� �ٲ� ���� ��ǻ�ͼ��ڶ� �Է��� ���ڶ� �� �� ����� �迭�ν� �����Ѵ�
				CalculatorStrikeBall a=new CalculatorStrikeBall(usernum,computernum);
				//0�ε������� ��Ʈ����ũ 1�ε������� ���� ����ִ�.
				int []strikeballinfo=a.StrikeBall();
				if(strikeballinfo[0]==3) {
					System.out.println(strikeballinfo[0]+"��Ʈ����ũ");
					System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
					break;
				}
				else if(strikeballinfo[1]==3) {
					System.out.println(strikeballinfo[1]+"��");
				}else if(strikeballinfo[0]==0||strikeballinfo[1]==0){
					if(strikeballinfo[0]==0) {
						System.out.println(strikeballinfo[1]+"��");
					}else if(strikeballinfo[1]==0){
						System.out.println(strikeballinfo[0]+"��Ʈ����ũ");
					}
				}else if(strikeballinfo[0]==0&&strikeballinfo[1]==0) {
					System.out.println("Nothing");
				}
				else {
					System.out.println(strikeballinfo[1]+"��"+strikeballinfo[0]+"��Ʈ����ũ");
				}
			}
			System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
			int number=scanner.nextInt();
			if(number==2) {
				break;
			}
		}
	}
}
