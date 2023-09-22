import java.util.ArrayList;
import java.util.List;

public class ListadeTarefas {


    List<Tarefa> listaTarefas;

    public ListadeTarefas() {
        listaTarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        this.listaTarefas.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        List <Tarefa> listaRemocao = new ArrayList<>();
        for (Tarefa t:listaTarefas) {
            if(t.getDecricao().equals(descricao)){
                listaRemocao.add(t);
            }
        }
        this.listaTarefas.removeAll(listaRemocao);
    }

    public int obterNumeroTotalTarefas(){
       return this.listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        if (!listaTarefas.isEmpty()) {
            System.out.println(listaTarefas);
        } else {
            System.out.println("A lista está vazia");
        }
    }


    public static void main(String[] args) {
        ListadeTarefas lista = new ListadeTarefas();

        lista.adicionarTarefa("Ir para bordo");
        lista.adicionarTarefa("tarefa 3");
        lista.adicionarTarefa("tarefa 4");
        lista.adicionarTarefa("tarefa 4");
        lista.adicionarTarefa("tarefa 6");
        lista.adicionarTarefa("tarefa 7");
        System.out.println(lista.obterNumeroTotalTarefas());
        lista.adicionarTarefa("tarefa 7");
        lista.obterDescricoesTarefas();
        lista.removerTarefa("tarefa 4");
        lista.obterDescricoesTarefas();
        lista.removerTarefa("tarefa 7");
        lista.obterDescricoesTarefas();
        System.out.println(lista.obterNumeroTotalTarefas());


    }

}
