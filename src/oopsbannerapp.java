
   import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * This application demonstrates Object-Oriented Programming concepts 
 * using the Collections Framework to manage and display character patterns.
 */
public class oopsbannerapp {

    // Global map to store character patterns
    private static Map<Character, String[]> characterMap;

    public static void main(String[] args) {
        // Initialize the character pattern database
        characterMap = createCharacterMap();

        // The message we want to display as a banner
        String message = "OOPS";

        // Display the banner in the console
        System.out.println("--- ASCII BANNER ---");
        displayBanner(message, characterMap);
        System.out.println("--------------------");
    }

    /**
     * Part 2: Utility Static Method - Create Character Map
     * Populates a HashMap with ASCII patterns for supported characters.
     */
    public static Map<Character, String[]> createCharacterMap() {
        Map<Character, String[]> map = new HashMap<>();

        // Pattern for 'O'
        map.put('O', new String[]{
            "  ****  ",
            " *    * ",
            " *    * ",
            " *    * ",
            "  ****  "
        });

        // Pattern for 'P'
        map.put('P', new String[]{
            " *****  ",
            " *    * ",
            " *****  ",
            " *      ",
            " *      "
        });

        // Pattern for 'S'
        map.put('S', new String[]{
            "  ***** ",
            " *      ",
            "  ****  ",
            "      * ",
            " *****  "
        });

        return map;
    }

    /**
     * Part 2: Utility Static Method - Display Banner
     * Iterates through each line of the pattern height and builds the banner row by row.
     */
    public static void displayBanner(String message, Map<Character, String[]> charMap) {
        // All patterns must have the same number of rows (height)
        int patternHeight = 5; 

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            // Loop through each character in the message string
            for (char ch : message.toUpperCase().toCharArray()) {
                if (charMap.containsKey(ch)) {
                    // Append the specific line of the current character's pattern
                    rowBuilder.append(charMap.get(ch)[line]).append("  ");
                }
            }
            // Print the assembled row
            System.out.println(rowBuilder.toString());
        }
    }
}

    