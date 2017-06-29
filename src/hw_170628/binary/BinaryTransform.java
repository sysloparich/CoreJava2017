package hw_170628.binary;

public class BinaryTransform {

	static String bTransform(int i) {
		if(i == 0){
			return new String("0");
		}
		StringBuffer result = new StringBuffer("");
		Integer tmp = i;
		while(Integer.divideUnsigned(tmp.intValue(), 2) != 0){
			Integer mod = Integer.remainderUnsigned(tmp, 2);
			tmp = Integer.divideUnsigned(tmp.intValue(), 2);
			result.append(mod.toString());
		}
		result.append("1");
		return result.reverse().toString();	
	}	
}
