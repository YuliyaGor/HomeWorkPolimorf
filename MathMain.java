package poliMorf;

public class MathMain {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		
		System.out.println("----------abstract------------");
		
		Calc calc = new Calc();
		calc.print(x, y);
		calc.maximum(11, 5, 7, 13, 02, 91);
		calc.minimum(21, 15, 7, 3, 01);
		
		System.out.println("----------Interface------------");
		
		CalcInterface calcInterface = new CalcInterface();
		calcInterface.print(x, y);
		calcInterface.maximum(4, 41, 01, 34, 84);
		calcInterface.minimum(4, 2, 56, 01);

	}

}
