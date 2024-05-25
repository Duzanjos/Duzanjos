package ControleSimplesDeSaques;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();
        double totalSaque = 0; // Variável para acompanhar o valor total dos saques realizados

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            double valorSaque = scanner.nextDouble();
            
            if (valorSaque <= 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }
            
            if (totalSaque + valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            totalSaque += valorSaque; // Atualiza o valor total dos saques realizados
            limiteDiario -= valorSaque; // Atualiza o limite diário restante
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }
        
        scanner.close();
    }
}
