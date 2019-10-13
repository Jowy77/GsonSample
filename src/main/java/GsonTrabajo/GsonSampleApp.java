package GsonTrabajo;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSampleApp {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nombre="",apellidos="";
		int edad=0;
		boolean correctos = false;
		Persona p;
		
		while(!correctos) {
			try {
			
			System.out.print("Introduce un nombre: ");
			nombre= entrada.nextLine();
			System.out.print("Introduce los apellidos: ");
			apellidos= entrada.nextLine();
			System.out.print("Introduce la edad: ");
			edad= entrada.nextInt();
			correctos=true;
			}catch(InputMismatchException e) {
				System.out.println("\nHas introducido datos erroneos");
				entrada.nextLine();
				correctos= false;
			}
		}
		
		entrada.close();
		
		p= new Persona(nombre, apellidos, edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String convertido = gson.toJson(p);
		
		System.out.println(convertido);

	}

}
