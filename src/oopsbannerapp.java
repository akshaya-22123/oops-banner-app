class oopsbannerapp{
   

    public static void main(String[] args) {
        // Define String Array variable to hold the OOPS banner lines.
        // Each line represents a row in the banner for the letters O, O, P, S.
        // We use String.join(" ", ...) to add spacing between the letter segments.
        String[] lines = {
            String.join(" ", "  ***  ", "  ***  ", " *****  ", " ***** "),
            String.join(" ", " *   * ", " *   * ", " *   *  ", " *     "),
            String.join(" ", " *   * ", " *   * ", " *****  ", " ***** "),
            String.join(" ", " *   * ", " *   * ", " *      ", "     * "),
            String.join(" ", "  ***  ", "  ***  ", " *      ", " ***** "),
        };

        // Use a for-each loop to iterate through the array and print each line
        // to create the visual banner effect in the console.
        for (String line : lines) {
            System.out.println(line);
        }
    
} 
}

    
    



