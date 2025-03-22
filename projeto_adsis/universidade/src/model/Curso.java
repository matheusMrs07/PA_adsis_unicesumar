package model;

public class Curso {
    protected String nome;
    protected int cargaH;
    protected String codigo;

    public Curso(String nome, int cargaH, String codigo){
        this.nome = nome;
        this.cargaH = cargaH;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getCargaH(){
        return cargaH;
    }

    public String getCodigo(){
        return this.codigo;
    }

}
