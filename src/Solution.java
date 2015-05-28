import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String doubledWord = word + word;

		String rotation = "";
		boolean hasAnyPalindromRotations = false;
		for (int i = 0; i < word.length(); i++) {
			rotation = doubledWord.substring(i, i + word.length());
			if (isPalindrome(rotation)) {
				System.out.println(rotation);
				hasAnyPalindromRotations = true;
			}
		}

		if (!hasAnyPalindromRotations) {
			System.out.println("NONE");
		}
		
		sc.close();
	}

	public static boolean isPalindrome(String word) {
		for (int i = 0; i < Math.floor(word.length() / 2) - 1; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}

}
