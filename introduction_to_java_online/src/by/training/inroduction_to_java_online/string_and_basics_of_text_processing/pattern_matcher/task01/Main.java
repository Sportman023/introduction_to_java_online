package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task01;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �������: C������ ����������, ����������� ����� (����� �������� � ������)
 * � ����������� ��������� � ������� ��� ��������� ��������:
 * ������������� ������ �� ���������� �����������;
 * � ������ ����������� ������������� ����� �� �����;
 * ������������� ������� � ����������� �� �������� ���������� ��������� ��������� �������,
 * � � ������ ��������� � �� ��������.
 * 
 * @author Vadim Ortman
 */

public class Main {

	public static void main(String[] args) {
		
		String string = "Hello, mylll anlllame is Vadim. I just try to create sentece number two. The 3rd sennence.\r\n" +
				"Every dAy AAfter work I leAn JAVAA. It's not enough to have one sentence per paragraph.\r\n" +
				"I like to learn JAVA.\r\n";
		
		Logic logic = new Logic();
		View view = new View();
		Text text = new Text();
		
		logic.generateText(text, string);
		
//		logic.sortParagraphsByNumberOfSentences(text);
//		logic.sortWordsByLength(text);
		logic.sortWordsByAmountOfAskedChar(text, 'l');
		view.printText(text);
		
		
	}

}
