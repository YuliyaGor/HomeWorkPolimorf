package poliMorf;

import java.util.Arrays;

public class Calc extends MathAbstract {

	@Override
	public int multi(int multA, int multB) {
		int resultMulti = multA * multB;
		return resultMulti;
	}

	@Override
	public int divide(int divA, int divB) {
		int resultDivide;
		if (divB == 0) {
			System.err.println("Деление на ноль не допустимо");
			resultDivide = 0;
		} else {
			resultDivide = divA / divB;
		}
		return resultDivide;
	}

	@Override
	public int plus(int summA, int summB) {
		int resultPlus = summA + summB;
		return resultPlus;
	}

	@Override
	public int minus(int minA, int minB) {
		int resultMinus = minA - minB;
		return resultMinus;
	}

	@Override
	public void maximum(Integer... param) {
		int max;
		if (param.length > 0) {
			max = param[0];
		} else  {
			max = 0;
		}
		
		for ( Integer s : param ) {
			max = Integer.max(s, max);
        }
		System.out.println("из " + Arrays.toString(param) + " maximum = " + max);
	}
	
	@Override
	public void minimum(Integer... param) {
		int min;
		if (param.length > 0) {
			min = param[0];
		} else  {
			min = 0;
		}
		
		for ( Integer s : param ) {
			min = Integer.min(s, min);
        }
		System.out.println("из " + Arrays.toString(param) + " minimum = " + min);
		
	}
	
	public void print(int A, int B) {
		System.out.println(A + " * " + B + " = " + multi(A, B));
		System.out.println(A + " / " + B + " = " + divide(A, B));
		System.out.println(A + " + " + B + " = " + plus(A, B));
		System.out.println(A + " - " + B + " = " + minus(A, B));
	}

}
