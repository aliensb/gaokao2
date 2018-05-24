package ku6.tv.gaokao.utils;

/**
 * Created by john on 2017/10/25.
 */
public class StringUtil {
    public static boolean isBlank(String str){
        if(str==null||"".equals(str)||"".equals(str.trim())){
            return true;
        }
        else
            return false;
    }
}
