package codingbat.warmup2;

public class StringBits {
    public String stringBits(String str) {
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i < str.length(); i+=2){
            sb1.append(str.charAt(i));
        }
        return sb1.toString();
    }
/*Учитывая строку, верните новую строку, состоящую из всех остальных символов,
начиная с первого, поэтому «Hello» дает «Hlo».

 String result = "";
  for(int i=0; i < str.length(); i+=2){
    result += str.substring(i, i+1);
  }
  return result;*/
}
