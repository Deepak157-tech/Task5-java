public class GenerateUsername{
    public static void main(String []args){
        String fullName = "Kern Software Solutions";
        String userName = "";

        String [] words = fullName.toLowerCase().split(" ");

        for (String word : words) {
            userName += word.charAt(0);
            if (word.length() > 3){
                userName += word.substring(2);
            }
        }
        System.out.println("UserName: " + userName);
    }
}