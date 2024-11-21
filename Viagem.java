
public class Viagem {
    private double distancia, valor;
    private Cliente cliente;

    public Viagem(double distancia, Cliente cliente){ 
        this.distancia = distancia;
        this.cliente = cliente;
    }

    public double calcTarifaNormal(Cliente cl){
        this.valor = this.distancia * 2; 
        this.valor += (cl.getItem().getPeso() == (int) cl.getItem().getPeso() ) ? (int) cl.getItem().getPeso() : (int) cl.getItem().getPeso() + 1; 
        if(cl.getItem().isSensTemp()){
            this.valor += 10;
        }
        if(cl.getItem().isUrgente()){
            this.valor += 10; 
        }
        return this.valor;
    }

    

}
