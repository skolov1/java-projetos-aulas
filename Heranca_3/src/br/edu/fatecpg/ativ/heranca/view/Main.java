package br.edu.fatecpg.ativ.heranca.view;

import java.util.Scanner;
import br.edu.fatecpg.ativ.heranca.model.SistemaDeSeguranca;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();

        System.out.println("Tela de Login");

        boolean acessoPermitido = false;

        while (!acessoPermitido) {
            System.out.print("Digite seu usuário: ");
            String inputUsuario = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String inputSenha = scanner.nextLine();

            acessoPermitido = sistema.login(inputUsuario, inputSenha);

            if (acessoPermitido) {
                System.out.println("\nLogin aprovado! Bem-vindo(a) ao sistema.");
            } else {
                System.out.println("\nERRO: Usuário ou senha incorretos. Tente novamente.\n");
            }
        }

        System.out.println("\n(Agora você está logado)");
        System.out.println("Pressione ENTER para fazer o logout.");
        scanner.nextLine();
        
        sistema.logout();
        
        scanner.close(); 
    }
}