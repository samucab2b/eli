package com.senai.eli.Enum;

import lombok.Getter;

@Getter
public enum Sexo {

    NAO_INFORMADO(0, 'N', "Não informado"),
    MASCULINO(1, 'M', "Masculino"),
    FEMININO(2, 'F', "Feminino");
    

    private final int codigo;
    private final char abreviacao;
    private final String descricao;

    Sexo(int codigo, char abreviacao, String descricao){
        this.codigo = codigo;
        this.abreviacao = abreviacao;
        this.descricao = descricao;
    }

}
