package com.mais.saude.TDD;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.mais.saude.models.Pessoa;
import com.mais.saude.models.enuns.Genero;

public class PessoaTest {
    Pessoa pessoa = new Pessoa();
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    Date dataNascimento;

    @Test
    public void testPessoa() throws ParseException {
        pessoa.setNome("Eduardo Felizardo Cândido");
        dataNascimento = format.parse("11/10/1976");
        pessoa.setDataNascimento(dataNascimento);
        pessoa.setGenero(Genero.MASCULINO);
        pessoa.setCpf("123.456.789-89");
        pessoa.setRg("87.895.745-9");
        pessoa.setCartaoNacionalSaude("8088.8088.8888.6787");
        pessoa.setLogradouro("Rua Jose Maria");;

        String nomeEsperado = "Eduardo Felizardo Cândido";
        Date dataEsperada = format.parse("11/10/1976");
        String cpfEsperado = "123.456.789-89";
        String rgEsperado = "87.895.745-9";
        String cnsEsperado = "8088.8088.8888.6787";
        String logradouroesperado = "Rua Jose Maria";

        String nome = pessoa.getNome();
        Date data = pessoa.getDataNascimento();
        String cpf = pessoa.getCpf();
        String rg = pessoa.getRg();
        String cns = pessoa.getCartaoNacionalSaude();
        String logradouro = pessoa.getLogradouro();

        assertEquals(nomeEsperado, nome);
        assertEquals(dataEsperada, data);
        assertEquals(Genero.MASCULINO, pessoa.getGenero());
        assertEquals(cpfEsperado, cpf);
        assertEquals(rgEsperado, rg);
        assertEquals(cnsEsperado, cns);
        assertEquals(logradouroesperado, logradouro);
    }
    @Test
    public void testCalculaIdade() throws ParseException {
        Date dataNascimento = format.parse("11/10/1976");
        int idadeEsperada = 46;
        int idadeCalulada = pessoa.calcularIdade(dataNascimento);
        assertEquals(idadeEsperada, idadeCalulada);
    }

    @Test
    public void testTelefoneCelularAdiconar() {
        pessoa.adicionarTelefone("11 96060-8008");
        pessoa.adicionarTelefone("11 96060-8009");

        String telefoneEsperdo1 ="11 96060-8008";
        String telefoneEsperdo2 ="11 96060-8009";

        assertEquals(telefoneEsperdo1, pessoa.getTelefonesCelulares());
        assertEquals(telefoneEsperdo2, pessoa.getTelefonesCelulares());

    }
}
