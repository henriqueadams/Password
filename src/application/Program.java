//testa se a senha é valida, necessario 8 letras, 1 letra maiuscula, minuscula, numero, sem caracteres especiais ou espaço

package application;

import java.util.Scanner;

import entities.Complexity;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		String word = sc.nextLine();
		
		Complexity password = new Complexity(word);
		
		if (password.validaComplexidade() == 1)
			System.out.println("Senha aceita");
		else 
			System.out.println("Senha Invalida");
			
		System.out.println(password.validaComplexidade());
		
		sc.close();
	}

}
