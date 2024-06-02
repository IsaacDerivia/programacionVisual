package Proyecto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class panel extends JPanel {

    private DefaultTableModel modelo;
    private JTable tabla;
    private JScrollPane scroll;;

    public panel() {




        setLayout(null);


        // Inicializa la tabla y el JScrollPane al principio
        modelo = new DefaultTableModel();
        modelo.addColumn("Iteración");
        modelo.addColumn("raiz");
        modelo.addColumn("error");
        tabla = new JTable(modelo);
        scroll = new JScrollPane(tabla);
        scroll.setBounds(400, 357, 600, 300);
        add(scroll);

        JLabel lblMetodosNumericos = new JLabel("Métodos Numéricos");
        lblMetodosNumericos.setBounds(21, 25, 227, 36);
        add(lblMetodosNumericos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(702, 26, 90, 36);
        btnCalcular.setBackground(new Color(255, 138, 132)); // Establece el color de fondo a #FF8A84
        btnCalcular.setBorderPainted(false); // Desactiva el dibujo del borde del botón
        add(btnCalcular);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(883, 26, 90, 36);
        btnLimpiar.setBackground(new Color(255, 138, 132)); // Establece el color de fondo a #FF8A84
        btnLimpiar.setBorderPainted(false); // Desactiva el dibujo del borde del botón
        add(btnLimpiar);

        JLabel lblX6 = new JLabel("x⁶");
        lblX6.setBounds(41, 160, 24, 36);
        add(lblX6);

        JTextField txtField = new JTextField();
        txtField.setBounds(41, 221, 100, 50);
        add(txtField);

        JLabel lblX5 = new JLabel("x⁵");
        lblX5.setBounds(191, 160, 24, 36);
        add(lblX5);

        JTextField txtField1 = new JTextField();
        txtField1.setBounds(191, 221, 100, 50);
        add(txtField1);


        JLabel lblX4 = new JLabel("x⁴");
        lblX4.setBounds(338, 160, 24, 36);
        add(lblX4);


        JTextField txtField2 = new JTextField();
        txtField2.setBounds(338, 221, 100, 50);
        add(txtField2);


        JLabel lblX3 = new JLabel("x³");
        lblX3.setBounds(488, 160, 24, 36);
        add(lblX3);

        JTextField txtField3 = new JTextField();
        txtField3.setBounds(488, 221, 100, 50);
        add(txtField3);


        JLabel lblX2 = new JLabel("x²");
        lblX2.setBounds(640, 160, 24, 36);
        add(lblX2);

        JTextField txtField4 = new JTextField();
        txtField4.setBounds(640, 221, 100, 50);
        add(txtField4);

        JLabel lblX = new JLabel("x");
        lblX.setBounds(790, 160, 24, 36);
        add(lblX);

        JTextField txtField5 = new JTextField();
        txtField5.setBounds(790, 221, 100, 50);
        add(txtField5);

        JLabel lblC = new JLabel("C");
        lblC.setBounds(940, 160, 24, 36);
        add(lblC);

        JTextField txtField6 = new JTextField();
        txtField6.setBounds(940, 221, 100, 50);
        add(txtField6);


        JLabel lblIntervalos = new JLabel("Intervalos");
        lblIntervalos.setBounds(40, 357, 113, 36);
        add(lblIntervalos);

        JLabel lblA = new JLabel("a");
        lblA.setBounds(40, 418, 24, 36);
        add(lblA);

        JTextField txtField7 = new JTextField();
        txtField7.setBounds(40, 479, 100, 50);
        add(txtField7);

        JLabel lblB = new JLabel("b");
        lblB.setBounds(191, 418, 24, 36);
        add(lblB);

        JTextField txtField8 = new JTextField();
        txtField8.setBounds(191, 479, 100, 50);
        add(txtField8);


        JLabel lblError = new JLabel("Error");
        lblError.setBounds(28, 593, 199, 50);
        add(lblError);

        JTextField txtField9 = new JTextField();
        txtField9.setBounds(28, 668, 100, 50);
        add(txtField9);

        JLabel lblErrorAceptado = new JLabel("decimales");
        lblErrorAceptado.setBounds(200, 593, 199, 50); // Ajusta la posición x
        add(lblErrorAceptado);

        JTextField txtField10 = new JTextField();
        txtField10.setBounds(200, 668, 100, 50); // Ajusta la posición x
        add(txtField10);

        //crea un boton llamado menu al lado del btn calcular
        JButton btnMenu = new JButton("Menu");
        btnMenu.setBounds(1064, 26, 90, 36);
        btnMenu.setBackground(new Color(255, 138, 132)); // Establece el color de fondo a #FF8A84
        btnMenu.setBorderPainted(false); // Desactiva el dibujo del borde del botón
        add(btnMenu);



        // Añade un borde vacío con título "Método de la Regla Falsa"
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 138, 132)), "Método de la Regla Falsa", 0, 0, new Font("Tahoma", Font.BOLD, 18), new Color(255, 138, 132)));




        //evento para el boton menu
        btnMenu.addActionListener(e -> {
            //se hace visible main y se esconde el panel
            main main = new main();
            main.setVisible(true);
            this.setVisible(false);

        });

        //btncalcular y btnlimpiar
        btnCalcular.addActionListener(e -> {
            boolean esValido = true;


            //se obtienen los con validacion de los campos
            if (!esNumeroValido(txtField.getText())) {
                JOptionPane.showMessageDialog(null, "El campo x⁶ no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                //el marco del txtfield se vuelve rojo
                txtField.setBorder(BorderFactory.createLineBorder(Color.RED));

                esValido = false;
            } else {
                txtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            double x6 = obtenerValor(txtField);

            if (!esNumeroValido(txtField1.getText())) {
                JOptionPane.showMessageDialog(null, "El campo x⁵ no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                //el marco del txtfield se vuelve rojo
                txtField1.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            double x5 = obtenerValor(txtField1);

            //lo mismo para los demas
            if (!esNumeroValido(txtField2.getText())) {
                JOptionPane.showMessageDialog(null, "El campo x⁴ no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField2.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            double x4 = obtenerValor(txtField2);

            if (!esNumeroValido(txtField3.getText())) {
                JOptionPane.showMessageDialog(null, "El campo x³ no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField3.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            double x3 = obtenerValor(txtField3);

            if (!esNumeroValido(txtField4.getText())) {
                JOptionPane.showMessageDialog(null, "El campo x² no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField4.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            double x2 = obtenerValor(txtField4);

            if (!esNumeroValido(txtField5.getText())) {
                JOptionPane.showMessageDialog(null, "El campo x no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField5.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            double x = obtenerValor(txtField5);

            if (!esNumeroValido(txtField6.getText())) {
                JOptionPane.showMessageDialog(null, "El campo C no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField6.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            double c = obtenerValor(txtField6);

            //valida que los campos a y b no esten vacios
            if (txtField7.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo a no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                txtField7.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            if (txtField8.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo b no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                txtField8.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            //valida que los campos a y b sean numeros


            double a = esNumeroValido(txtField7.getText()) ? Double.parseDouble(txtField7.getText()) : 0;


            if (!esNumeroValido(txtField7.getText())) {
                JOptionPane.showMessageDialog(null, "El campo a no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField7.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }



            double b = esNumeroValido(txtField8.getText()) ? Double.parseDouble(txtField8.getText()) : 0;

            if (!esNumeroValido(txtField8.getText())) {
                JOptionPane.showMessageDialog(null, "El campo b no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField8.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }


            if (!esNumeroValido(txtField9.getText())) {
                JOptionPane.showMessageDialog(null, "El campo error no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField9.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            //validar que error sea un numero y no un caracter

            

            double error = esValido ? Double.parseDouble(txtField9.getText()) : 0;




            //mensaje de error para el error, no debe ser negativo ni un caracter solo un numero entero o decimal
            if (error < 0) {
                JOptionPane.showMessageDialog(null, "El error debe ser un número entero o decimal positivo", "Error", JOptionPane.ERROR_MESSAGE);
                txtField9.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            //el campo de error no puede estar vacio
            if (txtField9.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo error no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                txtField9.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }



            if (!esNumeroValido(txtField10.getText())) {
                JOptionPane.showMessageDialog(null, "El campo decimales no es un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtField10.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            //eliminar ceros en decimales
            txtField10.setText(eliminarCeros(txtField10.getText()));

            //validar que el numero no sea un decimal
            if (txtField10.getText().contains(".")) {
                JOptionPane.showMessageDialog(null, "El número de decimales no puede ser un número decimal", "Error", JOptionPane.ERROR_MESSAGE);
                txtField10.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
                return;
            } else {
                txtField10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            //validar que el numero de decimales no sea negativo
            if (esValido == true && Integer.parseInt(txtField10.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "El número de decimales debe ser un número entero y positivo", "Error", JOptionPane.ERROR_MESSAGE);
                txtField10.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            //mensaje de error si el numero de decimales no es un numero entero y positivo
            if (esValido == true && Integer.parseInt(txtField10.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "El número de decimales debe ser un número entero y positivo", "Error", JOptionPane.ERROR_MESSAGE);
                txtField10.setBorder(BorderFactory.createLineBorder(Color.RED));
                esValido = false;
            } else {
                txtField10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            //validacion para el numero de decimales
            int decimales = esValido == true ? Integer.parseInt(txtField10.getText()) : 0;
            //mensaje de error si el numero de decimales no es un numero entero y positivo



            //limitar numero de iteraciones creando una variable
            int iteraciones = 200;






            //se limpia la tabla
            modelo.setRowCount(0);

            //se crean las variables
            double fa = evaluarFuncion(x6, x5, x4, x3, x2, x, c, a);
            double fb = evaluarFuncion(x6, x5, x4, x3, x2, x, c, b);

            //se valida que haya una raiz
            if (fa * fb > 0) {
                JOptionPane.showMessageDialog(null, "No hay raíz en el intervalo", "Error", JOptionPane.ERROR_MESSAGE);
                //los marcos de los intervalos se vuelven rojos

                return;
            }

            //se crea la variable para la raiz
            double xr = 0;
            double xrn = 0;
            double fxr = 0;
            double anterior = 0;

            //se crea la variable para el error
            double errorCalculado = 0;

            //se crea la variable para la iteracion
            int i = 1;

            //ciclo para calcular la raiz
            do {
                //primera iteracion
                if (i == 1) {
                    xr = ((fa*b) - (fb*a)) / (fa - fb);
                    fxr = evaluarFuncion(x6, x5, x4, x3, x2, x, c, xr);

                    //se remplaza el valor en a
                    anterior = a;
                    a = xr;
                    fa = fxr;
                    //se calcula el error
                    errorCalculado = Math.abs((a - anterior) / a)*100;

                    //se agrega a la tabla
                    modelo.addRow(new Object[]{i, redondear(xr, decimales), redondearError(errorCalculado)});
                    i++;


                } else {
                    //se calcula la segunda raiz
                    xrn = b - (((fb*a)-(fb*b))/(fa-fb));
                    //se evalua la funcion
                    fxr = evaluarFuncion(x6, x5, x4, x3, x2, x, c, xrn);
                    //se remplaza el valor en a
                    anterior = a;
                    a = xrn;
                    fa = fxr;
                    //se calcula el error
                    errorCalculado = Math.abs((a - anterior) / a)*100;
                    //se agrega a la tabla
                    modelo.addRow(new Object[]{i, redondear(xrn, decimales), redondearError(errorCalculado)});

                    i++;

                    //se valida el numero de iteraciones
                    if (i > iteraciones) {
                        //mostrar en el mensaje que no se encontro la raiz en la iteracion 200, la raiz es : y el error relativo:
                        JOptionPane.showMessageDialog(null, "No se encontró la raíz en la iteración 200, la raíz es: " + redondear(xrn, decimales) + " y el error relativo es: " + redondearError(errorCalculado), "Error", JOptionPane.ERROR_MESSAGE);

                        break;
                    }




                }
            } while (errorCalculado > error);


            







        });

        btnLimpiar.addActionListener(e -> {
            //el codigo entero para limpiar los campos
            txtField.setText("");
            txtField1.setText("");
            txtField2.setText("");
            txtField3.setText("");
            txtField4.setText("");
            txtField5.setText("");
            txtField6.setText("");
            txtField7.setText("");
            txtField8.setText("");
            txtField9.setText("");
            txtField10.setText("");

            modelo.setRowCount(0);


            // Actualiza la interfaz gráfica
            this.revalidate();
            this.repaint();
        });





    }


    //eliminarCeros
    public static String eliminarCeros(String numero) {
        //si el numero contiene un punto
        if (numero.contains(".")) {
            //mientras el numero contenga un 0 al final
            while (numero.endsWith("0")) {
                //se elimina el 0
                numero = numero.substring(0, numero.length() - 1);
            }
            //si el numero termina en punto se elimina
            if (numero.endsWith(".")) {
                numero = numero.substring(0, numero.length() - 1);
            }
        }
        return numero;
    }


    //metodo para limpiar la tabla
    public static void limpiarTabla(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }


    public static double obtenerValor(JTextField campo) {
        String texto = campo.getText();
        if (texto.isEmpty()) {
            return 0;
        } else {
            return Double.parseDouble(texto);
        }

    }

    //metodo para redondear el error a 16 digitos maximo
    public static double redondearError(double error) {
        return Math.round(error * Math.pow(10, 16)) / Math.pow(10, 16);
    }

    //metodo para validar si es un numero y no un caracter
    public static boolean esNumeroValido(String texto) {
        //validar que sea un numero y que si no tiene nada regrese 0
        if (texto.isEmpty()) {
            return true;
        }
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(255, 138, 132)); // Establece el color a #FF8A84
        g.fillRect(0, 0, 1366, 87); // Dibuja un rectángulo relleno
    }



    public static double redondear(double numero, int decimales) {
        BigDecimal bd = new BigDecimal(Double.toString(numero));
        bd = bd.setScale(decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    //metodo para evaluar la funcion
    public static double evaluarFuncion(double x6, double x5, double x4, double x3, double x2, double x, double c, double x0) {

        return x6 * Math.pow(x0, 6) + x5 * Math.pow(x0, 5) + x4 * Math.pow(x0, 4) + x3 * Math.pow(x0, 3) + x2 * Math.pow(x0, 2) + x * x0 + c;
    }



}











        



