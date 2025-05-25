package academy.prog.myshortenlink;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlController {
    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }
    @GetMapping("stat")
    public String statistics() {
        return "stat";
    }
}
