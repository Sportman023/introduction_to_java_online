package by.training.inroduction_to_java_online.string_and_basics_of_text_processing.string_as_an_array;

/**
 * Задание: Замените в строке все вхождения 'word' на 'letter'.
 * 
 * @author Vadim Ortman
 */

public class Task02 {

	public static void main(String[] args) {
		String string = "I can replace word \"word\" on \"letter\": word1, word 2,word3, hello word";
		String word = "word";
		String letter = "letter";
		byte[] byteArrayOfString;
		byte[] byteArrayOfWord;
		byte[] byteArrayOfLetter;

		byteArrayOfString = string.getBytes();
		byteArrayOfWord = word.getBytes();
		byteArrayOfLetter = letter.getBytes();

		for (int i = 0; i < byteArrayOfString.length - byteArrayOfWord.length - 1; i++) {
			if (byteArrayOfString[i] == byteArrayOfWord[0]) {
				boolean isNeededWord = true;
				for (int j = 0; j < word.length(); j++) {
					if (byteArrayOfString[i + j] != byteArrayOfWord[j]) {
						isNeededWord = false;
					}
				}
				if (isNeededWord) {
					byte[] tempArr;
					int tempArrLength;
					tempArrLength = byteArrayOfString.length + letter.length() - word.length();
					tempArr = new byte[tempArrLength];

					int offsetTempArr = 0;

					for (int j = 0; j < byteArrayOfString.length; j++) {
						if (j == i) {
							for (int k = 0; k < letter.length(); k++) {
								tempArr[j + k] = byteArrayOfLetter[k];
							}

							offsetTempArr = letter.length() - word.length();
							j = j + word.length() - 1;
						} else {
							tempArr[j + offsetTempArr] = byteArrayOfString[j];
						}
					}
					byteArrayOfString = tempArr;
					i = i + offsetTempArr;
				}
			}
		}
		string = new String(byteArrayOfString);
		System.out.println(string);
	}
}
