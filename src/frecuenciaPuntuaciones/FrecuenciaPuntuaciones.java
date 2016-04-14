package frecuenciaPuntuaciones;

import java.util.Scanner;

public class FrecuenciaPuntuaciones
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int TAM = 6;
		int puntuacion;
		int[] frecuencia = new int[6];
		for(int i = 0; i < TAM; i++)
		{
			System.out.print("Introduce puntuación(0-5): ");
			puntuacion = sc.nextInt();
			while(puntuacion < 0 || puntuacion > 5)
			{
				System.out.println("Fuera de rango.");					
				System.out.print("Introduce puntuación(0-5): ");
				puntuacion = sc.nextInt();
			}
			frecuencia[puntuacion]++;
		}
		sc.close();
		System.out.println("Frecuencias:");
		for(int i = 0; i < frecuencia.length; i++)
		{
			System.out.println(i + ": " + frecuencia[i] + " veces.");
		}
	}
}

