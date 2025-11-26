package br.edu.utfpr.td.cotsi.transacoes.producer;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.edu.utfpr.td.cotsi.transacoes.producer.model.Transacao;
import br.edu.utfpr.td.cotsi.transacoes.producer.service.LeitorArquivo;

@Component
public class ProdutorRunner implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Lendo arquivo...");
        
        LeitorArquivo leitor = new LeitorArquivo();
        List<Transacao> transacoes = leitor.lerArquivo();
        
        System.out.println("Encontradas " + transacoes.size() + " transações.");

        for (Transacao t : transacoes) {
            rabbitTemplate.convertAndSend("transacoes.financeiras", t);
            System.out.println("Enviado código: " + t.getCodigo());
        }
        
        System.out.println("Envio concluído!");
    }
}