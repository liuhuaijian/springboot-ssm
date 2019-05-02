package cn.springboot.text.service;

import cn.springboot.text.entity.Area;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class ReadExcels {

    public List<Area> reads(String filePath) {
        List<Area> list = new ArrayList<Area>();
        Area area = new Area();
        //判断是否为excel文件
        boolean temp = false;
        if (!filePath.endsWith(".xls") && !filePath.endsWith(".xlsx")) {
            System.out.println("文件不是execl类型");
        } else {
            //1、文件输入流
            InputStream inputStream = null;
            //2、获取excel对象
            Workbook workbook = null;
            try {
                inputStream = new FileInputStream(filePath);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (filePath.endsWith(".xls")) {
                    //2003版的excel,.xls结尾
                    workbook = new HSSFWorkbook(inputStream);
                } else {
                    //2007版及以上excel，用.xlsx结尾
                    //  workbook = new XSSFWorkbook(inputStream);
                }
                //3、获取一张表
                Sheet sheet = workbook.getSheetAt(0);
                //4.获取表头，并判断表头是否正确
                Row row = sheet.getRow(0);
                if (row.getPhysicalNumberOfCells() != 4) {
                    System.out.println("表头的数量不对");
                } else {
                    //循环读取表中数据
                    for (Row rows : sheet) {
                        //首行不读
                        if (rows.getRowNum() == 0) {
                            continue;
                        }
                        //读取表中的单元格，索引从0开始
                        String id = rows.getCell(0).getStringCellValue();
                        String shengfen = rows.getCell(1).getStringCellValue();
                        String quYu = rows.getCell(2).getStringCellValue();
                        Double number = rows.getCell(3).getNumericCellValue();
                        Integer num = number.intValue();

                        area.setId(id);
                        area.setShengFen(shengfen);
                        area.setQuYu(quYu);
                        area.setNum(num);
                        list.add(area);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    workbook.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        return list;
    }
}
