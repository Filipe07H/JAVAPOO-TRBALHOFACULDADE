import java.util.ArrayList;
import java.util.List;

public class Contato {
    // dados básicos do contato
    private String nome;
    private List<String> telefones;  // lista de telefones (pode ter vários)
    private List<String> emails;     // lista de emails (pode ter vários)
    private Endereco endereco;       // endereço do contato
    
    // construtor vazio - inicializa as listas
    public Contato() {
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }
    
    // construtor só com nome
    public Contato(String nome) {
        this();  // chama o construtor vazio primeiro
        this.nome = nome;
    }
    
    // construtor completo com nome e endereço
    public Contato(String nome, Endereco endereco) {
        this(nome);  // chama o construtor com nome
        this.endereco = endereco;
    }
    
    // getters e setters - para acessar e modificar os dados
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<String> getTelefones() {
        return telefones;
    }
    
    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }
    
    public List<String> getEmails() {
        return emails;
    }
    
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    // métodos para adicionar telefone e email
    public void adicionarTelefone(String telefone) {
        // só adiciona se o telefone não for vazio
        if (telefone != null && !telefone.trim().isEmpty()) {
            this.telefones.add(telefone);
        }
    }
    
    public void adicionarEmail(String email) {
        // só adiciona se o email não for vazio
        if (email != null && !email.trim().isEmpty()) {
            this.emails.add(email);
        }
    }
    
    public void removerTelefone(String telefone) {
        this.telefones.remove(telefone);
    }
    
    public void removerEmail(String email) {
        this.emails.remove(email);
    }
    
    // método para mostrar o contato de forma bonita
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        
        // mostra os telefones se existirem
        if (!telefones.isEmpty()) {
            sb.append("Telefones: ");
            for (int i = 0; i < telefones.size(); i++) {
                sb.append(telefones.get(i));
                if (i < telefones.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("\n");
        }
        
        // mostra os emails se existirem
        if (!emails.isEmpty()) {
            sb.append("E-mails: ");
            for (int i = 0; i < emails.size(); i++) {
                sb.append(emails.get(i));
                if (i < emails.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("\n");
        }
        
        // mostra o endereço se existir
        if (endereco != null) {
            sb.append(endereco.toString());
        }
        
        return sb.toString();
    }
} 