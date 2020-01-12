public class Problem7 {

	// What is the 10001st prime number?

	public static void main(String[] args) {
		int countPrimitive = 0;
		int isPrimative = 1;
		while (countPrimitive < 10001) {
			isPrimative++;
			for (int i = 2; i < isPrimative + 1; i++) {
				int rest = isPrimative % i;
				if (rest == 0 && i != isPrimative) {
					break;
				} else if (rest == 0 && i == isPrimative) {
					countPrimitive++;
				}
			}
		}
		System.out.println(isPrimative);
	}
}
