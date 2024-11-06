public abstract class Veiculo {
    private double volumeMax, pesoMax;
    private boolean sensTemp;

    public Veiculo() {
        this.volumeMax = 0;
        this.pesoMax = 0;
        this.sensTemp = false;
    }

    public abstract double calcTarifaComposta();
}

