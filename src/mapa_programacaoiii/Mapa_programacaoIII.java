package mapa_programacaoiii;

import mapa_programacaoiii.entidades.Hospede;
import mapa_programacaoiii.entidades.Reserva;
import mapa_programacaoiii.entidades.Suite;

/**
 * @author romario ferreira de rezende
 * Atividade - Mapa | programção III
 */
public class Mapa_programacaoIII {

       public static void main(String[] args) {
           
           //atributos da suite - |numero|tipo|capacidade|valor
           Suite suiteMaster = new Suite();
           suiteMaster.setNumero(100);
           suiteMaster.setTipo("Luxo");
           suiteMaster.setCapacidade(4);
           suiteMaster.setValorDiaria(200.0);
           
           //criando uma reserva da suite master
           Reserva reserva = new Reserva(suiteMaster);
           
           //lista de hospedes/ atributos - |codigo|nome|endereco|idade
           reserva.adicionarHospedeLista(new Hospede(1,"Romario","rua manoel aquino 224", 32));
           reserva.adicionarHospedeLista(new Hospede(2,"Laura","rua manoel aquino 224", 35));
           reserva.adicionarHospedeLista(new Hospede(3,"Arthur","rua manoel aquino 224", 10));
           reserva.adicionarHospedeLista(new Hospede(4,"Debora","rua manoel aquino 224", 1));
           
           //passando a lista de hospedes para a reserva
           reserva.setQuantidadePessoas(reserva.getListaHospedes().size());
           
           //quantidade de dias da reserva
           reserva.setQuantidadeDias(10);
           
           System.out.printf("Valor da reserva $%.2f\n",reserva.calcularDiaria());
    }
    
}
