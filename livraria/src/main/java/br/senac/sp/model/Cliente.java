package br.senac.sp.model;

import java.time.LocalDate;
// import br.senac.sp.enumeration.Escolaridade;
// import br.senac.sp.enumeration.EstadoCivil;


public class Cliente {
    private int id;
    private String nome;
    private LocalDate nascimento;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private String endereco;
    private EstadoCivil estadoCivil;
    private Escolaridade escolaridade;
}