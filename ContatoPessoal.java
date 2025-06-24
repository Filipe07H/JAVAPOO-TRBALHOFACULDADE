public class ContatoPessoal extends Contato {
    // dados específicos de contato pessoal
    private String dataAniversario;
    
    // construtor vazio
    public ContatoPessoal() {
        super();  // chama o construtor da classe pai (Contato)
    }
    
    // construtor só com nome
    public ContatoPessoal(String nome) {
        super(nome);  // chama o construtor da classe pai com nome
    }
    
    // construtor completo com todos os dados
    public ContatoPessoal(String nome, Endereco endereco, String dataAniversario) {
        super(nome, endereco);  // chama o construtor da classe pai
        this.dataAniversario = dataAniversario;
    }
    
    // getter e setter para data de aniversário
    public String getDataAniversario() {
        return dataAniversario;
    }
    
    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    
    // método para mostrar o contato pessoal de forma bonita
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CONTATO PESSOAL ===\n");
        sb.append(super.toString());  // chama o toString da classe pai
        
        // só mostra a data de aniversário se ela existir
        if (dataAniversario != null && !dataAniversario.trim().isEmpty()) {
            sb.append("Data de Aniversário: ").append(dataAniversario).append("\n");
        }
        
        sb.append("======================\n");
        return sb.toString();
    }
} 