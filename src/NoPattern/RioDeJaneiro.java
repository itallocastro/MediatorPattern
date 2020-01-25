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
public class RioDeJaneiro {
    public void enviarMensagemSp(String mensagem) {
    SaoPaulo sp = new SaoPaulo();
        sp.receberRj(mensagem);
        
    }
    public void enviarMensagemMcz(String mensagem) {
    Maceio mcz = new Maceio();
        mcz.receberRj(mensagem);
    }
    public void receberMcz(String mensagem) {
        System.out.println("maceio mandou para rj: " + mensagem);
    }
    public void receberSp(String mensagem) {
        System.out.println("sao paulo mandou para rj: " + mensagem);
    }
    
}
