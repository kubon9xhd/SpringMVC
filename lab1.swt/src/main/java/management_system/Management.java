/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Doctor;
import validate.Validition;


public class Management {

    public Management() {
    }

    Validition vld = new Validition();

    public void menu() {
        System.out.println("\n1. Create a Doctor");
        System.out.println("2. Edit a Doctor Information");
        System.out.println("3. Delete a Doctor");
        System.out.println("4. Search doctor by ID and by Name");
        System.out.println("5. Sort doctor by DateOfBirth");
        System.err.print("Enter your choice: ");
    }

    public void create(ArrayList<Doctor> listDoctor, Doctor d) {
        //Doctor dtor = getDoctor(listDoctor);
        listDoctor.add(d);
    }

    public void edit(ArrayList<Doctor> listDoctor) {
        if (listDoctor.isEmpty()) {
            System.out.println("List empty !");
        } else {
            Doctor d = getDoctorEdit(listDoctor);
            listDoctor.get(d.getId() - 1).setName(d.getName());
            listDoctor.get(d.getId() - 1).setAvailability(d.getAvailability());
            listDoctor.get(d.getId() - 1).setDate(d.getDate());
            listDoctor.get(d.getId() - 1).setPhone(d.getPhone());
            listDoctor.get(d.getId() - 1).setSpecialization(d.getSpecialization());
            listDoctor.get(d.getId() - 1).setEmail(d.getEmail());
            System.out.println("Edited successfully !");
        }
    }

    public void showListDoctor(ArrayList<Doctor> listDoctor) {
        if (listDoctor.isEmpty()) {
            System.out.println("List empty !");
        } else {
            System.out.println("List doctor: ");
            for (Doctor d : listDoctor) {
                System.out.println(d.toString());
            }
        }
    }

    private Doctor getDoctorEdit(ArrayList<Doctor> listDoctor) {
        showListDoctor(listDoctor);
        System.out.print("Enter id doctor you want to edit: ");
        int id = vld.checkEnterNumber(1, listDoctor.size());
        System.out.print("Enter name doctor edit: ");
        String name = vld.checkEnterString();
        System.out.print("Enter date of birth doctor edit: ");
        String date = vld.checkEnterRegex("^\\d{2}/\\d{2}/\\d{4}", "Pls enter â€œdd/MM/yyyyâ€� format!");
        System.out.print("Enter specialization doctor edit: ");
        String specialization = vld.checkEnterString();
        System.out.print("Enter availability doctor edit: ");
        int availability = vld.checkEnterNumber(0, 3);
        System.out.print("Enter email doctor edit: ");
        String email = vld.checkEnterEmail(listDoctor);
        System.out.print("Enter phone doctor edit: ");
        String phone = vld.checkEnterRegex("^\\d{3}-\\d{3}-\\d{4}$", "Pls enter â€œ000-000-0000â€� format!");

        return new Doctor(id, name, date, specialization, availability, email, phone);
    }

    public void delete(ArrayList<Doctor> listDoctor, int index) {
        listDoctor.remove(index - 1);
    }

    public ArrayList<Doctor> search(ArrayList<Doctor> listDoctor, String name) {
        ArrayList<Doctor> list = new ArrayList<Doctor>();
        
        for (Doctor d : listDoctor) {
            if (d.getName().toUpperCase().contains(name.trim().toUpperCase())) {
                list.add(d);
            }
        }
        return list;
    }

    public void sort(ArrayList<Doctor> listDoctor) {
        Collections.sort(listDoctor);
        System.out.println("List doctor after sort: ");
        for (Doctor d : listDoctor) {
            System.out.println(d.toString());
        }
    }

}
