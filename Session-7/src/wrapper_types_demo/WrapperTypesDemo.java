package wrapper_types_demo;

import java.util.ArrayList;
import java.util.List;

public class WrapperTypesDemo {
	public static void main(String[] args) {
		int primitiveVal = 5;

		// in cele 2 cazuri de mai jos, intervine procesul de autoboxing
		Integer wrapperVal = 5;
		Integer wrapperVal1 = primitiveVal;

		Double d = 2.6;

		// aici se intampla procesul de unboxing
		System.out.println(wrapperVal + primitiveVal);

		/* ------------------------------------------------------------- */

		// exercitiu: incercati sa inlocuiti Integer cu int, la linia de mai jos
		// nu va merge, pt ca colectiile nu accepta decat tipuri Obiect ca si parametru de tip
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(wrapperVal);
		System.out.println(list);

		List<Double> dList = new ArrayList<>();
		dList.add(1.6);
		dList.add(new Double(6));
		System.out.println(dList);

	}
}
