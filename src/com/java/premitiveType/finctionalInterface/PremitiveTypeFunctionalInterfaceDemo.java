package com.java.premitiveType.finctionalInterface;

import java.util.function.IntPredicate;

public class PremitiveTypeFunctionalInterfaceDemo {

	public static void main(String[] args) {
		int[] x = { 2, 3, 4, 5, 6, 7, 8 };

		IntPredicate p = i -> i % 2 == 0; // Advantage of using IntPredicate is no Auto boxing or Auto Unboking is
											// happening so better performance
											// Similarly we have primitive versions of predefine functional interfaces:
											// LongPredicate, DoublePredicate, LongPredicate ,
											// ToIntFunction, IntToDoubleFunction etc

		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}

	}
}
