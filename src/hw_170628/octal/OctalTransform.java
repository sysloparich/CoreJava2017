package hw_170628.octal;

public class OctalTransform {
	static String oTransform(int i){
		if(i == 0){
			return new String("0");
		}
		StringBuffer result = new StringBuffer("");
		Integer tmp = i;
		while(tmp.intValue() / 8 != 0){
			Integer mod = tmp%8;
			tmp = tmp/8;
			result.append(mod.toString());
		}
		Integer mod = tmp%8;
		result.append(mod.toString());
		return result.reverse().toString();	
	}
}
