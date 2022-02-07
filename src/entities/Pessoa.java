package entities;

import java.util.Random;

public abstract class Pessoa {
    protected String Nome;
    protected Integer Id;
    protected Integer Idade;
    
    public Pessoa(String nome,int Id, Integer idade) {
        this.Nome = nome;
        this.Idade = idade;
        this.Id=Id;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getId() {
        return Id;
    }
    public Integer getIdade() {
        return Idade;
    }
    
    public void setIdade(Integer idade) {
        Idade = idade;
    }
}
