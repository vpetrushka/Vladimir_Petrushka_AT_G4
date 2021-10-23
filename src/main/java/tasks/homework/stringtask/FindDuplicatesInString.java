package tasks.homework.stringtask;

public class FindDuplicatesInString {

    public static void findDuplicatesInString(String initial) {

        String[] words = initial.toLowerCase().split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int toCompare = i + 1;
            while (toCompare < words.length) {
                if (words[i].equals(words[toCompare])) {
                    stringBuilder.insert(0, words[i] + " ");
                    break;
                } else
                    toCompare++;
            }
        }
        System.out.println(stringBuilder.reverse());
    }
}
