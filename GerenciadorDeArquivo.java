
import java.io.*;

public class GerenciadorDeArquivo {
    private BufferedWriter writer;

    
    public GerenciadorDeArquivo() throws IOException {
            this.writer = new BufferedWriter(new FileWriter("Registro.csv"));
        }
    
    public void escreverNoArquivo(String txt){
        try {
            writer.write("\n"+txt);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}