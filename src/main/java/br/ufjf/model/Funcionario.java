package br.ufjf.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Funcionario {
    private double salario;
    private double adicionalInsalubridade;

    public double calcularSalario() {
        return RH.calcularSalario(salario,adicionalInsalubridade);
    }
}
