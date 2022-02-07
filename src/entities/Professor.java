package entities;

public class Professor extends Pessoa {

    protected String Materia;

    public Professor(String nome, int Id, Integer idade) {
        super(nome, Id, idade);
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }
    
}
