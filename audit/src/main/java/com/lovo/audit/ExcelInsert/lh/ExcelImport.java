package com.lovo.audit.ExcelInsert.lh;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelImport {


    public List<Map<String,Object>> importXLS(String fileName,int number){
        List<Map<String,Object>> list = new ArrayList<>();
        try {
            File filePath = new File("D:/财务报表.xls");

       //1、获取文件输入流
       InputStream inputStream = new FileInputStream(fileName);
       //2、获取Excel工作簿对象
                HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
       //3、得到Excel工作表对象
                HSSFSheet sheetAt = workbook.getSheetAt(0);
                //4、循环读取表格数据
      for (Row row : sheetAt) {
          //首行（即表头）不读取
          if (row.getRowNum() == 0) {
              continue;
          }
          //读取当前行中单元格数据，索引从0开始
          String rowNum =null;
          Map<String,Object> map = new HashMap<>();
          for(int i=0;i<number+1;i++){
              if(row.getCell(i)!=null){
                  row.getCell(i).setCellType(Cell.CELL_TYPE_STRING);
                  rowNum=row.getCell(i).getStringCellValue();
                  map.put("row"+i,rowNum);
              }
          }


//          String row2=null;
//          if(row.getCell(0)!=null){
//              row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
//              row2=row.getCell(0).getStringCellValue();
//          }
//          String row3=null;
//          if(row.getCell(0)!=null){
//              row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
//              row3=row.getCell(0).getStringCellValue();
//          }
//          String row4=null;
//          if(row.getCell(0)!=null){
//              row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
//              row4=row.getCell(0).getStringCellValue();
//          }String row5=null;
//          if(row.getCell(0)!=null){
//              row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
//              row5=row.getCell(0).getStringCellValue();
//          }
//          String row6=null;
//          if(row.getCell(0)!=null){
//              row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
//              row6=row.getCell(0).getStringCellValue();
//          }

//          Map<String,Object> map = new HashMap<>();
//          for(int i=0;i<number+1;i++){
//              map.put("row1",rowNum);
//          }
//          map.put("row1",row1);
//          map.put("row2",row2);
//          map.put("row3",row3);
//          map.put("row4",row4);
//          map.put("row5",row5);
//          map.put("row6",row6);
          list.add(map);
                   }
          //5、关闭流
                 workbook.close();
           } catch (IOException e) {
                e.printStackTrace();
            }
         return list;
    }

    public static void main(String[] args) {
        ExcelImport port = new ExcelImport();
        List<Map<String,Object>> list = port.importXLS("D:/财务报表.xls",6);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }

    }
}
