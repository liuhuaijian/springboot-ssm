package cn.springboot.text.service;


import cn.springboot.text.entity.Area;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReadExcel {

    public List<Area> read() {
        List<Area> list = new ArrayList<Area>();
        try {
            //1、获取文件输出流
            InputStream inputStream = new FileInputStream("D:\\JSJ/数据.xlsx");
            //2、获取execl工作簿对象
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            //3、得到execl工作表对象
            XSSFSheet sheet = workbook.getSheetAt(0);
            //4、循环读取表格数据
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

                Area area = new Area();
                area.setId(id);
                area.setShengFen(shengFen);
                area.setQuYu(quYu);
                area.setNum(num);
                list.add(area);
            }
            //5、关闭流
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeExecl() throws IOException {

    }
}
