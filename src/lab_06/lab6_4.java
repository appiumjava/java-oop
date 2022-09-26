package lab_06;

import java.util.Arrays;

public class lab6_4 {
    public static void main(String[] args) {
//        System.out.print("Enter url: ");
//        Scanner scanner = new Scanner(System.in);
//        String url = scanner.next();
        String url = "https://google.com";
        String httP = "http";
        String httPs = "https";
        String dotCom_domain = ".com";
        String dotNet_domain = ".net";

        String[] spLitStr = url.split("://");
        System.out.println(Arrays.toString(spLitStr));
        if(spLitStr[0].equals(httP)){
            System.out.println("Protocol is: "+httP);
        }else if(spLitStr[0].equals(httPs)) {
            System.out.println("Protocol is: "+httPs);
        }else {
            System.out.println("Protocol is not http or https");
        }

        String myDomain = url.substring(url.indexOf(spLitStr[1]),url.indexOf("."));
        System.out.println("Domain name is: " +myDomain);

        String dotDomain = url.substring(url.indexOf("."));
        if(dotDomain.equals(dotCom_domain)){
            System.out.println("Domain is: "+dotCom_domain);
        }else if(dotDomain.equals(dotNet_domain)) {
            System.out.println("Domain is: "+dotNet_domain);
        }else {
            System.out.println("Domain is not .com or .net");
        }
    }
}


