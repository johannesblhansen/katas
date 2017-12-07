package features.resttemplate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {

    @RequestMapping("/resttemplate")
    public String testSomething()  {
        RestTemplate restTemplate = new RestTemplate();
        return "test";
    }

}
