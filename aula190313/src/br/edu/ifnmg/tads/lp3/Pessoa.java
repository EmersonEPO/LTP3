package br.edu.ifnmg.tads.lp3;

import java.util.Objects;

public class Pessoa{
    
    private int id;
    private String nome;
 
    
    public Pessoa(){
        this.id=0;
        this.nome="vazio";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>1) {
            this.id = id;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if((nome.length()> 3) && (nome.length() < 250)){
            this.nome = nome;
        }
        throw new Exception("Não podem haver nomes com menos de 3 letras e mais que 250 letras");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + '}';
    }
}
