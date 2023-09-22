import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{
    List<Pessoa> listapessoa;
    public void adicionarPessoa(String nome, int idade, double altura){
        listapessoa = new ArrayList<>();
        listapessoa.add(new Pessoa(nome, idade, altura));
    }
    public List ordenarPorIdade(List listapessoa){
        List <Pessoa> pessoasPorIdade = new ArrayList<>(listapessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List ordenarPorAltura(){
        List <Pessoa> pessoasPorAltura = new ArrayList<>();


    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }



}
