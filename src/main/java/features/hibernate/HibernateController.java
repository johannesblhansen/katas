package features.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HibernateController {

    @Autowired
    private HibernateComponent hibernateComponent;


    @RequestMapping("/hibernate")
    public String doingHibernate() {
        hibernateComponent.addApple();
        return "Succes";
    }

    @RequestMapping("/hibernatet")
    public String doingTransHibernate() {
        hibernateComponent.editingApple();
        return "Succes";
    }
}