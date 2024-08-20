package PJUserInterface;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PJForm extends JFrame{

    public PJForm(){
        customerControls();
    }

    private void customerControls(){
       
        setTitle("EcuAnt 2k24A");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        JPanel topPanel= new JPanel(new BorderLayout());
        JLabel imgLabel = new JLabel(new ImageIcon("src\\PJUserInterface\\PJResource\\Hormiga.png"));
        JLabel titleLabel = new JLabel("Hormiguero virtual", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        topPanel.add(imgLabel, BorderLayout.NORTH);
        topPanel.add(titleLabel, BorderLayout.SOUTH);

        String[] columnNames = {"RegisNro", "TipoHormiga", "Ubicación", "Sexo", "IngestaNativa", "GenoAlimento", "Estado"};
        Object[][] data = new Object[8][7];
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel comboPanel = new JPanel();
        String [] genoOptions = {"X", "XX", "XY"};
        JComboBox <String> genoCombo = new JComboBox<>(genoOptions);

        String [] ingestaOptions = {"Carnivoro", "Herbivoro", "Omnivoro", "Insectívoro", "Nectanrívoros"};
        JComboBox <String> ingestaCombo = new JComboBox<>(ingestaOptions);
        comboPanel.add(genoCombo);
        comboPanel.add(ingestaCombo);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        JButton createButton = new JButton("Crear Larva");
        JButton feedButton = new JButton("Alimentar");
        JButton deleteButton = new JButton("Eliminar");
        JButton saveButton = new JButton("Guardar");
        buttonPanel.add(createButton);
        buttonPanel.add(feedButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(saveButton);

        JPanel comboButtonPanel = new JPanel(new BorderLayout());
        comboButtonPanel.add(comboPanel, BorderLayout.NORTH);
        comboButtonPanel.add(buttonPanel, BorderLayout.SOUTH);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(comboButtonPanel, BorderLayout.SOUTH);

        JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel programLabel = new JLabel("Programación II");
        JLabel cedulaLabel = new JLabel("Cedula: 1727169631");
        JLabel nameLabel= new JLabel ("Nombres: Josselyn Pozo");

        statusBar.add(programLabel);
        statusBar.add(new JLabel(" | "));
        statusBar.add(cedulaLabel);
        statusBar.add(new JLabel(" | "));
        statusBar.add(nameLabel);

        add(topPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        add(statusBar, BorderLayout.PAGE_END);

        setVisible(true);

    }

}
    
