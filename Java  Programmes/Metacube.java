public class Metacube {
          static int[] map = new int[26]; // Array to store frequency of each character
      
          // Method to find the character with the maximum frequency
          public static char maxchar(String str, int idx) {
              int maxcount = 0;
              int maxindex = 0;
              for (int i = 0; i < 26; i++) {
                  if (map[i] > maxcount) {
                      maxcount = map[i];
                      maxindex = i;
                  }
              }
              return (char) (maxindex + 'a'); // Return the character with the highest frequency
          }
      
          // Method to map the frequency of each character in the string
          public static void mapvalue(String str, int idx) {
              if (idx == str.length()) { // Base case: stop when idx reaches the end of the string
                  return;
              }
              char curchar = Character.toLowerCase(str.charAt(idx)); // Convert to lowercase
              int mapIdx = (curchar - 'a'); // Calculate index for lowercase letters
      
              if (mapIdx >= 0 && mapIdx < 26) { // Ensure only valid letters are counted
                  map[mapIdx]++;
              }
      
              mapvalue(str, idx + 1); // Recur for the next character
          }
      
          public static void main(String[] args) {
              String str = "subhayan";
              int idx = 0;
              mapvalue(str, idx); // Populate the frequency map
              System.out.println("Max char: " + maxchar(str, idx)); // Print the character with the highest frequency
          }
      }