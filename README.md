Projeto: Agenda de Contatos - Java POO
Este projeto é um sistema de gerenciamento de agenda de contatos desenvolvido em Java, aplicando os conceitos fundamentais da Programação Orientada a Objetos (POO).

Funcionalidades Principais:
Adicionar Contatos: Suporta a inclusão de contatos pessoais (com data de aniversário) e profissionais (com empresa e cargo).
Gerenciar Contatos: Permite listar, buscar por nome/e-mail, editar e remover contatos existentes.
Armazenamento em Memória: Utiliza ArrayList para armazenar os dados de forma eficiente em tempo de execução.
Tratamento de Exceções: Inclui validações para entradas de usuário e tratamento de erros para garantir a robustez do sistema.
Conceitos de POO Aplicados:
O sistema foi estruturado com base nos pilares da POO:

Classes e Objetos: Modelagem de entidades como Contato (base), ContatoPessoal, ContatoProfissional, Endereco e Agenda, cada uma com suas responsabilidades.
Encapsulamento: Atributos privados com métodos getters e setters para controlar o acesso aos dados.
Herança: ContatoPessoal e ContatoProfissional herdam de Contato, promovendo a reutilização de código e uma hierarquia clara.
Polimorfismo: Sobrescrita do método toString() nas classes filhas e uso de referências da classe pai para objetos das classes filhas.
Estrutura e Execução:
O projeto é organizado em classes bem definidas (Endereco.java, Contato.java, ContatoPessoal.java, ContatoProfissional.java, Agenda.java, Main.java).

Para executar, basta compilar os arquivos .java (javac *.java) e rodar a classe principal (java Main) em um terminal Java JDK 8+.
