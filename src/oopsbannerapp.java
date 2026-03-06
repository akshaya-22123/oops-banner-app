class oopsbannerapp{
    

    public static void main(String[] args) {
        // 1. Define a String array with a size equal to the number of lines (7)
        String[] lines = new String[7];

        // 2. Populate each index of the array using String.join()
        // We join the patterns for 'O', 'O', 'P', and 'S' with a space separator
        lines[0] = String.join("  ", " ***  ", " ***  ", "***** ", "  *****  ");
        lines[1] = String.join("  ", "*   * ", "*   * ", "*   * ", " **      ");
        lines[2] = String.join("  ", "*   * ", "*   * ", "*   * ", "**       ");
        lines[3] = String.join("  ", "*   * ", "*   * ", "***** ", " *****   ");
        lines[4] = String.join("  ", "*   * ", "*   * ", "*     ", "     **  ");
        lines[5] = String.join("  ", "*   * ", "*   * ", "*     ", "**    ** ");
        lines[6] = String.join("  ", " ***  ", " ***  ", "*     ", "  *****  ");

        // 3. Use a for-each loop to iterate through the array and print each line
        System.out.println("--- OOPS Banner ---");
        for (String line : lines) {
            System.out.println(line);
    }

}
}

