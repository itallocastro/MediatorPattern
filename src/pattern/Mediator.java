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
public interface Mediator {

    void submit(String message, Colleague colleague);
    
}
