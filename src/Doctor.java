package src;
public class Doctor {
     Integer id = 0;
    private String name;
    private String speciality;
    public static Integer estatica=0;

    public Doctor(){
        this.id++;
    }
    public void showName(){
        System.out.println( this.name);
    }

    public void showId(){
        System.out.println( this.id);
    }

    public static String consulta(){
       return "Consulta agendada"; 
    }

    public void setName(String name){
        this.name = name;
    }
}
