package br.edu.ifnmg.tads.lp3;

public class Telefones {
    private int id;
    private int numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefones{" + "id=" + id + ", numero=" + numero + '}';
    }
    
    
    
}
