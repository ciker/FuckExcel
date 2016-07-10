package me.zacharyjia.fuckexcel.controller.superadmin;

import me.zacharyjia.fuckexcel.common.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by zachary on 16/7/10.
 */
@Controller
@RequestMapping("/sa/users")
public class UsersController extends BaseSaController {

    @Autowired
    private HttpSession session;

    private String result;

    @RequestMapping("")
    public String users(ModelMap map) {
        if ((result = authCheck()) != null) {
            return result;
        }

        map.addAttribute("superAdmin", getLoginSuperAdmin());

        return "sa/users";
    }
}
