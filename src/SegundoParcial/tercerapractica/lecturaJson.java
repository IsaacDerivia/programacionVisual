package SegundoParcial.tercerapractica;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class lecturaJson {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("/home/isaac/Universidad/Programacion Visual/unedl_PV_2024A/src/SegundoParcial/tercerapractica/DocenTes.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String autor = (String) jsonObject.get("Autor");
            System.out.println("Autor: " + autor);

            JSONArray docentes = (JSONArray) jsonObject.get("Docentes");
            System.out.println("Docentes:");
            for(Object docenteObj : docentes){
                JSONObject docente = (JSONObject) docenteObj;
                String nombre = (String) docente.get("Nombre");
                System.out.println("Nombre: " + nombre);

                Object materiasObj = docente.get("Materias");
                if (materiasObj instanceof String) {
                    System.out.println("Materias: " + materiasObj);
                } else if (materiasObj instanceof JSONObject) {
                    JSONObject materias = (JSONObject) materiasObj;
                    System.out.println("Materias:");
                    for (Object keyObj : materias.keySet()) {
                        String key = (String) keyObj;
                        String materia = (String) materias.get(key);
                        System.out.println(key + ": " + materia);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}