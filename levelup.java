import java.util.Scanner;

public class levelup {
	
    public static String Title(int level) {
        if (level <= 2) return "일반인";
        else if (level <= 4) return "견습기사";
        else if (level <= 8) return "왕실기사";
        else if (level <= 10) return "전설의기사";
        else return "신의기사";
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = 0;
        int level = 1;
        int exp = 0;
        int LevelUp = 3;

        while (true) {
            String title = Title(level);
            System.out.println("안내면 진다 가위바위보!");
            System.out.println("1: 가위, 2: 바위, 3: 보, 0: 종료");
            System.out.printf("현재 레벨: %d (%s), 경험치: %d/%d\n", level, title, exp, LevelUp);
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
                exp++;
                if (exp >= LevelUp) {
                    level++;
                    exp = 0;
                    String newTitle = Title(level);
                    System.out.println("레벨 업!! 현재 레벨: " + level + " (" + newTitle + ")");
                    // 칭호가 바뀌었을 때만 안내
                    if (!newTitle.equals(title)) {
                        System.out.println("새로운 칭호: " + newTitle + "!");
                    }
                }
            } else {
                System.out.println("내가 졌다...");
            }

            System.out.println();
        }

        sc.close();
	}

}
