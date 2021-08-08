package leetcode;

public class RomanInt {

	public static int romanToInt(String s) {
		int result = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i < ch.length - 1) {
				if (ch[i] == 'I' && ch[i + 1] == 'V') {
					result += 4;
					i++;
					continue;
				} else if (ch[i] == 'I' && ch[i + 1] == 'X') {
					result += 9;
					i++;
					continue;
				} else if (ch[i] == 'X' && ch[i + 1] == 'L') {
					result += 40;
					i++;
					continue;
				} else if (ch[i] == 'X' && ch[i + 1] == 'C') {
					result += 90;
					i++;
					continue;
				} else if (ch[i] == 'C' && ch[i + 1] == 'D') {
					result += 400;
					i++;
					continue;
				} else if (ch[i] == 'C' && ch[i + 1] == 'M') {
					result += 900;
					i++;
					continue;
				}
			}
			switch (ch[i]) {
			case 'I':
				result++;
				break;
			case 'V':
				result += 5;
				break;
			case 'X':
				result += 10;
				break;
			case 'L':
				result += 50;
				break;
			case 'C':
				result += 100;
				break;
			case 'D':
				result += 500;
				break;
			case 'M':
				result += 1000;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

}
