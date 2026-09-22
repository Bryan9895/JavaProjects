package br.edu.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
    public static void main(String[] args) {
        String nome = "Fulano";
        String celular = "1234-5678";
        String email = "fulano@email.com";
        
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("contato.txt"));
            pw.println("Nome: " + nome);
            pw.println("Celular: " + celular);
            pw.println("Email: " + email);
            pw.close();
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo!");
            System.out.println("Erro:" + e.getMessage());
        }
}
}