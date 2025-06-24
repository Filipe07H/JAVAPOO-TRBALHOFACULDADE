import java.util.Scanner;

public class Main {
    
    private static Agenda agenda = new Agenda();
    
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        System.out.println("=== AGENDA DE CONTATOS ===");
        System.out.println("Bem-vindo ao sistema de gerenciamento de contatos!");
        
        
        while (true) {
            exibirMenu();
            try {
                // lê a opção que o usuário escolheu
                int opcao = Integer.parseInt(scanner.nextLine());
                if (opcao == 8) break;  // sai do programa
                processarOpcao(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido!");
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        
        System.out.println("Obrigado por usar a Agenda de Contatos!");
        scanner.close();
    }
    
    
    private static void exibirMenu() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Adicionar contato pessoal");
        System.out.println("2. Adicionar contato profissional");
        System.out.println("3. Listar todos os contatos");
        System.out.println("4. Buscar contato por nome");
        System.out.println("5. Buscar contato por e-mail");
        System.out.println("6. Editar contato");
        System.out.println("7. Remover contato");
        System.out.println("8. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    
    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                adicionarContatoPessoal();
                break;
            case 2:
                adicionarContatoProfissional();
                break;
            case 3:
                agenda.listarTodos();
                break;
            case 4:
                buscarPorNome();
                break;
            case 5:
                buscarPorEmail();
                break;
            case 6:
                editarContato();
                break;
            case 7:
                removerContato();
                break;
            default:
                System.out.println("Opção inválida! Digite um número entre 1 e 8.");
        }
    }
    
    
    private static void adicionarContatoPessoal() {
        try {
            System.out.println("\n=== ADICIONAR CONTATO PESSOAL ===");
            
           
            String nome = lerNome();
            if (nome == null) return;
            
            
            ContatoPessoal contato = new ContatoPessoal(nome);
            
            
            lerDadosBasicos(contato);
            lerEndereco(contato);
            
            
            System.out.print("Data de aniversário (DD/MM/AAAA): ");
            String dataAniversario = scanner.nextLine().trim();
            if (!dataAniversario.isEmpty()) {
                contato.setDataAniversario(dataAniversario);
            }
            
            
            agenda.adicionarContato(contato);
            
        } catch (Exception e) {
            System.out.println("Erro ao adicionar contato pessoal: " + e.getMessage());
        }
    }
    
    
    private static void adicionarContatoProfissional() {
        try {
            System.out.println("\n=== ADICIONAR CONTATO PROFISSIONAL ===");
            
           
            String nome = lerNome();
            if (nome == null) return;
            
           
            ContatoProfissional contato = new ContatoProfissional(nome);
            
            
            lerDadosBasicos(contato);
            lerEndereco(contato);
            
            
            System.out.print("Empresa: ");
            String empresa = scanner.nextLine().trim();
            if (!empresa.isEmpty()) {
                contato.setEmpresa(empresa);
            }
            
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine().trim();
            if (!cargo.isEmpty()) {
                contato.setCargo(cargo);
            }
            
            
            agenda.adicionarContato(contato);
            
        } catch (Exception e) {
            System.out.println("Erro ao adicionar contato profissional: " + e.getMessage());
        }
    }
    
    private static String lerNome() {
        System.out.print("Nome completo: ");
        String nome = scanner.nextLine().trim();
        
        if (nome.isEmpty()) {
            System.out.println("Erro: Nome é obrigatório!");
            return null;
        }
        return nome;
    }
    
    
    private static void lerDadosBasicos(Contato contato) {
        
        System.out.print("Telefone (ou pressione Enter para pular): ");
        String telefone = scanner.nextLine().trim();
        if (!telefone.isEmpty()) {
            contato.adicionarTelefone(telefone);
        }
        
       
        System.out.print("E-mail (ou pressione Enter para pular): ");
        String email = scanner.nextLine().trim();
        if (!email.isEmpty()) {
            contato.adicionarEmail(email);
        }
    }
    
    
    private static void lerEndereco(Contato contato) {
        System.out.println("\n--- Dados do Endereço ---");
        System.out.print("Rua: ");
        String rua = scanner.nextLine().trim();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine().trim();
        System.out.print("Estado: ");
        String estado = scanner.nextLine().trim();
        System.out.print("CEP: ");
        String cep = scanner.nextLine().trim();
        
        
        if (!rua.isEmpty() || !cidade.isEmpty() || !estado.isEmpty() || !cep.isEmpty()) {
            Endereco endereco = new Endereco(rua, cidade, estado, cep);
            contato.setEndereco(endereco);
        }
    }
    
    
    private static void buscarPorNome() {
        try {
            System.out.print("\nDigite o nome do contato: ");
            String nome = scanner.nextLine().trim();
            
            if (nome.isEmpty()) {
                System.out.println("Erro: Nome é obrigatório!");
                return;
            }
            
            
            Contato contato = agenda.buscarPorNome(nome);
            if (contato != null) {
                System.out.println("\nContato encontrado:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não encontrado!");
            }
            
        } catch (Exception e) {
            System.out.println("Erro na busca: " + e.getMessage());
        }
    }
    
    
    private static void buscarPorEmail() {
        try {
            System.out.print("\nDigite o e-mail do contato: ");
            String email = scanner.nextLine().trim();
            
            if (email.isEmpty()) {
                System.out.println("Erro: E-mail é obrigatório!");
                return;
            }
            
            
            Contato contato = agenda.buscarPorEmail(email);
            if (contato != null) {
                System.out.println("\nContato encontrado:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não encontrado!");
            }
            
        } catch (Exception e) {
            System.out.println("Erro na busca: " + e.getMessage());
        }
    }
    
    
    private static void editarContato() {
        try {
            System.out.print("\nDigite o nome do contato a ser editado: ");
            String nome = scanner.nextLine().trim();
            
            if (nome.isEmpty()) {
                System.out.println("Erro: Nome é obrigatório!");
                return;
            }
            
            
            Contato contato = agenda.buscarPorNome(nome);
            if (contato != null) {
                System.out.println("\nContato encontrado:");
                System.out.println(contato);
                System.out.println("\nFuncionalidade de edição será implementada em versões futuras.");
                System.out.println("Por enquanto, remova o contato e adicione novamente com os dados corretos.");
            } else {
                System.out.println("Contato não encontrado!");
            }
            
        } catch (Exception e) {
            System.out.println("Erro na edição: " + e.getMessage());
        }
    }
    
    
    private static void removerContato() {
        try {
            System.out.print("\nDigite o nome do contato a ser removido: ");
            String nome = scanner.nextLine().trim();
            
            if (nome.isEmpty()) {
                System.out.println("Erro: Nome é obrigatório!");
                return;
            }
            
            
            agenda.removerContato(nome);
            
        } catch (Exception e) {
            System.out.println("Erro na remoção: " + e.getMessage());
        }
    }
} 