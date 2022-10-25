package org.estudostdd.desconto;

public abstract class CalculadoraFaixaDesconto {

    private CalculadoraFaixaDesconto proximo;

    public CalculadoraFaixaDesconto(CalculadoraFaixaDesconto proximo) {
        this.proximo = proximo;
    }

    public double desconto(double valorTotal) {
        double desconto = calcular(valorTotal);
        if (desconto == -1) {
             return proximo.calcular(valorTotal);
        }
        return desconto;
    }

    protected abstract double calcular(double valorTotal);
}