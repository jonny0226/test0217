package com.itheima.test;

import com.itheima.pojo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        //测试同一包下的类 新建对象
        User user = new User();
        user.setUsername("zhangsan");

        /*//测试scanner类
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        int i = scanner.nextInt();// 接收一个键盘录入的整数
        System.out.println("输入的字符串是："+i);

        System.out.println("请输入字符串：");
        String s = scanner.nextLine();
        System.out.println("输入的字符串是："+s);*/

        Scanner sc = new Scanner(System.in);
        // 接收数据
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        String b = sc.next();
        // 对数据进行求和

        System.out.println("第一个数据:" + a + "第一个数据:" + b);

        int[] arr = {1, 3, 5};// arr = 0x11901
        System.out.println(arr[0]);// 1
        change(arr);
        System.out.println(arr[0]);// 200

        System.out.println(Arrays.toString(arr));


        ArrayList<String> list = new ArrayList<>();
        String str1 = "str1";
        String str2 = "str2";
        String str3 = "str3";
        list.add(str1);
        list.add(str2);
        list.add(str3);

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }

    public static void change(int[] arr) {// 0x11901
        arr[0] = 200;
    }


}
