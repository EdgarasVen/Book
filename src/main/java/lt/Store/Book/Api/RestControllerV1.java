package lt.Store.Book.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class RestControllerV1 implements RestApi{

    @Override
    @GetMapping("hello")
    public String hello() {
        return "Hello spring";
    }
}
