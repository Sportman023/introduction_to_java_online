package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание: Дана строка, содержащая следующий текст (xml-документ): <notes>
 * <note id = "1"> <to>Вася</to> <from>Света</from>
 * <heading>Напоминание</heading> <body>Позвони мне завтра!</body> </note>
 * <note id = "2"> <to>Петя</to> <from>Маша</from> <heading>Важное
 * напоминание</heading> <body/> </note> </notes> Напишите анализатор,
 * позволяющий последовательно возвращать содержимое узлов xml-документа и его
 * тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
 * Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 * 
 * @author Vadim Ortman
 */

public class Main {

	public static void main(String[] args) {
		String xmlText = "<notes>\n" + "<note id = \"1\">\n" + "<to>Вася</to>\n" + "<from>Света</from>\n"
				+ "<heading>Напоминание</heading>\n" + "<body>Позвони мне завтра!</body>\n" + "</note>\n"
				+ "<note id = \"2\">\n" + "<to>Петя</to>\n" + "<from>Маша</from>\n"
				+ "<heading>Важное напоминание</heading>\n" + "<body/>\n" + "</note>\n" + "</notes>\n";
		xmlAnalyzer(xmlText);
	}

	public static void xmlAnalyzer(String xmlText) {
		String regex = "<(\\w+)[ >]|<(\\w+)[ />]";
		Pattern pt = Pattern.compile(regex);
		Matcher mt = pt.matcher(xmlText);

		String nodeName;

		int beginIndex = 0;
		int endIndex = 0;

		while (mt.find()) {
			beginIndex = mt.end();

			nodeName = (mt.group(2) == null) ? mt.group(1) : mt.group(2) + "\nNode content: Тег без тела";

			System.out.println("Node name: " + nodeName);

			String regexContent = "</" + nodeName + ">";
			Pattern ptContent = Pattern.compile(regexContent);
			Matcher mtContent = ptContent.matcher(xmlText);
			if (mtContent.find(beginIndex)) {
				endIndex = mtContent.start();
				String nodeContent = xmlText.substring(beginIndex, endIndex);
				System.out.println("Node content: " + nodeContent + "\n");
			}
		}
	}

}
