package cn.springboot.text;

import cn.springboot.text.entity.Area;
import cn.springboot.text.util.InputExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={TextApplication.class})// 指定启动类
public class TextApplicationTests {
    @Autowired
    private InputExcelUtil inputExcelUtil;
    @Test
    public void contextLoads() throws Exception{
        System.out.println("开始测试！");
        String filePath = "D:\\JSJ/数据.xlsx";
        List<Area> list = inputExcelUtil.getExcelSheel(filePath);
        for (Area area : list){
            System.out.println(area.getNum());
        }
    }

}
