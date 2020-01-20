package com.ifpb.interfacegrafica.telas;

import javax.swing.*;
import java.awt.*;

public class PrimeiraJanela extends JFrame {

    public PrimeiraJanela(){
        super("Meu primeiro formulário");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);

        Container painel = getContentPane();
        painel.setLayout(null);
        painel.setBackground(Color.white);

        inserirJLabels(painel);

    }

    private void inserirJLabels(Container painel) {

        JLabel labelTitulo = new JLabel("Cadastro de professor");
        Font fonteLabels = new Font("Arial", Font.BOLD, 16);

        labelTitulo.setBounds(20, 20, 300, 30);
        labelTitulo.setForeground(Color.DARK_GRAY);
        labelTitulo.setHorizontalAlignment(JLabel.CENTER);
        painel.add(labelTitulo);

        JLabel labelcpf = new JLabel("cpf");
        labelcpf.setBounds(20, 50, 100 ,50);
        labelcpf.setFont(fonteLabels);
        painel.add(labelcpf);

        JLabel labelnome = new JLabel("nome");
        labelnome.setBounds(20, 70, 100 ,50);
        labelnome.setFont(fonteLabels);
        painel.add(labelnome);

        JLabel labelnascimento = new JLabel("nascimento");
        labelnascimento.setBounds(20, 90, 120 ,50);
        labelnascimento.setFont(fonteLabels);
        painel.add(labelnascimento);

        JLabel labelsexo = new JLabel("sexo");
        labelsexo.setBounds(20, 110, 100 ,50);
        labelsexo.setFont(fonteLabels);
        painel.add(labelsexo);

        JLabel labeltitulacao = new JLabel("titulação");
        labeltitulacao.setBounds(20, 130, 100 ,50);
        labeltitulacao.setFont(fonteLabels);
        painel.add(labeltitulacao);

    }

}
