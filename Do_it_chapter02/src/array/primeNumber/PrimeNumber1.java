package array.primeNumber;

// 1000이하의 소수를 열거
// 소수 탐색 ver.1 : 2부터 n-1까지의 어떤 정수로도 나누어떨어지지 않는다.
public class PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0; 			// 나눗셈의 횟수

		for (int n = 2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) {
				counter++;

				if (n % i == 0) {	// 나누어 떨어지면 소수가 아님
					break; 			// 더 이상의 반복은 불필요하므로 continue가 아니고 break
				}
			}
			if (n == i) {			// 마지막까지 나누어 떨어지지 않음
				System.out.println(n);
			}
		}
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
