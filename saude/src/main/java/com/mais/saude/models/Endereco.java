package com.mais.saude.models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class Endereco {
    
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;


    /**********************Construtores**************************/
    public Endereco() {
    }
    public Endereco(String cep) {
        this.cep = cep;
    }

    /*************************Metodos****************************/
    public void buscarInformacoesCep() throws Exception {
        URL url= new URL("https://viacep.com.br/ws/" + cep + "/json/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status  = con.getResponseCode();
        if (status == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            JSONObject json = new JSONObject(content.toString());
            logradouro = json.getString("logradouro");
            complemento = json.getString("complemento");
            bairro = json.getString("bairro");
            localidade = json.getString("localidade");
            uf = json.getString("uf");
            ibge = json.getString("ibge");
            gia = json.getString("gia");
            ddd = json.getString("ddd");
            siafi = json.getString("siafi");
        } else {
            throw new Exception("Não foi possível recuperar as informações do CEP " + cep);
        }
    }
    
    /*************************Geters*****************************/
    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public String getDdd() {
        return ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    /*************************Seters*****************************/
    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    /*********************HashCode/Equals************************/
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
        result = prime * result + numero;
        result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
        result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
        result = prime * result + ((localidade == null) ? 0 : localidade.hashCode());
        result = prime * result + ((uf == null) ? 0 : uf.hashCode());
        result = prime * result + ((ibge == null) ? 0 : ibge.hashCode());
        result = prime * result + ((gia == null) ? 0 : gia.hashCode());
        result = prime * result + ((ddd == null) ? 0 : ddd.hashCode());
        result = prime * result + ((siafi == null) ? 0 : siafi.hashCode());
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
        Endereco other = (Endereco) obj;
        if (cep == null) {
            if (other.cep != null)
                return false;
        } else if (!cep.equals(other.cep))
            return false;
        if (logradouro == null) {
            if (other.logradouro != null)
                return false;
        } else if (!logradouro.equals(other.logradouro))
            return false;
        if (numero != other.numero)
            return false;
        if (complemento == null) {
            if (other.complemento != null)
                return false;
        } else if (!complemento.equals(other.complemento))
            return false;
        if (bairro == null) {
            if (other.bairro != null)
                return false;
        } else if (!bairro.equals(other.bairro))
            return false;
        if (localidade == null) {
            if (other.localidade != null)
                return false;
        } else if (!localidade.equals(other.localidade))
            return false;
        if (uf == null) {
            if (other.uf != null)
                return false;
        } else if (!uf.equals(other.uf))
            return false;
        if (ibge == null) {
            if (other.ibge != null)
                return false;
        } else if (!ibge.equals(other.ibge))
            return false;
        if (gia == null) {
            if (other.gia != null)
                return false;
        } else if (!gia.equals(other.gia))
            return false;
        if (ddd == null) {
            if (other.ddd != null)
                return false;
        } else if (!ddd.equals(other.ddd))
            return false;
        if (siafi == null) {
            if (other.siafi != null)
                return false;
        } else if (!siafi.equals(other.siafi))
            return false;
        return true;
    }

    /*************************output*****************************/
    @Override
    public String toString() {
        return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
                + complemento + ", bairro=" + bairro + ", localidade=" + localidade + ", uf=" + uf + ", ibge=" + ibge
                + ", gia=" + gia + ", ddd=" + ddd + ", siafi=" + siafi + "]";
    }
}
