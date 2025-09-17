package br.com.estudando.java._1fundamentos;

public class _07TiposPrimitivos {

    public static void main(String[] args) {
        boolean compraAprovada = true;

        boolean clienteBloqueado = false;

        System.out.println("Compra aprovada?:" + compraAprovada);
        System.out.println("Cliente bloqueado?:" + clienteBloqueado);

        int quantidadeEstoque = 10;
        int pedidoCliente = 15;

        boolean estoqueSuficiente  = quantidadeEstoque >= pedidoCliente;

        System.out.println("Estoque suficiente:" + estoqueSuficiente);

        //byte short numeros menores


        //float e double -> casas decimais (Não deve ser usado para dinheiro, usar Bigdecimal, pode perder precisão)

        float taxa = 1947.05f; // obrigatório usar o F;
    }





}
