package features.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class HibernateComponent {

    @Autowired
    private AppleRepository appleRepository;

    @Transactional
    public void editingApple(){
        Apple apple = appleRepository.getAppleById("testid123");
        apple.setAppletype("setFromTrans");
    }

    @Transactional
    public void addApple(){
        appleRepository.add(new Apple("testtype"));
    }
}
