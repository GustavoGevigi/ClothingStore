package ClothingStore;

import java.time.LocalDateTime;

public class CadastroUsuario {
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private int idade;
    private boolean sexo;
    private LocalDateTime dataNascimento;

    // Construtor padrão
    public CadastroUsuario() {
    }

    // Construtor com parâmetros
    public CadastroUsuario(String nome, String email, String cpf, String senha, int idade, boolean sexo, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

