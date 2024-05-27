package SpringDemo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter

public class Address {

    @Getter
    private String city;


    private String pincode;

//    public Address(String city, String pincode) {
//        this.city = city;
//        this.pincode = pincode;
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "city='" + city + '\'' +
//                ", pincode='" + pincode + '\'' +
//                '}';
//    }
//
//    public Address(){
//
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getPincode() {
//        return pincode;
//    }
//
//    public void setPincode(String pincode) {
//        this.pincode = pincode;
//    }
}
