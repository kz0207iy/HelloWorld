import java.util.HashMap;
import java.util.Map;

class FindLowestTime {
    public static String findLowestTime() {
        String[] strings1 = new String[]{
                "11:11:60", "1:1:60", "1:00:00"};
        int lowestNumber = 0;
        String lowestTime = "";
        Map<String, Integer> map = new HashMap<>();

        for (int j = 0; j < strings1.length; j++) {
            int totalSeconds = 0;
            String[] strings = strings1[j].split(":");
            for (int i = 0; i < strings.length; i++) {
                if (i == 0) {
                    totalSeconds += Integer.valueOf(strings[i]) * 60 * 60;
                } else if (i == 1) {
                    totalSeconds += Integer.valueOf(strings[i]) * 60;
                } else if (i == 2) {
                    totalSeconds += Integer.valueOf(strings[i]);
                }
            }
            if (j == 0) {
                lowestNumber = totalSeconds;
                lowestTime = strings1[j];
            }
            if (totalSeconds < lowestNumber) {
                lowestNumber = totalSeconds;
                lowestTime = strings1[j];
            }
        }
        return lowestTime;
    }


    public static void main(String[] args) {
        System.out.println(findLowestTime());
    }
}