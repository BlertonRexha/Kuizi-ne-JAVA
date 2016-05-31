package numerike2;

import java.util.Scanner;

public class NevilleMethod {

	public static void main(String[] args) {
		/**
		 * Amortizimi n�nkupton fillimisht vler�simin e shfryt�zimit t� mjetit.
		 * Shebull i till mund t� jet� makina p�r prodhim bazuar n� numrin e
		 * prodhuar t� produkteve. Le t� marrim nj� shembull me nj� makin�
		 * transporti. Kompania blen nj� makin� transporti n� vler� prej 54
		 * 000�. Vler�sohet q� makina t� amortizohet pasi q� t� ket� kaluar 320
		 * 000 kilometra. Pas k�saj periudhe amortizimi makina vler�sohet t�
		 * shitet n� vler� prej 5 500�. P�r nj� vit vler�sohet makina t� kaloj�
		 * 40 000 km. Pra fillimisht p�rcaktohet vlera e plot� e amortizimit pa
		 * mbetje q� �ht� 54 000 � 5 500� =48 500�. Pastaj vlera e mjetit p�r
		 * kilomet�r 48 500/320 000 = 0.1515625 e cila shum�zohet me kilometrat
		 * e vler�suara p�r nj� vit, pra 0.1515625 * 40 000 = 6062.5�.
		 * 
		 * Depreciation on a car can be determined by the formula V=C(1-r)^t ,
		 * where V is the value of the car after t years, C is the original
		 * cost, and r the rate of depreciation. If a car's cost, when new, is
		 * $15,000, the rate of depreciation is 30%, and the value of the car
		 * now is $3,000, how old is the car to the nearest tenth of a year?
		 */

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Amortizimi i makinave: \n  - Marim shembull nje makin transporti. Kompania deshiron te blej veturat e perdorura deri ne nje mas kilometrazhi te kaluar"
						+ " \n Vetura kushton 54 000 � me 00 km te kaluara. Nese kjo vetur kalon 40 000 km ne vit  "
						+ "qmimi i vetures do te bie nga % 0.1515625 *40 000 = 6062.5� . "
						+ " \n pas  km               qmimi" + " \n 50 000                47937.5 � "
						+ " \n 100 000               41875 �" + " \n 200 000               35812.5 �"
						+ " \n 300 000               29750 �");

		int vitet = 5;
		// System.out.println("Shtyp numrat e x =");
		double[] x = { 0, 50000, 100000, 200000, 300000 };

		// System.out.println("Shtyp numrat e f(x) =");
		double[] y = { 54000, 47937.5, 41875, 35812.5, 29750 };

		System.out.println(
				"Kompania deshi te mar veturen me nje mas kilometrazhi te kaluar, \n Shtyp km te kaluara qe kompania deshiron te blej : ");
		double t = input.nextDouble();
		
		System.out.println("Vetura per " + t + " km te kaluara kushton  " + neville(vitet, x, y, t) + " �");

	}

	public static double neville(int vitet, double[] x, double[] y, double t)

	/*
	 
	 */

	{
		int i, j;
		double[] f = new double[vitet];
		double total;
		for (j = 1; j < vitet; j++)
			for (i = vitet - 1; i >= j; i--) {
				y[i] = ((t - x[i - j]) * y[i] - (t - x[i]) * y[i - 1]) / (x[i] - x[i - j]);
			}

		total = y[vitet - 1];
		return (total);
	}
}