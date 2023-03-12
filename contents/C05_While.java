/*
# while 반복문
while문은 무한반복 혹은 반복할 횟수가 정해지지 않았을때 사용한다.

	while(조건식){
		반복할 실행문..
	}
	
- 조건식이 참이면 계속해서 반복을 실행
- 조건식이 거짓이 되면 반복 중지

# break 키워드
반복문을 빠져나옴. 탈출(exit)
if문과 함께 사용

*/
package contents;

public class C05_While {
	public static void main(String[] args) {
		/* while 반복문 */
		// 5번 반복하기
		int i = 1;
		while (i <= 5) {
			System.out.println("반복" + i);
			i++; // 증감식 없으면 무한반복 실행
		}

		// 1~10까지 자연수 출력하기
		int w = 1; // 시작값(for문 초기식)
		while (w <= 10) {// 조건식
			System.out.println(w);
			w++;// 증감식
		}

		// 7~0까지 정수 출력하기
		int j = 7;
		while (j >= 0) {
			System.out.println("j = " + j);
			j--;
		}

		// 1~10까지 자연수 합 구하기
		int k = 1, sum = 0;
		while (k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("sum = " + sum);

		/* break 키워드 */
		// 5번 반복하기
		int b = 1; // 시작값
		while (true) {
			System.out.println("반복" + b);
			if (b == 5) {// 끝값
				break;// 반복문 탈출
			}
			b++;
		}
	}
}
