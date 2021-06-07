/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import management_system.Management;
import model.Doctor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SWTTest {
    
    
    
    public SWTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of create method, of class Management.
     */
    @Test
    public void testCreate() {
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
        int size = listDoctor.size();
        Doctor doctor = new Doctor(1, "Nguyen Van A", "05/11/2000", "Y ta", 0, "abcsgdxyz@gmail.com", "(111)-222-3333");
        Management instance = new Management();
        instance.create(listDoctor, doctor);
        Assert.assertEquals(size + 1, listDoctor.size());
    } 
    @Test
    public void testCreateWrong() {
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
        int size = listDoctor.size();
        Doctor doctor = new Doctor(1, "Nguyen Van A", "05/11/2000", "Y ta", 0, "abcsgdxyz@gmail.com", "(111)-222-3333");
        Management instance = new Management();
        instance.create(listDoctor, doctor);
        Assert.assertEquals(size, listDoctor.size());
    }


    @Test
    public void testDelete() {
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
        listDoctor.add(new Doctor(1, "Nguyen Van A", "01/12/2000", "cong an", 1, "acb1@gmail.com", "0886102385"));
        listDoctor.add(new Doctor(2, "Nguyen Van B", "15/08/2005", "Bac si", 2, "acb2@gmail.com", "0234545888"));
        listDoctor.add(new Doctor(3, "Nguyen Van C", "25/12/2010", "cuu hoa", 3, "accb3@gmail.com", "06666888812"));
        listDoctor.add(new Doctor(4, "Nguyen Van D", "07/05/2002", "cong nhan", 3, "acb4@gmail.com", "0888666222"));
        int size = listDoctor.size();
        int id = 1;
        Management instance = new Management();
        instance.delete(listDoctor, id);
        Assert.assertEquals(size - 1, listDoctor.size());
    }
    @Test
    public void testDeleteWrong() {
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
        listDoctor.add(new Doctor(1, "Nguyen Van A", "01/12/2000", "cong an", 1, "acb1@gmail.com", "0886102385"));
        listDoctor.add(new Doctor(2, "Nguyen Van B", "15/08/2005", "Bac si", 2, "acb2@gmail.com", "0234545888"));
        listDoctor.add(new Doctor(3, "Nguyen Van C", "25/12/2010", "cuu hoa", 3, "accb3@gmail.com", "06666888812"));
        listDoctor.add(new Doctor(4, "Nguyen Van D", "07/05/2002", "cong nhan", 3, "acb4@gmail.com", "0888666222"));
        int size = listDoctor.size();
        int id = 1;
        Management instance = new Management();
        instance.delete(listDoctor, id);
        Assert.assertEquals(size, listDoctor.size());
    }

    
    @Test
    public void testSearch() {
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
       listDoctor.add(new Doctor(1, "Nguyen Van A", "01/12/2000", "cong an", 1, "acb1@gmail.com", "0886102385"));
        listDoctor.add(new Doctor(2, "Nguyen Van B", "15/08/2005", "Bac si", 2, "acb2@gmail.com", "0234545888"));
        listDoctor.add(new Doctor(3, "Nguyen Van C", "25/12/2010", "cuu hoa", 3, "accb3@gmail.com", "06666888812"));
        listDoctor.add(new Doctor(4, "Nguyen Van D", "07/05/2002", "cong nhan", 3, "acb4@gmail.com", "0888666222"));
        String name = "Nguyen";
        Management instance = new Management();
        ArrayList<Doctor> list = new ArrayList<Doctor>();
        list = instance.search(listDoctor, name);
        boolean check = true;
        if(list.size() == 0){
            check = false;
        }
        Assert.assertEquals(true, check);
    }
    @Test
    public void testSearchWrong() {
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
       listDoctor.add(new Doctor(1, "Nguyen Van A", "01/12/2000", "cong an", 1, "acb1@gmail.com", "0886102385"));
        listDoctor.add(new Doctor(2, "Nguyen Van B", "15/08/2005", "Bac si", 2, "acb2@gmail.com", "0234545888"));
        listDoctor.add(new Doctor(3, "Nguyen Van C", "25/12/2010", "cuu hoa", 3, "accb3@gmail.com", "06666888812"));
        listDoctor.add(new Doctor(4, "Nguyen Van D", "07/05/2002", "cong nhan", 3, "acb4@gmail.com", "0888666222"));
        String name = "Van E";
        Management instance = new Management();
        ArrayList<Doctor> list = new ArrayList<Doctor>();
        list = instance.search(listDoctor, name);
        boolean check = true;
        if(list.size() == 0){
            check = false;
        }
        Assert.assertEquals(true, check);
    }


    
    
    @Test
    public void testSetId() {
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
        listDoctor.add(new Doctor(1, "Nguyen Van A", "01/12/2000", "cong an", 1, "acb1@gmail.com", "0886102385"));
        listDoctor.add(new Doctor(2, "Nguyen Van B", "15/08/2005", "Bac si", 2, "acb2@gmail.com", "0234545888"));
        listDoctor.add(new Doctor(3, "Nguyen Van C", "25/12/2010", "cuu hoa", 3, "accb3@gmail.com", "06666888812"));
        listDoctor.add(new Doctor(4, "Nguyen Van D", "07/05/2002", "cong nhan", 3, "acb4@gmail.com", "0888666222"));
        int id = 5;
        boolean exp = false;
        boolean check = false;
        
        //check id exits
        for (Doctor d : listDoctor) {
            if(d.getId() == id){
                check = true;
                break;
            }
        }
        
        assertEquals(exp, check);
    }
    
    @Test
    public void testSetIdWrong() throws Exception{
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
        listDoctor.add(new Doctor(1, "Nguyen Van A", "01/12/2000", "cong an", 1, "acb1@gmail.com", "0886102385"));
        listDoctor.add(new Doctor(2, "Nguyen Van B", "15/08/2005", "Bac si", 2, "acb2@gmail.com", "0234545888"));
        listDoctor.add(new Doctor(3, "Nguyen Van C", "25/12/2010", "cuu hoa", 3, "accb3@gmail.com", "06666888812"));
        listDoctor.add(new Doctor(4, "Nguyen Van D", "07/05/2002", "cong nhan", 3, "acb4@gmail.com", "0888666222"));
        int id = 1;
        boolean exp = false;
        boolean check = false;
        
        //check id exits
        for (Doctor d : listDoctor) {
            if(d.getId() == id){
                check = true;
                break;
            }
        }
        
        assertEquals(exp, check);
        
    }

    
 
    
    @Test
    public void testName() {
        //Name is a string which is not longer than 50 characters
        String name = "Abcd Xyz";
        boolean exp = true;
        boolean check = true;
        if(name.trim().length() > 50 && name.length() > 0){
            check = false;
        }
        assertEquals(exp, check);
    }
    @Test
    public void testNameWrong() {
        //Name is a string which is not longer than 50 characters
        String name = "ban hien dang rat cham chi hoc mon swt cua thay pham ngoc ha nhung abcxyz";
        boolean exp = true;
        boolean check = true;
        if(name.trim().length() > 50){
            check = false;
        }
        assertEquals(exp, check);
    }

   
   
   
    @Test
    public void testDate() {
        
        String date = "32/04/2000";
        String regex = "^^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$$";
        boolean exp = true;
        boolean check = true;
        if(!date.matches(regex)){
            check = false;
        }
        assertEquals(exp, check);
    }
    @Test
    public void testDateWrong() {
        
        String date = "35/04/2000";
        String regex = "^^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$$";
        boolean exp = true;
        boolean check = true;
        if(!date.matches(regex)){
            check = false;
        }
        assertEquals(exp, check);
    }

    
    
    
    @Test
    public void testAvailability() {
        int availability = 2;
        boolean exp = true;
        boolean check = true;
        if(availability < 0 || availability > 3){            
            check = false;
        }
        assertEquals(exp, check);
    }
    @Test
    public void testAvailabilityWrong() {
        int availability = 10;
        boolean exp = true;
        boolean check = true;
        if(availability < 0 || availability > 3){            
            check = false;
        }
        assertEquals(exp, check);
    }

 
  
    @Test
    public void testEmail() {
        String email = "abc123@gmail.com";
        String regex = "^[A-za-z][A-Za-z0-9_]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
        boolean exp = true;
        boolean check = true;
        if(!email.matches(regex)){
            check = false;
        }
        assertEquals(exp, check);
    }
    
    @Test
    public void testEmailWrong() {
        String email = "abc123gmail.com";
        String regex = "^[A-za-z][A-Za-z0-9_]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
        boolean exp = true;
        boolean check = true;
        if(!email.matches(regex)){
            check = false;
        }
        assertEquals(exp, check);
    }


    
    @Test
    public void testPhone() {
        //Mobile is a string of number conforming (000)-000-0000 format
        String phone = "000-688-8666";
        String regex = "^\\d{3}-\\d{3}-\\d{4}$";
        boolean exp = true;
        boolean check = true;
        if(!phone.matches(regex)){
            check = false;
        }
        assertEquals(exp, check);
    }
    @Test
    public void testPhoneWrong() {
        //Mobile is a string of number conforming (000)-000-0000 format
        String phone = "001-0002-1234231";
        String regex = "^\\d{3}-\\d{3}-\\d{4}$";
        boolean exp = true;
        boolean check = true;
        if(!phone.matches(regex)){
            check = false;
        }
        assertEquals(exp, check);
    }

  
 
   
    @Test
    public void testSpecialization() {
        //Specialization is a string which is not longer than 50 characters.
        String spec = "bac si";
        boolean exp = true;
        boolean check = true;
        if(spec.trim().length() > 50){
            check = false;
        }
        assertEquals(exp, check);
    }
    @Test
    public void testSpecializationWrong() {
        //Specialization is a string which is not longer than 50 characters.
        String spec = "abcdefghijklmnopqrstwyzxbnjnjnjnjnjnjnjnjnjnjnjnjnjnjnjnjn";
        boolean exp = true;
        boolean check = true;
        if(spec.length() > 50){
            check = false;
        }
        assertEquals(exp, check);
    }
}
