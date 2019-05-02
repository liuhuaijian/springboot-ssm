package cn.springboot.text.controller;

import cn.springboot.text.entity.Area;
import cn.springboot.text.service.ReadExcel;
import cn.springboot.text.service.ReadExcels;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AreaController {
    @Autowired
    private ReadExcel re;

    public void setRe(ReadExcel re) {
        this.re = re;
    }

    public ReadExcel getRe() {
        return re;
    }

    @RequestMapping(value = "/getArea")
    public List<Area> getArea() {
        List<Area> list = re.read();

        for (Area a : list) {

            System.out.println(a.getId() + a.getShengFen() + a.getQuYu() + a.getNum());
        }
        return list;
    }
}
