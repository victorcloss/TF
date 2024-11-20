import java.awt.*;
import java.util.*;

import javax.swing.*;

public class TelaCadastroProduto{

    private ArrayList<Item> umaLista;

    private JTextArea tfDesc;
    private JTextField pfPeso;
    private JTextField tfVol;
    private JTextField tfValor;
    private JButton btLogin;
    private JRadioButton btSensivel, btSensivel2, btUrgente,btUrgente2;


    
    
    
    public TelaCadastroProduto(){
        this.umaLista = new ArrayList<>();        

        JFrame frame = new JFrame("Detalhes do Produto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        linha1.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
        JLabel lbDesc = new JLabel("Descricao ");
        tfDesc = new JTextArea(10, 20);
        linha1.add(lbDesc);
        linha1.add(tfDesc);
        
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbPass = new JLabel("Peso em KiloGramas ");
        pfPeso = new JTextField(20);
        linha2.add(lbPass);
        linha2.add(pfPeso);
    
        
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbVol = new JLabel("Volume em Litros ");
        tfVol = new JTextField(20);
        linha3.add(lbVol);
        linha3.add(tfVol);

        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbValor = new JLabel("Valor aproximado da carga ");
        tfValor = new JTextField(20);
        linha4.add(lbValor);
        linha4.add(tfValor);

        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label= new JLabel("Sensivel a calor");
        JLabel lbEmpty3= new JLabel(" ");
        btSensivel= new JRadioButton("Sim ");
        ButtonGroup bGroup= new ButtonGroup();
        btSensivel2 = new JRadioButton("Não");
        linha5.add(label);
        linha5.add(lbEmpty3);
        linha5.add(btSensivel);
        linha5.add(btSensivel2);
        bGroup.add(btSensivel);
        bGroup.add(btSensivel2);

        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label2= new JLabel("O envio é urgente");
        JLabel lbEmpty4= new JLabel(" ");
        btUrgente= new JRadioButton("Sim ");
        ButtonGroup bGroup2= new ButtonGroup();
        btUrgente2 = new JRadioButton("Não");
        linha6.add(label2);
        linha6.add(lbEmpty4);
        linha6.add(btUrgente);
        linha6.add(btUrgente2);
        bGroup2.add(btUrgente);
        bGroup2.add(btUrgente2);

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
                String descricao = tfDesc.getText();
                float peso = (float) Double.parseDouble(pfPeso.getText()); 
                float volume = (float) Double.parseDouble(tfVol.getText());
                float valor = (float) Double.parseDouble(tfValor.getText());
                boolean sensivel = btSensivel.isSelected();
                boolean urgente = btUrgente.isSelected();
                umaLista.add(new Produto(descricao,peso,volume,valor,sensivel,urgente));

            } catch (Exception exc) {
                JOptionPane.showMessageDialog(null, "Alguma informação inserida esta errada", "Erro", JOptionPane.WARNING_MESSAGE);
            }
            
            if(btLogin!= null)
            System.out.println("Parametros Salvos");


        });
        
        

        btImprime.addActionListener(e -> {

            for(Produto q : umaLista)
                System.out.println(q);

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
        frame.setVisible(true);
        }

}
