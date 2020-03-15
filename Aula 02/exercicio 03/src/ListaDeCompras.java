import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    public static void main(String[] args) {

        Itens item1 = new Itens("Arroz", Segmento.ALIMENTACAO, 4.50, 2);
        item1.setValorFinal
        Itens item2 = new Itens("Pasta de dente", Segmento.HIGIENE, 3.89, 3);
        Itens item3 = new Itens("Ovos - duzia", Segmento.ALIMENTACAO, 10.99, 1);
        Itens item4 = new Itens("Alvex", Segmento.LIMPEZA, 4.55, 1);

        List<Itens> itens= new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);

        private static double valorTotalSobItem (List<Itens> itens){
            double valorTotal = 0;
            for (Itens item: itens){
                valorTotal += item.getValorFinal();
            }
            return valorTotal / itens.size();
        }
    }
}
