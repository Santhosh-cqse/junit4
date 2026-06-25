package org.junit.runner;

/**
 * Utility class for data processing with multiple algorithm variants.
 * Used for test case TC3: Multiple instances in same sibling file.
 */
public class DataProcessor {
    
    private DataProcessor() {
    }
    
    // Helper method for separation
    private static int countElements(String input) {
        return input == null ? 0 : input.split("\\|").length;
    }

    /**
     * First instance: processInputData - processes and transforms input
     * by parsing, validating, and applying formatting rules.
     * Contains non-trivial logic with loops and conditionals.
     */
    private static String processInputData(String content) {
        if (content == null || content.length() == 0) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        String[] parts = content.split("\\|");
        
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

    // Separator method to distinguish clone instances
    private static void logProcessing(String msg) {
        System.out.println("Processing: " + msg);
    }

    /**
     * Second instance: handleInputData - identical logic to processInputData
     * but under a different method name for test scenario.
     * Contains the same non-trivial logic with loops and conditionals.
     */
    private static String handleInputData(String content) {
        if (content == null || content.length() == 0) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        String[] parts = content.split("\\|");
        
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
