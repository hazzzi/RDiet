package gayag.server.rdiet.temp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TempRestController {

    TempService tempService;

    @GetMapping("/list")
    public List<Temp> tempList() {
        List<Temp> data = tempService.getData();
        return data;
    }
}
