package staff.test;

import staff.Lecturer;
import staff.StaffMember;

public class StaffTest {
    public static void printStaffDetails(StaffMember staffMember) {
        System.out.println(staffMember.toString());
    }

    public static void main(String[] args) {
        StaffMember newStaff = new StaffMember("Junji Ito", 10000, "11/12/2001", "09/06/2021");
        Lecturer newLecturer = new Lecturer("Pennywise", 2000, "2/7/2003", "08/06/2021", "CSE", "A");

        printStaffDetails(newStaff);
        printStaffDetails(newLecturer);

        System.out.println(newStaff.equals(newLecturer));
        System.out.println(newLecturer.equals(newStaff));

        StaffMember newStaff2 = new StaffMember("Junji Ito", 10000, "11/12/2001", "09/06/2021");
        Lecturer newLecturer2 = new Lecturer("Pennywise", 2000, "2/7/2003", "08/06/2021", "CSE", "A");

        System.out.println(newStaff.equals(newStaff2));
        System.out.println(newLecturer.equals(newLecturer2));
    }
}
