package cn.springboot.text.test;


import org.springframework.web.bind.annotation.*;

@RestController
public class TextController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam String string) {

        return "hello word! 你好 " + string;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post(@RequestBody String st) {

        return st;
    }

    @RequestMapping("/text")
    public int text() {
        String st = "abcdefffs";
        String s = "f";
        char[] chars = st.toCharArray();
        int temp = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 'f') {
                temp++;
            }
        }
        System.out.println(temp);
        return temp;
    }
}
