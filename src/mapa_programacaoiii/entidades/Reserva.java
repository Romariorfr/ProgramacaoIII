package mapa_programacaoiii.entidades;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    
    private List<Hospede> list = new ArrayList<>();
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;
    
    public Reserva(){
        
    }

    public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias) {
        this.suite = suite;
        this.quantidadePessoas = quantidadePessoas;
        this.quantidadeDias = quantidadeDias;
    }

    public List<Hospede> getList() {
        return list;
    }

    public void setList(List<Hospede> list) {
        this.list = list;
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
        
}
