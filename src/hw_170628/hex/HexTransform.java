package hw_170628.hex;

public class HexTransform {
	
	static StringBuffer helper(StringBuffer result, Integer tmp){
		Integer mod = Integer.remainderUnsigned(tmp, 16);
		if(mod > 9){
			result.append((char)(mod.intValue()+55));
		}
		else{
			result.append(mod.toString());				
		}
		return result;
	}
	
	static String hTransform(int i){
		if(i == 0){
			return new String("0");
		}
		StringBuffer result = new StringBuffer("");
		Integer tmp = i;
		while(Integer.divideUnsigned(tmp.intValue(), 16) != 0){
			result = helper(result, tmp);
			tmp = Integer.divideUnsigned(tmp.intValue(), 16);
		}
		result = helper(result, tmp);
		return result.reverse().toString();	
	}
}
