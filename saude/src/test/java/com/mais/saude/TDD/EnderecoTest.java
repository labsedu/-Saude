package com.mais.saude.TDD;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

import com.mais.saude.models.Endereco;

public class EnderecoTest {
    Endereco cepEndereco = new Endereco();

    @Test
    public void testBuscaCepPositivo() throws Exception {
        cepEndereco.setCep("05122010");
        cepEndereco.buscarInformacoesCep();

        String cepEsperado = "05122010";
        String logradouroEsperado = "Rua Professor José Maria Calazans Nogueira";
        String complementoEsperado = "";
        String bairroEsperado = "Parque São Domingos";
        String localidadeEsperado = "São Paulo";
        String ufEsperado = "SP";
        String ibgeEsperado = "3550308";
        String giaEsperado = "1004";
        String dddEsperado = "11";
        String siafiEsperado = "7107";

        assertEquals(cepEsperado, cepEndereco.getCep());
        assertEquals(logradouroEsperado, cepEndereco.getLogradouro());
        assertEquals(complementoEsperado, cepEndereco.getComplemento());
        assertEquals(bairroEsperado, cepEndereco.getBairro());
        assertEquals(localidadeEsperado, cepEndereco.getLocalidade());
        assertEquals(ufEsperado, cepEndereco.getUf());
        assertEquals(ibgeEsperado, cepEndereco.getIbge());
        assertEquals(giaEsperado, cepEndereco.getGia());
        assertEquals(dddEsperado, cepEndereco.getDdd());
        assertEquals(siafiEsperado, cepEndereco.getSiafi());
    }

    @Test
    public void testBuscaCepConfirmarConsulta() throws Exception {
        cepEndereco.setCep("60010010");
        cepEndereco.buscarInformacoesCep();

        String cepEsperado = "05122010";
        String logradouroEsperado = "Rua Professor José Maria Calazans Nogueira";
        String complementoEsperado = "";
        String bairroEsperado = "Parque São Domingos";
        String localidadeEsperado = "São Paulo";
        String ufEsperado = "SP";
        String ibgeEsperado = "3550308";
        String giaEsperado = "1004";
        String dddEsperado = "11";
        String siafiEsperado = "7107";

        assertNotEquals(cepEsperado, cepEndereco.getCep());
        assertNotEquals(logradouroEsperado, cepEndereco.getLogradouro());
        assertEquals(complementoEsperado, cepEndereco.getComplemento());
        assertNotEquals(bairroEsperado, cepEndereco.getBairro());
        assertNotEquals(localidadeEsperado, cepEndereco.getLocalidade());
        assertNotEquals(ufEsperado, cepEndereco.getUf());
        assertNotEquals(ibgeEsperado, cepEndereco.getIbge());
        assertNotEquals(giaEsperado, cepEndereco.getGia());
        assertNotEquals(dddEsperado, cepEndereco.getDdd());
        assertNotEquals(siafiEsperado, cepEndereco.getSiafi());
    }

    @Test
    public void testBuscarInformacoesException() {
        
        try {
            cepEndereco.setCep("05122810");
            cepEndereco.buscarInformacoesCep();
            fail("Deveria ter lançado EnderecoNaoEncontradoException");
        } catch (Exception e) {
            // Sucesso, a exception foi lançada corretamente
        }
    }
}
