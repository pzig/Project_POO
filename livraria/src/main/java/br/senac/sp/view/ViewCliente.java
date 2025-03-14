package br.senac.sp.view;

import java.awt.*;
import javax.swing.*;   


public class ViewCliente extends JFrame{
    JLabel lbId, lbCpf, lbNome, lbNascimento;
    JTextField rfId, tfCpf, tfNome;
    JFormattedTextField tfNascimento;
    Font fonteArial;

    public static void main(String[] args) {
        new ViewCliente();
    }

    public ViewCliente() {
        initiComponents();
        actions();
    }

    //neste metodo construiremos a tela
    private void initiComponents() {
    fonteArial = new Font("Arial", Font.PLAIN, 14);

        //lbId
        lbId = new Jlabel("ID: ");
        lbId.setBounds(20,20,50,20);
        lbId.setFont(fonteArial);

        //lbNome
        lbNome = new Jlabel("Nome: ");
        lbNome.setBounds(20,20,50,20);
        lbNome.setFont(fonteArial);
        
        //lbCpf
        lbCpf = new Jlabel("Cpf: ");
        lbCpf.setBounds(20,20,50,20);
        lbCpf.setFont(fonteArial);

        //tfCpf
        tfId = new JTextField();
        tfId.setBounds(60,20,40,20);
        tfId.setFont(fonteArial);
        tfId.setHorizontalAlignment(SwingConstants.CENTER);

         //tfCpf
         tfNome = new JTextField();
         tfNome.setBounds(60,20,40,20);
         tfNome.setFont(fonteArial);
         tfNome.setHorizontalAlignment(SwingConstants.CENTER);

          //tfCpf
        tfCpf = new JTextField();
        tfCpf.setBounds(60,20,40,20);
        tfCpf.setFont(fonteArial);
        tfCpf.setHorizontalAlignment(SwingConstants.CENTER);
        
        //adicionar componentes
        Container base = getContentPane();
        base.setLayout(null);
        base.add(lbId);
        base.add(tfId);
        base.add(lbNome);
        base.add(tfNome);
        base.add(lbCpf);
        base.add(tfCpf);

        //parâmetros do frame
        setSize(500,500);
        setLocationRelativeTo(null); //define janela no centro ao colocar null
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //stop the program ao fechar a janela

    }
    
    //definiremos os comportamentos
    private void actions() {

    }
}