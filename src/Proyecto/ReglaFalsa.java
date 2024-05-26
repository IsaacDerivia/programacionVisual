package Proyecto;

import javax.swing.*;


public class ReglaFalsa extends JFrame{
    //se crea la ventana
    public ReglaFalsa(){
        setTitle("Metodo de la Regla Falsa");
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new panel());
    }


    //se crea el metodo main
    public static void main(String[] args) {
        ReglaFalsa m = new ReglaFalsa();
        m.setVisible(true);
    }




 }
