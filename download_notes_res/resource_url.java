// 从下周的note文件里面抽取出来网页链接（虽然网页不能访问，但是curl可以访问）
// 抓紧时间，不一定很快就都不能访问了
import edu.duke.*;


// https://cs50.harvard.edu/web/2020/notes/4/images/all.png > all.png
public class resource_url{
    public static void get_img_address(FileResource fr){
        for (String s : fr.lines()){
            if (s.indexOf("img") != -1){
                if (s.indexOf("images")!= -1){
                    System.out.println(s);
                }
            }
        }
    }

    // 现在就有了网页（src）和图片名（alt）
    // 下一步，可以存这个图片了，
    // 1 上一步的结果是保存在哪里，当然可以找到一个位置，执行一次下载，也可以先存在列表或者哪里
    // 我现在还不会没有长度的列表怎么写，可以写在一个文件里面（外部）
    // 2 如何用java调用curl
    // 3 出现了错误怎么办
    // https://www.cnblogs.com/jimlau/p/13282888.html
    // 是不是觉得很有趣


    public static void main(String[] args){
        FileResource fr = new FileResource("/Users/liting/Desktop/cs50/notes/note1.html");
        get_img_address(fr);
    }
}