package features.asynching;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

@Component
public class MyAsyncComponent {

    @Async
    public Future<String> doSomeWork(String name) throws InterruptedException {
        Random random = new Random();
        int randomInt = random.nextInt(10000);
        System.out.println(name + " " + randomInt);
        Thread.sleep(random.nextInt(randomInt));

        System.out.println(name + " has slept");
        return new AsyncResult<>(name);
    }
}
