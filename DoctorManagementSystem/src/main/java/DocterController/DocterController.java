package DocterController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.sound.midi.Soundbank;

import Model.DoctorModel;
import Ultil.Validation;

public class DocterController {
	public List<DoctorModel> list = new ArrayList<DoctorModel>();

	public void createDoctor() {
		DoctorModel model = new DoctorModel();
		int id = Validation.getId(list);
		model.setId(id);
		list.add(model);
		commonDoctor(list.get(id - 1));
		System.out.println(Messages.getString("DocterController.0")); //$NON-NLS-1$

	}

	public void editDoctor() {
		int id = getInteger(Messages.getString("DocterController.1")); //$NON-NLS-1$
		if (isId(id)) {
			commonDoctor(list.get(id - 1));
			System.out.println(Messages.getString("DocterController.2")); //$NON-NLS-1$
		} else {
			System.out.println(Messages.getString("DocterController.3")); //$NON-NLS-1$
		}

	}

	public void commonDoctor(DoctorModel model) {
		String name = getName();
		model.setName(name);

		String date = getDate();
		model.setDateOfBirth(date);

		String specialization = getSpecial();
		model.setSpecialization(specialization);

		int availability = getAvailability();
		model.setAvailability(availability);

		String email = getEmail();
		model.setEmail(email);

		String phone = getPhone();
		model.setMobile(phone);
	}

	public String getName() {
		String name = getString(Messages.getString("DocterController.4")); //$NON-NLS-1$
		while (Validation.isRightName(name)) {
			System.out.println(Messages.getString("DocterController.5")); //$NON-NLS-1$
			name = getString(Messages.getString("DocterController.6")); //$NON-NLS-1$
		}
		return name;
	}

	public String getDate() {
		String date = getString(Messages.getString("DocterController.7")); //$NON-NLS-1$
		while (!Validation.isRightDateOfBirth(date)) {
			System.out.println(Messages.getString("DocterController.8")); //$NON-NLS-1$
			date = getString(Messages.getString("DocterController.9")); //$NON-NLS-1$
		}
		return date;
	}

	public String getSpecial() {
		String specialization = getString(Messages.getString("DocterController.10")); //$NON-NLS-1$
		while (!Validation.isSpecialization(specialization)) {
			System.out.println(Messages.getString("DocterController.11")); //$NON-NLS-1$

			specialization = getString(Messages.getString("DocterController.12")); //$NON-NLS-1$
		}
		return specialization;
	}

	public int getAvailability() {
		int availability = getInteger(Messages.getString("DocterController.13")); //$NON-NLS-1$
		while (!Validation.isAvailability(availability)) {

			availability = getInteger(Messages.getString("DocterController.14")); //$NON-NLS-1$
		}
		return availability;
	}

	public String getEmail() {
		String email = getString(Messages.getString("DocterController.15")); //$NON-NLS-1$
		while (!Validation.isEmail(email)) {
			System.out.println(Messages.getString("DocterController.16")); //$NON-NLS-1$
			email = getString(Messages.getString("DocterController.17")); //$NON-NLS-1$
		}
		return email;
	}

	public String getPhone() {
		String phone = getString(Messages.getString("DocterController.18")); //$NON-NLS-1$
		while (!Validation.isMobile(phone)) {
			phone = getString(Messages.getString("DocterController.19")); //$NON-NLS-1$
		}
		return phone;
	}

	public boolean deleteDoctor(int id) {
		if (isId(id)) {
			for (DoctorModel doctorModel : list) {
				if (doctorModel.getId() == id) {
					list.remove(doctorModel);
					return true;
				}
			}
		}
		return false;
	}

	public boolean findDoctor(int id, String name) {
		if (isId(id)) {
			for (DoctorModel doctorModel : list) {
				System.out.println(doctorModel.getEmail());
				if (doctorModel.getName().equalsIgnoreCase(name)) {
					return true;
				}
			}
		}
		return false;
	}
	//Fix
	public void sortDoctor() {
		Collections.sort(list);
	}

	public boolean isId(int id) {
		for (DoctorModel doctorModel : list) {
			if (doctorModel.getId() == id) {
				return true;
			}
		}
		return false;

	}

	public static String getString(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
		String strs = sc.nextLine();
		return strs;
	}

	private int getInteger(String str) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(str);
			try {
				int number = Integer.parseInt(sc.nextLine());
				if (number < 0)
					throw new Exception();
				return number;
			} catch (Exception e) {
				System.out.println(Messages.getString("DocterController.21")); //$NON-NLS-1$
			}
		}
	}

	public void main(String args[]) {
		while (true) {
			System.out.println(Messages.getString("DocterController.22") + Messages.getString("DocterController.23") //$NON-NLS-1$ //$NON-NLS-2$
					+ Messages.getString("DocterController.24") //$NON-NLS-1$
					+ Messages.getString("DocterController.25") + Messages.getString("DocterController.26")); //$NON-NLS-1$ //$NON-NLS-2$
			int choice = getInteger(Messages.getString("DocterController.27")); //$NON-NLS-1$
			switch (choice) {
			case 1:
				createDoctor();
				break;
			case 2:
				editDoctor();
				break;
			case 3:
				int id = getInteger(Messages.getString("DocterController.28")); //$NON-NLS-1$
				deleteDoctor(id);
				break;
			case 4:
				int idFind = getInteger(Messages.getString("DocterController.29")); //$NON-NLS-1$
				String name = getString(Messages.getString("DocterController.30")); //$NON-NLS-1$
				if (findDoctor(idFind, name)) {
					for (DoctorModel doctorModel : list) {
						if (doctorModel.getId() == idFind) {
							doctorModel.toString();
							break;
						}
					}
				}
				break;
			case 5:
				sortDoctor();
				break;
			default:
				break;
			}
		}
	}
}
