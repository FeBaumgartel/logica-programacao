/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prof;

/**
 *
 * @author felipe_baumgartel
 */
public class Calculator {

    public enum Operation {

        ADD, SUBTRACT, DIVIDE, MULTIPLY, RESULT
    };
    private double a;
    private Operation operation;
    private final double MAX_VALUE = 1.0E100;
    private final double MIN_VALUE = 1.0E-100;

    public Calculator() {
        clear();
    }

    public void clear() {
        a = 0;
        operation = Operation.ADD;
    }

    // Muda a operação a ser realizada
    public void changeOperation(Operation op) {
        operation = op;
    }

    // Caso não ocorra erros, muda o valor de 'a' para 'a(operação)b', onde
    // operação = {+,-,*,/}.
    public void changeNum(double b) throws IllegalArgumentException {
        double u = operationAns(b);
        a = u;
    }

    // Retorna a string correspondente ao valor de 'a' caso a parte fracionária
    // de a for maior que 1.0E-100 ou retorna '(int)a' caso contrário.
    public String getAns() {
        String ans;
        int u = (int) a;
        if (Math.abs(a - u) < MIN_VALUE) {
            ans = String.valueOf(u);
            a = u;
        } else {
            ans = String.valueOf(a);
        }
        return ans;
    }

    // Retorna o valor de 'a(operação)b' ou lança uma excessão caso ocorra
    // divisão por zero.
    private double operationAns(double b) throws IllegalArgumentException {
        double ret = 0;
        if (operation == Operation.ADD || operation == Operation.RESULT) {
            ret = a + b;
        } else if (operation == Operation.SUBTRACT) {
            ret = a - b;
        } else if (operation == Operation.MULTIPLY) {
            ret = a * b;
        } else if (operation == Operation.DIVIDE) {
            //Verifica se ocorre divisão por zero
            if (b == 0) {
                if (a == 0) {
                    throw new IllegalArgumentException("Indeterminado");
                }
                throw new IllegalArgumentException("Infinito");
            } else {
                ret = a / b;
            }
        }
        // Verifica se a resposta ultrapassa o valor máximo permitido
        if (ret > MAX_VALUE) {
            throw new IllegalArgumentException("Estouro");
        }
        return ret;
    }

}
