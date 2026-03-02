public class OOPSBannerApp {

    /**
     * Inner static class for storing character-to-pattern mappings.
     * Provides immutable access through getters.
     */
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
            "  ***  ", "**   **", "**   **", "**   **", "**   **", "**   **", "  *** "
        });
        maps[1] = new CharacterPatternMap('P', new String[]{
            "****** ", "**   **", "**   **", "****** ", "** ", "** ", "  ** "
        });
        maps[2] = new CharacterPatternMap('S', new String[]{
            " ***** ", "**   **", "** ", " ***** ", "         **", "    **   **", "     ***** "
        });
        maps[3] = new CharacterPatternMap(' ', new String[]{
            "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });

        return maps;
    }

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        
        return charMaps[3].getPattern();
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int lines = 7; // Standard height requirement
        for (int i = 0; i < lines; i++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                sb.append(pattern[i]).append("  "); // Added spacing for readability
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        // Step 1: Create the pattern database
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Step 2: Define and print the message
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}