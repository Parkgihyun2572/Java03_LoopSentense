/*
# 복합 대입 연산자
+=, -=, *=, /=, %=
산술연산자와 대입연산가 합쳐진 연산
제어문(조건문, 반복문)에서 많이 사용

# 연산자(Operator)의 종류
대입 연산자(=)
산술 연산자(+,%)
관계 연산자(>=,==,<)
논리 연산자(&&,||)
복합 대입 연산자(+=,-=)

*/
package contents;

public class C02_OperatorAssign {
	public static void main(String[] args) {
		/* 복합 대입 연산자 확인하기 */
		int a = 100;
		
		a += 10; //a = a + 10;
		System.out.println(a);
		
		a -= 10; //a = a - 10;
		System.out.println(a);
		
		a *= 5; //a = a * 5;
		System.out.println(a);
		
		a /= 50;
		System.out.println(a);
		
		a %= 4;
		System.out.println(a);
		
		//1~10까지의 자연수 합 구하기
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 자연수의 합은 " +sum);
	
		//1~20까지 4씩 건너뛰면서 출력
		for (int i = 1; i <= 20; i += 4) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1~50 사이 3의 배수 출력
		for (int i = 3; i <= 50; i += 3) {
			System.out.print(i + " ");
		}
	}
}
