/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SegundoParcial.tercerapractica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
//imports para leer el archivo json
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author viejo
 */
public class Encuesta extends JFrame {

    /**
     * Creates new form Encuesta
     */
    public Encuesta() {
        initComponents();
    }


    private JComboBox<String> comboboxMaestros;
    private JLabel lblMaestros;

    private JLabel lblMaestroElegido;
    private JLabel lblMateria;
    private JComboBox<String> comboboxMateria;

    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblpregunta1;
    private javax.swing.JLabel lblpregunta10;
    private javax.swing.JLabel lblpregunta11;
    private javax.swing.JLabel lblpregunta12;
    private javax.swing.JLabel lblpregunta13;
    private javax.swing.JLabel lblpregunta14;
    private javax.swing.JLabel lblpregunta2;
    private javax.swing.JLabel lblpregunta3;
    private javax.swing.JLabel lblpregunta4;
    private javax.swing.JLabel lblpregunta5;
    private javax.swing.JLabel lblpregunta6;
    private javax.swing.JLabel lblpregunta7;
    private javax.swing.JLabel lblpregunta8;
    private javax.swing.JLabel lblpregunta9;
    private javax.swing.JRadioButton radioButtonPregunta3_5;
    private javax.swing.JRadioButton radiobutton2_1;
    private javax.swing.JRadioButton radiobutton2_2;
    private javax.swing.JRadioButton radiobutton2_3;
    private javax.swing.JRadioButton radiobutton2_4;
    private javax.swing.JRadioButton radiobutton2_5;
    private javax.swing.JRadioButton radiobuttonPregunta1_1;
    private javax.swing.JRadioButton radiobuttonPregunta1_2;
    private javax.swing.JRadioButton radiobuttonPregunta1_3;
    private javax.swing.JRadioButton radiobuttonPregunta1_4;
    private javax.swing.JRadioButton radiobuttonPregunta3_4;
    private javax.swing.JRadioButton radiobuttonpregunta1_5;
    private javax.swing.JRadioButton RadioButtonPregunta4_1;
    private javax.swing.JRadioButton Radiobutton4_2;
    private javax.swing.JRadioButton Radiobutton4_3;
    private javax.swing.JRadioButton Radiobutton4_4;
    private javax.swing.JRadioButton Radiobutton4_5;
    private javax.swing.JRadioButton RadiobuttonPregunta10_1;
    private javax.swing.JRadioButton RadiobuttonPregunta10_2;
    private javax.swing.JRadioButton RadiobuttonPregunta10_3;
    private javax.swing.JRadioButton RadiobuttonPregunta10_4;
    private javax.swing.JRadioButton RadiobuttonPregunta10_5;
    private javax.swing.JRadioButton RadiobuttonPregunta11_1;
    private javax.swing.JRadioButton RadiobuttonPregunta11_2;
    private javax.swing.JRadioButton RadiobuttonPregunta11_3;
    private javax.swing.JRadioButton RadiobuttonPregunta11_4;
    private javax.swing.JRadioButton RadiobuttonPregunta11_5;
    private javax.swing.JRadioButton RadiobuttonPregunta12_1;
    private javax.swing.JRadioButton RadiobuttonPregunta12_2;
    private javax.swing.JRadioButton RadiobuttonPregunta12_3;
    private javax.swing.JRadioButton RadiobuttonPregunta12_4;
    private javax.swing.JRadioButton RadiobuttonPregunta12_5;
    private javax.swing.JRadioButton RadiobuttonPregunta13_1;
    private javax.swing.JRadioButton RadiobuttonPregunta13_2;
    private javax.swing.JRadioButton RadiobuttonPregunta13_3;
    private javax.swing.JRadioButton RadiobuttonPregunta13_4;
    private javax.swing.JRadioButton RadiobuttonPregunta13_5;
    private javax.swing.JRadioButton RadiobuttonPregunta14_1;
    private javax.swing.JRadioButton RadiobuttonPregunta14_2;
    private javax.swing.JRadioButton RadiobuttonPregunta14_3;
    private javax.swing.JRadioButton RadiobuttonPregunta14_4;
    private javax.swing.JRadioButton RadiobuttonPregunta14_5;
    private javax.swing.JRadioButton RadiobuttonPregunta3_1;
    private javax.swing.JRadioButton RadiobuttonPregunta3_2;
    private javax.swing.JRadioButton RadiobuttonPregunta3_3;
    private javax.swing.JRadioButton RadiobuttonPregunta5_1;
    private javax.swing.JRadioButton RadiobuttonPregunta5_2;
    private javax.swing.JRadioButton RadiobuttonPregunta5_3;
    private javax.swing.JRadioButton RadiobuttonPregunta5_4;
    private javax.swing.JRadioButton RadiobuttonPregunta5_5;
    private javax.swing.JRadioButton RadiobuttonPregunta6_1;
    private javax.swing.JRadioButton RadiobuttonPregunta6_2;
    private javax.swing.JRadioButton RadiobuttonPregunta6_3;
    private javax.swing.JRadioButton RadiobuttonPregunta6_4;
    private javax.swing.JRadioButton RadiobuttonPregunta6_5;
    private javax.swing.JRadioButton RadiobuttonPregunta7_1;
    private javax.swing.JRadioButton RadiobuttonPregunta7_2;
    private javax.swing.JRadioButton RadiobuttonPregunta7_3;
    private javax.swing.JRadioButton RadiobuttonPregunta7_4;
    private javax.swing.JRadioButton RadiobuttonPregunta7_5;
    private javax.swing.JRadioButton RadiobuttonPregunta8_1;
    private javax.swing.JRadioButton RadiobuttonPregunta8_2;
    private javax.swing.JRadioButton RadiobuttonPregunta8_3;
    private javax.swing.JRadioButton RadiobuttonPregunta8_4;
    private javax.swing.JRadioButton RadiobuttonPregunta8_5;
    private javax.swing.JRadioButton RadiobuttonPregunta9_1;
    private javax.swing.JRadioButton RadiobuttonPregunta9_2;
    private javax.swing.JRadioButton RadiobuttonPregunta9_3;
    private javax.swing.JRadioButton RadiobuttonPregunta9_4;
    private javax.swing.JRadioButton RadiobuttonPregunta9_5;
    private javax.swing.JMenuItem btnNuevaEncuesta;
    private javax.swing.JButton btnGuardarEncuesta;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        btnNuevaEncuesta = new javax.swing.JMenuItem();
        btneditar = new javax.swing.JMenu();
        btnInformacion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1142, 727));
        setMinimumSize(new java.awt.Dimension(1142, 727));
        setResizable(false);
        setSize(new java.awt.Dimension(1142, 727));
        getContentPane().setLayout(null);

        btnArchivo.setText("Archivo");

        btnNuevaEncuesta.setText("Nueva Encuesta");
        btnNuevaEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaEncuestaActionPerformed(evt);
            }
        });
        btnArchivo.add(btnNuevaEncuesta);

        jMenuBar1.add(btnArchivo);

        btneditar.setText("Editar");
        jMenuBar1.add(btneditar);

        btnInformacion.setText("Informacion");
        jMenuBar1.add(btnInformacion);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaEncuestaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnNuevaEncuestaActionPerformed
        // TODO add your handling code here:    
        lblMaestros = new JLabel();
        comboboxMaestros = new JComboBox<>();

        lblMaestros.setText("Seleccione maestro al que realizar la encuesta");
        getContentPane().add(lblMaestros);
        lblMaestros.setBounds(10, 30, 260, 16);

        // Crea un ArrayList para almacenar los nombres de los maestros
        ArrayList<String> maestros = new ArrayList<String>();

        // Agrega una cadena vacía a la lista para asegurar que el primer espacio en el combobox esté vacío
        maestros.add("");

        // Crea un nuevo JSONParser para analizar el archivo JSON
        JSONParser parser = new JSONParser();

        try {
            // Analiza el archivo JSON ubicado en la ruta especificada
            Object obj = parser.parse(new FileReader("C:\\Users\\viejo\\OneDrive\\Escritorio\\AHHHH\\programacionVisual\\src\\SegundoParcial\\tercerapractica\\DocenTes.json"));

            // Convierte el objeto analizado a un JSONObject
            JSONObject jsonObject = (JSONObject) obj;

            // Recupera el array de maestros del objeto JSON analizado
            JSONArray docentes = (JSONArray) jsonObject.get("Docentes");

            // Itera sobre cada maestro en el array
            for (Object docenteObj : docentes) {
                // Convierte el maestro actual a un JSONObject
                JSONObject docente = (JSONObject) docenteObj;

                // Recupera el nombre del maestro actual
                String nombre = (String) docente.get("Nombre");

                // Agrega el nombre del maestro actual a la lista
                maestros.add(nombre);
            }
        } catch (IOException e) {
            // Imprime la traza de la pila para cualquier IOException que ocurra
            e.printStackTrace();
        } catch (ParseException e) {
            // Imprime la traza de la pila para cualquier ParseException que ocurra
            e.printStackTrace();
        }

        // Ordena la lista de maestros alfabéticamente
        maestros.sort(null);

        comboboxMaestros.setModel(new DefaultComboBoxModel<>(maestros.toArray(new String[0])));
        getContentPane().add(comboboxMaestros);
        comboboxMaestros.setBounds(10, 50, 560, 22);

        comboboxMaestros.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                //ocultar los componentes anteriores
                lblMaestros.setVisible(false);
                comboboxMaestros.setVisible(false);



                if (e.getStateChange() == ItemEvent.SELECTED) {


                    //crear los nuevos componentes
                    lblMaestroElegido = new JLabel();
                    lblMateria = new JLabel();
                    comboboxMateria = new JComboBox<>();


                    lblMaestroElegido.setText("Maestro seleccionado:" + comboboxMaestros.getSelectedItem());
                    getContentPane().add(lblMaestroElegido);
                    lblMaestroElegido.setBounds(10, 20, 270, 16);

                    lblMateria.setText("Eliga materia a evaluar");
                    getContentPane().add(lblMateria);
                    lblMateria.setBounds(10, 60, 130, 16);

                    //del maestro obtenido se obtienen las materias
                    String maestro = (String) comboboxMaestros.getSelectedItem();
                    // Crea un ArrayList para almacenar las materias del maestro seleccionado
                    ArrayList<String> materias = new ArrayList<String>();
                    // Agrega una cadena vacía a la lista para asegurar que el primer espacio en el combobox esté vacío
                    materias.add("");
                    // Crea un nuevo JSONParser para analizar el archivo JSON
                    JSONParser parser = new JSONParser();
                    try {
                        // Analiza el archivo JSON ubicado en la ruta especificada
                        Object obj = parser.parse(new FileReader("C:\\Users\\viejo\\OneDrive\\Escritorio\\AHHHH\\programacionVisual\\src\\SegundoParcial\\tercerapractica\\DocenTes.json"));
                        // Convierte el objeto analizado a un JSONObject
                        JSONObject jsonObject = (JSONObject) obj;
                        // Recupera el array de maestros del objeto JSON analizado
                        JSONArray docentes = (JSONArray) jsonObject.get("Docentes");
                        // Itera sobre cada maestro en el array
                        for (Object docenteObj : docentes) {
                            // Convierte el maestro actual a un JSONObject
                            JSONObject docente = (JSONObject) docenteObj;
                            // Recupera el nombre del maestro actual
                            String nombre = (String) docente.get("Nombre");
                            // Si el nombre del maestro actual coincide con el maestro seleccionado
                            if (nombre.equals(maestro)) {
                                // Recupera el objeto de materias del maestro actual
                                Object materiasObj = docente.get("Materias");
                                // Si el objeto de materias es una cadena
                                if (materiasObj instanceof String) {
                                    // Agrega la cadena de materias a la lista de materias
                                    materias.add((String) materiasObj);
                                    // Si el objeto de materias es un JSONObject
                                } else if (materiasObj instanceof JSONObject) {
                                    // Convierte el objeto de materias a un JSONObject
                                    JSONObject materiasJson = (JSONObject) materiasObj;
                                    // Itera sobre cada materia en el objeto de materias
                                    for (Object keyObj : materiasJson.keySet()) {
                                        // Convierte la clave actual a una cadena
                                        String key = (String) keyObj;
                                        // Recupera la materia actual del objeto de materias
                                        String materia = (String) materiasJson.get(key);
                                        // Agrega la clave y la materia a la lista de materias
                                        materias.add(key + ": " + materia);
                                    }
                                }
                            }
                        }
                    } catch (IOException ex) {
                        // Imprime la traza de la pila para cualquier IOException que ocurra
                        ex.printStackTrace();
                    } catch (ParseException ex) {
                        // Imprime la traza de la pila para cualquier ParseException que ocurra
                        ex.printStackTrace();
                    }

                    // Ordena la lista de materias alfabéticamente
                    materias.sort(null);

                    comboboxMateria.setModel(new DefaultComboBoxModel<>(materias.toArray(new String[0])));
                    getContentPane().add(comboboxMateria);
                    comboboxMateria.setBounds(150, 60, 410, 22);
                    JScrollBar jScrollBar1 = new JScrollBar();
                    getContentPane().add(jScrollBar1);
                    jScrollBar1.setBounds(1120, 0, 20, 700);

                    //se crea un listener para el combobox de materias
                    comboboxMateria.addItemListener(new ItemListener() {
                        public void itemStateChanged(ItemEvent e) {
                            if (e.getStateChange() == ItemEvent.SELECTED) {

                                //ocultar los componentes anteriores
                                lblMaestroElegido.setVisible(false);
                                lblMateria.setVisible(false);
                                comboboxMateria.setVisible(false);


                                // Aquí es donde comienza la creación del JPanel y JScrollPane
                                // Obtén el contenedor de contenido actual
                                Container contentPane = getContentPane();

                                // Crea un nuevo JPanel con el mismo layout
                                JPanel panel = new JPanel();
                                panel.setLayout(null); // Use null layout to manually set component positions
                                //definir tamaño del panel, tiene el mismo tamaño que el frame
                                panel.setPreferredSize(new Dimension(2000, 2000));


                                // Mueve todos los componentes al panel
                                for (Component component : contentPane.getComponents()) {
                                    panel.add(component);
                                }


                                // Crea un JScrollPane y agrega el panel a él
                                JScrollPane scrollPane = new JScrollPane(panel);

                                // Establece el JScrollPane como el nuevo contenedor de contenido
                                setContentPane(scrollPane);
                                // Aquí termina la creación del JPanel y JScrollPan

                                //ocultar los componentes anteriores
                                lblMaestroElegido.setVisible(false);
                                lblMateria.setVisible(false);
                                comboboxMateria.setVisible(false);
                                
                                //crear los nuevos componentes
                                lblInstruccion = new javax.swing.JLabel();
                                lblpregunta1 = new javax.swing.JLabel();
                                radiobuttonPregunta1_1 = new javax.swing.JRadioButton();
                                radiobuttonpregunta1_5 = new javax.swing.JRadioButton();
                                radiobuttonPregunta1_4 = new javax.swing.JRadioButton();
                                radiobuttonPregunta1_3 = new javax.swing.JRadioButton();
                                radiobuttonPregunta1_2 = new javax.swing.JRadioButton();
                                lblpregunta2 = new javax.swing.JLabel();
                                radiobutton2_1 = new javax.swing.JRadioButton();
                                radiobutton2_5 = new javax.swing.JRadioButton();
                                radiobutton2_4 = new javax.swing.JRadioButton();
                                radiobutton2_3 = new javax.swing.JRadioButton();
                                radiobutton2_2 = new javax.swing.JRadioButton();
                                lblpregunta3 = new javax.swing.JLabel();
                                RadiobuttonPregunta3_1 = new javax.swing.JRadioButton();
                                radioButtonPregunta3_5 = new javax.swing.JRadioButton();
                                radiobuttonPregunta3_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta3_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta3_2 = new javax.swing.JRadioButton();
                                lblpregunta4 = new javax.swing.JLabel();
                                RadioButtonPregunta4_1 = new javax.swing.JRadioButton();
                                Radiobutton4_5 = new javax.swing.JRadioButton();
                                Radiobutton4_4 = new javax.swing.JRadioButton();
                                Radiobutton4_3 = new javax.swing.JRadioButton();
                                Radiobutton4_2 = new javax.swing.JRadioButton();
                                lblpregunta5 = new javax.swing.JLabel();
                                RadiobuttonPregunta5_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta5_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta5_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta5_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta5_2 = new javax.swing.JRadioButton();
                                lblpregunta6 = new javax.swing.JLabel();
                                RadiobuttonPregunta6_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta6_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta6_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta6_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta6_2 = new javax.swing.JRadioButton();
                                lblpregunta7 = new javax.swing.JLabel();
                                RadiobuttonPregunta7_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta7_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta7_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta7_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta7_2 = new javax.swing.JRadioButton();
                                lblpregunta8 = new javax.swing.JLabel();
                                RadiobuttonPregunta8_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta8_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta8_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta8_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta8_2 = new javax.swing.JRadioButton();
                                lblpregunta9 = new javax.swing.JLabel();
                                RadiobuttonPregunta9_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta9_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta9_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta9_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta9_2 = new javax.swing.JRadioButton();
                                lblpregunta10 = new javax.swing.JLabel();
                                RadiobuttonPregunta10_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta10_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta10_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta10_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta10_2 = new javax.swing.JRadioButton();
                                lblpregunta11 = new javax.swing.JLabel();
                                RadiobuttonPregunta11_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta11_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta11_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta11_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta11_2 = new javax.swing.JRadioButton();
                                lblpregunta12 = new javax.swing.JLabel();
                                RadiobuttonPregunta12_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta12_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta12_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta12_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta12_2 = new javax.swing.JRadioButton();
                                lblpregunta13 = new javax.swing.JLabel();
                                RadiobuttonPregunta13_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta13_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta13_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta13_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta13_2 = new javax.swing.JRadioButton();
                                lblpregunta14 = new javax.swing.JLabel();
                                RadiobuttonPregunta14_1 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta14_5 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta14_4 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta14_3 = new javax.swing.JRadioButton();
                                RadiobuttonPregunta14_2 = new javax.swing.JRadioButton();
                                btnGuardarEncuesta = new javax.swing.JButton();


                                lblInstruccion.setText("Contesta para cada materia el numero que corresponda: 5(siempre lo hace), 4 (la mayoria de las veces lo hace), 3(Algunas veces lo hace), 2(pocas veces lo hace), 1(Nunca lo hace)");
                                getContentPane().add(lblInstruccion);
                                lblInstruccion.setBounds(10, 20, 970, 20);

                                lblpregunta1.setText("Contextualiza los objetivos y contenidos de la asignatura respecto al perfil de egreso.");
                                getContentPane().add(lblpregunta1);
                                lblpregunta1.setBounds(10, 70, 460, 16);

                                radiobuttonPregunta1_1.setText("1");
                                getContentPane().add(radiobuttonPregunta1_1);
                                radiobuttonPregunta1_1.setBounds(270, 100, 98, 21);

                                radiobuttonpregunta1_5.setText("5");
                                getContentPane().add(radiobuttonpregunta1_5);
                                radiobuttonpregunta1_5.setBounds(20, 100, 29, 21);

                                radiobuttonPregunta1_4.setText("4");
                                getContentPane().add(radiobuttonPregunta1_4);
                                radiobuttonPregunta1_4.setBounds(70, 100, 98, 21);

                                radiobuttonPregunta1_3.setText("3");
                                getContentPane().add(radiobuttonPregunta1_3);
                                radiobuttonPregunta1_3.setBounds(140, 100, 98, 21);

                                radiobuttonPregunta1_2.setText("2");
                                getContentPane().add(radiobuttonPregunta1_2);
                                radiobuttonPregunta1_2.setBounds(200, 100, 98, 21);

                                lblpregunta2.setText("Describe los usos y aplicaciones profesionales de los contenidos temáticos.");
                                getContentPane().add(lblpregunta2);
                                lblpregunta2.setBounds(10, 140, 450, 16);

                                radiobutton2_1.setText("1");
                                getContentPane().add(radiobutton2_1);
                                radiobutton2_1.setBounds(270, 170, 98, 21);

                                radiobutton2_5.setText("5");
                                getContentPane().add(radiobutton2_5);
                                radiobutton2_5.setBounds(20, 170, 29, 21);

                                radiobutton2_4.setText("4");
                                getContentPane().add(radiobutton2_4);
                                radiobutton2_4.setBounds(80, 170, 98, 21);

                                radiobutton2_3.setText("3");
                                getContentPane().add(radiobutton2_3);
                                radiobutton2_3.setBounds(140, 170, 98, 21);

                                radiobutton2_2.setText("2");
                                getContentPane().add(radiobutton2_2);
                                radiobutton2_2.setBounds(200, 170, 98, 21);

                                lblpregunta3.setText("Respeta los criterios de evaluación socializados con el grupo.");
                                getContentPane().add(lblpregunta3);
                                lblpregunta3.setBounds(10, 220, 390, 16);

                                RadiobuttonPregunta3_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta3_1);
                                RadiobuttonPregunta3_1.setBounds(270, 250, 98, 21);

                                radioButtonPregunta3_5.setText("5");
                                getContentPane().add(radioButtonPregunta3_5);
                                radioButtonPregunta3_5.setBounds(20, 250, 29, 21);

                                radiobuttonPregunta3_4.setText("4");
                                getContentPane().add(radiobuttonPregunta3_4);
                                radiobuttonPregunta3_4.setBounds(80, 250, 98, 21);

                                RadiobuttonPregunta3_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta3_3);
                                RadiobuttonPregunta3_3.setBounds(140, 250, 98, 21);

                                RadiobuttonPregunta3_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta3_2);
                                RadiobuttonPregunta3_2.setBounds(200, 250, 98, 21);

                                lblpregunta4.setText("Ha demostrado dominio de los conocimientos y habilidades propios de esta asignatura.");
                                getContentPane().add(lblpregunta4);
                                lblpregunta4.setBounds(10, 300, 490, 16);

                                RadioButtonPregunta4_1.setText("1");
                                getContentPane().add(RadioButtonPregunta4_1);
                                RadioButtonPregunta4_1.setBounds(270, 330, 98, 21);

                                Radiobutton4_5.setText("5");
                                getContentPane().add(Radiobutton4_5);
                                Radiobutton4_5.setBounds(30, 330, 29, 21);

                                Radiobutton4_4.setText("4");
                                getContentPane().add(Radiobutton4_4);
                                Radiobutton4_4.setBounds(80, 330, 98, 21);

                                Radiobutton4_3.setText("3");
                                getContentPane().add(Radiobutton4_3);
                                Radiobutton4_3.setBounds(140, 330, 98, 21);

                                Radiobutton4_2.setText("2");
                                getContentPane().add(Radiobutton4_2);
                                Radiobutton4_2.setBounds(200, 330, 98, 21);

                                lblpregunta5.setText("Ha adoptado la conducción de la clase considerando las condiciones del grupo.");
                                getContentPane().add(lblpregunta5);
                                lblpregunta5.setBounds(10, 380, 460, 16);

                                RadiobuttonPregunta5_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta5_1);
                                RadiobuttonPregunta5_1.setBounds(270, 420, 98, 21);

                                RadiobuttonPregunta5_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta5_5);
                                RadiobuttonPregunta5_5.setBounds(20, 420, 29, 21);

                                RadiobuttonPregunta5_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta5_4);
                                RadiobuttonPregunta5_4.setBounds(80, 420, 98, 21);

                                RadiobuttonPregunta5_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta5_3);
                                RadiobuttonPregunta5_3.setBounds(140, 420, 98, 21);

                                RadiobuttonPregunta5_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta5_2);
                                RadiobuttonPregunta5_2.setBounds(200, 420, 98, 21);

                                lblpregunta6.setText("Promueve la práctica de los valores de la institución (Respeto, Responsabilidad, Solidaridad, Democracia, Autonomía, Búsqueda de la verdad).");
                                getContentPane().add(lblpregunta6);
                                lblpregunta6.setBounds(10, 480, 750, 16);

                                RadiobuttonPregunta6_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta6_1);
                                RadiobuttonPregunta6_1.setBounds(270, 510, 98, 21);

                                RadiobuttonPregunta6_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta6_5);
                                RadiobuttonPregunta6_5.setBounds(20, 510, 29, 21);

                                RadiobuttonPregunta6_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta6_4);
                                RadiobuttonPregunta6_4.setBounds(80, 510, 98, 21);

                                RadiobuttonPregunta6_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta6_3);
                                RadiobuttonPregunta6_3.setBounds(140, 510, 98, 21);

                                RadiobuttonPregunta6_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta6_2);
                                RadiobuttonPregunta6_2.setBounds(200, 510, 98, 21);

                                lblpregunta7.setText("Fomenta el desarrollo de las competencias emocionales (Autorregulación, autoconciencia, automotivación, empatía y formación de relaciones).");
                                getContentPane().add(lblpregunta7);
                                lblpregunta7.setBounds(10, 560, 780, 16);

                                RadiobuttonPregunta7_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta7_1);
                                RadiobuttonPregunta7_1.setBounds(270, 600, 98, 21);

                                RadiobuttonPregunta7_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta7_5);
                                RadiobuttonPregunta7_5.setBounds(20, 600, 29, 21);

                                RadiobuttonPregunta7_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta7_4);
                                RadiobuttonPregunta7_4.setBounds(80, 600, 98, 21);

                                RadiobuttonPregunta7_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta7_3);
                                RadiobuttonPregunta7_3.setBounds(140, 600, 98, 21);

                                RadiobuttonPregunta7_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta7_2);
                                RadiobuttonPregunta7_2.setBounds(200, 600, 98, 21);

                                lblpregunta8.setText("Inicia las clases puntualmente.");
                                getContentPane().add(lblpregunta8);
                                lblpregunta8.setBounds(20, 650, 180, 16);

                                RadiobuttonPregunta8_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta8_1);
                                RadiobuttonPregunta8_1.setBounds(270, 680, 98, 21);

                                RadiobuttonPregunta8_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta8_5);
                                RadiobuttonPregunta8_5.setBounds(20, 680, 29, 21);

                                RadiobuttonPregunta8_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta8_4);
                                RadiobuttonPregunta8_4.setBounds(80, 680, 98, 21);

                                RadiobuttonPregunta8_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta8_3);
                                RadiobuttonPregunta8_3.setBounds(140, 680, 98, 21);

                                RadiobuttonPregunta8_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta8_2);
                                RadiobuttonPregunta8_2.setBounds(200, 680, 98, 21);

                                lblpregunta9.setText("Cierra las clases puntualmente.");
                                getContentPane().add(lblpregunta9);
                                lblpregunta9.setBounds(20, 730, 430, 16);

                                RadiobuttonPregunta9_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta9_1);
                                RadiobuttonPregunta9_1.setBounds(270, 760, 98, 21);

                                RadiobuttonPregunta9_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta9_5);
                                RadiobuttonPregunta9_5.setBounds(20, 760, 29, 21);

                                RadiobuttonPregunta9_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta9_4);
                                RadiobuttonPregunta9_4.setBounds(80, 760, 98, 21);

                                RadiobuttonPregunta9_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta9_3);
                                RadiobuttonPregunta9_3.setBounds(140, 760, 98, 21);

                                RadiobuttonPregunta9_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta9_2);
                                RadiobuttonPregunta9_2.setBounds(200, 760, 98, 21);

                                lblpregunta10.setText("Retroalimenta los trabajos, tareas y actividades.");
                                getContentPane().add(lblpregunta10);
                                lblpregunta10.setBounds(20, 810, 270, 16);

                                RadiobuttonPregunta10_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta10_1);
                                RadiobuttonPregunta10_1.setBounds(270, 840, 98, 21);

                                RadiobuttonPregunta10_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta10_5);
                                RadiobuttonPregunta10_5.setBounds(20, 840, 29, 21);

                                RadiobuttonPregunta10_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta10_4);
                                RadiobuttonPregunta10_4.setBounds(80, 840, 98, 21);

                                RadiobuttonPregunta10_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta10_3);
                                RadiobuttonPregunta10_3.setBounds(140, 840, 98, 21);

                                RadiobuttonPregunta10_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta10_2);
                                RadiobuttonPregunta10_2.setBounds(200, 840, 98, 21);

                                lblpregunta11.setText("Promueve la participación.");
                                getContentPane().add(lblpregunta11);
                                lblpregunta11.setBounds(20, 890, 160, 16);

                                RadiobuttonPregunta11_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta11_1);
                                RadiobuttonPregunta11_1.setBounds(270, 920, 98, 21);

                                RadiobuttonPregunta11_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta11_5);
                                RadiobuttonPregunta11_5.setBounds(20, 920, 29, 21);

                                RadiobuttonPregunta11_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta11_4);
                                RadiobuttonPregunta11_4.setBounds(80, 920, 98, 21);

                                RadiobuttonPregunta11_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta11_3);
                                RadiobuttonPregunta11_3.setBounds(140, 920, 98, 21);

                                RadiobuttonPregunta11_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta11_2);
                                RadiobuttonPregunta11_2.setBounds(200, 920, 98, 21);

                                lblpregunta12.setText("Aplica estrategias de aprendizaje que promueven interacción y trabajo colaborativo.");
                                getContentPane().add(lblpregunta12);
                                lblpregunta12.setBounds(20, 960, 450, 16);

                                RadiobuttonPregunta12_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta12_1);
                                RadiobuttonPregunta12_1.setBounds(270, 990, 98, 21);

                                RadiobuttonPregunta12_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta12_5);
                                RadiobuttonPregunta12_5.setBounds(20, 990, 29, 21);

                                RadiobuttonPregunta12_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta12_4);
                                RadiobuttonPregunta12_4.setBounds(80, 990, 98, 21);

                                RadiobuttonPregunta12_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta12_3);
                                RadiobuttonPregunta12_3.setBounds(140, 990, 98, 21);

                                RadiobuttonPregunta12_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta12_2);
                                RadiobuttonPregunta12_2.setBounds(200, 990, 98, 21);

                                lblpregunta13.setText("Recomiendo plenamente a este profesor para impartir nuevamente la materia.");
                                getContentPane().add(lblpregunta13);
                                lblpregunta13.setBounds(20, 1040, 450, 16);

                                RadiobuttonPregunta13_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta13_1);
                                RadiobuttonPregunta13_1.setBounds(270, 1070, 98, 21);

                                RadiobuttonPregunta13_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta13_5);
                                RadiobuttonPregunta13_5.setBounds(20, 1070, 29, 21);

                                RadiobuttonPregunta13_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta13_4);
                                RadiobuttonPregunta13_4.setBounds(80, 1070, 98, 21);

                                RadiobuttonPregunta13_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta13_3);
                                RadiobuttonPregunta13_3.setBounds(140, 1070, 98, 21);

                                RadiobuttonPregunta13_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta13_2);
                                RadiobuttonPregunta13_2.setBounds(200, 1070, 98, 21);

                                lblpregunta14.setText("Resuelve dudas e inquietudes de los temas o actividades.");
                                getContentPane().add(lblpregunta14);
                                lblpregunta14.setBounds(20, 1110, 410, 16);

                                RadiobuttonPregunta14_1.setText("1");
                                getContentPane().add(RadiobuttonPregunta14_1);
                                RadiobuttonPregunta14_1.setBounds(270, 1140, 98, 21);

                                RadiobuttonPregunta14_5.setText("5");
                                getContentPane().add(RadiobuttonPregunta14_5);
                                RadiobuttonPregunta14_5.setBounds(20, 1140, 29, 21);

                                RadiobuttonPregunta14_4.setText("4");
                                getContentPane().add(RadiobuttonPregunta14_4);
                                RadiobuttonPregunta14_4.setBounds(80, 1140, 98, 21);

                                RadiobuttonPregunta14_3.setText("3");
                                getContentPane().add(RadiobuttonPregunta14_3);
                                RadiobuttonPregunta14_3.setBounds(140, 1140, 98, 21);

                                RadiobuttonPregunta14_2.setText("2");
                                getContentPane().add(RadiobuttonPregunta14_2);
                                RadiobuttonPregunta14_2.setBounds(200, 1140, 98, 21);

                                btnGuardarEncuesta.setText("Guardar Encuesta");
                                btnGuardarEncuesta.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnGuardarEncuestaActionPerformed(evt);
                                    }
                                });
                                getContentPane().add(btnGuardarEncuesta);
                                btnGuardarEncuesta.setBounds(940, 1190, 170, 40);

                                //agrega todos los componentes al panel
                                panel.add(lblInstruccion);
                                panel.add(lblpregunta1);
                                panel.add(radiobuttonPregunta1_1);
                                panel.add(radiobuttonpregunta1_5);
                                panel.add(radiobuttonPregunta1_4);
                                panel.add(radiobuttonPregunta1_3);
                                panel.add(radiobuttonPregunta1_2);
                                panel.add(lblpregunta2);
                                panel.add(radiobutton2_1);
                                panel.add(radiobutton2_5);
                                panel.add(radiobutton2_4);
                                panel.add(radiobutton2_3);
                                panel.add(radiobutton2_2);
                                panel.add(lblpregunta3);
                                panel.add(RadiobuttonPregunta3_1);
                                panel.add(radioButtonPregunta3_5);
                                panel.add(radiobuttonPregunta3_4);
                                panel.add(RadiobuttonPregunta3_3);
                                panel.add(RadiobuttonPregunta3_2);
                                panel.add(lblpregunta4);
                                panel.add(RadioButtonPregunta4_1);
                                panel.add(Radiobutton4_5);
                                panel.add(Radiobutton4_4);
                                panel.add(Radiobutton4_3);
                                panel.add(Radiobutton4_2);
                                panel.add(lblpregunta5);
                                panel.add(RadiobuttonPregunta5_1);
                                panel.add(RadiobuttonPregunta5_5);
                                panel.add(RadiobuttonPregunta5_4);
                                panel.add(RadiobuttonPregunta5_3);
                                panel.add(RadiobuttonPregunta5_2);
                                panel.add(lblpregunta6);
                                panel.add(RadiobuttonPregunta6_1);
                                panel.add(RadiobuttonPregunta6_5);
                                panel.add(RadiobuttonPregunta6_4);
                                panel.add(RadiobuttonPregunta6_3);
                                panel.add(RadiobuttonPregunta6_2);
                                panel.add(lblpregunta7);
                                panel.add(RadiobuttonPregunta7_1);
                                panel.add(RadiobuttonPregunta7_5);
                                panel.add(RadiobuttonPregunta7_4);
                                panel.add(RadiobuttonPregunta7_3);
                                panel.add(RadiobuttonPregunta7_2);
                                panel.add(lblpregunta8);
                                panel.add(RadiobuttonPregunta8_1);
                                panel.add(RadiobuttonPregunta8_5);
                                panel.add(RadiobuttonPregunta8_4);
                                panel.add(RadiobuttonPregunta8_3);
                                panel.add(RadiobuttonPregunta8_2);
                                panel.add(lblpregunta9);
                                panel.add(RadiobuttonPregunta9_1);
                                panel.add(RadiobuttonPregunta9_5);
                                panel.add(RadiobuttonPregunta9_4);
                                panel.add(RadiobuttonPregunta9_3);
                                panel.add(RadiobuttonPregunta9_2);
                                panel.add(lblpregunta10);
                                panel.add(RadiobuttonPregunta10_1);
                                panel.add(RadiobuttonPregunta10_5);
                                panel.add(RadiobuttonPregunta10_4);
                                panel.add(RadiobuttonPregunta10_3);
                                panel.add(RadiobuttonPregunta10_2);
                                panel.add(lblpregunta11);
                                panel.add(RadiobuttonPregunta11_1);
                                panel.add(RadiobuttonPregunta11_5);
                                panel.add(RadiobuttonPregunta11_4);
                                panel.add(RadiobuttonPregunta11_3);
                                panel.add(RadiobuttonPregunta11_2);
                                panel.add(lblpregunta12);
                                panel.add(RadiobuttonPregunta12_1);
                                panel.add(RadiobuttonPregunta12_5);
                                panel.add(RadiobuttonPregunta12_4);
                                panel.add(RadiobuttonPregunta12_3);
                                panel.add(RadiobuttonPregunta12_2);
                                panel.add(lblpregunta13);
                                panel.add(RadiobuttonPregunta13_1);
                                panel.add(RadiobuttonPregunta13_5);
                                panel.add(RadiobuttonPregunta13_4);
                                panel.add(RadiobuttonPregunta13_3);
                                panel.add(RadiobuttonPregunta13_2);
                                panel.add(lblpregunta14);
                                panel.add(RadiobuttonPregunta14_1);
                                panel.add(RadiobuttonPregunta14_5);
                                panel.add(RadiobuttonPregunta14_4);
                                panel.add(RadiobuttonPregunta14_3);
                                panel.add(RadiobuttonPregunta14_2);
                                panel.add(btnGuardarEncuesta);
                                panel.add(lblMaestroElegido);
                                panel.add(lblMateria);
                                panel.add(comboboxMateria);

                                // Ahora oculta los componentes
                                lblMaestroElegido.setVisible(false);
                                lblMateria.setVisible(false);
                                comboboxMateria.setVisible(false);


                                revalidate();
                                repaint();


                                // Ahora oculta los componentes
                                lblMaestroElegido.setVisible(false);
                                lblMateria.setVisible(false);
                                comboboxMateria.setVisible(false);

                            }


                        }
                    });

                }
            }
        });


    }//GEN-LAST:event_btnNuevaEncuestaActionPerformed


    //evento vacio para el botonGuardarEncuesta
    private void btnGuardarEncuestaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnGuardarEncuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarEncuestaActionPerformed


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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenu btnInformacion;
    private javax.swing.JMenu btneditar;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
