package lab.lab_06;

public class Lab06_4 {

    /* *
    * String url = "https://google.com";
      Check http OR https; domain name, .com OR .net
    *  */

    public static void main(String[] args) {
        String url = "https://google.com";
         boolean isHttps = url.contains("https");
         boolean isDotCom = url.contains(".com");
         boolean isDotNet = url.contains(".net");

        System.out.println("the url :" + url);
        if (isHttps) {
            System.out.println("Is secure http");
        } else {
            System.out.println("Is NOT secure http");
        }

        if (isDotCom) {
            System.out.println("Is dot com website");
        } else if (isDotNet) {
            System.out.println("Is dot net website");
        }
    }
}
