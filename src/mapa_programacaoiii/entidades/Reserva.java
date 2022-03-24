package mapa_programacaoiii.entidades;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    
    private List<Hospede> listaHospedes = new ArrayList<>();
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;

    public Reserva(Suite suite) {
        this.suite = suite;
    }

    public void adicionarHospedeLista(Hospede hospede){
        if(verificarCapacidade()){
            listaHospedes.add(hospede);
            
        }
        else if(verificarCapacidade() == false && hospede.getIdade() <= 2){
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Bebês até 2 anos não contam na capacidade da suíte.");
            System.out.println("---------------------------------------------------------------------");
            
        }
        else{
            System.out.println("---------------------------------------------------------------------");
            System.out.println("A reserva não pode alocar mais hóspedes do que a capacidade da suíte.");
            System.out.println("---------------------------------------------------------------------");
        }
    }
    
    public void removerHospedeLista(Hospede hospede){
        listaHospedes.remove(hospede);
    }

    public List<Hospede> getListaHospedes() {
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
    
    public boolean verificarCapacidade(){
        return suite.getCapacidade() >= listaHospedes.size()+1;
        
    }
    
    public double calcularDiaria(){
        double diaria;
        if(quantidadeDias > 7){
            diaria = valorTotal() - desconto(valorTotal());
        }else{
            diaria = valorTotal();
        }
        return diaria;
    }
    
    private double desconto(double valorTotal){
       return 0.1 * valorTotal;
    }
    
    private double valorTotal(){
        return suite.getValorDiaria() * quantidadeDias;
    }
    
    public void labelDesconto(){
        if(quantidadeDias > 7){
            System.out.println("Com desconto de 10% para diarias acima de 7 dias.");
        }
        else{
            System.out.println("Sem desconto.");
        }
    }
        
}
