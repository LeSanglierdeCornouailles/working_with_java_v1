//Class
public class stringReverse {
    //Method
    public static void main(String[] args){
        String anystring = "campello";
        //checking length
        int anystringlength = anystring.length();
        //using loop
        for (anystringlength = anystring.length(); anystringlength >0;--anystringlength){
            System.out.println(anystring.charAt(anystringlength-1));
        }
    }
}
