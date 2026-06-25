package org.junit.internal;

/**
 * Utility class for collection validation and transformation.
 * Used for test case TC4: Mixed same-file and different-file siblings.
 */
public class CollectionValidator {
    
    private CollectionValidator() {
    }

    /**
     * Analyzes and transforms a collection string representation by parsing items,
     * applying filters, and constructing a formatted output with validation.
     * Contains non-trivial string transformation logic.
     */
    private static String analyzeCollection(String itemList) {
        if (itemList == null || itemList.isEmpty()) {
            return "EMPTY";
        }
        
        StringBuilder formatted = new StringBuilder();
        String[] items = itemList.split(";");
        int count = 0;
        
        for (int x = 0; x < items.length; x++) {
            String item = items[x].trim();
            if (item.length() > 0) {
                if (count > 0) {
                    formatted.append("|");
                }
                
                // Transform each character
                for (int p = 0; p < item.length(); p++) {
                    char ch = item.charAt(p);
                    if (Character.isLetterOrDigit(ch)) {
                        formatted.append(Character.toLowerCase(ch));
                    }
                }
                count++;
            }
        }
        
        return count > 0 ? formatted.toString() : "NONE";
    }
}
