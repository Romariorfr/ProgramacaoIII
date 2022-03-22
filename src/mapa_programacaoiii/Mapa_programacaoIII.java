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
           
           //numero|tipo|capacidade|valor
           Suite suiteMaster = new Suite();
           suiteMaster.setNumero(100);
           suiteMaster.setTipo("Luxo");
           suiteMaster.setCapacidade(4);
           suiteMaster.setValorDiaria(200.0);
           
           
           //suite|numero de pessoas|quantidade dias
           Reserva reserva = new Reserva(suiteMaster,4,2);
           
           //codigo|nome|endereco|idade
           reserva.AddListaHospede(new Hospede(1,"Romario","rua manoel aquino 224", 32));
           reserva.AddListaHospede(new Hospede(2,"Laura","rua manoel aquino 224", 35));
           reserva.AddListaHospede(new Hospede(3,"Arthur","rua manoel aquino 224", 10));
           reserva.AddListaHospede(new Hospede(4,"Debora","rua manoel aquino 224", 1));
           
      
                    
    }
    
}
