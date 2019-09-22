package domaci;

import java.util.Scanner;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise. Napisati po 2 primera o svakom.
		 */
		Scanner sc = new Scanner(System.in);
		int a = 5, b = 6, d = 11, f = 13;

		a = d++ + b++;
		b = a++ + d++;
		d = b++ - f++;// b pisemo 6 pa ga povecavamo na 7 + f pisemo 13 pa ga povecamo na 14, d=6-13, d= -7
		f = a++ + b++;// a pisemo 5 pa ga povecavamo na 6 + b pisemo 7 pa ga povecamo na 8, f=5+7, f= 13
		b = d++ - a++;
		d = a++ * b++;
		f = b++ / a++;
		a = b++ * f++;

		a = ++b + ++d;
		b = ++d + ++f;// povecamo d za 1 i pisemo 12 + povecavamo f za jedan i pisemo 14, b=12+14 b=26
		d = ++f + ++a;// povecamo f za 1 i pisamo 15 + povecavamo a za jedan i pisemo 6, d=15+6 d=21
		f = ++a + ++b;
		a = ++b * ++d;
		b = ++d * ++f;
		d = ++f * ++a;
		f = ++a * ++b;

		a = b-- * d--;
		b = f-- / a--;
		f = d-- * a--;
		b = f-- * d--;
		d = a-- + f--;//a pisemo 5 pa ga samnjujemo na 4 + f pisemo 13 pa ga samnjujemo na 12, d=5+13 d=18
		d = f-- * b--;
		b = d-- - a--;
		a = f-- * b--;//f pisemo 13 pa ga samnjujemo na 12 * b pisemo 6 pa ga samnjujemo na 5,a=13*6 a=78

		f = --a * --b;
		d = --f * --a;
		b = --d / --f;// samnjimo d za jedan pa pisemo 10 / samnjimo f za jedan pa pisemo 12,b=10/12 b=0
		f = --a + --b;
		a = --b / --d;
		f = --d - --b;
		a = --b * --f;//samnjimo b za jedan pa pisemo 5 * smanjimo f za jedan pa pisemo 12, a=5*12 a=60
		b = --f - --d;

	}
}
