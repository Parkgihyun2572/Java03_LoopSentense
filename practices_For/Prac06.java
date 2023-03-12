/*
Q1) 아래와 같은 패턴의 별(*)을 출력하는 프로그램을 작성하시오.

*
**
***
****
*****

Q2) 아래와 같은 패턴의 별(*)을 출력하는 프로그램을 작성하시오.

    *
   **
  ***
 ****
*****

i번째줄: 	1	2	3	4	5	i번째줄
blank:	4	3	2	1	0	(5-i)개
star :	1	2	3	4	5	i개

Q3) 아래와 같은 패턴의 별(*)을 출력하는 프로그램을 작성하시오.

*****
 ****
  ***
   **
    *
i번째줄: 	1	2	3	4	5	i번째줄
blank:	0	1	2	3	4	(i-1)개
star :	5	4	3	2	1	(6-i)개

도전과제) 아래와 같은 패턴의 별(*)을 출력하는 프로그램을 작성하시오.
        
    *
   ***
  *****
 *******
*********

Tip) n번째 줄에서 별의 개수는 (2n-1)개

*/
package practices_For;

public class Prac06 {
	public static void main(String[] args) {
		int NUM = 5;

		// Triangle LB 출력
		for (int i = 1; i <= NUM; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");

		// Triangle RB 출력
		for (int i = 1; i <= NUM; i++) {
			for (int j = NUM; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");

		// Triangle RU 출력
		for (int i = 1; i <= NUM; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = NUM; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");

		// Triangle RB 출력
		for (int i = 1; i <= NUM; i++) {
			for (int j = NUM; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
	}
}
