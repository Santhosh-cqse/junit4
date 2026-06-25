package junit.framework;

/**
 * Utility class for format conversion operations.
 * Used for test case TC2: Different package hierarchy scenario.
 */
public class FormatConverter {
    
    private FormatConverter() {
    }
    
    /**
     * Validates and transforms a data string by parsing elements,
     * applying conditional logic, and constructing formatted output.
     * This method contains non-trivial validation and transformation logic.
     */
    private static String validateAndFormat(String data) {
        if (data == null || data.length() == 0) {
            return "INVALID";
        }
        
        StringBuilder output = new StringBuilder();
        String[] elements = data.split(",");
        int validCount = 0;
        
        for (int idx = 0; idx < elements.length; idx++) {
            String element = elements[idx].trim();
            if (element.length() > 0) {
                if (validCount > 0) {
                    output.append("|");
                }
                
                // Process each character
                for (int pos = 0; pos < element.length(); pos++) {
                    char ch = element.charAt(pos);
                    if (Character.isLetterOrDigit(ch)) {
                        output.append(Character.toLowerCase(ch));
                    } else if (ch == '-') {
                        output.append("_");
                    }
                }
                validCount++;
            }
        }
        
        return validCount > 0 ? output.toString() : "EMPTY";
    }
}
