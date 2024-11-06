
public class Viagem {
    private double distancia, valor;

    public Viagem(double distancia) {
        this.distancia = distancia;
        
    }

    public double calcTarifaNormal(Item item){
        this.valor = distancia * 2; 
        this.valor += (item.getPeso() == (int) item.getPeso() ) ? (int) item.getPeso() : (int) item.getPeso() + 1; 
        if(item.isSensTemp()){
            this.valor += 10;
        }
        if(item.isUrgente()){
            this.valor += 10; 
        }
        return this.valor;
    }

    
}
