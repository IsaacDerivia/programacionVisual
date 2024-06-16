/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Examen.SegundoParcial;

import javax.swing.*;
//import para escribir en el csv con la libreria opencsv
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
//impor para sacar dia y hora
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;



/**
 *
 * @author isaac
 */
public class SegundoParcial extends javax.swing.JFrame {

    /**
     * Creates new form SegundoParcial
     */
    public SegundoParcial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblgenero = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        radiobuttonMasculino = new javax.swing.JRadioButton();
        RadiobuttonFemenino = new javax.swing.JRadioButton();
        lblEstadoCivil = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        RadioButtonUnionLIbre = new javax.swing.JRadioButton();
        RadioButtonSoltero = new javax.swing.JRadioButton();
        RadioButtonCasado = new javax.swing.JRadioButton();
        RadioButtonDivorciado = new javax.swing.JRadioButton();
        lblNacionalidad = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        RadiobuttonExtranjera = new javax.swing.JRadioButton();
        RadioButtonMexicana = new javax.swing.JRadioButton();
        lblLenguajes = new javax.swing.JLabel();
        RadioButtonOtroLenguajes = new javax.swing.JRadioButton();
        RadioButtonCmasmas = new javax.swing.JRadioButton();
        RadioButtonCsharp = new javax.swing.JRadioButton();
        RadioButtonJava = new javax.swing.JRadioButton();
        RadioButtonPHP = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        lblIdioma = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        RadioButtonOtrosIdioma = new javax.swing.JRadioButton();
        RadioButtonIngles = new javax.swing.JRadioButton();
        RadioButtonFrances = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        RadioButtonAleman = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen Parcial #2");
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        lblgenero.setText("Genero");
        getContentPane().add(lblgenero);
        lblgenero.setBounds(10, 10, 120, 19);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 40, 500, 10);


        //grupo de botones para genero
        ButtonGroup grupoGenero = new ButtonGroup();

        radiobuttonMasculino.setText("Masculino");

        getContentPane().add(radiobuttonMasculino);
        radiobuttonMasculino.setBounds(20, 50, 90, 23);

        RadiobuttonFemenino.setText("Feminino");
        getContentPane().add(RadiobuttonFemenino);
        RadiobuttonFemenino.setBounds(170, 50, 84, 23);

        grupoGenero.add(radiobuttonMasculino);
        grupoGenero.add(RadiobuttonFemenino);


        lblEstadoCivil.setText("Estado Civil");
        getContentPane().add(lblEstadoCivil);
        lblEstadoCivil.setBounds(10, 100, 90, 19);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 130, 500, 10);

        //grupo de botoes para estado civil
        ButtonGroup grupoEstadoCivil = new ButtonGroup();

        RadioButtonUnionLIbre.setText("Union Libre");

        getContentPane().add(RadioButtonUnionLIbre);
        RadioButtonUnionLIbre.setBounds(370, 140, 115, 23);

        RadioButtonSoltero.setText("Soltero");

        getContentPane().add(RadioButtonSoltero);
        RadioButtonSoltero.setBounds(20, 140, 70, 23);

        RadioButtonCasado.setText("Casado");

        getContentPane().add(RadioButtonCasado);
        RadioButtonCasado.setBounds(110, 140, 115, 23);

        RadioButtonDivorciado.setText("Divorciado");
        getContentPane().add(RadioButtonDivorciado);
        RadioButtonDivorciado.setBounds(240, 140, 115, 23);

        grupoEstadoCivil.add(RadioButtonUnionLIbre);
        grupoEstadoCivil.add(RadioButtonSoltero);
        grupoEstadoCivil.add(RadioButtonCasado);
        grupoEstadoCivil.add(RadioButtonDivorciado);


        lblNacionalidad.setText("Nacionalidad");
        getContentPane().add(lblNacionalidad);
        lblNacionalidad.setBounds(10, 190, 86, 19);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 230, 500, 10);

        //grupo de botones para nacionalidad
        ButtonGroup grupoNacionalidad = new ButtonGroup();


        RadiobuttonExtranjera.setText("Extranjero");
        getContentPane().add(RadiobuttonExtranjera);
        RadiobuttonExtranjera.setBounds(140, 240, 115, 23);

        RadioButtonMexicana.setText("Mexicana");
        getContentPane().add(RadioButtonMexicana);
        RadioButtonMexicana.setBounds(20, 240, 86, 23);

        grupoNacionalidad.add(RadiobuttonExtranjera);
        grupoNacionalidad.add(RadioButtonMexicana);


        lblLenguajes.setText("Lenguaje");
        getContentPane().add(lblLenguajes);
        lblLenguajes.setBounds(10, 280, 90, 19);

        //grupo de botones para lenguajes
        ButtonGroup grupoLenguajes = new ButtonGroup();

        RadioButtonOtroLenguajes.setText("Otro");
        getContentPane().add(RadioButtonOtroLenguajes);
        RadioButtonOtroLenguajes.setBounds(10, 390, 60, 23);

        RadioButtonCmasmas.setText("C++");
        getContentPane().add(RadioButtonCmasmas);
        RadioButtonCmasmas.setBounds(10, 310, 50, 23);

        RadioButtonCsharp.setText("C#");
        getContentPane().add(RadioButtonCsharp);
        RadioButtonCsharp.setBounds(10, 330, 50, 23);

        RadioButtonJava.setText("Java");
        getContentPane().add(RadioButtonJava);
        RadioButtonJava.setBounds(10, 350, 60, 23);

        RadioButtonPHP.setText("PHP");

        getContentPane().add(RadioButtonPHP);
        RadioButtonPHP.setBounds(10, 370, 60, 23);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 300, 210, 10);

        grupoLenguajes.add(RadioButtonOtroLenguajes);
        grupoLenguajes.add(RadioButtonCmasmas);
        grupoLenguajes.add(RadioButtonCsharp);
        grupoLenguajes.add(RadioButtonJava);
        grupoLenguajes.add(RadioButtonPHP);


        lblIdioma.setText("Idioma");
        getContentPane().add(lblIdioma);
        lblIdioma.setBounds(350, 280, 45, 19);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(330, 300, 250, 20);

        //grupo de botones para idiomas
        ButtonGroup grupoIdiomas = new ButtonGroup();


        RadioButtonOtrosIdioma.setText("Otro");

        getContentPane().add(RadioButtonOtrosIdioma);
        RadioButtonOtrosIdioma.setBounds(330, 380, 122, 23);

        RadioButtonIngles.setText("Ingles");
        getContentPane().add(RadioButtonIngles);
        RadioButtonIngles.setBounds(330, 320, 62, 23);

        RadioButtonFrances.setText("Frances");

        getContentPane().add(RadioButtonFrances);
        RadioButtonFrances.setBounds(330, 340, 122, 23);

        RadioButtonAleman.setText("Aleman");
        getContentPane().add(RadioButtonAleman);
        RadioButtonAleman.setBounds(330, 360, 122, 23);

        grupoIdiomas.add(RadioButtonOtrosIdioma);
        grupoIdiomas.add(RadioButtonIngles);
        grupoIdiomas.add(RadioButtonFrances);
        grupoIdiomas.add(RadioButtonAleman);





        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //GEN-FIRST:event_btnRegistrarActionPerformed
                    // TODO add your handling code here:
                    //validar que todos los campos esten vacios
                    if (radiobuttonMasculino.isSelected() == false && RadiobuttonFemenino.isSelected() == false) {
                        JOptionPane.showMessageDialog(null, "Selecciona un genero");
                        return;
                    } else if (RadioButtonUnionLIbre.isSelected() == false && RadioButtonSoltero.isSelected() == false && RadioButtonCasado.isSelected() == false && RadioButtonDivorciado.isSelected() == false) {
                        JOptionPane.showMessageDialog(null, "Selecciona un estado civil");
                        return;
                    } else if (RadiobuttonExtranjera.isSelected() == false && RadioButtonMexicana.isSelected() == false) {
                        JOptionPane.showMessageDialog(null, "Selecciona una nacionalidad");
                        return;
                    } else if (RadioButtonCmasmas.isSelected() == false && RadioButtonCsharp.isSelected() == false && RadioButtonJava.isSelected() == false && RadioButtonPHP.isSelected() == false && RadioButtonOtroLenguajes.isSelected() == false) {
                        JOptionPane.showMessageDialog(null, "Selecciona un lenguaje");
                        return;
                    } else if (RadioButtonIngles.isSelected() == false && RadioButtonFrances.isSelected() == false && RadioButtonAleman.isSelected() == false && RadioButtonOtrosIdioma.isSelected() == false) {
                        JOptionPane.showMessageDialog(null, "Selecciona un idioma");
                        return;
                    }



                    //saca la fecha actual y la guarda en una variable
                    Date fecha = new Date();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaActual = formato.format(fecha);

                    //saca la hora actual y la guarda en una variable
                    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
                    String horaActual = formatoHora.format(fecha);

                    //variables para guardar los datos
                    String genero = "";
                    String estadoCivil = "";
                    String nacionalidad = "";
                    String lenguaje = "";
                    String idioma = "";

                    //valida el genero
                    if (radiobuttonMasculino.isSelected()) {
                        genero = "Masculino";
                    } else {
                        genero = "Femenino";
                    }

                    //valida el estado civil
                    if (RadioButtonUnionLIbre.isSelected()) {
                        estadoCivil = "Union Libre";
                    } else if (RadioButtonSoltero.isSelected()) {
                        estadoCivil = "Soltero";
                    } else if (RadioButtonCasado.isSelected()) {
                        estadoCivil = "Casado";
                    } else {
                        estadoCivil = "Divorciado";
                    }

                    //valida la nacionalidad
                    if (RadiobuttonExtranjera.isSelected()) {
                        nacionalidad = "Extranjera";
                    } else {
                        nacionalidad = "Mexicana";
                    }

                    //valida el lenguaje
                    if (RadioButtonCmasmas.isSelected()) {
                        lenguaje = "C++";
                    } else if (RadioButtonCsharp.isSelected()) {
                        lenguaje = "C#";
                    } else if (RadioButtonJava.isSelected()) {
                        lenguaje = "Java";
                    } else if (RadioButtonPHP.isSelected()) {
                        lenguaje = "PHP";
                    } else {
                        //en el txtarea se escribe el lenguaje que se selecciono
                        lenguaje = JOptionPane.showInputDialog(null, "Escribe el lenguaje que conoces");
                        //si no se escribe nada se pone otro y validar que solo sean letras
                        if (lenguaje == null || lenguaje.equals("")) {
                            lenguaje = "Otro";
                        } else {
                            if (lenguaje.matches(".*\\d.*")) {
                                JOptionPane.showMessageDialog(null, "nombre no valido");
                                return;
                            }
                        }

                    }

                    //valida el idioma
                    if (RadioButtonIngles.isSelected()) {
                        idioma = "Ingles";
                    } else if (RadioButtonFrances.isSelected()) {
                        idioma = "Frances";
                    } else if (RadioButtonAleman.isSelected()) {
                        idioma = "Aleman";
                    } else {
                        //en el txtarea se escribe el idioma que se selecciono
                        idioma = JOptionPane.showInputDialog(null, "Escribe el idioma que conoces");
                        //si no se escribe nada se pone otro y validar que solo sean letras
                        if (idioma == null || idioma.equals("")) {
                            idioma = "Otro";
                        } else {
                            if (idioma.matches(".*\\d.*")) {
                                JOptionPane.showMessageDialog(null, "idioma no valido");
                                return;
                            }
                        }
                    }

                    //guarda los datos en un archivo csv
                    try {
                        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\viejo\\OneDrive\\Escritorio\\AHHHH\\programacionVisual\\src\\Examen\\SegundoParcial\\Encuestas.csv", true));
                        String[] datos = {fechaActual, horaActual, genero, estadoCivil, nacionalidad, lenguaje, idioma};
                        writer.writeNext(datos);
                        writer.close();
                        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                    } catch (IOException ex) {
                        Logger.getLogger(SegundoParcial.class.getName()).
                                log(Level.SEVERE, null, ex);
                    }



                    //limpia los campos
                    grupoGenero.clearSelection();
                    grupoEstadoCivil.clearSelection();
                    grupoNacionalidad.clearSelection();
                    grupoLenguajes.clearSelection();
                    grupoIdiomas.clearSelection();



                    //repintar la ventana
                    repaint();








            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(330, 410, 160, 25);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 410, 190, 40);



        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


   //GEN-LAST:event_btnRegistrarActionPerformed



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SegundoParcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundoParcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundoParcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundoParcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SegundoParcial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonAleman;
    private javax.swing.JRadioButton RadioButtonCasado;
    private javax.swing.JRadioButton RadioButtonCmasmas;
    private javax.swing.JRadioButton RadioButtonCsharp;
    private javax.swing.JRadioButton RadioButtonDivorciado;
    private javax.swing.JRadioButton RadioButtonFrances;
    private javax.swing.JRadioButton RadioButtonIngles;
    private javax.swing.JRadioButton RadioButtonJava;
    private javax.swing.JRadioButton RadioButtonMexicana;
    private javax.swing.JRadioButton RadioButtonOtroLenguajes;
    private javax.swing.JRadioButton RadioButtonOtrosIdioma;
    private javax.swing.JRadioButton RadioButtonPHP;
    private javax.swing.JRadioButton RadioButtonSoltero;
    private javax.swing.JRadioButton RadioButtonUnionLIbre;
    private javax.swing.JRadioButton RadiobuttonExtranjera;
    private javax.swing.JRadioButton RadiobuttonFemenino;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblgenero;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblLenguajes;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton radiobuttonMasculino;
    // End of variables declaration//GEN-END:variables
}
