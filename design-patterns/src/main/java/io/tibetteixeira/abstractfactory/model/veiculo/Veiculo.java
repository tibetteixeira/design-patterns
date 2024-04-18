package io.tibetteixeira.abstractfactory.model.veiculo;

import io.tibetteixeira.abstractfactory.model.componente.carro.chassi.Chassi;
import io.tibetteixeira.abstractfactory.model.componente.carro.motor.Motor;
import io.tibetteixeira.abstractfactory.model.componente.carro.transmissao.Transmissao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Veiculo {
    private Chassi chassi;
    private Motor motor;
    private Transmissao transmissao;
    private String marca;
    private String modelo;
    private Integer ano;

    protected Veiculo(Chassi chassi, Motor motor, Transmissao transmissao) {
        this.chassi = chassi;
        this.motor = motor;
        this.transmissao = transmissao;
    }

    public void mostrarEspecificao() {
        chassi.especificao();
        motor.especificao();
        transmissao.especificao();
    }
}
