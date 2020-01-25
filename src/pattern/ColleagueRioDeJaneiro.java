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
public class ColleagueRioDeJaneiro extends Colleague{

    public ColleagueRioDeJaneiro(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Rio de janeiro recebeu: " + message);
    }
    
    
}
