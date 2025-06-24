import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    private List<Contato> contatos;
    
    
    public Agenda() {
        this.contatos = new ArrayList<>();
    }
    
    
    
    
    public void adicionarContato(Contato contato) {
        
        if (contato != null && contato.getNome() != null && !contato.getNome().trim().isEmpty()) {
            
            if (buscarPorNome(contato.getNome()) == null) {
                contatos.add(contato);
                System.out.println("Contato adicionado com sucesso!");
            } else {
                System.out.println("Erro: Já existe um contato com este nome!");
            }
        } else {
            System.out.println("Erro: Nome do contato é obrigatório!");
        }
    }
    
    
    public void removerContato(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            Contato contato = buscarPorNome(nome);
            if (contato != null) {
                contatos.remove(contato);
                System.out.println("Contato removido com sucesso!");
            } else {
                System.out.println("Contato não encontrado!");
            }
        } else {
            System.out.println("Erro: Nome é obrigatório para remoção!");
        }
    }
    
    
    public Contato buscarPorNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            
            for (Contato contato : contatos) {
                if (contato.getNome().equalsIgnoreCase(nome.trim())) {
                    return contato;
                }
            }
        }
        return null;  
    }
    
    
    public Contato buscarPorEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            
            for (Contato contato : contatos) {
                
                for (String contatoEmail : contato.getEmails()) {
                    if (contatoEmail.equalsIgnoreCase(email.trim())) {
                        return contato;
                    }
                }
            }
        }
        return null;  
    }
    
    
    public void listarTodos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado na agenda.");
        } else {
            System.out.println("\n=== LISTA DE CONTATOS ===");
            
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println("\nContato " + (i + 1) + ":");
                System.out.println(contatos.get(i));
            }
            System.out.println("Total de contatos: " + contatos.size());
        }
    }
    
    public void editarContato(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            Contato contato = buscarPorNome(nome);
            if (contato != null) {
                System.out.println("Contato encontrado:");
                System.out.println(contato);
                System.out.println("Use o menu de edição para modificar os dados.");
            } else {
                System.out.println("Contato não encontrado!");
            }
        } else {
            System.out.println("Erro: Nome é obrigatório para edição!");
        }
    }
    
    
    public boolean contatoExiste(String nome) {
        return buscarPorNome(nome) != null;
    }
    
    public int getQuantidadeContatos() {
        return contatos.size();
    }
    
    public List<Contato> getContatos() {
        return new ArrayList<>(contatos); 
    }
} 