import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinho;

    public CarrinhoDeCompras(){
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List <Item> itemsParaRemover = new ArrayList<>();
        for(Item i:carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);}
        }
        carrinho.removeAll(itemsParaRemover);
    }
    public double calcularValorTotal() {
        double total = 0;
        for (Item i : carrinho) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        if(!carrinho.isEmpty())
            System.out.println(carrinho);
        else System.out.println("o Carrinho está vazio.");
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("biscoito", 3,3);
        System.out.println(compras.calcularValorTotal());
        compras.exibirItens();
        compras.removerItem("biscoito");
        compras.exibirItens();
    }



}
