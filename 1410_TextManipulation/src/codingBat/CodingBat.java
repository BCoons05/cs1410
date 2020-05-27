package codingBat;

public class CodingBat {
	
	public static String wordEnds(String str, String word) {
  		StringBuilder sb = new StringBuilder();
		  int length = word.length();
		  
		  for(int i = 0; i < str.length(); i++){
			  if(str.length() - i >= word.length()) {
				  if(str.substring(i, i + length).equals(word)){
					  if(i > 0) {
						  sb.append(str.charAt(i - 1));
					  }
					  if(str.length() - i >= word.length() + 1) {
						  sb.append(str.charAt((i + length)));
					  }
				  } 
			  } else {
				  break;
			  }
		  }
		  
		  return sb.toString();
	}
}
