package SpringDemo;

public class SpringClient {

    public static void main(String[] args) {
        // Student object i want to create with all data name,id , address
        Student student=new Student();
        student.setName("john");
        student.setId(1);
        //Since Student class is dependent on Address class so we have to create object of Address claas
        Address address= new Address();
        address.setCity("hisar");
        address.setPincode("12345");
//        student.setAddress(new Address("hisar","123454"));
        //here we are injecting the dependency on Student
        student.setAddress(address);//who is injecting the dependency-> user
        //spring will start doing the same thing ,Spring will be injecting the dependency
        //spring will inject the dependency -> IOC(Control has been inverted)
    }
}
