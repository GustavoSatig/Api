package br.com.senai.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaModel {

    private long id;
    private String nome;
    private String email;
    private String telefone;

}
