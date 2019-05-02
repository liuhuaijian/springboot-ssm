package cn.springboot.text.test;

import cn.springboot.text.util.ExcelUtils;

public class Test {

    public static void main(String[] arag) {
        ExcelUtils excelUtils = new ExcelUtils();
        try {
            excelUtils.exportExcel();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
