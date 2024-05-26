/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


/**
 *
 * @author isaac
 */
public class Biseccion extends JFrame {

    /**
     * Creates new form metodoBI
     */
    public Biseccion() {
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

        jTextField10 = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        JtexVariable6 = new JTextField();
        jLabel3 = new JLabel();
        txtvariable5 = new JTextField();
        jLabel4 = new JLabel();
        JTextvariable4 = new JTextField();
        jLabel5 = new JLabel();
        JTextVariable3 = new JTextField();
        jLabel6 = new JLabel();
        txtVariable2 = new JTextField();
        jLabel7 = new JLabel();
        JtextVariable1 = new JTextField();
        jLabel8 = new JLabel();
        JtextConstante = new JTextField();
        jLabel9 = new JLabel();
        txtVariableA = new JTextField();
        jLabel10 = new JLabel();
        JtextVariableB = new JTextField();
        jLabel11 = new JLabel();
        TxtError = new JTextField();
        jLabel12 = new JLabel();
        TxtDecimales = new JTextField();
        btnGuardado = new JButton();

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new Dimension(600, 600));
        setMinimumSize(new Dimension(600, 600));
        setPreferredSize(new Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new Font("Cantarell", 0, 18)); // NOI18N
        jLabel1.setText("MÉTODO DE BISECCIÓN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 230, 40);

        jLabel2.setText("X⁶");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 47, 19);

