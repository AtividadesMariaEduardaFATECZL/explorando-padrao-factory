package br.com.factory.method.van;

import br.com.factory.method.util.NumberUtil;
import br.com.factory.method.veiculo.Veiculo;

import java.math.BigDecimal;

public class Van extends Veiculo {
    private int numeroDePassageiros;
    private int numeroDeParadas;

    public Van(String placa, String marca, String modelo, String cor) {
        super(placa, marca,modelo,cor);
        this.numeroDeParadas = (int) NumberUtil.generateRandomDoubleFromRange(3, 12);
        this.numeroDePassageiros = (int) NumberUtil.generateRandomDoubleFromRange(3, 12);
    }

    @Override
    public void criaDeslocamento() {
        System.out.println("Não há deslocamento!");
    }
}
