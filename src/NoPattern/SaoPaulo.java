/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoPattern;

/**
 *
 * @author Castro Alves
 */
public class SaoPaulo {
    public void enviarMensagemMcz(String mensagem) {
    Maceio mcz = new Maceio();
        mcz.receberSp(mensagem);
        
    }
    public void enviarMensagemRj(String mensagem) {
    RioDeJaneiro rj = new RioDeJaneiro();
        rj.receberSp(mensagem);
    }
    public void receberMcz(String mensagem) {
        System.out.println("maceio mandou para sao paulo: " + mensagem);
    }
    public void receberRj(String mensagem) {
        System.out.println("Rj mandou para sao paulo: " + mensagem);
    }
    
}
