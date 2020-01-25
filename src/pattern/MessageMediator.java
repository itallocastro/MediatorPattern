/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.ArrayList;

/**
 *
 * @author Castro Alves
 */
public class MessageMediator implements Mediator {

    ArrayList<Colleague> contatos;

    public MessageMediator() {
        this.contatos = new ArrayList<Colleague>();
    }
    public void addColleague(Colleague colleague) {
        this.contatos.add(colleague);
    }
    public void defineProtocol(Colleague contato) {
        if(contato instanceof ColleagueRioDeJaneiro) {
            System.out.println("Protocolo do rio de janeiro");
        } else if(contato instanceof ColleagueMaceio) {
            System.out.println("Protocolo de maceió");
        } else if(contato instanceof ColleagueSaoPaulo) {
            System.out.println("Protocolo de são paulo");
        }
    }
    
    @Override
    public void submit(String message, Colleague colleague) {
        for(Colleague contato : contatos) {
            if(contato != colleague) {
                defineProtocol(contato);
                contato.receiveMessage(message);
            }
        }
    }
    
    
}
