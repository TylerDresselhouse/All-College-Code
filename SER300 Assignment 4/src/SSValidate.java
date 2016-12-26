import java.util.ArrayList;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSValidate {
	
	List<String> inList;
	
	String regex = "\\d\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d";
	//matches pattern "###-##-####"
	Pattern pattern = Pattern.compile(regex); //compiles pattern
	
	public SSValidate(List<String> inList) {
		this.inList = inList;
	}
	
	public List<String> Validate() {
		
		List<String> outList = new ArrayList<String>();
		
		for (int i = 0; i < inList.size(); i++) {
			
			Matcher matcher = pattern.matcher(inList.get(i)); //match pattern to list
			
			if (matcher.find() && inList.get(i).length() == 11) {
				//change this to ### ## ####, and must be 11 characters long (spaces count, too)
				outList.add(inList.get(i));
			}
		}
		return outList;
	}
}
