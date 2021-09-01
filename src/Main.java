package src;

import static src.Menu.TermMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setName("Julissa");
        doctor.showName();
        doctor.showId();
    
        //System.out.println( Doctor.consulta());
        //System.out.println( Doctor.estatica );
        //Doctor.estatica = 100;
        //System.out.println( Doctor.estatica );

        Doctor doctorAr = new Doctor();
        doctorAr.setName("Armando");
        doctorAr.showName();
        doctorAr.showId();

        doctor.showId();
        //TermMenu.showMenu();
        showMenu();

    }
}
