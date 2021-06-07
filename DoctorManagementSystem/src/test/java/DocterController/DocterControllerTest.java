package DocterController;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Model.DoctorModel;
import Ultil.Validation;

public class DocterControllerTest {
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	// Test input boundary name with 50 characters
	@Test
	public void inputBoundaryName_NormalCase_ExpectSuccess() {
		boolean expected = true;
		String input = "abcxyzvbcsjcsjbcjsbcsjcbscbksbksckbckscmmgdjsgdjsj";
		boolean output = Validation.isRightName(input);
		Assert.assertEquals(output, expected);
	}

	// Test input invalid name is empty
	@Test
	public void inputInvalidNameIsEmpty_AbnormalCase_ExpectError() {
		boolean expected = false;
		String input = "";
		boolean output = Validation.isRightName(input);
		Assert.assertEquals(output, expected);
	}

	// Test input invalid name with more than 50 characters
	@Test
	public void inputInvalidName_AbnormalCase_ExpectError() {
		boolean expected = false;
		String input = "I'm sitting here in a boring room. It's just another rainy Sunday afternoonaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		boolean output = Validation.isRightName(input);
		Assert.assertEquals(output, expected);
	}

	// Test input valid name with less than 50 characters
	@Test
	public void inputValidName_NormalCase_ExpectSuccess() {
		boolean expected = true;
		String input = "My name is Nguyen Duc Hung";

		boolean output = Validation.isRightName(input);
		Assert.assertEquals(expected, output);
	}

	@Test
	public void inputBoundaryLeapYear_NormalCase_ExpectSuccess() {
		boolean expected = true;
		String input = "29/02/2000";
		boolean output = Validation.isRightDateOfBirth(input);
		Assert.assertEquals(expected, output);

	}

	@Test
	public void inputInvalidMonth_AbnormalCase_ExpectError() {
		boolean expected = false;
		String input = "29/13/2000";
		boolean output = Validation.isRightDateOfBirth(input);
		Assert.assertEquals(expected, output);
	}

	@Test
	public void inputInvalidDay_AbnormalCase_ExpectError() {
		boolean expected = false;
		String input = "32/12/2000";
		boolean output = Validation.isRightDateOfBirth(input);
		Assert.assertEquals(expected, output);
	}

	@Test
	public void inputValidDate_NormalCase_ExpectSuccess() {
		boolean expected = true;
		String input = "31/12/2000";
		boolean output = Validation.isRightDateOfBirth(input);
		Assert.assertEquals(expected, output);
	}

	@Test
	public void inputBoundarySpecialization_NormalCase_ExpectSuccess() {
		boolean expected = true;
		String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddffffffffffffffaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddffffffffffffffaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddfffffffffff";
		boolean output = Validation.isSpecialization(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputInvalidSpecializationIsEmpty_AbnormalCase_ExpectError() {
		boolean expected = false;
		String input = "";
		boolean output = Validation.isSpecialization(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputInvalidSpecialization_AbnormalCase_ExpectError() {
		boolean expected = false;
		String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddffffffffffffffaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddffffffffffffffaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddffffffffffffffff";
		boolean output = Validation.isSpecialization(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputValidSpecialization_NormalCase_ExpectSuccess() {
		boolean expected = true;
		String input = "Specialization is Doctor";
		boolean output = Validation.isSpecialization(input);
		Assert.assertEquals(expected, output);
	}

	@Test
	public void inputBoundaryAvailability_NormalCase_ExpectSuccess() {
		boolean expected = true;
		int input = 3;
		boolean output = Validation.isAvailability(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputValidAvailability_NormalCase_ExpectSuccess() {
		boolean expected = true;
		int input = 2;
		boolean output = Validation.isAvailability(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputValidAvailability_AbnormalCase_ExpectError() {
		boolean expected = false;
		int input = 4;
		boolean output = Validation.isAvailability(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputValidEmail_NormalCase_ExpectSuccess() {
		boolean expected = true;
		String input = "hungndhe140412@gamil.com";
		boolean output = Validation.isEmail(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputInValidEmail_AbnormalCase_ExpectError() {
		boolean expected = false;
		String input = "hungndhe140412gamil.com";
		boolean output = Validation.isEmail(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputValidPhone_NormalCase_ExpectSuccess() {
		boolean expected = true;
		String input = "(999)-999-9999";
		boolean output = Validation.isMobile(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void inputInalidPhone_AbnormalCase_ExpectError() {
		boolean expected = false;
		String input = "(999)999-9999";
		boolean output = Validation.isMobile(input);
		Assert.assertEquals(output, expected);
	}
	//fix
	@Test
	public void inputInalidPhone_AbnormalCase_ExpectError2() {
		boolean expected = false;
		String input = "aaaaaaaaaaaaaaaaaa";
		boolean output = Validation.isMobile(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void deleteDoctorValid_ExpectSuccess() {
		DoctorModel doctorModel = new DoctorModel();
		DocterController docterController = new DocterController();
		doctorModel.setId(Validation.getId(docterController.list));
		docterController.list.add(doctorModel);
		boolean expected = true;
		int input = 1;
		boolean output = docterController.deleteDoctor(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void deleteDoctorInvalid_AbnormalCase_ExpectError() {
		DoctorModel doctorModel = new DoctorModel();
		DocterController docterController = new DocterController();
		doctorModel.setId(Validation.getId(docterController.list));
		docterController.list.add(doctorModel);
		boolean expected = false;
		int input = 2;
		boolean output = docterController.deleteDoctor(input);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void findDoctor_ExpectSuccess() {
		DoctorModel doctorModel = new DoctorModel(1, "H�ng", "31/10/2000", "SE", 0, "kubon9xhd@gmail.com",
				"(999)-999-9999");
		DocterController docterController = new DocterController();
		docterController.list.add(doctorModel);
		boolean expected = true;
		int input = 1;
		String inputName = "H�ng";
		boolean output = docterController.findDoctor(input, inputName);
		Assert.assertEquals(output, expected);
	}

	@Test
	public void findDoctorInvalid_AbnormalCase_ExpectSuccess() {
		DoctorModel doctorModel = new DoctorModel();
		DocterController docterController = new DocterController();
		docterController.list.add(doctorModel);
		boolean expected = false;
		int input = 1;
		String inputName = "H�ng";
		boolean output = docterController.findDoctor(input, inputName);
		Assert.assertEquals(output, expected);
	}

	@Test()
	public void sortDoctor_ExpectSuccess() {
		DocterController docterController = new DocterController();
		DoctorModel doctorModel = new DoctorModel(3, "H�ng", "31/10/2000", "SE", 0, "kubon9xhd@gmail.com",
				"(999)-999-9999");
		DoctorModel doctorModel2 = new DoctorModel(4, "H�ng", "20/09/2000", "SE", 0, "kubon9xhd@gmail.com",
				"(999)-999-9999");
		docterController.list.add(doctorModel);
		docterController.list.add(doctorModel2);
		docterController.sortDoctor();
	}

	@Test
	public void testModel_ExpectSucces() {
		DoctorModel doctorModel2 = new DoctorModel();
		doctorModel2.setId(4);
		doctorModel2.setName("H�ng");
		doctorModel2.setDateOfBirth("20/09/2000");
		doctorModel2.setSpecialization("SE");
		doctorModel2.setAvailability(0);
		doctorModel2.setEmail("kubon9xhd@gmail.com");
		doctorModel2.setMobile("(999)-999-9999");
		System.out.println(doctorModel2.toString());
	}

}
