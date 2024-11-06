
public class Cliente {
    private String nome;
    private int nroContato;
    private Item item;

    public Cliente(String nome, int nroContato, Item item) {
        this.nome = nome;
        this.nroContato = nroContato;
        this.item = item;
    }

    public String getNome() {
        return nome;
    }

    public Item getItem() {
        return item;
    }

}
