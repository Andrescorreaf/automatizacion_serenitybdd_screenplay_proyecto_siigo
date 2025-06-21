package com.co.starter.Utils;


import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {

    public static Map<String, String> leerCredenciales(String rutaArchivo, String hoja) {
        Map<String, String> datos = new HashMap<>();
        try (FileInputStream fis = new FileInputStream(new File(rutaArchivo));
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet(hoja);
            Row row = sheet.getRow(1); // Suponiendo que los datos están en la segunda fila (índice 1)

            String usuario = row.getCell(0).getStringCellValue();
            String pass = row.getCell(1).getStringCellValue();

            datos.put("usuario", usuario);
            datos.put("password", pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datos;
    }


}
