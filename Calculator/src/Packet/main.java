package Packet;

public class main {
	public static void main (String[] args) throws Exception {
		String[] stir = reader.read();
		for (int i = 0; i < stir.length; i++) {
			System.out.println(stir[i]);
		}
		
		int a, b;
		
		try {
		if (RomanNumeral.isRoman(stir[0]) & RomanNumeral.isRoman(stir[2])) {
			a = RomanNumeral.RomanToArab(stir[0]);
			b = RomanNumeral.RomanToArab(stir[2]);
			if ((0 <= a & a <= 10) & (0 <= b & b <= 10)) {
				int sum = Calculation.calc(a, b, stir[1]);
				System.out.println(RomanNumeral.ArabToRoman(sum));
			}
			else {
				System.out.println("����� �� ��������� � ������� �� 0 �� 10!");
			}
		}
		else {
			a = Integer.parseInt(stir[0]);
			b = Integer.parseInt(stir[2]);
			if ((0 <= a & a <= 10) & (0 <= b & b <= 10)) {
				System.out.println(Calculation.calc(a, b, stir[1]));
			}
			else {
				System.out.println("����� �� ��������� � ������� �� 0 �� 10!");
			}
		}
		}
		catch(NumberFormatException e) {
			System.out.println("������������ ����!");
			System.out.println("���������� ������ ���� ������ ��������, ���� ������ ������� �����!");
			System.exit(0);
		}
	}
}