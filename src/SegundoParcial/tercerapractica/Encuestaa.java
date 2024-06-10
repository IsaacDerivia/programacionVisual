package SegundoParcial.tercerapractica;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;
//import para el json
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.util.Map;


public class Encuestaa {
    private String NombreMaestro;
    private String Materia;
    private int[] respuestas;

    public Encuestaa(String NombreMaestro, String Materia, int[] respuestas) {
        this.NombreMaestro = NombreMaestro;
        this.Materia = Materia;
        this.respuestas = respuestas;
    }

    //metodo para sacarle id al maestro con su nombre 
    public String ConseguirIDMaestro(String nombre) {
        //del json de docentes sacar el id del maestro con su nombre
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("/home/isaac/Universidad/Programacion Visual/unedl_PV_2024A/src/SegundoParcial/tercerapractica/DocenTes.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray docentes = (JSONArray) jsonObject.get("Docentes");
            for (Object docenteObj : docentes) {
                JSONObject docente = (JSONObject) docenteObj;
                String nombreDocente = (String) docente.get("Nombre");
                if (nombreDocente.equals(nombre)) {
                    String id = (String) docente.get("id");
                    return id;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void GuardarEncuesta() {
        try {
            String filePath = "/home/isaac/Universidad/Programacion Visual/unedl_PV_2024A/src/SegundoParcial/tercerapractica/Resultados.csv";
            FileWriter outputfile = new FileWriter(filePath, true);
            CSVWriter writer = new CSVWriter(outputfile);

            // Asegúrate de que el array 'respuestas' tenga 14 elementos
            if (respuestas.length != 14) {
                System.err.println("Error: el array 'respuestas' no tiene 14 elementos.");
                return;
            }

            // Crea un array 'data' con el nombre del maestro, la materia y las 14 respuestas
            String[] data = new String[16];
            data[0] = NombreMaestro;
            data[1] = Materia;
            for (int i = 0; i < 14; i++) {
                data[i + 2] = Integer.toString(respuestas[i]);
            }

            writer.writeNext(data);
            writer.close();
            System.out.println("Datos escritos en el archivo CSV en: " + filePath);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }


}
