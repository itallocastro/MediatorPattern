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
public class ColleagueMaceio extends Colleague{

    public ColleagueMaceio(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Maceio recebeu a mensagem: " + message);
    }
    
}
