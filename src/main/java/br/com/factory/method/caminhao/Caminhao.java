package br.com.factory.method.caminhao;

import br.com.factory.method.util.NumberUtil;
import br.com.factory.method.veiculo.Veiculo;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {
    private BigDecimal carga;
    private BigDecimal deslocamento;
    private BigDecimal valorDoFrete;
    private int quantidadeDeEixos;
    private int cargaMaxima;

    public Caminhao(String placa, String marca, String modelo, String cor) {
        super(placa, marca,modelo,cor);
        this.carga = new BigDecimal(String.valueOf(NumberUtil.generateRandomBigDecimalFromRange(new BigDecimal(1000), new BigDecimal(3000))));
        this.deslocamento = new BigDecimal(String.valueOf(NumberUtil.generateRandomBigDecimalFromRange(new BigDecimal(500), new BigDecimal(3000))));
        this.valorDoFrete = new BigDecimal(String.valueOf(NumberUtil.generateRandomBigDecimalFromRange(new BigDecimal(2000), new BigDecimal(5000))));
        this.quantidadeDeEixos = (int) NumberUtil.generateRandomDoubleFromRange(3, 12);
        this.cargaMaxima = (int) NumberUtil.generateRandomDoubleFromRange(10000, Integer.MAX_VALUE);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "carga=" + carga +
                ", deslocamento=" + deslocamento +
                ", valorDoFrete=" + valorDoFrete +
                ", quantidadeDeEixos=" + quantidadeDeEixos +
                ", cargaMaxima=" + cargaMaxima +
                "} " + super.toString();
    }

    @Override
    public void criaDeslocamento() {
        System.out.println("O deslocamento feito foi de " + deslocamento);
    }
}
