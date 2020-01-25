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
public class ColleagueSaoPaulo extends Colleague{

    public ColleagueSaoPaulo(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
       System.out.println("São paulo recebeu: " + message);
    }
    
    
}
