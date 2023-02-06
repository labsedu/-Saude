package com.mais.saude.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mais.saude.models.Endereco;

public class EnderecoService {
    
    private final String url = "https://viacep.com.br/ws/{cep}/json/";
    public ResponseEntity<Endereco> buscaEnderecoPorCep (String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Endereco> endereco = restTemplate.getForEntity(url, Endereco.class, cep);
        return endereco;
    }
}
