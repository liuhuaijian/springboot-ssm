package cn.springboot.text.util;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.List;

public class ExcelUtil {
    /**
     * 导出excel
     *
     * @param title    导出表的标题
     * @param rowsName 导出表的列名
     * @param dataList 需要导出的数据
     * @param fileName 生成excel文件的文件名
     * @param response
     */
    public void exportExcel(String title, String[] rowsName, List<Object> dataList, String fileName,
                            HttpServletResponse response) throws Exception {
        OutputStream outputStream = response.getOutputStream();
        response.reset();
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.setContentType("application/msexcel");
        this.export(title, rowsName, dataList, fileName, outputStream);
        // this.close(outputStream);
    }

    /*
     *导出数据
     */
    public void export(String title, String[] rowsName, List<Object> dataList, String fileName,
                       OutputStream outputStream) throws Exception {
        try {
            Workbook workbook = new XSSFWorkbook();//创建工作簿对象
            Sheet sheet = workbook.createSheet(title);//创建工作表
            Row row = sheet.createRow(0);//产生表格标题行
            Cell cell = row.createCell(0);//创建表格标题列
            // sheet样式定义;    getColumnTopStyle();    getStyle()均为自定义方法 --在下面,可扩展
            // XSSFCellStyle cellStyle = this.getColumnTopStyle(workbook);//获取列头样式对象
            //XSSFCellStyle style = this.getStyle(workbook); // 获取单元格样式对象
            //合并表格标题行，合并列数为列名的长度,第一个0为起始行号，第二个1为终止行号，第三个0为起始列好，第四个参数为终止列号
            // sheet.addMergedRegion(new CellRangeAddress(0, 1, 0, (rowName.length - 1)));
            //cellTiltle.setCellStyle(columnTopStyle);    //设置标题行样式
            //cellTiltle.setCellValue(title);     //设置标题行值
            int columnNum = rowsName.length;     // 定义所需列数
            Row rowRowName = sheet.createRow(1); // 在索引2的位置创建行(最顶端的行开始的第二行)
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
     * 列头单元格样式
     */
    private XSSFCellStyle getColumnTopStyle(XSSFWorkbook workbook) {

        // 设置字体
        XSSFFont font = workbook.createFont();
        // 设置字体大小
        font.setFontHeightInPoints((short) 11);
        // 字体加粗
        // font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setBold(false);
        // 设置字体名字
        font.setFontName("Courier New");
        // 设置样式;
        XSSFCellStyle style = workbook.createCellStyle();
        // 设置底边框;
        style.setBorderBottom(BorderStyle.DASHED);
        //style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
        // 设置底边框颜色;
        //style.setBottomBorderColor(XSSFColor.toXSSFColor());
        //style.setBottomBorderColor(XSSFColor.BLACK.index);
        // 设置左边框;
        //style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        // 设置左边框颜色;
        //style.setLeftBorderColor(HSSFColor.BLACK.index);
        // 设置右边框;
        //style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        // 设置右边框颜色;
        //style.setRightBorderColor(HSSFColor.BLACK.index);
        // 设置顶边框;
        //style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        // 设置顶边框颜色;
        //style.setTopBorderColor(HSSFColor.BLACK.index);
        // 在样式用应用设置的字体;
        style.setFont(font);
        // 设置自动换行;
        style.setWrapText(false);
        // 设置水平对齐的样式为居中对齐;
        // style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // style.setVerticalAlignment();
        // 设置垂直对齐的样式为居中对齐;
        //style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        return style;

    }

    /*
     * 列数据信息单元格样式
     */
    private XSSFCellStyle getStyle(XSSFWorkbook workbook) {
        // 设置字体
        XSSFFont font = workbook.createFont();
        // 设置字体大小
        // font.setFontHeightInPoints((short)10);
        // 字体加粗
        // font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 设置字体名字
        font.setFontName("Courier New");
        // 设置样式;
        XSSFCellStyle style = workbook.createCellStyle();
        // 设置底边框;
        //style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        // 设置底边框颜色;
        //style.setBottomBorderColor(HSSFColor.BLACK.index);
        // 设置左边框;
        //style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        // 设置左边框颜色;
        //style.setLeftBorderColor(HSSFColor.BLACK.index);
        // 设置右边框;
        //style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        // 设置右边框颜色;
        //style.setRightBorderColor(HSSFColor.BLACK.index);
        // 设置顶边框;
        //style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        // 设置顶边框颜色;
        //style.setTopBorderColor(HSSFColor.BLACK.index);
        // 在样式用应用设置的字体;
        //style.setFont(font);
        // 设置自动换行;
        //style.setWrapText(false);
        // 设置水平对齐的样式为居中对齐;
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // 设置垂直对齐的样式为居中对齐;
        //style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        return style;
    }

}
