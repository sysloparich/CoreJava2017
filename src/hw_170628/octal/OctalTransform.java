package hw_170628.octal;

public class OctalTransform {
	static String oTransform(int i){
		if(i == 0){
			return new String("0");
		}
		StringBuffer result = new StringBuffer("");
		Integer tmp = i;
		while(Integer.divideUnsigned(tmp.intValue(), 8) != 0){
			Integer mod = Integer.remainderUnsigned(tmp.intValue(), 8);
			tmp = Integer.divideUnsigned(tmp.intValue(), 8);
			result.append(mod.toString());
		}
		Integer mod = Integer.remainderUnsigned(tmp.intValue(), 8);
		result.append(mod.toString());
		return result.reverse().toString();	
	}
}
