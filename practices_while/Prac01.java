/*
Q)  다음처럼 막대그래프를 그려보자. (무한루프 사용)
    단, -1을 입력하면 프로그램을 종료한다.

    ↓ Console ↓
    숫자를 입력하시오: 5
    *****
    숫자를 입력하시오: 10
    **********
    숫자를 입력하시오: -1
    프로그램을 종료합니다.
*/
//Q. 프로그램 종료를 판단하는 -1인지 확인하는게 먼저 나와야 하는 것이 아닌지?
package practices_while;

import java.util.Scanner;

public class Prac01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하시오.: ");
			int n = sc.nextInt();
			if (n == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
