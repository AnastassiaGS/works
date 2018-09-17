package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
 /*  // Item 4
        String str = "Suddenly she came upon a little three-legged table, all made of solid glass.";
        String str1="World";
        String res = str.replace(String.valueOf(str.substring(15)), String.valueOf(str1.substring(2)));
        System.out.println(res);

 //Item 5
        String str2="However, on the second time round, she came upon a low curtain she had not noticed before, and behind it was a little door about fifteen inches high: she tried the little golden key in the lock, and to her great delight it fitted! ";
        String[] words = str2.split(" ");
        String result= "";
        for (int i = 0; i < words.length; i++) {
            boolean wordEnds = words[i].endsWith("nd");
            if (wordEnds) {
                result += words[i] + "hello ";
            } else {
                result +=words[i]+ " ";
            }
        }
        System.out.println(result);


 // Item 6
       String str3 = "Suddenly she ca-me upon a little three-legged table, all made of solid glass.";
        String s1 = Character.toString('-');
        int a=0;
             switch(a)
            {
                case 0:
                System.out.println(str3.replaceAll("[-]", ""));
                break;
                case 1:
                System.out.println(str3.substring(0,3) + s1+str3.substring(4));
                break;
                default:
                System.out.println(str3);
                 }

     // Item 7
        String str4 = " Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it.";
        String words1 = str4.replaceAll("[^\\w]", "");

                String s = Character.toString(' ');
                String result1;
                result1 = words1.substring(0, 15) + s + words1.substring(16);
                System.out.println(result1);

// Item 8
        String str5 = "Suddenly she came upon a little three-legged table{, all made of solid glass}.";
        System.out.println(str5.replaceAll("\\{.*?\\}", ""));

 // Item 9
        String str2 = "Suddenly she came she all little three-legged all, all made she solid glass}.";
        String wordsN = str2.replaceAll("[^\\w]", " ");
        String[] words = wordsN.split(" ");
        String[] strNew = new String[words.length];
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i] = count[i] + 1;
                }
            }
            if (count[i] >0) {
                strNew[i] = words[i] + ":" + count[i];
            }
            System.out.print(strNew[i] + " ");
        }

        System.out.println();

        List<String> results = Arrays.asList(strNew).stream().distinct().collect(Collectors.toList());
        System.out.println(results);

          /*    for (int k = 0; k < strNew.length; k++) {  // 2-nd method (problems with bounds)
                for (int l = 0; l < strNew.length; l++){
                    for (int m = 0; m < strFinal.length; m++) {
                        if (!(strNew[k].equals(strNew[l]))) {
                            strFinal[m] = strNew[l];
                            l++;
                        }
                        System.out.print(strFinal[m] + " ");
                    }
              }}*/


  /*    // Item 17
        String str6 = "Suddenly -!/she c8975ame upon a 65746541 little three-legged tab/59(^le{, all made of solid glass}.";
        String words2=str6.replaceAll("[a-zA-Z]", "");
        String[] word=words2.split(" ");
        System.out.println(words2);
        int max=0;
        String maxStr="";
        for (int i = 0; i < word.length; i++) {
            if (max < word[i].length()) {
                max = word[i].length();
                maxStr = word[i];
            }
        }
        System.out.println(maxStr + " ");

      // Item 18

        String str12 = "Suddenly she came she all little three-legged all, all made she solid glass}.";
        String words8 = str12.replaceAll("[^\\w]", " ");
        String[] word8 = str12.split(" ");
        String strMas = new String("B b C c D d F f G g H h J j K k L l M m N n P p Q q R r S s T t V v X x Z z W w Y y");
        int position = 0;
        String result = "";
        int[] count = new int[word8.length];
        char[] chArray = strMas.toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            for (int j = 0; j < word8.length; j++) {
                position = word8[j].indexOf(chArray[i]);
                j++;

                if (position > -1) {
                    count[i] = count[i] + 1;
                }
                if (count[i] < 3) {
                    result = String.valueOf(chArray[i]);
                }
            }
            System.out.print(result + ", ");

        }


  //Item 19
        String str7 = "Suddenly -!/she c8975ame upon a 65746541 little three-le53gged tab/59(^le{, all made of solid glass}.";
        String[] words3 = str7.split(" ");
        String result2 = "";

        for (int i = 0; i < words3.length; i++) {
            Pattern regexp = Pattern.compile("[(0-9)|(.)]");
            Matcher m = regexp.matcher(words3[i]);
            boolean wordMatches = m.find();
            if (wordMatches) {
                result2 = words3[i] + " ";
            } else {
                result2 = words3[i].substring(0, 1).toUpperCase() + words3[i].substring(1) + " ";
            }
            System.out.print(result2);
        }

        //Item 20
        String str8 = "Suddenly -!/she c8975ame upon a 65746541 little three-le53gged tab/59(^le{, all made of solid glass}.";
        String words4=str8.replaceAll("[[0-9a-zA-Z\\s]]", "");
        String[] word4 = words4.split("");
        int count=0;
        for (int i = 0; i < word4.length; i++) {
            count++;
        }
        System.out.println(count);*/

        //Item 21
     /**  String str9 = "Suddenly -!/she c8975ame upon a 65746541 little three-le53gged tab/59(^le{, all made of solid glass}.";
        String words5=str9.replaceAll("[^0-9]", "");
        System.out.println(words5);
        String[] word5 = words5.split("");
        int sum=0;
        for (int i = 0; i < word5.length; i++) {
            sum+= Integer.parseInt(word5[i]);
        }
        System.out.println(sum);*/

//Item 22

   /**     String str10 = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                //" nothing to do: once or twice she had peeped into the book her sister was reading, but it had no" +
                " Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                /* " pictures or conversations in it, `and what is the use of a book,' thought Alice `without pictures " +*/
    //            "or conversation?'So she was considering in her own mind (as well as she could, for the hot day made" +
    //            " her feel very sleepy and stupid), whether the pleasure of making a daisy-chain would be worth the" +
                /** " trouble of getting up and picking the daisies, when suddenly a White Rabbit with pink eyes ran " +*/
    /*            "close by her.";
        String resultStr1 = "";
 //       resultStr1 =str10.replaceAll("[/*-*//*_/**-*//*_//_$]", "");
 //       System.out.println(resultStr1);*/

    }


}