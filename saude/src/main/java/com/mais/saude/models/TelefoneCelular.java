package com.mais.saude.models;

import java.util.List;

public class TelefoneCelular {
    private List<String> telefones;
    private Pessoa pessoa;
          

    public List<String> getTelefones() {
        return telefones;
    }
    public void setNumero(List<String> telefones) {
        this.telefones = telefones;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((telefones == null) ? 0 : telefones.hashCode());
        result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TelefoneCelular other = (TelefoneCelular) obj;
        if (telefones == null) {
            if (other.telefones != null)
                return false;
        } else if (!telefones.equals(other.telefones))
            return false;
        if (pessoa == null) {
            if (other.pessoa != null)
                return false;
        } else if (!pessoa.equals(other.pessoa))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "TelefoneCelular [numero=" + telefones + ", pessoa=" + pessoa + "]";
    }
}
