package Packet;

public class Calculation {
	public static int calc(int a, int b, String oper) throws Exception {
		switch(oper) {
		case ("+") :
			return (a + b);
		case ("-") :
			return (a - b);
		case ("*") :
			return (a * b);	
		case ("/") :
			return (a / b);
		}
		throw new Exception("Неправильно указана арифметическая операция!");
	}
}
