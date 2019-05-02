package cn.springboot.text.util;

import cn.springboot.text.entity.Area;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class InputExcelUtil {
    public List<Area> getExcelSheel(String filePath) throws Exception {
        List<Area> list = new ArrayList<Area>();
        Area area = new Area();
        // 判断是否为excel文件
        if (!filePath.endsWith(".xsl") & !filePath.endsWith(".xlsx")) {
            System.out.println("不是excel文件！");
        } else {
            // IO流读取文件
            InputStream inputStream = new FileInputStream(filePath);
            // 获取EXCEL对象
            Workbook workbook = null;
            if (filePath.endsWith(".xls")) {
                // 2003版及以前版本
                workbook = new HSSFWorkbook(inputStream);
            } else {
                // 2007版及以后版本
                workbook = new XSSFWorkbook(inputStream);
            }
            // 获取一张表
            Sheet sheet = workbook.getSheetAt(0);
            // 获取表头，并判断表头是否正确
//			Row rowHeader = sheet.getRow(0);
//			if (rowHeader.getPhysicalNumberOfCells() != 4) {
//				System.out.println("表头的数量不对！");
//			} else {
            for (Row row : sheet) {
                //首行不读取
                if (row.getRowNum() == 0) {
                    continue;
                }
                //读取表中的单元格，索引从0开始
                String id = row.getCell(0).getStringCellValue();
                String shengFen = row.getCell(1).getStringCellValue();
                String quYu = row.getCell(2).getStringCellValue();
                Double number = row.getCell(3).getNumericCellValue();
                Integer num = number.intValue();

                area.setId(id);
                area.setShengFen(shengFen);
                area.setQuYu(quYu);
                area.setNum(num);
                list.add(area);

            }
//			}
            // 5、关闭流
            workbook.close();
        }
        return list;
    }
}
