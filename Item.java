public class Item {
    private boolean sensTemp, urgente;
    private double peso, volume, valor;
    // peso eh informado em quilogramas e o volume informado em cm3 e valor em reais

    public Item(boolean sensTemp, boolean urgente, double peso, double volume, double valor) {
        this.sensTemp = sensTemp;
        this.urgente = urgente;
        this.peso = peso;
        this.volume = volume;
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public double getVolume() {
        return volume;
    }

    public double getValor() {
        return valor;
    }

    public boolean isSensTemp() {
        return sensTemp;
    }

    public boolean isUrgente() {
        return urgente;
    }


}
