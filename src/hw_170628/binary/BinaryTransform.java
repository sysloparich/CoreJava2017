package hw_170628.binary;

public class BinaryTransform {

	static String bTransform(int i) {
		if(i == 0){
			return new String("0");
		}
		StringBuffer result = new StringBuffer("");
		Integer tmp = i;
		while(tmp.intValue() / 2 != 0){
			Integer mod = tmp%2;
			tmp = tmp/2;
			result.append(mod.toString());
		}
		result.append("1");
		if(result.charAt(0)=='0'){
		result.deleteCharAt(0);
		}
		return result.reverse().toString();	
	}	
}
