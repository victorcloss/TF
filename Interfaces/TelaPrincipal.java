import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.Border;

public class TelaPrincipal extends JFrame{
    private JFrame princ;
    private TelaSolicitarViagem tsv;
    private TelaCadastroVeiculo tcv;
    private TelaCadastroCliente tcc;

    public TelaPrincipal(){
        inicializar();
    }
    
    private void inicializar(){
        princ = new JFrame();
        tsv = new TelaSolicitarViagem();
        tcv = new TelaCadastroVeiculo();
        tcc = new TelaCadastroCliente();

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
        JButton salvar = new JButton("Salvar Dados");
        panel2.add(salvar);
        JButton carregar = new JButton("Carregar Dados");
        panel2.add(carregar);
        princ.add(panel2, BorderLayout.SOUTH);

         
        // DefaultListModel<String> listModel = new DefaultListModel<>();
        // listModel.addElement("Item 1");
        // listModel.addElement("Item 2");
        // listModel.addElement("Item 3");
        // JList<String> list = new JList<>(listModel);
        // list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // JScrollPane listScrollPane = new JScrollPane(list);
        // princ.add(listScrollPane, BorderLayout.CENTER);
        princ.setVisible(true); 
        
    // ActionListener Area
        cc.addActionListener(e ->{
            tcc.show();
        });

        cv.addActionListener(e -> {
            tcv.show();
        });

        pt.addActionListener(e ->{
            tsv.show();
        });
        cv2.addActionListener(e->{
            
        });
        cdi.addActionListener(e->{

        });
    }
}