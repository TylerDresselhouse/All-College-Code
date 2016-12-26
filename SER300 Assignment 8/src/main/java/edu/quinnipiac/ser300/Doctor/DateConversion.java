
package edu.quinnipiac.ser300.Doctor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.base.Function;

//Tyler Dresselhouse

public class DateConversion implements Function<String, Date> {

	public Date apply(String string) {

		DateFormat format = new SimpleDateFormat("mm/dd/yy");

		try {
			Date date = format.parse(string);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}