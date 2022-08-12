package easy_problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static void main(String [] args) {
    RomanToInteger obj = new RomanToInteger();
    System.out.println(obj.romanToInt("XLVII"));
  }

  static Map<Character, Integer> romansMap = new HashMap<>();
  static {
    romansMap.put('I', 1);
    romansMap.put('V', 5);
    romansMap.put('X', 10);
    romansMap.put('L', 50);
    romansMap.put('C', 100);
    romansMap.put('D', 500);
    romansMap.put('M', 1000);
  }

  public int romanToInt(String s) {
    int counter = 0;
    int total = 0;
    int romanLength = s.length();

    while (counter < romanLength) {
      if (romanLength - counter >= 2 && (romansMap.get(s.charAt(counter)) < romansMap.get(s.charAt(counter + 1)))) {
        total = total + (romansMap.get(s.charAt(counter + 1)) - romansMap.get(s.charAt(counter)));
        counter += 2;
      } else {
        total = total + romansMap.get(s.charAt(counter));
        counter ++;
      }
    }
    return total;
  }

}
