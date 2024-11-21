import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class TelaCadastroCliente {
    private List<Cliente> lstClnt;
    private JFrame frame;
    private JTextField nomeField;
    private JTextField telefoneField;

    public TelaCadastroCliente() {
        lstClnt = new ArrayList<>();
        frame = new JFrame("Cadastro de Cliente");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 400);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);
        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField(20);
        JButton cadastrarButton = new JButton("Cadastrar");

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });

        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(telefoneLabel);
        frame.add(telefoneField);
        frame.add(cadastrarButton);

        frame.setVisible(false);
    }

    private void cadastrarCliente() {
        String nome = nomeField.getText();
        String telefone = telefoneField.getText();

        if (nome.isEmpty() || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Cliente cliente : lstClnt) {
            if (cliente.getNroContato().equals(telefone)) {
                JOptionPane.showMessageDialog(frame, "Número de telefone já cadastrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        Cliente novoCliente = new Cliente(nome, telefone);
        lstClnt.add(novoCliente);
        JOptionPane.showMessageDialog(frame, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        nomeField.setText("");
        telefoneField.setText("");
    }

    public void show(){
        frame.setVisible(true);
    }
}


