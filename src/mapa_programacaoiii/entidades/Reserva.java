package mapa_programacaoiii.entidades;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    
    private List<Hospede> listaHospedes = new ArrayList<>();
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;

    public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias) {
        this.suite = suite;
        
        if(verificarCapacidade(quantidadePessoas) == true){
            this.quantidadePessoas = quantidadePessoas;
        }
        else{
            System.out.println("O numero de possoas excede a capacidade da suite!");
        }
        
        this.quantidadeDias = quantidadeDias;
    }

    public void AddListaHospede(Hospede hospede){
        listaHospedes.add(hospede);
    }
    
    public void removerHospedeLista(Hospede hospede){
        listaHospedes.remove(hospede);
    }
    
    public List<Hospede> getList() {
        return listaHospedes;
    }
    
    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    
    public boolean verificarCapacidade(int quantidadePessoas){
        return suite.getCapacidade() >= quantidadePessoas;
    }
    
    public double calcularDiaria(){
        double valorTotal = suite.getValorDiaria() * quantidadeDias;
        return valorTotal - descontoConcedido(valorTotal);
    }
    
    private double descontoConcedido(double valorTotal){
        
        final int PORCENTAGEM_DESCONTO = 10;
        double totalDesconto = 0;
        if(quantidadeDias > 7){
            totalDesconto = (PORCENTAGEM_DESCONTO / 100) * valorTotal;
        }
        else{
            totalDesconto = 0;
        }
        return totalDesconto;
    }
        
}
