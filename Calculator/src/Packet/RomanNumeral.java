package Packet;

public class RomanNumeral {
	enum Rome {
		I, II, III, IV, V, VI, VII, VIII, IX, X, XX, XXX, XL, L, LX, LXX, LXXX, XC, C
	}
	
	public static int RomanToArab(String num) {
		Rome rom = Rome.valueOf(num);
		return rom.ordinal() + 1;
	}
	
	public static String ArabToRoman(int num) {
		Rome[] rom = Rome.values();
		String str = "";
		if (num < 0) {
			str = "-";
		}
		num = Math.abs(num);
		if (num >= 10) {
			str = str + rom[(num/10 + 8)].toString();
			if (num%10 != 0) {
				str += rom[(num%10 - 1)].toString(); 
			}
			return str;
		}
		else {
			return str + rom[num - 1].toString();
		}
	}
	
	public static boolean isRoman(String num) {
		for (Rome x : Rome.values()) {
			if (x.toString().equals(num)) {
				return true;
			}
		}
		return false;
	}
}
