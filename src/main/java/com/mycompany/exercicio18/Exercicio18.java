/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio18;

/**
 *
 * @author Fabricio de Aguiar
 */
import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");

        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));

        String categoria = JOptionPane.showInputDialog(
                "Digite a categoria do produto:\nA\nB\nC\nD\nE"
        );

        if (categoria != null) {
            categoria = categoria.toUpperCase();
        }

        double desconto = 0;

        switch (categoria) {
            case "A":
                desconto = 0.10;
                break;
            case "B":
                desconto = 0.15;
                break;
            case "C":
                desconto = 0.20;
                break;
            case "D":
                desconto = 0.25;
                break;
            case "E":
                desconto = 0.50;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Categoria inválida. Nenhum desconto será aplicado.");
        }

        double precoFinal = preco - (preco * desconto);

        JOptionPane.showMessageDialog(null,
                "Cliente: " + nome
                + "\nCategoria: " + categoria
                + "\nPreço original: R$ " + String.format("%.2f", preco)
                + "\nPreço final com desconto: R$ " + String.format("%.2f", precoFinal)
        );
    }
}
