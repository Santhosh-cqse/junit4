package junit.extensions;

/**
 * Helper class for string processing operations.
 * Used for test case TC1: Partial resolution scenario (second sibling).
 */
public class TextNormalizer {
    
    private TextNormalizer() {
    }
    
    /**
     * Processes and normalizes a string by validating format,
     * extracting components, and building normalized output.
     * This method contains non-trivial string manipulation logic.
     */
    private static String normalizeInputString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        String[] parts = input.split("\\|");
        
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i].trim();
            if (!part.isEmpty()) {
                if (i > 0) {
                    result.append("-");
                }
                
                // Convert to uppercase and remove special chars
                for (int j = 0; j < part.length(); j++) {
                    char c = part.charAt(j);
                    if (Character.isLetterOrDigit(c)) {
                        result.append(Character.toUpperCase(c));
                    }
                }
            }
        }
        
        return result.length() > 0 ? result.toString() : "DEFAULT";
    }
}
