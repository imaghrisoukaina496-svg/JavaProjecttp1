package ma.projet.Test;

import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		float tab[] = new float[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Donnez l element n° : " + i);
		}
		tab[i] = sc.nextFloat();
		for (float e : tab)
			System.out.println(e);
	}

}
