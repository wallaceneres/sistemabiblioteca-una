package models;

public class Credenciais {
    private String login;
    private String senha;
    private String nome;
    private String tipo;
    private int id;

    public Credenciais(String nome, String tipo) {
    	this(nome, tipo, "", "", 0);
    }

    public Credenciais(String login, String senha, String nome, String tipo, int id) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.tipo = tipo;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }
}