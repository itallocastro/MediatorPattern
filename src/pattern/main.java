/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import NoPattern.Maceio;
import NoPattern.RioDeJaneiro;
import NoPattern.SaoPaulo;

/**
 *
 * @author Castro Alves
 */
public class main {
    public static void main(String[] args) {
//        MessageMediator mediator = new MessageMediator();
//        
//        ColleagueMaceio mcz = new ColleagueMaceio(mediator);
//        ColleagueSaoPaulo sp = new ColleagueSaoPaulo(mediator);
//        ColleagueRioDeJaneiro rj = new ColleagueRioDeJaneiro(mediator);
//        
//        mediator.addColleague(rj);
//        mediator.addColleague(sp);
//        mediator.addColleague(mcz);
//        
//       mcz.enviarMessage("olá, sou de maceio");
//        System.out.println("==========");
//        sp.enviarMessage("olá, sou de sp");
//        System.out.println("==========");
//        rj.enviarMessage("olá, sou do rj");

    
          Maceio mcz = new Maceio();
          SaoPaulo sp = new SaoPaulo();
          RioDeJaneiro rj = new RioDeJaneiro();
          
          System.out.println("NO PATTERN");
          
          mcz.enviarMensagemSp("olá, sou de maceio");
          mcz.enviarMensagemRj("olá, sou de maceio");
          System.out.println("==========");
          sp.enviarMensagemMcz("olá, sou de sao paulo");
          sp.enviarMensagemRj("olá, sou de sao paulo");
          System.out.println("==========");
          rj.enviarMensagemMcz("olá, sou do rj");
          rj.enviarMensagemSp("olá, sou do rj");
        
        
    }
    
}
