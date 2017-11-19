/**
 *@创建人 zhouhuan
 *@创建时间 2017/11/19
 * @描述 java作业第一题程序，将十六进制数转换为十进制数
 */
package java_study;

import java.util.Scanner;

public class prj01 {
    public static void main(String[] args){
        System.out.println("请输入一个十六进制数");
        Scanner in = new Scanner(System.in);
        String num=in.next();
        try{
            int number=Integer.parseInt(num,16);
            System.out.println(number);
        }
        catch(Exception e){
            System.out.println("请输入正确的十六进制数");
        }
    }
}
