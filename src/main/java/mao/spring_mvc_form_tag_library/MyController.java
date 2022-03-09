package mao.spring_mvc_form_tag_library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Project name(项目名称)：Spring_MVC_form_tag_library
 * Package(包名): mao.spring_mvc_form_tag_library
 * Class(类名): MyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/9
 * Time(创建时间)： 14:25
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class MyController
{
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String add(@ModelAttribute("user") User user)
    {
        return "addUser";
    }

    @RequestMapping(value = "/showUser", method = RequestMethod.POST)
    public String showuser(User user, HttpSession session, HttpServletRequest request)
    {
        return "showUser";
    }
}
