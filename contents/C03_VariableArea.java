/*
# 변수의 생존 범위
변수는 변수를 선언한 {} 내부에서만 생존 가능하다.
*/
package contents;

public class C03_VariableArea {
	static int k = 10;
	
	public static void main(String[] args) {
		System.out.println(k);
		
		//for문에서 변수의 생존 범위
		int a = 10;
		for (int i = 0; i < 10; i++) {
			int b = 10;//b는 for문의 {}내부에서만 생존, 사용가능한 변수
			a++;
			b++;
			System.out.println("for내부 (a,b) = ("+a+","+b+")");
		}
		System.out.println("for외부 a = " + a);
//		System.out.println("for외부 b = " + b);
//		에러: for문 안에서 만든 변수 b는 for문이 끝나면 없어진다.
		
		//for문으로 변수에 값 누적시키기(카운트하기)
		int numA = 0;
		System.out.print("numA 누적값: ");
		for(int i=0;i<10;i++) {
			numA++;
			System.out.print(numA + " ");
		}
		System.out.println();
		
		System.out.print("numB 누적값: ");
		for(int i=0;i<10;i++) {
			int numB = 0;//numB값은 반복을 실행할 때마다 0으로 초기화된다.
			numB++;
			System.out.print(numB + " ");
		}
		System.out.println();
		
		//if문도 동일
		int d;
		if(true) {
			int c = 100;
			System.out.println("if내부 c = " + c);
			d = c;
		}
		System.out.println("if외부 c = " + d);
	}
}
