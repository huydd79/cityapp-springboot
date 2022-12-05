package springboot.huydo.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnvController {
    @Autowired
    CityAppRepository cityRepo;

    @RequestMapping("/env")
    public String home(Model model) {
        return "env";
    }
}