package notificationPkg;

import SpringDemo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//i don't want to use annotation in my main class but i want to Scan a package

public class Client {
    public static void main(String[] args) {
        //we use this in 6.0.8 and greater version since we can't use XmlBeanFactory in greater version
        //Bucket 1
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("projectBean.xml");
        Student s=(Student) classPathXmlApplicationContext.getBean("Student");

        //Bucket 2
        //this will scan the complete package and whenever it see @Component annotation it will create the beans.
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("notificationPkg");

        NotificationService n=(NotificationService)applicationContext.getBean("notificationService");
        n.sendMsg("my code is 5678");

    }
}
