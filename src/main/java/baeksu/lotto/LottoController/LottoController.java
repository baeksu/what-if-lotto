package baeksu.lotto.LottoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LottoController {

    @GetMapping("/lotto")
    public String get(){
        return "hello world";
    }


}
