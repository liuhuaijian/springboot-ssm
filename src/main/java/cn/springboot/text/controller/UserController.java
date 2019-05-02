package cn.springboot.text.controller;

import cn.springboot.text.entity.User;
import cn.springboot.text.service.impl.UserServiceImpl;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    @RequestMapping(value = "/getUserSubmit", method = RequestMethod.GET)
    public String getUserSubmit(String name, String password, HttpServletResponse res) {
        //后台代码传送到前台
        res.setHeader("Access-Control-Allow-Origin", "*");
        Map<String, Object> map = new HashMap<String, Object>();
        User user = new User();
        user = userService.getUserSubmit(name, password);
        if (user.getId() != null) {
            map.put("mag", "ok");
        } else {
            map.put("errorMag", "账号或密码错误！");
        }
        return JSONObject.toJSONString(map);
    }
    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        List<User> list = userService.getUsers();
        return list;
    }
    @GetMapping("/userList")
    public ResponseEntity userList (){
        User user = new User();
        List<User> list = userService.findUserListByPage(user);
        return new ResponseEntity(user,HttpStatus.OK);
    }

    @RequestMapping("/getUserByPagehelper")
    public PageInfo<User> getUserByPagehelper(@RequestParam int pageNum){
        PageHelper.startPage(pageNum,5);
        List<User> list = userService.getUsers();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}