public class SplitTest {
    public static void main(String[]args){
        String email = "test.email+a@thoughtworks.com";
        String[] s = email.split("@");
        System.out.println(s[0]);
    }


}
