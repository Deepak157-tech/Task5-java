public class CamelCaseConverter {
    public static void main(String[] args) {
        String sentence = "Intern in Kernsoftware";
        String[] words = sentence.split(" ");

         String camelCase = words[0].toLowerCase();

         for (int i = 1; i < words.length; i++){
             camelCase += words[i].substring(0,1).toUpperCase()
                    + words[i].substring(1).toLowerCase();
        }

         System.out.println("CamelCase: " + camelCase);

         }
    }

