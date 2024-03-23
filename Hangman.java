package Game;

import java.util.Scanner;

public class Hangman {
	public void showMenu() {
		int option;
		Scanner Sc = new Scanner(System.in);
		System.out.println("--------MENU--------");
		System.out.println("1. Play");
		System.out.println("2. instruction");
		System.out.println("3. Exit");
		System.out.print("\n choose option:  ");
		option = Sc.nextInt();
	}
	public static void main(String[] args) {
		Hangman hg = new Hangman();
		hg.showMenu();
	}
}
