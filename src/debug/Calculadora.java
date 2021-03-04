package debug;

import java.util.Arrays;

public class Calculadora {

	private static int chave = 0;
	
	private int fibonacciRecursivo(int n) {
		return n<=0 ? 0 : n==1 || n==2 ? 1 :
			   fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
	}
	
	private long fibonacciInterativo(int n) {
		long a=1;
		long b=1;
		long fib=0;
		if(n<=0) {
			return 0;
		}
		System.out.print("1, 1, ");
		if(n==1 || n==2) {
			return 1;
		} else {
			for(int i=3; i<=n; i++) {
				fib=a+b;
				a=b;
				b=fib;
				System.out.print(fib+", ");
			}
			a++;
		}
		System.out.println();
		return fib;
	}
	
	public int[] concatena(int[] a, int[] b) {
		
		int[] c = new int[a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = a.length; i < c.length; i++) {
			c[i] = b[i-a.length];
		}
		
		return c;
	}
	
	public int[] interseccao(int[] a, int[] b) {
		
		int k=0;
		//1) determinar o tamanho do novo array
		//saber quantos elementos em 'b' existem em 'a'
		for (int i = 0; i < b.length; i++) {
			if(contem(a,b[i]))
				k++;
		}
		//2) criar novo array
		int[] c = new int[k];
		
		//3) copiar os elementos do array B, que existem em A, para C
		k=0;
		for (int i = 0; i < b.length; i++) {
			if(contem(a,b[i]))
				c[k++] = b[i];
		}
		return c;
	}
	
	public int[] uniao(int[] a, int[] b) {
		int k=0;
		//1) determinar o tamanho do novo array
		//saber quantos elementos em 'b' não existem em 'a'
		for (int i = 0; i < b.length; i++) {
			chave++;
			if(!contem(a,b[i]))
				k++;
		}
		//2) criar novo array
		int[] c = new int[a.length+k];
		
		//3) copiar elementos do array A para C
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		k = a.length;
		//4) copiar os elementos do array B, que não existem em A, para C
		for (int i = 0; i < b.length; i++) {
			if(!contem(c,b[i]))
				c[k++] = b[i];
		}
		return c;
	}
	
	/**
	 * Verifica se o array contém o elemento x
	 * @param c
	 * @param x
	 * @return
	 */
	private boolean contem(int[] s, int x) {
		for (int i = 0; i <= s.length; i++) {
			if(s[i]==x)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		//int[] sorteio = {7, 16, 19, 22, 28, 55};
		//System.out.println(calc.contem(sorteio, 30));
		
		System.out.println(calc.fibonacciInterativo(8));
	}

}
