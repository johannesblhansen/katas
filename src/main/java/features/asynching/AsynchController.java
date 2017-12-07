package features.asynching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class AsynchController {

    @Autowired
    MyAsyncComponent myAsyncComponent;

    @RequestMapping("/asynch")
    public String index() throws ExecutionException, InterruptedException {
        System.out.println("Calling A ...");
        Future<String> f1 = myAsyncComponent.doSomeWork("A");

        System.out.println("Calling B ...");
        Future<String> f2 = myAsyncComponent.doSomeWork("B");

        System.out.println("Calling C ...");
        Future<String> f3 = myAsyncComponent.doSomeWork("C");

        String first = "";
        while (true){
            if (f1.isDone()){
                first = f1.get();
                break;
            }
            if (f2.isDone()){
                first = f2.get();
                break;
            }
            if (f3.isDone()){
                first = f3.get();
                break;
            }
        }

        System.out.println("We are done. Winner was " + first);
        return "Greetings from Spring Boot! - First future to return was: " + first;
    }
}