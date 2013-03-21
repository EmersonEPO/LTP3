package br.edu.ifnmg.tads.lp3;

import java.util.Objects;

public class Enderecos {
    private int id;
    private String estado;
    private String cidade;
    private int cep;
    private String bairro;
    private String rua;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.estado);
        hash = 11 * hash + Objects.hashCode(this.cidade);
        hash = 11 * hash + this.cep;
        hash = 11 * hash + Objects.hashCode(this.bairro);
        hash = 11 * hash + Objects.hashCode(this.rua);
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
        final Enderecos other = (Enderecos) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (this.cep != other.cep) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enderecos{" + "id=" + id + ", estado=" + estado + ", cidade=" + cidade + ", cep=" + cep + ", bairro=" + bairro + ", rua=" + rua + '}';
    }
    
    
    
}
