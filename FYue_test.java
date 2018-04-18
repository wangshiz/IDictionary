/*
方越学英语，拿到了一篇英语文章，他没看懂。找王世哲帮忙，王世哲同学需要完成以下任务才能帮助方越进步：
a.写一个程序，每当方越输入一个单词，程序可以告诉他，这个单词在全文中重复了多少次，并且出现的位置在整篇文章第几个。
b.告诉方越全文最长的单词是哪个，并且全文有几个单词.

wang le you duo jiu zai mei ting dao ni dui wo shuo ni zui ai de gu shi wo xiang le hen jiu wo kai shi huang le 
shi bu shi wo you zuo cuo le shen me ni ku zhe dui wo shuo tong hua ni dou shi pian ren de wo bu ke neng shi ni de wang zi
ye xu ni bu hui dong cong ni shuo ai wo yi hou wo de tian kong xing xing dou liang le wo yuan bian cheng tong hua li 
ni ai de na ge tian shi zhang kai shuang shou bian cheng chiiiiiiiii bang shou hu ni ni yao xiang xin xiang xin wo men hui xiang tong hua gu shi li xing fu he kuai le shi jie ju ni ku zhe dui wo shuo tong hua ni dou shi pian ren de 
wo bu ke neng shi ni de wang ziiiowoqpwopqw ye xu ni bu hui dong cong ni shuo ai wo yi hou
wo de tian kong xing xing dou liang le wo yuan bian cheng tong hua li 


注意：文章保存在wenzhang.txt的文件中，你需要让程序先读取txt文件，再把第b题结果通过程序打印来变成并保存在jieguo.txt文件中
*/


package First_IDictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FYue_test {
	public static void main(String[] args) throws Exception{		
        File file = new File("C:\\Users\\Administrator\\Desktop\\J\\wenzhang.txt");
//		File file = new File("wenzhang.txt");
//		String f = file.getAbsolutePath();			//D:\scjs1711\第二阶段\MyFirstJava\wenzhang.txt (系统找不到指定的文件。)
        FileReader reader = new FileReader(file);
        int fileLen = (int)file.length();
        char[] chars = new char[fileLen];
        reader.read(chars);
        String txt = String.valueOf(chars);
        System.out.println(txt);
		System.out.println("-----------------------------------我是分隔符---------------------------------------");
		
		
//		String txt = "wang le you duo jiu zai mei ting dao ni dui wo shuo ni zui ai de gu shi wo xiang le hen jiu wo kai shi huang le shi bu shi wo you zuo cuo le shen me ni ku zhe dui wo shuo tong hua ni dou shi pian ren de wo bu ke neng shi ni de wang ziye xu ni bu hui dong cong ni shuo ai wo yi hou wo de tian kong xing xing dou liang le wo yuan bian cheng tong hua li ni ai de na ge tian shi zhang kai shuang shou bian cheng chiiiiiiiii bang shou hu ni ni yao xiang xin xiang xin wo men hui xiang tong hua gu shi li xing fu he kuai le shi jie ju ni ku zhe dui wo shuo tong hua ni dou shi pian ren de wo bu ke neng shi ni de wang ziiiowoqpwopqw ye xu ni bu hui dong cong ni shuo ai wo yi houwo de tian kong xing xing dou liang le wo yuan bian cheng tong hua li ";
		String[] arrtxt = txt.split(" |\\.|\\,|\\?|\\'|\\!");
//		System.out.println(Arrays.toString(arrtxt));
		Scanner input = new Scanner(System.in);
		String choice = "";
		do{
		int count = 0;
		System.out.print("请输入你要查找的单词：");
		String a = input.next();
		for(int i = 0;i<arrtxt.length;i++){
			if(arrtxt[i].equals(a)){
				count++;
				System.out.println(a+"这个单词出现在文章第"+(i+1)+"个。");
			}
		}
		System.out.println("全文总共出现"+count+"次。");
		System.out.print("是否结束单词检索？（按下y/n）");
		choice = input.next();
		}while(choice.equals("n"));
		
		String[] longest = new String[1];
		longest[0] = " ";
		
		for(int i = 0;i<arrtxt.length;i++){
			if(arrtxt[i].length()>longest[0].length()){
				longest[0] = arrtxt[i];
			}
		}
		
		
		PrintStream ps = new PrintStream("C:\\Users\\Administrator\\Desktop\\J\\jieguo.txt");
		System.setOut(ps); 
		
		System.out.println("最长的单词是"+longest[0]);
		
		System.out.println("全文一共有"+arrtxt.length+"个单词。");
		
	}
}
