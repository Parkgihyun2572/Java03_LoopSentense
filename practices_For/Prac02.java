/*
Q)  월드컵은 4년에 한 번 개최됩니다. for문을 사용하여
    2002~2022년까지 중 월드컵이 개최되는 연도를 출력하시오.

    ↓ Console ↓
	2002
	2006
	2010
	2014
	2018
	2022
*/
package practices_For;

public class Prac02 {
	public static void main(String[] args) {
		for(int i = 2002; i <= 2022; i+=4) {
			System.out.println(i);
		}
	}
}
