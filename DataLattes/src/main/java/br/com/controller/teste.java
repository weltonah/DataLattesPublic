package br.com.controller;

import java.util.ArrayList;

public class teste {

	public static void main(String[] args) {

		ArrayList<Integer> lis = new ArrayList<Integer>();
		lis.add(4);
		lis.add(3);
		lis.add(2);
		ArrayList<Integer> lis2 = new ArrayList<Integer>();
		lis.add(84);
		lis.add(37);
		lis.add(62);
		lis2.addAll(lis);
		for (Integer integer : lis2) {
			System.out.println(integer);
		}
	}

}
