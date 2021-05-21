package test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * ClassName:TextDemo3
 * Package:test
 * Description:
 *
 * @Author:HP
 * @date:2021/5/21 16:20
 */
public class TextDemo3 {

    //最难的问题
//    public static String getPlaintext(String s) {
//        char[] c = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','x','Y','Z'};
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == ' ') {
//                sb.append(' ');
//            } else {
//                int n = ((s.charAt(i) - 'A') - 5 + 26) % 26;
//                sb.append(c[n]);
//            }
//        }
//        String res = sb.toString();
//        return res;
//    }


    //因子个数
//    public static int getFactor(int n) {
//        HashSet<Integer> set = new HashSet<>();
////        int i = 2;
////        while(n != 0) {
////            if(n % i == 0) {
////                set.add(i);
////                n /= i;
////            } else {
////                i++;
////            }
////        }
//        while(n != 1) {
//            int i = 0;
//            for (i = 2; i <= n; i++) {
//                if(n % i == 0) {
//                    set.add(i);
//                    break;
//                }
//            }
//            n /= i;
//        }
//        return set.size();
//    }

//    public static int[] distributeCandies(int candies, int num_people) {
//        int[] arr = new int[num_people];
//        int i = 0;
//        int sum = 0;
//        while(candies != 0) {
//            int n = i % 4;
//            if(sum < candies) {
//                arr[n] = i + 1;
//                sum = arr[n];
//            } else {
//                arr[n] = candies;
//            }
//            candies -= sum;
//            i++;
//        }
//        return arr;
//    }

    //1408. 数组中的字符串匹配
//    public List<String> stringMatching(String[] words) {
//        List<String> list = new ArrayList<>();
//        for(int i = 0; i < words.length; i++) {
//            for(int j = 0; j < words.length; j++) {
//                if(words[i].contains(words[j]) && words[i].length() > words[j].length() && !list.contains(words[j])){
//                    list.add(words[j]);
//                }
//            }
//        }
//        return list;
//    }
    public static void main(String[] args) {

//        int candies = 7, num_people = 4;
//        int[] ret = distributeCandies(candies,num_people);
//        for (int i = 0; i < ret.length; i++) {
//            System.out.println(ret[i]);
//        }

//        int n = 20;
//        System.out.println(getFactor(n));
////        char c = ;
//        System.out.println('H' - 'A');
//        String s = "SNHJ";
//        System.out.println(getPlaintext(s));
    }
}
