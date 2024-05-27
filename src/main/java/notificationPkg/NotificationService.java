package notificationPkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Since i want to create a New object of this class so using Component
@Component("notificationService")//by default this will be there(first letter small"n") but if we want something else then we can define here

public class NotificationService {

    //Since i want to connect the NotificationService and SMSGateway so using Autowired
   //THREE TYPE OF INJECTION
    // @Autowired //1st-> this is for field injection
    private SMSGateway smsGateway;
    //this is depedency injection will happen
    //this is field injection

    // This is best Injection
    //2nd-> Constructor injection so with don't use Autowired
    //constuctor are called by spring in order to create the bean

    public NotificationService(SMSGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    //3rd->Setter injection in this we have to use Autowire since we don't know what to set

    @Autowired
    public void setSmsGateway(SMSGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    @Autowired
    private EmailGateway emailGateway;

    public void sendMsg(String msg){
        smsGateway.sendMsg(msg);
    }




}
