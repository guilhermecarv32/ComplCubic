package br.edu.ifba.ordenacao.ordenador;

public interface Ordenador<Ordenavel> {
    
    public String getTipo();

    public void ordenar(Ordenavel[] ordenaveis);

}
