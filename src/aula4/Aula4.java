/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author luis.oliveira2
 */
public class Aula4 {

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 6;
    int f = 8;
    int g = 10;
    
    public static void main(String[] args) {
        Aula4 Val = new Aula4 ();
        String str1 = "Ola mundo  ";
        String str2 = "Ola mundo \n";
        int [] ListNum = {1, 2, 3, 4, 6, 8, 10};
        int resp = 11;
        
        System.out.print(str1);
        System.out.println(str2);
        System.out.print(str2 + str1);
        System.out.printf("Soma da variaveis a e b = %d \n", (Val.a + Val.b));
        if(ListNum[0] + ListNum [6] == resp){
            System.out.print ("resposta correta " + (ListNum[6] - ListNum[0]));
        }
        else {
            System.out.print ("resposta incorreta");
        }
    }
    
}
