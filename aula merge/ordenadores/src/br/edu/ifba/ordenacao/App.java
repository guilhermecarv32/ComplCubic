package br.edu.ifba.ordenacao;

import br.edu.ifba.ordenacao.impl.Bubble;
import br.edu.ifba.ordenacao.impl.Merge;
import br.edu.ifba.ordenacao.ordenador.Ordenador;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] numeros = new Integer[] {3, 2, 10, 100, 70, 55, 98, 27, 45, 1000, 4};

        // Ordenador<Integer> ordenador = new Merge();
        Ordenador<Integer> ordenador = new Bubble();
        ordenador.ordenar(numeros);

        for(Integer numero: numeros){
            System.out.println(numero);
        }
    }
}
