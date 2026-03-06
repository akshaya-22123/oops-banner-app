class oopsbannerapp{
   
    
        
    
    // PART 2: Inner Class to store character-to-pattern mappings
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // PART 3: Outer Class Utility Static Methods
    
    // Method to create the character pattern database
    public static CharacterPatternMap[] createCharacterPatternMap() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[]{"  ***  ", " *   * ", " *   * ", " *   * ", "  ***  "}),
            new CharacterPatternMap('P', new String[]{" ****  ", " *   * ", " ****  ", " *     ", " *     "}),
            new CharacterPatternMap('S', new String[]{"  **** ", " *     ", "  ***  ", "     * ", " ****  "}),
            new CharacterPatternMap(' ', new String[]{"       ", "       ", "       ", "       ", "       "})
        };
    }

    // Method to retrieve a pattern for a specific character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        // Return empty space if character not found
        return getCharacterPattern(' ', charMaps);
    }

    // Method to print the final banner message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int patternHeight = 5; // Height of our ASCII characters
        
        for (int i = 0; i < patternHeight; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Add spacing between letters
            }
            System.out.println(line);
        }
    }

    // PART 4: Main Method
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMap();
        String message = "OOPS";
        
        System.out.println("Displaying Banner for: " + message + "\n");
        printMessage(message, charMaps);
    
}
    
    
}
    