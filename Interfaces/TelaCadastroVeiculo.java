import java.awt.*;
import java.util.*;

import javax.swing.*;

public class TelaCadastroVeiculo{

    private ArrayList<Item> duasLista;

    private JFrame frame;
    private JTextArea tfDesc;
    private JTextField pfPeso;
    private JTextField tfVol;
    private JTextField tfNum;
    private JButton btLogin;
    private JRadioButton btSensivel, btSensivel2, btUrgente,btUrgente2;


    
    
    
    public TelaCadastroVeiculo(){
        this.duasLista = new ArrayList<>();        

        frame = new JFrame("Detalhes do Veiculo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        linha1.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
        JLabel lbVei = new JLabel("Tipo de veiculo ");
        ButtonGroup bGroup = new ButtonGroup();
        JRadioButton BtBike = new JRadioButton("Bicicleta");
        JRadioButton BtMoto = new JRadioButton("Motocicleta");
        JRadioButton BtCarro = new JRadioButton("Carro");
        JRadioButton BtCaminhao = new JRadioButton("Caminhão");
        JRadioButton BtCaminhaoRefri = new JRadioButton("Caminhao Refrigerado");
        linha1.add(lbVei);
        linha1.add(BtBike);
        linha1.add(BtMoto);
        linha1.add(BtCarro);
        linha1.add(BtCaminhao);
        linha1.add(BtCaminhaoRefri);
        bGroup.add(BtBike);
        bGroup.add(BtMoto);
        bGroup.add(BtCarro);
        bGroup.add(BtCaminhao);
        bGroup.add(BtCaminhaoRefri);
        
        
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbComporta = new JLabel("Peso comportado pelo veiculo");
        pfPeso = new JTextField(20);
        linha2.add(lbComporta);
        linha2.add(pfPeso);
    
        
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbVol = new JLabel("Volume em Litros comportado pelo veiculo ");
        tfVol = new JTextField(20);
        linha3.add(lbVol);
        linha3.add(tfVol);

        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbNum = new JLabel("Seu numero de telefone ");
        tfNum = new JTextField(20);
        linha4.add(lbNum);
        linha4.add(tfNum);

        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label= new JLabel("Comporta carga sensivel ao calor");
        JLabel lbEmpty3= new JLabel(" ");
        btSensivel= new JRadioButton("Sim ");
        ButtonGroup bGroup2= new ButtonGroup();
        btSensivel2 = new JRadioButton("Não");
        linha5.add(label);
        linha5.add(lbEmpty3);
        linha5.add(btSensivel);
        linha5.add(btSensivel2);
        bGroup2.add(btSensivel);
        bGroup2.add(btSensivel2);

        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label2= new JLabel("O envio pode ser feito com urgencia");
        JLabel lbEmpty4= new JLabel(" ");
        btUrgente= new JRadioButton("Sim ");
        ButtonGroup bGroup3= new ButtonGroup();
        btUrgente2 = new JRadioButton("Não");
        linha6.add(label2);
        linha6.add(lbEmpty4);
        linha6.add(btUrgente);
        linha6.add(btUrgente2);
        bGroup3.add(btUrgente);
        bGroup3.add(btUrgente2);

        JPanel linha7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btImprime = new JButton("Imprimir");
        JLabel lbEmpty2 = new JLabel(" ");
        btLogin = new JButton("Salvar");
        linha7.add(btLogin); 
        linha7.add(lbEmpty2);
        linha7.add(btImprime);

    //ACTIONLISTENER ZONE
        btLogin.addActionListener(e -> {
            try {
                String nome = tfDesc.getText();
                int nroContato = (int)Double.parseDouble(tfNum.getText());
                

            } catch (Exception exc) {
                JOptionPane.showMessageDialog(null, "Alguma informação inserida esta errada", "Erro", JOptionPane.WARNING_MESSAGE);
            }
            
            if(btLogin!= null)
            System.out.println("Parametros Salvos");


        });
        
        

        


        
        JPanel jpRegistro = new JPanel();
        jpRegistro.setLayout(new BoxLayout(jpRegistro,BoxLayout.Y_AXIS));

        jpRegistro.add(linha1);
        jpRegistro.add(linha2);
        jpRegistro.add(linha3);
        jpRegistro.add(linha4);
        jpRegistro.add(linha5);
        jpRegistro.add(linha6);
        JScrollPane jsp = new JScrollPane(jpRegistro);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.PAGE_AXIS));

        contentPane.add(jsp);
        contentPane.add(linha7);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(false);
        }
    
    public void show(){
        frame.setVisible(true);
    }
}