        JtexVariable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtexVariable6ActionPerformed(evt);
            }
        });
        getContentPane().add(JtexVariable6);
        JtexVariable6.setBounds(10, 100, 64, 25);

        jLabel3.setText("x⁵");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 70, 13, 19);
        getContentPane().add(txtvariable5);
        txtvariable5.setBounds(100, 100, 64, 25);

        jLabel4.setText("x⁴");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 70, 13, 19);
        getContentPane().add(JTextvariable4);
        JTextvariable4.setBounds(190, 100, 64, 25);

        jLabel5.setText("x³");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 70, 13, 19);
        getContentPane().add(JTextVariable3);
        JTextVariable3.setBounds(280, 100, 70, 25);

        jLabel6.setText("x²");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 70, 13, 19);
        getContentPane().add(txtVariable2);
        txtVariable2.setBounds(370, 100, 60, 25);

        jLabel7.setText("x");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 70, 7, 19);
        getContentPane().add(JtextVariable1);
        JtextVariable1.setBounds(450, 100, 60, 25);

        jLabel8.setText("Constante");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(520, 70, 80, 19);
        getContentPane().add(JtextConstante);
        JtextConstante.setBounds(520, 100, 60, 25);

        jLabel9.setText("Intervalo de ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 150, 90, 30);
        getContentPane().add(txtVariableA);
        txtVariableA.setBounds(10, 190, 80, 25);

        jLabel10.setText("a");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 190, 8, 19);
        getContentPane().add(JtextVariableB);
        JtextVariableB.setBounds(150, 190, 80, 25);

        jLabel11.setText("% de error relativo");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 240, 130, 19);
        getContentPane().add(TxtError);
        TxtError.setBounds(10, 270, 120, 25);

        jLabel12.setText("Numero de decimales");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 330, 160, 19);
        getContentPane().add(TxtDecimales);
        TxtDecimales.setBounds(10, 370, 110, 25);

        btnGuardado.setText("Iniciar");
        btnGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardado);
        btnGuardado.setBounds(20, 460, 72, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtexVariable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtexVariable6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtexVariable6ActionPerformed

    private void btnGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadoActionPerformed
        // TODO add your handling code here:
        String regexEntero = "-?\\d+"; // Expresión regular para números enteros

// Campo que puede ser un número entero
        JTextField campoEntero = JtextConstante;

        if (!campoEntero.getText().matches(regexEntero)) {
            campoEntero.setBorder(BorderFactory.createLineBorder(Color.RED)); // Poner borde rojo si no es un número entero
            JOptionPane.showMessageDialog(null, "El campo constante puede ser un número entero, positivo o negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            campoEntero.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }


        double x6 = JtexVariable6.getText().isEmpty() ? 0 : Double.parseDouble(JtexVariable6.getText());
        double x5 = txtvariable5.getText().isEmpty() ? 0 : Double.parseDouble(txtvariable5.getText());
        double x4 = JTextvariable4.getText().isEmpty() ? 0 : Double.parseDouble(JTextvariable4.getText());
        double x3 = JTextVariable3.getText().isEmpty() ? 0 : Double.parseDouble(JTextVariable3.getText());
        double x2 = txtVariable2.getText().isEmpty() ? 0 : Double.parseDouble(txtVariable2.getText());
        double x = JtextVariable1.getText().isEmpty() ? 0 : Double.parseDouble(JtextVariable1.getText());
        double c = JtextConstante.getText().isEmpty() ? 0 : Double.parseDouble(JtextConstante.getText());
        double a;
        double b;

        boolean datosCorrectos = false;
        int decimales = 0;
        double error = 0;







        // Validar los campos de texto de los intervalos
        if (!txtVariableA.getText().matches("-?\\d+(\\.\\d+)?") || !JtextVariableB.getText().matches("-?\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Los intervalos deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
            txtVariableA.setBorder(BorderFactory.createLineBorder(Color.RED));
            JtextVariableB.setBorder(BorderFactory.createLineBorder(Color.RED));
            return; // Salir del método si los datos no son válidos
        } else {
            txtVariableA.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JtextVariableB.setBorder(BorderFactory.createLineBorder(Color.BLACK));


            a = Double.parseDouble(txtVariableA.getText());
            b = Double.parseDouble(JtextVariableB.getText());

            //crear dos variables que guarden los valores de a y b y realicen la ecuacion
            double fa = 0;
            double fb = 0;

            //calcular el valor de la funcion en los intervalos
            if (x6 != 0) {
                fa += x6 * Math.pow(a, 6);
                fb += x6 * Math.pow(b, 6);
            }
            if (x5 != 0) {
                fa += x5 * Math.pow(a, 5);
                fb += x5 * Math.pow(b, 5);
            }
            if (x4 != 0) {
                fa += x4 * Math.pow(a, 4);
                fb += x4 * Math.pow(b, 4);
            }
            if (x3 != 0) {
                fa += x3 * Math.pow(a, 3);
                fb += x3 * Math.pow(b, 3);
            }
            if (x2 != 0) {
                fa += x2 * Math.pow(a, 2);
                fb += x2 * Math.pow(b, 2);
            }
            if (x != 0) {
                fa += x * a;
                fb += x * b;
            }
            fa += c;
            fb += c;



            //validar que el error sea un numero
            if (!TxtError.getText().matches("-?\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(null, "El error debe ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
                TxtError.setBorder(BorderFactory.createLineBorder(Color.RED));
                return; // Salir del método si los datos no son válidos
            } else {
                TxtError.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                error = Double.parseDouble(TxtError.getText());
            }



            // Validar que la multiplicación de los valores de los intervalos sea negativa
            if ((fa*fb > 0)) {
                JOptionPane.showMessageDialog(null, "El intervalo debe ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
                txtVariableA.setBorder(BorderFactory.createLineBorder(Color.RED));
                JtextVariableB.setBorder(BorderFactory.createLineBorder(Color.RED));
                return; // Salir del método si los datos no son válidos
            } else {
                txtVariableA.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                JtextVariableB.setBorder(BorderFactory.createLineBorder(Color.BLACK));

               // Validar el campo de texto de decimales
                    if (!TxtDecimales.getText().matches("-?\\d+(\\.\\d+)?")) {
                        JOptionPane.showMessageDialog(null, "El numero de decimales debe ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
                        TxtDecimales.setBorder(BorderFactory.createLineBorder(Color.RED));
                        return; // Salir del método si los datos no son válidos
                    } else {
                        TxtDecimales.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                        decimales = Integer.parseInt(TxtDecimales.getText());
                    }
                }
            }
//raiz con el metodo de biseccion
//contador de iteraciones
        int contador = 0;

        boolean salir = false;

//se crea la tabla para guardar, el numero de iteracion, el punto medio y el error relativo
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Iteracion");
        modelo.addColumn("Punto medio");
        modelo.addColumn("Error relativo");

// Antes de entrar al bucle while
        BigDecimal prevc1 = BigDecimal.ZERO;

//se calcula el valor de la funcion en los intervalos
        while (!salir) {
            contador++;
            double fa = 0;
            double fb = 0;

            if (x6 != 0) {
                fa += x6 * Math.pow(a, 6);
                fb += x6 * Math.pow(b, 6);
            }
            if (x5 != 0) {
                fa += x5 * Math.pow(a, 5);
                fb += x5 * Math.pow(b, 5);
            }
            if (x4 != 0) {
                fa += x4 * Math.pow(a, 4);
                fb += x4 * Math.pow(b, 4);
            }
            if (x3 != 0) {
                fa += x3 * Math.pow(a, 3);
                fb += x3 * Math.pow(b, 3);
            }
            if (x2 != 0) {
                fa += x2 * Math.pow(a, 2);
                fb += x2 * Math.pow(b, 2);
            }
            if (x != 0) {
                fa += x * a;
                fb += x * b;
            }
            fa += c;
            fb += c;

            //se calcula el valor de la funcion en el punto medio
            BigDecimal c1 = BigDecimal.valueOf((a + b) / 2);
            //redondear a las decimales que se le pasen
            c1 = c1.setScale(decimales, RoundingMode.HALF_UP);
            double fc = 0;

            if (x6 != 0) {
                fc += x6 * Math.pow(c1.doubleValue(), 6);
            }
            if (x5 != 0) {
                fc += x5 * Math.pow(c1.doubleValue(), 5);
            }
            if (x4 != 0) {
                fc += x4 * Math.pow(c1.doubleValue(), 4);
            }
            if (x3 != 0) {
                fc += x3 * Math.pow(c1.doubleValue(), 3);
            }
            if (x2 != 0) {
                fc += x2 * Math.pow(c1.doubleValue(), 2);
            }
            if (x != 0) {
                fc += x * c1.doubleValue();
            }
            fc += c;

            //se multiplica el valor de la funcion del punto medio con el de las dos funciones, el resultado que de negativo se asigna a b
            if (fa * fc < 0) {
                b = c1.doubleValue();
                System.out.println("b = " + b);
            } else {
                a = c1.doubleValue();
                System.out.println("a = " + a);
            }

            //calculo el error relativo en la primera iteracion
            if (contador == 1) {
                prevc1 = c1;
                double errorrelativo;
                if (b != 0) {
                    errorrelativo = redondearErrorRelativo(Math.abs((b - a) / b) * 100);
                    //se agrega a la tabla el numero de iteracion, el punto medio y el error relativo
                    modelo.addRow(new Object[]{contador, c1, errorrelativo});

                } else {
                    errorrelativo = 0;
                }
            }

            // Dentro del bucle while
            if (contador != 1) {
                // Calcular el error relativo con BigDecimal
                BigDecimal errorrelativoBD = c1.subtract(prevc1).divide(c1, MathContext.DECIMAL128).abs().multiply(BigDecimal.valueOf(100));

                // Redondear el error relativo a las decimales que se le pasen
                errorrelativoBD = errorrelativoBD.setScale(decimales, RoundingMode.HALF_UP);

                // Convertir el error relativo a double para compararlo con el error
                double errorrelativo = errorrelativoBD.doubleValue();

                // Verificar el error relativo
                if (errorrelativo <= error) {
                    salir = true;
                }

                // Agregar a la tabla el número de iteración, el punto medio y el error relativo
                modelo.addRow(new Object[]{contador, c1, errorrelativoBD});
            }

            // Actualizar prevc1
            prevc1 = c1;
        }

//se imprime la tabla
        JTable tabla = new JTable(modelo);
        JOptionPane.showMessageDialog(null, new JScrollPane(tabla));











        
        
        
        
    }//GEN-LAST:event_btnGuardadoActionPerformed

    //redondear el error relativo a las decimales que se le pasen
    public double redondearErrorRelativo(double valorInicial) {
        BigDecimal bd = new BigDecimal(valorInicial);
        bd = bd.setScale(6, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    //validacion para que los campos de texto solo acepten numeros
    public void validarNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresa solo numeros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    //metodo redondear a las decimales que se le pasen
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        BigDecimal bd = new BigDecimal(valorInicial);
        bd = bd.setScale(numeroDecimales, RoundingMode.HALF_UP);
        return bd.doubleValue();

    }


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
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biseccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField JTextVariable3;
    private JTextField JTextvariable4;
    private JTextField JtexVariable6;
    private JTextField JtextConstante;
    private JTextField JtextVariable1;
    private JTextField JtextVariableB;
    private JTextField TxtDecimales;
    private JTextField TxtError;
    private JButton btnGuardado;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JTextField jTextField10;
    private JTextField txtVariable2;
    private JTextField txtVariableA;
    private JTextField txtvariable5;
    // End of variables declaration//GEN-END:variables
}
