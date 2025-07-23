import java.util.*;
public class EncodeDecode {

  // Encode a list of strings to a single strings
  public String encode(List<String> strs){
    StringBuilder sb = new StringBuilder();
    for(String s : strs){
      sb.append(s.length()).append('#').append(s);
    }
    return sb.toString();
  }

  // Decode a single string to list of strings
  public List<String> decode(String s){
    List<String> res = new ArrayList<>();
    int i = 0;
    while (i < s.length()) {
      int j = i;
      while (s.charAt(j) != '#') {
        j++;
      }
      int len = Integer.parseInt(s.substring(i, j));
      j++;
      res.add(s.substring(j, j + len));
      i = j + len;
    }
    return res;
  }
  public static void main(String[] args){
    String[] str = {"neet", "code", "love", "you"};
    
    // Convert String[] to List<String>
    List<String> strs = Arrays.asList(str);

    // Create an object to access non-static methods
    EncodeDecode codec = new EncodeDecode();

    // Encode
    String encoded = codec.encode(strs);
    System.out.println("Encoded: " + encoded);

    // Decode
    List<String> decoded = codec.decode(encoded);
    System.out.println("Decoded: " + decoded);
  }
}
