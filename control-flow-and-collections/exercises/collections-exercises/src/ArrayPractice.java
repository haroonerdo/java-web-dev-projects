import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < intArray.length; i += 1) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("\n*****");
        for (int j = 0; j < intArray.length; j += 1) {
            if ((intArray[j] % 2) == 0) {
                System.out.print(intArray[j]);
                if (j < intArray.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("\n*****");
        for (int k = 0; k < intArray.length; k += 1) {
            if (intArray[k] % 2 != 0) {
                System.out.print(intArray[k]);
                if (k < intArray.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("\n*****");
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = str.split("\\.");
        System.out.println(Arrays.toString(sentences));
        System.out.println(sentences.length);
        for(int i=0; i<sentences.length; i+=1){
            System.out.println(sentences[i]);
        }
        String[] line1=sentences[0].split(",");
        System.out.println(Arrays.toString(line1));
        System.out.println(line1.length);
        for(int i=0; i<line1.length; i+=1){
            System.out.println(line1[i]);
        }
    }
}


