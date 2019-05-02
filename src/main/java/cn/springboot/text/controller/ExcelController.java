package cn.springboot.text.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.springboot.text.entity.Area;
import cn.springboot.text.util.InputExcelUtil;

@RestController
public class ExcelController {
    @Autowired
    private InputExcelUtil ie;

    @RequestMapping("/getList")
    public List<Area> getList() throws Exception {
        String filePath = "D:\\JSJ/数据.xlsx";
        List<Area> list = ie.getExcelSheel(filePath);
        System.out.println(list.size());
        for (Area area : list) {

            System.out.println(area.getShengFen());
        }
        return list;
    }
}
