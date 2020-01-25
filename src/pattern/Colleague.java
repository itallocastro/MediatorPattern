/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author Castro Alves
 */
public abstract class Colleague {
    
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public void enviarMessage(String message) {
        mediator.submit(message,this);
    }
    
    public abstract void receiveMessage(String message);
    
    
    
}
