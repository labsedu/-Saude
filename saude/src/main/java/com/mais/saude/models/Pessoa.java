package com.mais.saude.models;

import java.util.Calendar;
import java.util.Date;

import com.mais.saude.models.enuns.Genero;

public class Pessoa extends Endereco {
    private Long ID;
    private String nome;
    private Date DataNascimento;
    private Genero genero;
    private String cpf;
    private String rg;
    private String cartaoNacionalSaude;
    private Endereco endereco;

    /**********************Construtores**************************/
    public Pessoa() {
    }

    /*************************Metodos****************************/
    public int calcularIdade(Date dataNascimento) {
        Calendar dataAtual = Calendar.getInstance();
        Calendar nascimeto = Calendar.getInstance();
        nascimeto.setTime(dataNascimento);
        int idade = dataAtual.get(Calendar.YEAR) - nascimeto.get(Calendar.YEAR);
        if (dataAtual.get(Calendar.MONTH) < nascimeto.get(Calendar.MONTH)) {
            idade--;
        } else if (dataAtual.get(Calendar.MONTH) == nascimeto.get(Calendar.MONTH) 
        && dataAtual.get(Calendar.DAY_OF_MONTH) < nascimeto.get(Calendar.DAY_OF_MONTH)) {
            idade--;
        }
        return idade;
    }

    /*************************Geters*****************************/
    public Long getID() {
        return ID;
    }
    public String getNome() {
        return nome;
    }
    public Date getDataNascimento() {
        return DataNascimento;
    }
    public Genero getGenero() {
        return genero;
    }
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
    public String getCartaoNacionalSaude() {
        return cartaoNacionalSaude;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    @Override
    public String getLogradouro() {
        // TODO Auto-generated method stub
        return super.getLogradouro();
    }

    /*************************Seters*****************************/
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setCartaoNacionalSaude(String cartaoNacionalSaude) {
        this.cartaoNacionalSaude = cartaoNacionalSaude;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public void setLogradouro(String logradouro) {
        // TODO Auto-generated method stub
        super.setLogradouro(logradouro);
    }

    /*********************HashCode/Equals************************/
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ID == null) ? 0 : ID.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((DataNascimento == null) ? 0 : DataNascimento.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((rg == null) ? 0 : rg.hashCode());
        result = prime * result + ((cartaoNacionalSaude == null) ? 0 : cartaoNacionalSaude.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
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
        Pessoa other = (Pessoa) obj;
        if (ID == null) {
            if (other.ID != null)
                return false;
        } else if (!ID.equals(other.ID))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (DataNascimento == null) {
            if (other.DataNascimento != null)
                return false;
        } else if (!DataNascimento.equals(other.DataNascimento))
            return false;
        if (genero != other.genero)
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (rg == null) {
            if (other.rg != null)
                return false;
        } else if (!rg.equals(other.rg))
            return false;
        if (cartaoNacionalSaude == null) {
            if (other.cartaoNacionalSaude != null)
                return false;
        } else if (!cartaoNacionalSaude.equals(other.cartaoNacionalSaude))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        return true;
    }

    /*************************output*****************************/
    @Override
    public String toString() {
        return "Pessoa [ID=" + ID + ", Nome=" + nome + ", Data de Nascimento=" + DataNascimento + ", Gênero=" + genero
                + ", CPF=" + cpf + ", RG=" + rg + ", Cartão Nacional de Saúde=" + cartaoNacionalSaude + ", Endereco="
                + endereco + "]";
    }

    public void setID(Long iD) {
        ID = iD;
    }

}