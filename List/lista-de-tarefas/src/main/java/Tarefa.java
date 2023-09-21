public class Tarefa {
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public void setDescricao(String decricao) {
        this.descricao = decricao;
    }

    public String getDecricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
