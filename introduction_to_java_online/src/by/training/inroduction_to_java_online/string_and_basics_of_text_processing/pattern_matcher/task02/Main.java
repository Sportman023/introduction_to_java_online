package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.pattern_matcher.task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * �������: ���� ������, ���������� ��������� ����� (xml-��������):
 *	<notes>
 *	 	<note id = "1">
 *		 	<to>����</to>
 *		 	<from>�����</from>
 *		 	<heading>�����������</heading>
 *		 	<body>������� ��� ������!</body>
 *	 	</note>
 *	 	<note id = "2">
 *		 	<to>����</to>
 *		 	<from>����</from>
 *		 	<heading>������ �����������</heading>
 *		 	<body/>
 *	 	</note>
 *	</notes>
 * �������� ����������, ����������� ��������������� ����������
 * ���������� ����� xml-��������� � ��� ���
 * (����������� ���, ����������� ���, ���������� ����, ��� ��� ����).
 * ������������ �������� ��������� XML ��� ������� ������ ������ ������.
 * 
 * @author Vadim Ortman
 */

public class Main {

	public static void main(String[] args) {
		String xmlText =  "<notes>\n"
							+ "<note id = \"1\">\n"
								+ "<to>����</to>\n"
								+ "<from>�����</from>\n"
								+ "<heading>�����������</heading>\n"
								+ "<body>������� ��� ������!</body>\n"
							+ "</note>\n"
							+ "<note id = \"2\">\n"
								+ "<to>����</to>\n"
								+ "<from>����</from>\n"
								+ "<heading>������ �����������</heading>\n"
								+ "<body/>\n"
							+ "</note>\n"
						+ "</notes>\n";
		xmlAnalyzer(xmlText);
	}

	public static void xmlAnalyzer(String xmlText) {
		String regex = "<(\\w+)[ >]|<(\\w+)[ />]";
		Pattern pt = Pattern.compile(regex);
		Matcher mt = pt.matcher(xmlText);
		
		String nodeName;
		
		int beginIndex = 0;
		int endIndex = 0;
		
		while(mt.find()) {
			beginIndex = mt.end();
			
			nodeName =  (mt.group(2) == null) ? mt.group(1) : mt.group(2) + "\nNode content: ��� ��� ����";
			
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
