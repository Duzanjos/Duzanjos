package Contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O primeiro parâmetro deve ser menor ou igual ao segundo.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor ou igual ao segundo.");
		}
		for (int contagem = parametroUm; contagem <= parametroDois; contagem++) {
			System.out.println("Número: " + contagem);
		}

	}
    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }
	
}