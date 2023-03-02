package one.digitalinovation.gof.facade;

import subsistema1.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome , String cep){
        CrmService.gravarCliente(nome,cep, CepApi.getInstancia().recuperarCidade(cep),CepApi.getInstancia().recuperarEstado(cep) );
    }
}
