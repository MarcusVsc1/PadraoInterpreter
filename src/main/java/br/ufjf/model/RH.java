package br.ufjf.model;

import br.ufjf.interfaces.InterpretadorExpressao;
import br.ufjf.interpreter.InterpretadorExpressoesAritmeticas;

public class RH {
    public static String formula = "salario * adicionalInsalubridade + salario";

    public static double calcularSalario(double salario, double adicionalInsalubridade) {
        String expressao;
        expressao = formula.replace("salario", Double.toString(salario));
        expressao = expressao.replace("adicionalInsalubridade", Double.toString(adicionalInsalubridade));
        InterpretadorExpressao interpretadorExpressao = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretadorExpressao.interpretar();
    }
}
