/*
��ԽѧӢ��õ���һƪӢ�����£���û�������������ܰ�æ��������ͬѧ��Ҫ�������������ܰ�����Խ������
a.дһ������ÿ����Խ����һ�����ʣ�������Ը����������������ȫ�����ظ��˶��ٴΣ����ҳ��ֵ�λ������ƪ���µڼ�����
b.���߷�Խȫ����ĵ������ĸ�������ȫ���м�������.

wang le you duo jiu zai mei ting dao ni dui wo shuo ni zui ai de gu shi wo xiang le hen jiu wo kai shi huang le 
shi bu shi wo you zuo cuo le shen me ni ku zhe dui wo shuo tong hua ni dou shi pian ren de wo bu ke neng shi ni de wang zi
ye xu ni bu hui dong cong ni shuo ai wo yi hou wo de tian kong xing xing dou liang le wo yuan bian cheng tong hua li 
ni ai de na ge tian shi zhang kai shuang shou bian cheng chiiiiiiiii bang shou hu ni ni yao xiang xin xiang xin wo men hui xiang tong hua gu shi li xing fu he kuai le shi jie ju ni ku zhe dui wo shuo tong hua ni dou shi pian ren de 
wo bu ke neng shi ni de wang ziiiowoqpwopqw ye xu ni bu hui dong cong ni shuo ai wo yi hou
wo de tian kong xing xing dou liang le wo yuan bian cheng tong hua li 


ע�⣺���±�����wenzhang.txt���ļ��У�����Ҫ�ó����ȶ�ȡtxt�ļ����ٰѵ�b����ͨ�������ӡ����ɲ�������jieguo.txt�ļ���
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
//		String f = file.getAbsolutePath();			//D:\scjs1711\�ڶ��׶�\MyFirstJava\wenzhang.txt (ϵͳ�Ҳ���ָ�����ļ���)
        FileReader reader = new FileReader(file);
        int fileLen = (int)file.length();
        char[] chars = new char[fileLen];
        reader.read(chars);
        String txt = String.valueOf(chars);
        System.out.println(txt);
		System.out.println("-----------------------------------���Ƿָ���---------------------------------------");
		
		
//		String txt = "wang le you duo jiu zai mei ting dao ni dui wo shuo ni zui ai de gu shi wo xiang le hen jiu wo kai shi huang le shi bu shi wo you zuo cuo le shen me ni ku zhe dui wo shuo tong hua ni dou shi pian ren de wo bu ke neng shi ni de wang ziye xu ni bu hui dong cong ni shuo ai wo yi hou wo de tian kong xing xing dou liang le wo yuan bian cheng tong hua li ni ai de na ge tian shi zhang kai shuang shou bian cheng chiiiiiiiii bang shou hu ni ni yao xiang xin xiang xin wo men hui xiang tong hua gu shi li xing fu he kuai le shi jie ju ni ku zhe dui wo shuo tong hua ni dou shi pian ren de wo bu ke neng shi ni de wang ziiiowoqpwopqw ye xu ni bu hui dong cong ni shuo ai wo yi houwo de tian kong xing xing dou liang le wo yuan bian cheng tong hua li ";
		String[] arrtxt = txt.split(" |\\.|\\,|\\?|\\'|\\!");
//		System.out.println(Arrays.toString(arrtxt));
		Scanner input = new Scanner(System.in);
		String choice = "";
		do{
		int count = 0;
		System.out.print("��������Ҫ���ҵĵ��ʣ�");
		String a = input.next();
		for(int i = 0;i<arrtxt.length;i++){
			if(arrtxt[i].equals(a)){
				count++;
				System.out.println(a+"������ʳ��������µ�"+(i+1)+"����");
			}
		}
		System.out.println("ȫ���ܹ�����"+count+"�Ρ�");
		System.out.print("�Ƿ�������ʼ�����������y/n��");
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
		
		System.out.println("��ĵ�����"+longest[0]);
		
		System.out.println("ȫ��һ����"+arrtxt.length+"�����ʡ�");
		
	}
}
