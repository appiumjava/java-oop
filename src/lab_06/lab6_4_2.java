package lab_06;

public class lab6_4_2 {
    public static void main(String[] args) {
//        System.out.print("Enter url: ");
//        Scanner scanner = new Scanner(System.in);
//        String url = scanner.next();
        String url = "https://google.com";

        String[] spLitStr = url.split("://");
//        System.out.println(Arrays.toString(spLitStr));
        System.out.println("Protocol is: "+spLitStr[0]);

        String myDomain = url.substring(url.indexOf(spLitStr[1]),url.indexOf("."));
        System.out.println("Domain name is: " +myDomain);

        String dotDomain = url.substring(url.indexOf("."));
        System.out.println("Domain is: "+dotDomain);
        }
    }

