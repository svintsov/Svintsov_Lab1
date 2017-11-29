package com.bazyl.credits.view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class XLSOutput {

  private static final String FILE_NAME = "results.xls";

  public static void writeResults(Map<Integer, Map<String, Long>> map) {
    Workbook book = new HSSFWorkbook();
    Sheet sheet = book.createSheet("Sortings");
    List<Row> rowList = new ArrayList<Row>();
    List<Cell> cellList = new ArrayList<Cell>();

    Row row = sheet.createRow(0);
    int i = 1;
    for (Integer arrayLength : map.keySet()) {
      row.createCell(i).setCellValue(arrayLength.toString());
      i += 2;
    }

    for (Map.Entry<Integer, Map<String, Long>> entry : map.entrySet()) {
      i = 1;
      for (Map.Entry<String, Long> data : entry.getValue().entrySet()) {
        rowList.add(sheet.createRow(i++));
      }
    }

    int j = 0;
    for (Map.Entry<Integer, Map<String, Long>> entry : map.entrySet()) {

      i = 1;
      for (Map.Entry<String, Long> data : entry.getValue().entrySet()) {
        Cell sortName = rowList.get(i).createCell(j);
        Cell cellTime = rowList.get(i).createCell(j + 1);
        sortName.setCellValue(data.getKey());
        cellTime.setCellValue(data.getValue().toString());
        i++;
      }
      j += 2;

    }

    try {
      book.write(new FileOutputStream(FILE_NAME));
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      book.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
