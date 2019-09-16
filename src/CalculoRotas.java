import java.util.Collection;

public class CalculoRotas {

	public static void main(String[] args) {
		System.out.println("calculo da cidade CasaBranca e Vargem em km: ");
		int n = Calculo(2,7);
		System.out.println(n);
		System.out.println("calculo da cidade Grama e Aguai em km: ");
		int m = Calculo(8,3);
		System.out.println(m);
		
	}

	private static int Rotas(int a, int b) {
		if (a == 0 || b == 0) {
			return 1;
		} else {
			return Calculo(a - 1, b) + Calculo(a, b - 1);
		}
	}

	private static int Calculo(int c, int d) {
		if (c == 0 || d == 0) {
			return 1;
		} else {
			return Calculo(c - 1, d) + Calculo(c, d - 1);
		}
        
	}
}
