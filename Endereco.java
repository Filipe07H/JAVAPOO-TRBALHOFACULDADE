public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    
    public Endereco() {
    }
    
    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    public String getRua() {
        return rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Endereço: ");
        
        if (rua != null && !rua.trim().isEmpty()) {
            sb.append(rua);
        }
        
        if (cidade != null && !cidade.trim().isEmpty()) {
            if (sb.length() > 10) sb.append(", ");
            sb.append(cidade);
        }
        
        if (estado != null && !estado.trim().isEmpty()) {
            if (sb.length() > 10) sb.append(" - ");
            sb.append(estado);
        }
        
        if (cep != null && !cep.trim().isEmpty()) {
            if (sb.length() > 10) sb.append(", CEP: ");
            sb.append(cep);
        }
        
        return sb.toString();
    }
} 