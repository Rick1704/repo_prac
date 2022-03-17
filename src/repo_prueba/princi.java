package repo_prueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class princi {

	public static void main(String[] args) throws IOException {
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		String edad;
		int cadena;

		System.out.println("1º modificación");
		edad = bufer.readLine();
		cadena = Integer.parseInt(edad);
		System.out.println(cadena);
		System.out.println();
		System.out.println();
	}

}
