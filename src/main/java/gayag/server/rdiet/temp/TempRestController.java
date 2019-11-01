package gayag.server.rdiet.temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TempRestController {

    @Autowired
    TempService tempService;

    @GetMapping("/list")
    public ArrayList<Temp> tempList() {
        return tempService.getData();
    }
}
