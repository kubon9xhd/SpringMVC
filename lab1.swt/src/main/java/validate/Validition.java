/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;


public class Validition {
    public Scanner in = new Scanner(System.in);
    public int checkEnterNumber(int min, int max) {
        while (true) {
            try {
                int result;
                result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkEnterString() {
        String str;
        while (true) {       
            str = in.nextLine().trim();
            if(str.trim().length() == 0 || str.trim() == null){
                System.out.print("Pls enter something not empty: ");
            }else{
                break;
            }
        }
        return str;
    }

    public String checkEnterRegex(String regex, String mess) {
        while (true) {            
            String str = checkEnterString().trim();
            if(!str.matches(regex.trim())){
                System.out.println(mess);
                System.out.print("Enter again: ");
            }else {
                return str;
            }
        }
    }

    public String checkEnterEmail(ArrayList<Doctor> listDoctor) {
        String regex = "^[A-za-z][A-Za-z0-9_]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
        while (true) {            
            String email = checkEnterString().trim();
            if(!email.matches(regex.trim())){
                System.out.println("Pls enter “abc123@gmail.com” format!");
                System.out.print("Enter again: ");
                continue;
            }
            if(checkEmailExited(email, listDoctor)){
                System.out.println("Email has exits!");
                System.out.print("Enter again: ");
            }
            if(email.matches(regex.trim()) && !checkEmailExited(email, listDoctor)){
                return email;
            }
        }
    }

    private boolean checkEmailExited(String email, ArrayList<Doctor> listDoctor) {
        for (Doctor d : listDoctor) {
            if(d.getEmail().equalsIgnoreCase(email)){
                return true;
            }
        }
        return false;
    }

    public String checkEnterPhone(ArrayList<Doctor> listDoctor) {
        String regex = "^\\d{3}-\\d{3}-\\d{4}$";
        while (true) {            
            String phone = checkEnterString().trim();
            if(!phone.matches(regex.trim())){
                System.out.println("Pls enter “000-000-0000” format!");
                System.out.print("Enter again: ");
                continue;
            }
            if(checkPhoneExited(phone, listDoctor)){
                System.out.println("Email has exits!");
                System.out.print("Enter again: ");
            }
            if(phone.matches(regex.trim()) && !checkEmailExited(phone, listDoctor)){
                return phone;
            }
        }
    }

    private boolean checkPhoneExited(String phone, ArrayList<Doctor> listDoctor) {
        for (Doctor d : listDoctor) {
            if(d.getPhone().equalsIgnoreCase(phone)){
                return true;
            }
        }
        return false;
    }
    
}
