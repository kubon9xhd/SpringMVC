/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import management_system.Management;
import model.Doctor;
import validate.Validition;


public class Main {

    public static void main(String[] args) {
        ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();
        listDoctor.add(new Doctor(1, "abc", "12/07/2020", "abc", 1, "abc@gmail.com", "123-133-1235"));
        listDoctor.add(new Doctor(2, "bbc", "02/01/2020", "bbc", 2, "bbc@gmail.com", "113-133-1235"));
        listDoctor.add(new Doctor(3, "cbc", "10/02/2020", "cbc", 3, "cbc@gmail.com", "123-133-1235"));
        Management m = new Management();
        Validition vld = new Validition();
        while (true) {
            m.menu();
            int choice = vld.checkEnterNumber(1, 5);
            switch (choice) {
                case 1:// Create
                    Doctor d = getDoctor(listDoctor);
                    m.create(listDoctor, d);
                    break;
                case 2:// Edit
                    m.edit(listDoctor);
                    break;
                case 3:// Delete
                    int index = getIndexDelete(listDoctor);
                    m.delete(listDoctor, index);
                    updateId(listDoctor, index);
                    break;
                case 4:// Search by ID and Name
                    ArrayList<Doctor> list = new ArrayList<Doctor>();
                    String name = nameSearch();
                    list = m.search(listDoctor, name);
                    showList(list);
                    break;
                case 5:// Sort by date
                    m.sort(listDoctor);
                    break;
            }
        }
    }

    private static Doctor getDoctor(ArrayList<Doctor> listDoctor) {
        Validition vld = new Validition();
        System.out.print("Enter name doctor: ");
        String name = vld.checkEnterString();
        System.out.print("Enter date of birth doctor: ");
        String date = vld.checkEnterRegex("^\\d{2}/\\d{2}/\\d{4}", "Pls enter â€œdd/MM/yyyyâ€� format!");
        System.out.print("Enter specialization doctor: ");
        String specialization = vld.checkEnterString();
        System.out.print("Enter availability doctor: ");
        int availability = vld.checkEnterNumber(0, 3);
        System.out.print("Enter email doctor: ");
        String email = vld.checkEnterEmail(listDoctor);
        System.out.print("Enter phone doctor: ");
        String phone = vld.checkEnterPhone(listDoctor);

        return new Doctor(listDoctor.size() + 1, name, date, specialization, availability, email, phone);
    }

    private static int getIndexDelete(ArrayList<Doctor> listDoctor) {
        Validition vld = new Validition();
        System.out.print("Enter id doctor you want to delete: ");
        return vld.checkEnterNumber(1, listDoctor.size());
    }

    private static void updateId(ArrayList<Doctor> listDoctor, int index) {
        for (int i = index - 1; i < listDoctor.size(); i++) {
            listDoctor.get(i).setId(listDoctor.get(i).getId() - 1);
        }
    }

    private static String nameSearch() {
        Validition vld = new Validition();
        System.out.print("Enter name doctor: ");
        return vld.checkEnterString();
    }

    private static void showList(ArrayList<Doctor> list) {
        System.out.println("List search: ");
        for (Doctor doctor : list) {
            System.out.println(doctor.toString());
        }
    }
}
