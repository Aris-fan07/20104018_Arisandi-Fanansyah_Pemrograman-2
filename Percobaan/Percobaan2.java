package com.Arisandi_F.PBO.modul9.Percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int bil = 10 ; try{
            System.out.println(bil/0);
        }catch(ArithmeticException e){
            System.out.println("Tidak boleh membagi bilangan dengan 0");
        }
    }
}
