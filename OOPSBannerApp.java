import java.util.HashMap;


public class OOPSBannerApp {

  
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>(); 

       
        charMap.put('O', new String[] {
            "  ***   ",
            "**   ** ",
            "**   ** ",
            "**   ** ",
            "**   ** ",
            "**   ** ",
            "  ***   "
        }); 

        // Pattern for 'P'
        charMap.put('P', new String[] {
            "****** ",
            "**   **",
            "**   **",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        });

        // Pattern for 'S'
        charMap.put('S', new String[] {
            " *****  ",
            "**   ** ",
            "**      ",
            " *****  ",
            "     ** ",
            "**   ** ",
            " *****  "
        });

        return charMap; 
    }
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = 7; 
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder(); 
            for (char ch : message.toUpperCase().toCharArray()) {
                String[] pattern = charMap.get(ch); 
                if (pattern != null) {
                    sb.append(pattern[line]).append(" "); 
                }
            }
            System.out.println(sb.toString()); 
        }
    }
    public static void main(String[] args) {  
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}