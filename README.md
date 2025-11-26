# Atividade 4 de API e Web Services - Troca de mensagens Transações

Desenvolva uma aplicação distribuída capaz de processar dados de transações financeiras. A aplicação deve utilizar troca de mensagens através de eventos. Os eventos devem seguir o protocolo AMQP (Advanced Message Queuing Protocol) e utilizar o broker de mensagens RabbitMQ.

Deve-se implementar um Produtor capaz de processar um arquivo CSV que contém dados de transações financeiras. Cada registro CSV deve ser convertido em um evento, sendo encaminhado para a fila “transacoes.financeiras”. Deve-se implementar um Consumidor capaz de processar eventos da fila
anteriormente citada e imprimir na saída padrão os dados da transação recebida. O processamento da transação por parte do Consumidor deve simular uma espera programada de 1 segundo. Ou seja, cada transação necessita de 1 segundo para ser processada pelo Consumidor.
