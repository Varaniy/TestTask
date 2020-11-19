package Packet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reader {
	public static String[] read() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		char[] phrase = line.toCharArray();
		String[] stir = new String[] {"", "", ""};
		int n = 0;
		for (int i = 0; i < phrase.length; i++) {
			if (!Character.isWhitespace(phrase[i])) {
				stir[n] = stir[n] + phrase[i];
			}
			else {
				n++;
			}
		}
		return stir;
	}
}
