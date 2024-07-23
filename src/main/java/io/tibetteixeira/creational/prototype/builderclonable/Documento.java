package io.tibetteixeira.creational.prototype.builderclonable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Documento {

    private final String nome;
    private final String tipo;
    private final String visibilidade;
    private final String conteudo;

    public Documento clone()  {
        return new Documento(nome, tipo, visibilidade, conteudo);
    }

    public Builder cloneBuilder() {
        return new Builder(nome, tipo, visibilidade, conteudo);
    }

    public void imprimir() {
        System.out.println(this);
    }

    public static class Builder {
        private String nome;
        private String tipo;
        private String visibilidade;
        private String conteudo;

        private Builder(String nome, String tipo, String visibilidade, String conteudo) {
            this.nome = nome;
            this.tipo = tipo;
            this.visibilidade = visibilidade;
            this.conteudo = conteudo;
        }

        public Builder comNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder comTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder comVisibilidade(String visibilidade) {
            this.visibilidade = visibilidade;
            return this;
        }

        public Builder comConteudo(String conteudo) {
            this.conteudo = conteudo;
            return this;
        }

        public Documento build() {
            return new Documento(nome, tipo, visibilidade, conteudo);
        }
    }
}