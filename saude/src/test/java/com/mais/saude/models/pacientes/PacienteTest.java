package com.mais.saude.models.pacientes;

import org.junit.Test;

import com.mais.saude.models.enuns.Genero;

import static org.junit.Assert.*;

import java.util.*;
import java.text.*;

public class PacienteTest {

    private Paciente paciente = new Paciente();
    private Date dataNascimento;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public void dadosPaciente() throws ParseException, Exception  {
        paciente.setNome("Alex Silva");
        dataNascimento = format.parse("21/10/1987");
        paciente.setDataNascimento(dataNascimento);
        paciente.setGenero(Genero.MASCULINO);
        paciente.setRg("12.125.452.-89");
        paciente.setCartaoNacionalSaude("8888.8888.8888.0088");
        paciente.setCep("05171160");
        paciente.buscarInformacoesCep();
        paciente.setNumero(123);
        paciente.setComplemento(null);
    }

    public void dadosEsperados() throws ParseException {
        String nomeEsperado = "Alex Silva";
        Date dataEsperada = format.parse("21/10/1987");
        paciente.setGenero(Genero.MASCULINO);
        paciente.setRg("12.125.452.-89");
        paciente.setCartaoNacionalSaude("8888.8888.8888.0088");
        paciente.setCep("05171160");
        paciente.setNumero(123);
        paciente.setComplemento(null);
        
    }

    @Test
    public void testGetPaciente() throws ParseException, Exception  {
        dadosPaciente();
        String nomeEsperado = "Alex Silva";
        Date dataEsperada = format.parse("21/10/1987");
        paciente.setGenero(Genero.MASCULINO);
        paciente.setRg("12.125.452.-89");
        paciente.setCartaoNacionalSaude("8888.8888.8888.0088");
        paciente.setCep("05171160");
        paciente.setNumero(123);
        paciente.setComplemento(null);

        assertEquals(nomeEsperado, paciente.getNome());
        assertEquals(dataEsperada, paciente.getDataNascimento());
        assertEquals(Genero.MASCULINO, paciente.getGenero());
    }

}
