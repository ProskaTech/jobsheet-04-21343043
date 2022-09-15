package empatempat.Latihan;

//Created by 21343043_Fadhil Nugraha Wikarya

public class kondisiOperator {
    public static void main(String[] args){
        String status ="";
        int grade = 50;

        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";
        
        //print status
        System.out.println(status);
    }
}
