package br.senac.sp.view;

import br.senac.sp.enumeration.Escolaridade;
import br.senac.sp.enumeration.EstadoCivil;
import br.senac.sp.model.Cliente;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ViewCliente extends JFrame {
    JLabel lbId, lbCpf, lbNome, lbNascimento, lbTelefone, lbEmail, lbEndereco, lbEstadoCivil, lbEscolaridade;
    JTextField tfId, tfCpf, tfNome, tfTelefone, tfEmail;
    JFormattedTextField tfNascimento;
    MaskFormatter mskNascimento;
    Font fontePadrao;
    JTextArea taEndereco;
    JComboBox<Escolaridade> cbEscolaridade;
    JComboBox<EstadoCivil> cbEstadoCivil;
    JButton btSalvar;
    Cliente cliente;

    public ViewCliente() {
        initComponents();
        actions();
    }

    public static void main(String[] args) {
        new ViewCliente();
    }

    // neste método "construíremos a tela"
    private void initComponents() {
        fontePadrao = new Font("Tahoma", Font.PLAIN, 12);

        // lbId
        lbId = new JLabel("ID: ");
        lbId.setBounds(20, 20, 30, 25);
        lbId.setFont(fontePadrao);

        // tfId
        tfId = new JTextField();
        tfId.setBounds(60, 20, 40, 25);
        tfId.setEnabled(false);
        tfId.setFont(fontePadrao);
        tfId.setHorizontalAlignment(SwingConstants.CENTER);

        // lbNome
        lbNome = new JLabel("Nome: ");
        lbNome.setBounds(110, 20, 50, 25);
        lbNome.setFont(fontePadrao);

        // tfNome
        tfNome = new JTextField();
        tfNome.setBounds(170, 20, 250, 25);
        tfNome.setFont(fontePadrao);

        // lbCpf
        lbCpf = new JLabel("CPF: ");
        lbCpf.setBounds(430, 20, 40, 25);
        lbCpf.setFont(fontePadrao);

        // tfCpf
        tfCpf = new JTextField();
        tfCpf.setBounds(480, 20, 150, 25);
        tfCpf.setFont(fontePadrao);

        // lbNascimento
        lbNascimento = new JLabel("Nascimento:");
        lbNascimento.setBounds(20, 55, 70, 25);
        lbNascimento.setFont(fontePadrao);

        // mskNascimento
        try {
            mskNascimento = new MaskFormatter("##/##/####");
            mskNascimento.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        // tfNascimento
        tfNascimento = new JFormattedTextField(mskNascimento);
        tfNascimento.setBounds(100, 55, 90, 25);
        tfNascimento.setFont(fontePadrao);
        tfNascimento.setHorizontalAlignment(SwingConstants.CENTER);

        // lbTelefone:
        lbTelefone = new JLabel("Tel:");
        lbTelefone.setBounds(200, 55, 30, 25);
        lbTelefone.setFont(fontePadrao);

        // tfTelefone
        tfTelefone = new JTextField();
        tfTelefone.setBounds(230, 55, 90, 25);
        tfTelefone.setFont(fontePadrao);

        // lbEmail:
        lbEmail = new JLabel("E-mail:");
        lbEmail.setBounds(330, 55, 50, 25);
        lbEmail.setFont(fontePadrao);

        // tfEmail
        tfEmail = new JTextField();
        tfEmail.setBounds(380, 55, 250, 25);
        tfEmail.setFont(fontePadrao);

        // lbEscolaridade
        lbEscolaridade = new JLabel("Escolaridade: ");
        lbEscolaridade.setBounds(20, 90, 90, 25);
        lbEscolaridade.setFont(fontePadrao);

        // cbEscolaridade
        cbEscolaridade = new JComboBox<Escolaridade>(Escolaridade.values());
        cbEscolaridade.setBounds(100, 90, 170, 25);
        cbEscolaridade.setFont(fontePadrao);
        cbEscolaridade.setSelectedIndex(-1);

        // lbEstadoCivil
        lbEstadoCivil = new JLabel("Estado civil: ");
        lbEstadoCivil.setBounds(20, 125, 90, 25);
        lbEstadoCivil.setFont(fontePadrao);

        // cbEstadoCivil
        cbEstadoCivil = new JComboBox<EstadoCivil>(EstadoCivil.values());
        cbEstadoCivil.setBounds(100, 125, 170, 25);
        cbEstadoCivil.setFont(fontePadrao);
        cbEstadoCivil.setSelectedIndex(-1);

        // lbEndereco
        lbEndereco = new JLabel("Endereço:");
        lbEndereco.setBounds(280, 90, 60, 25);
        lbEndereco.setFont(fontePadrao);

        // taEndereco
        taEndereco = new JTextArea();
        taEndereco.setBounds(350, 90, 280, 60);
        taEndereco.setFont(fontePadrao);

        // btSalvar
        btSalvar = new JButton("Salvar");
        btSalvar.setBounds(20, 160, 80, 25);
        btSalvar.setFont(fontePadrao);
        btSalvar.setMnemonic('a');

        // adicionar componentes
        Container base = getContentPane();
        base.setLayout(null);
        base.setBackground(Color.lightGray);
        base.add(lbId);
        base.add(tfId);
        base.add(lbNome);
        base.add(tfNome);
        base.add(lbCpf);
        base.add(tfCpf);
        base.add(lbNascimento);
        base.add(tfNascimento);
        base.add(lbTelefone);
        base.add(tfTelefone);
        base.add(lbEmail);
        base.add(tfEmail);
        base.add(lbEscolaridade);
        base.add(cbEscolaridade);
        base.add(lbEstadoCivil);
        base.add(cbEstadoCivil);
        base.add(lbEndereco);
        base.add(taEndereco);
        base.add(btSalvar);

        // parâmetros do frame
        setSize(670, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // neste método definiremos os comportamentos
    private void actions() {
        // ação do botão salvar

        // ação do botão salvar com classe anônima
        btSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou no botão 2ª vez");
            }
        });

        // ação do botão salvar usando expressão lambda
        btSalvar.addActionListener(e -> {
            //validar campos
            if(tfNome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(ViewCliente.this,"Informe o nome", "Erro", JOptionPane.WARNING_MESSAGE);
                tfNome.requestFocus();
            } else if(tfCpf.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe o CPF", "Erro", JOptionPane.WARNING_MESSAGE);
                tfCpf.requestFocus();
            } else if(tfNascimento.getValue() == null) {
                JOptionPane.showMessageDialog(this, "Informe a Data de Nascimento", "Erro", JOptionPane.WARNING_MESSAGE);
                tfNascimento.requestFocus();
            } else if(cbEscolaridade.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Informe a Escolaridade", "Erro", JOptionPane.WARNING_MESSAGE);
                cbEscolaridade.requestFocus();
            } else if(cbEstadoCivil.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Informe o Estado Civil", "Erro", JOptionPane.WARNING_MESSAGE);
                cbEstadoCivil.requestFocus();
            } else {
                cliente = new Cliente();
                cliente.setNome(tfNome.getText());
                cliente.setCpf(tfCpf.getText());
                // conversão da String para data
                Calendar dataNasc = Calendar.getInstance();
                SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    dataNasc.setTime(fmt.parse(tfNascimento.getText()));
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Erro ao converter a data");
                }
                cliente.setNascimento(dataNasc);
                cliente.setTelefone(tfTelefone.getText());
                cliente.setEmail(tfEmail.getText());
                cliente.setEscolaridade((Escolaridade) cbEscolaridade.getSelectedItem());
                cliente.setEstadoCivil((EstadoCivil) cbEstadoCivil.getSelectedItem());
                cliente.setEndereco(taEndereco.getText());
            }
        });

        // permitir somente números na tfCpf
        tfCpf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) || tfCpf.getText().length() == 11) {
                    e.consume();
                }
            }
        });
    }


}
