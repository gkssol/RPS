import java.util.Scanner;
public class RPS {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = 0;

        while (true) {
            System.out.println("안내면 진다 가위바위보!");
            System.out.println("1: 가위, 2: 바위, 3: 보, 0: 종료");
            System.out.print("나는: ");
            int user = sc.nextInt();

            if (user == 0) {
                System.out.println("게임 오버!.");
                break;
            }
            if (user < 1 || user > 3) {
                System.out.println("뭔가 이상하다");
                continue;
            }

            int computer = (round % 3) + 1;
            round++;

            System.out.print("당신: ");
            if (user == 1) System.out.println("가위");
            else if (user == 2) System.out.println("바위");
            else System.out.println("보");

            System.out.print("컴퓨터: ");
            if (computer == 1) System.out.println("가위");
            else if (computer == 2) System.out.println("바위");
            else System.out.println("보");

            if (user == computer) {
                System.out.println("비겼습니다!");
            } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
                System.out.println("내가 이겼다!");
            } else {
                System.out.println("내가 졌다...");
            }

            System.out.println();
        }

        sc.close();

	}

}
