package cn.springboot.text.util;

import cn.springboot.text.entity.Area;
import cn.springboot.text.service.ReadExcels;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

public class ExcelUtils {
    public void exportExcel() throws Exception {
        ReadExcels re = new ReadExcels();
        List<Area> list = re.reads("D:\\JSJ/数据.xlsx");
        //在内存中创建一个excel文件
        Workbook workbook = new XSSFWorkbook();
        //创建工作簿
        Sheet sheet = workbook.createSheet();
        //创建标题行
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("编号");
        row.createCell(1).setCellValue("省份");
        row.createCell(2).setCellValue("区域");
        row.createCell(3).setCellValue("编号");
        //遍历数据，创建数据行
        for (Area a : list) {
            //获取最后一行的行号
            int lastRowNum = sheet.getLastRowNum();
            Row dataRow = sheet.getRow(lastRowNum + 1);
            dataRow.createCell(0).setCellValue(a.getId());
            dataRow.createCell(1).setCellValue(a.getShengFen());
            dataRow.createCell(2).setCellValue(a.getQuYu());
            dataRow.createCell(3).setCellValue(a.getNum());
        }
        //创建文件名
        String fileName = "新数据.xlsx";
        String savePath = "D:\\JSJ/" + fileName;
        //获取输出流对象
        OutputStream fileOut = new FileOutputStream(savePath);
        //写出文件,关闭流
        workbook.write(fileOut);
        workbook.close();
        System.out.println("成功！");
    }
}
