package io.tibetteixeira.creational.prototype.clonable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Documento {

    private String nome;
    private String tipo;
    private String visibilidade;
    private String conteudo;

    public Documento clone()  {
        return new Documento(nome, tipo, visibilidade, conteudo);
    }

    public void imprimir() {
        System.out.println(this);
    }
}
