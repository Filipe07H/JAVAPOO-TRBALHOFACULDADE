# Agenda de Contatos - Java POO

## Descrição
Sistema de gerenciamento de agenda de contatos desenvolvido em Java, aplicando os conceitos fundamentais da Programação Orientada a Objetos (POO).

## Funcionalidades
- ✅ Adicionar contatos pessoais e profissionais
- ✅ Listar todos os contatos
- ✅ Buscar contatos por nome ou e-mail
- ✅ Editar dados de contatos
- ✅ Remover contatos
- ✅ Armazenamento em memória usando ArrayList
- ✅ Tratamento de exceções

## Conceitos de POO Aplicados

### 1. Classes e Objetos
- **Endereco**: Classe simples para representar endereços
- **Contato**: Classe base para contatos
- **ContatoPessoal**: Herda de Contato, adiciona data de aniversário
- **ContatoProfissional**: Herda de Contato, adiciona empresa e cargo
- **Agenda**: Gerencia a coleção de contatos
- **Main**: Classe principal com interface do usuário

### 2. Encapsulamento
- Atributos privados com getters e setters
- Controle de acesso aos dados

### 3. Herança
- `ContatoPessoal` e `ContatoProfissional` herdam de `Contato`
- Reutilização de código e hierarquia de classes

### 4. Polimorfismo
- Sobrescrita do método `toString()` nas classes filhas
- Uso de referências da classe pai para objetos das classes filhas

### 5. Tratamento de Exceções
- Validação de entradas do usuário
- Tratamento de erros de formato
- Mensagens de erro informativas

## Estrutura do Projeto

```
Trabalho JavaPOO/
├── Endereco.java           # Classe para endereços
├── Contato.java            # Classe base para contatos
├── ContatoPessoal.java     # Contatos pessoais (herda de Contato)
├── ContatoProfissional.java # Contatos profissionais (herda de Contato)
├── Agenda.java             # Gerenciador de contatos
├── Main.java               # Interface do usuário
└── README.md               # Documentação
```

## Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- Terminal ou prompt de comando

### Compilação
```bash
javac *.java
```

### Execução
```bash
java Main
```

## Menu do Sistema

```
=== MENU PRINCIPAL ===
1. Adicionar contato pessoal
2. Adicionar contato profissional
3. Listar todos os contatos
4. Buscar contato por nome
5. Buscar contato por e-mail
6. Editar contato
7. Remover contato
8. Sair
```

## Dados dos Contatos

### Contato Pessoal
- Nome completo
- Telefone(s)
- E-mail(s)
- Endereço (rua, cidade, estado, CEP)
- Data de aniversário

### Contato Profissional
- Nome completo
- Telefone(s)
- E-mail(s)
- Endereço (rua, cidade, estado, CEP)
- Empresa
- Cargo

## Características Técnicas

### Armazenamento
- Utiliza `ArrayList<Contato>` para armazenar contatos em memória
- Validação de duplicatas por nome
- Busca case-insensitive

### Validações
- Nome obrigatório para todos os contatos
- Campos opcionais podem ser pulados
- Tratamento de entradas vazias ou nulas

### Interface
- Menu interativo via console
- Entrada de dados via `Scanner`
- Feedback claro para o usuário

## Exemplo de Uso

1. **Adicionar Contato Pessoal**:
   - Escolha opção 1
   - Digite o nome completo
   - Adicione telefone, e-mail, endereço e data de aniversário (opcional)

2. **Buscar Contato**:
   - Escolha opção 4 ou 5
   - Digite o nome ou e-mail do contato
   - Visualize os dados encontrados

3. **Listar Contatos**:
   - Escolha opção 3
   - Visualize todos os contatos cadastrados

## Melhorias Futuras

- [ ] Persistência de dados em arquivo
- [ ] Interface gráfica (GUI)
- [ ] Validação de formato de e-mail
- [ ] Validação de formato de telefone
- [ ] Categorização de contatos
- [ ] Exportação de contatos
- [ ] Backup automático

## Autor
Desenvolvido como trabalho acadêmico de Programação Orientada a Objetos em Java. 