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
public class Maceio {
    public void enviarMensagemRj(String mensagem) {
    RioDeJaneiro rj = new RioDeJaneiro();
        rj.receberMcz(mensagem);
        
    }
    public void enviarMensagemSp(String mensagem) {
    SaoPaulo sp = new SaoPaulo();
        sp.receberMcz(mensagem);
    }
    public void receberSp(String mensagem) {
        System.out.println("Sao paulo mandou para maceio: " + mensagem);
    }
    public void receberRj(String mensagem) {
        System.out.println("Rj mandou para maceio: " + mensagem);
    }
}
