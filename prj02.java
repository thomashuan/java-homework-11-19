/**
 *@创建人 zhouhuan
 *@创建时间 2017/11/19
 * @描述 java作业第二题程序，将日期字符串转换为日期对象
 */
package java_study;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class prj02 {
    public static Date StrToDate(String str) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String num=in.next();
        System.out.println("字符串转日期：" + prj02.StrToDate(num));
    }
}
