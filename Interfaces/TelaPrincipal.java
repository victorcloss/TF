import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.Border;

public class TelaPrincipal extends JFrame{
    JFrame princ;

    public TelaPrincipal(){
        inicializar();
    }
    
    private void inicializar(){
        princ = new JFrame();
        princ.setLocationRelativeTo(null);
        princ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        princ.setLayout(new BorderLayout(10,5));
        princ.setSize(800, 500);
        princ.setTitle("Transportes Para Quem Precisa");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, 3));
        Button cc = new Button("Cadastro de Cliente");
        panel.add(cc);
        Button cv = new Button("Cadastro de Veiculo");
        panel.add(cv);
        Button pt = new Button("Pedir Transporte");
        panel.add(pt);
        Button cv2 = new Button("Consultar Viagens");
        panel.add(cv2);
        Button cdi = new Button("Carregar Dados Iniciais");
        panel.add(cdi);
        princ.add(panel, BorderLayout.WEST);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        Button salvar = new Button("Salvar Dados");
        panel2.add(salvar);
        Button carregar = new Button("Carregar Dados");
        panel2.add(carregar);
        princ.add(panel2, BorderLayout.SOUTH);

        princ.setVisible(true);
        
    }
}