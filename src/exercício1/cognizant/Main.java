package exercício1.cognizant;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 5);
        Calculadora.multiplicacao(3, 3);
        Calculadora.divisão(9, 3);

        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5 );

    }
}
