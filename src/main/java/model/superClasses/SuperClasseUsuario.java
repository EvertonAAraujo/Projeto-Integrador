
package model.superClasses;

import model.interfaces.IsuperClasseUsuario;

/**
 *
 * @author Pedro Lucas
 */
public abstract class SuperClasseUsuario implements IsuperClasseUsuario{
    private String nome;
    private String telefone;
    private String nascimento;
    private String usuario;
    private String senha;
    private String email;
    private int cep;
    private String rua;
    private int Numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int id;
    private boolean enable;
    private String rg;
    private String cpf;
    
    
    
    public SuperClasseUsuario(String nome, String telefone, String nascimento, String usuario, String senha, String email, int cep, String rua, int Numero, String complemento, String bairro, String cidade, String estado, int id, boolean enable) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.Numero = Numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.id = id;
        this.enable = enable;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getTelefone() {
        return telefone;
    }
    
    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getNascimento() {
        return nascimento;
    }

    @Override
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getCep() {
        return cep;
    }

    @Override
    public void setCep(int cep) {
        this.cep = cep;
    }
    
    @Override
    public String getRua() {
        return rua;
    }

    @Override
    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public int getNumero() {
        return Numero;
    }

    @Override
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public String getComplemento() {
        return complemento;
    }

    @Override
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String getBairro() {
        return bairro;
    }

    @Override
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String getCidade() {
        return cidade;
    }

    @Override
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean getEnable() {
        return enable;
    }

    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String getCpf() {
    return cpf;    
    }

    @Override
    public void setCpf(String Cpf) {
       this.cpf = Cpf;
    }

    @Override
    public String getRg() {
     return rg;   
    }

    @Override
    public void setRg(String Rg) {
        this.rg = Rg;
    }

    
    
    
    
}
