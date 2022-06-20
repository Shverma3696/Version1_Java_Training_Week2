package day1;

public class Panagrams {
	
	public static void PanagramChecker(String str) {

		Boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

		a = b = c = d = e = f = g = h = i = j = k = l = m = n = o = p = q = r = s = t = u = v = w = x = y = z = false;

		String[] arr = str.split(" ");

		for (int itr1 = 0; itr1 < arr.length; itr1++) {

			for (int itr2 = 0; itr2 < arr[itr1].length(); itr2++) {

				char ch = arr[itr1].charAt(itr2);

				switch (ch) {
				case 'a':
					a = true;
					break;
				case 'b':
					b = true;
					break;
				case 'c':
					c = true;
					break;
				case 'd':
					d = true;
					break;
				case 'e':
					e = true;
					break;
				case 'f':
					f = true;
					break;
				case 'g':
					g = true;
					break;
				case 'h':
					h = true;
					break;
				case 'i':
					i = true;
					break;
				case 'j':
					j = true;
					break;
				case 'k':
					k = true;
					break;
				case 'l':
					l = true;
					break;
				case 'm':
					m = true;
					break;
				case 'n':
					n = true;
					break;
				case 'o':
					o = true;
					break;
				case 'p':
					p = true;
					break;
				case 'q':
					q = true;
					break;
				case 'r':
					r = true;
					break;
				case 's':
					s = true;
					break;
				case 't':
					t = true;
					break;
				case 'u':
					u = true;
					break;
				case 'v':
					v = true;
					break;
				case 'w':
					w = true;
					break;
				case 'x':
					x = true;
					break;
				case 'y':
					y = true;
					break;
				case 'z':
					z = true;
					break;
				}
			}

		}

		if (a == true && b == true && c == true && d == true && e == true && f == true && g == true && h == true
				&& i == true && j == true && k == true && l == true && m == true && n == true && o == true && p == true
				&& q == true && r == true && s == true && t == true && u == true && v == true && w == true && x == true
				&& y == true && z == true) {
			System.out.println("the sentence " + str + "is a PANAGRAM...");
		} else {
			System.out.println("the sentence " + str + "is not a PANAGRAM...");
		}

	}

	public static void main(String[] args) {

		System.out.println("Day 1 - Additional Task 2 - Panagram Checker");

		String sentence1 = "Sixty zippers were quickly picked from the woven jute bag.";
		PanagramChecker(sentence1);
		
		String sentence2 = "A wizard’s job is to vex chumps quickly in fog.";
		PanagramChecker(sentence2);

		String sentence3 = "Brown jars prevented the mixture from freezing too quickly.";
		PanagramChecker(sentence3);

		String sentence4 = "I once went to a quiet place in the Bahamas to see a very dodgy taxman.";
		PanagramChecker(sentence4);

		String sentence5 = "We promptly judged antique ivory buckles for the next prize.";
		PanagramChecker(sentence5);
	}

}
