package cn.springboot.text.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
public class AsyncController {
    @Autowired
    private AnyscText at;

    @RequestMapping("/doTask")
    public String doTask() throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        at.task1();
        at.task2();
        at.task3();
        long currentTimeMillis1 = System.currentTimeMillis();
        return "task任务总耗时:" + (currentTimeMillis1 - currentTimeMillis) + "ms";

    }

}
