package br.edu.utfpr.td.cotsi.transacoes.cosumer;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @RabbitListener(queues = "transacoes.financeiras")
    public void receberMensagem(Map<String, Object> transacao) {
        try {
            System.out.println("*******************************");
            System.out.println("Transação: " + transacao.get("codigo"));
            
            Thread.sleep(1000);
            
            System.out.println("Cedente: " + transacao.get("cedente"));
            System.out.println("Pagador: " + transacao.get("pagador"));
            System.out.println("Valor: " + transacao.get("valor"));
            System.out.println("Vencimento: " + transacao.get("vencimento"));
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}