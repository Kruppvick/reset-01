public class Início {

    public static void main(String[] args){

        Calculadora calculadoraDeIdades = new Calculadora ();
        int somaDasIdades=  calculadoraDeIdades.somar (33, 54);
        System.out.println( somaDasIdades);

        int subtracaoDasIdades=  calculadoraDeIdades.subtrair (23, 64);
            System.out.println( subtracaoDasIdades);

        int multiplicacaoDasIdades=  calculadoraDeIdades.multiplicar(78, 5);
        System.out.println( multiplicacaoDasIdades);

        int divisaoDasIdades=  calculadoraDeIdades.dividir(10, 2);
        System.out.println( divisaoDasIdades);

        Comparador menorQue = new Comparador();
        boolean valor = menorQue.comparar(50, 23);
        System.out.println(valor);
    }

}
