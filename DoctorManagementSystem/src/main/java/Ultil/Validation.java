package Ultil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Model.DoctorModel;

public class Validation {
	private static final String PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String PATTERN_MOBILE = "^\\([0-9]{3}\\)\\-[0-9]{3}\\-[0-9]{4}$";

	public static Integer getId(List<DoctorModel> list) {
		return (list.isEmpty()) ? 1 : list.get(list.size() - 1).getId() + 1;
	}

	public static boolean isRightName(String name) {
		if (name.trim().length() > 50 || name.trim().length() <= 0) {
			return false;
		}
		return true;
	}

	public static boolean isRightDateOfBirth(String dateOfBirth) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			sdf.parse(dateOfBirth);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	public static boolean isSpecialization(String str) {
		if (str.length() > 0 && str.length() <= 255) {
			return true;
		}
		return false;
	}

	public static boolean isAvailability(Integer n) {
		if (n == 0 || n == 1 || n == 2 || n == 3) {
			return true;
		}
		return false;
	}

	public static boolean isEmail(String str) {
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	public static boolean isMobile(String str) {
		Pattern pattern = Pattern.compile(PATTERN_MOBILE);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
