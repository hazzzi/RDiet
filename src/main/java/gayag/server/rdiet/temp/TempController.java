package gayag.server.rdiet.temp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {

    @GetMapping("/")
    public String home() {
        return "forward:index.html";
    }
}
