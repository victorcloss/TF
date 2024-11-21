
public class Cliente {
    private String nome;
    private String nroContato;
    private Item item;

    public Cliente(String nome, String nroContato) {
        this.nome = nome;
        this.nroContato = nroContato;

    }

    public String getNome() {
        return nome;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item i){
        this.item = i;
    }

    public String getNroContato() {
        return nroContato;
    }
}
