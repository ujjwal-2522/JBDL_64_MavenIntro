package SpringDemo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemoClient {
    public static void main(String[] args) {
        //this is a bucket creation
        Resource resource=new ClassPathResource("projectBean.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        //you can still use new keyword in singleton
        Student student2=new Student();
        //bucket has been created
        Student s =(Student)beanFactory.getBean("Student");
        System.out.println(s);
    }
}
