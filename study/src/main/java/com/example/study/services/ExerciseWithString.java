package com.example.study.services;

public class ExerciseWithString {
    public static void main(String args[]) {

        String s = "aaaa   aannnqddtttwebb";
        //a anqdtweb
        //a3 a1n2qd1t2web2
        //a3 a2nn2qd2tt2we1b
        //a3 1a1n2q1d1t2w1e1

        int count = 0;
        char aux = '\u0000';
        String sAux = "";
        StringBuffer sb = new StringBuffer();//It's better use StringBuilder
        for (int i = 0; i < s.length(); i++) {

            char letter = s.charAt(i);

            if (i == s.length() - 1) {
                sb.append(aux).append(count);
            }
            if (aux == '\u0000') {
                aux = letter;
            }

            if (aux == letter) {//aaaa
                count++;
            } else {

                sb.append(aux).append(count == 1 ? "" : (count - 1));

                count = 0;
                aux = letter;
                count++;
            }


        }

        System.out.print(sb);


    }

}
