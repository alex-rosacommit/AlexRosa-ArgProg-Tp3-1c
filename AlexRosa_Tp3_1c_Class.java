package alexRosa_Tp3_1c_package;

public class AlexRosa_Tp3_1c_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorX = 22;
		int[] listaNumeros = new int[5];
		listaNumeros[0] = 23;
		listaNumeros[1] = 12;
		listaNumeros[2] = 45;
		listaNumeros[3] = 11;
		listaNumeros[4] = 54;
		
		int respuestaMetodo = SumarX(listaNumeros, valorX);
		
		System.out.println("La suma de los valores > x es: " + respuestaMetodo);
	}
	
	private static int SumarX(int[] numeros, int x) {
		int sumatoriaMayoresX = 0;
		
		for(int index = 0; index < numeros.length; index++) {
			if(x < numeros[index]) {
				sumatoriaMayoresX = sumatoriaMayoresX + numeros[index];
			}
		}
		
		return sumatoriaMayoresX;
	}

}
