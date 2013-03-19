package br.edu.ifnmg.tads.lp3;

public class Pessoa{
    
    private int id;
    private String nome;
    
    public Pessoa(){
        this.id=0;
        thissnome="vazio";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>1)
            this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if((nome.length()> 3) && (nome.length() < 250)){
            this.nome = nome;
        }
        throw new Exception("Não podem haver nomes com menos de 3 letras e mais que 250 letras");
    }
    
    
    
  
}
