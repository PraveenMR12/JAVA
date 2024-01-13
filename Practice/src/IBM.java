//A particular text encrypting scheme encrypts a message by using a key phrase. The key phrase has the same number of words
//as the message to be encrypted. The message is divided into words and each word is encrypted using a corresponding word in 
//the key phrase. The rule for encrypting each word of the message depends on the word from the key phrase that is used to 
//encrypt it. The same key phrase is used to decrypt an encrypted message.
//
//
//
//The encryption works as follows:
//
//The first word of the message is encrypted using the last word of the key phrase. The second word of the message is 
//encrypted using the second to last word of the key phrase and so on
//For example, if the message to be encrypted is "meet at four" and the key phrase is "one orange ball", the word 'meet' is 
//encrypted using 'ball', the word 'at' is encrypted using 'orange', and the word 'four' is encrypted using 'one'
//If the key word has an even number of characters, the word is encrypted by incrementing each of its character by the 
//length of the key word
//For example, if the word to be encrypted is 'give', and the corresponding word in key phrase is 'go', each character in 
//the word is incremented by 2 - since the length of the key word 'go' is 2, and it is an even number. Thus, the letter g is
//encrypted as i ('g' incremented by 2 gives 'i'), the letter i is encrypted as k ('i' incremented by 2 gives 'k'), the 
//letter v is encrypted as x ('v' incremented by 2 gives 'x') and the letter e is encrypted as g ('e' incremented by 2 gives
//'g'). So the encrypted word is 'ikxg'
//If the key word has an odd number of characters, the word is encrypted by decrementing each of its character by the length 
//of the key word
//For example, if the word to be encrypted is 'give', and the corresponding word in key phrase is 'bye', each character in 
//the word is decremented by 3 - since the length of the key word 'bye' is 3, and it is an odd number. Following the kind of 
//transformation as shown above, the letters get encrypted as: 'g'->'d', 'i'->'f', 'v'->'s', 'e'->'b'. So the encrypted word 
//is 'dfsb'
// 
//
//Given a string of encrypted message and the key phrase, the program should return the decrypted message. (The output 
//should not be printed)
//
// 
//
//Function Description
//
//Complete the function decryptMessage in the editor below. The function should return the decrypted message based on the 
//inputs provided
//
//decryptMessage has the following parameter(s):
//
//    encryptedMessage:  a string denoting the encrypted message
//
//    keyPhrase: a string denoting the key phrase to be used for decryption
//
//Constraints
//
//The message to be encrypted and the key phrase should have the same number of words
//For the purpose of this encryption, consider only lower case characters. Consider upper case as invalid input.
//For the purpose of this encryption, consider only the English alphabets and that they repeat in a cycle. 
//For instance while incrementing the letters, after 'z', the next letter should be 'a', then 'b', etc. And while 
//decrementing letters, before 'a', the previous letter would be 'z', and before that 'y', etc.
// 
//
//Input Format For Custom Testing
//Sample Case 0
//Sample Input For Custom Testing
//
//qiix gz clro
//one orange ball
//Sample Output
//
//meet at four
//Explanation
//
//The message is decrypted as follows:
//
//First encrypted word 'qiix' is decrypted using the last word of the phrase, 'ball'. 'ball' is 4 letters long. Since 4 is 
//an even number, encryption was done by incrementing each character by 4. For decrypting, we do the reverse, i.e.,
//decrement each character by 4. This yields 'qiix' -> 'meet'
//Second encrypted word 'gz' is decrypted using the second last word of the phrase, 'orange'. 'orange' is 6 letters long. 
//Since 6 is an even number, encryption was done by incrementing each character by 6. For decrypting, we do the reverse,
//i.e., decrement each character by 6. This yields 'gz' -> 'at'
//Last encrypted word 'clro' is decrypted using the first word of the phrase, 'one'. 'one' is 3 letters long. Since 3 is an
//even number, encryption was done by decrementing each character by 3. For decrypting, we do the reverse, i.e., increment 
//each character by 3. This yields 'clro' -> 'four' use 
//other test cases
//Sample Input For Custom Testing
//
//luaxzn vsa filmrh bpm jxoh 
//one good reason
//Sample Output
//
//Invalid input
//Explanation
//
//The number of words in the message and the number of words in the key phrase are different
//
//Sample Case 2
//Sample Input For Custom Testing
//
//LUAxzn vsa filmrh bpm jxoh 
//one good reason to solve
//Sample Output
//
//Invalid input
//Explanation
//
//The message should contain only lowercase English alphabets (a-z)
//
//Sample Case 3
//Sample Input For Custom Testing
//
//luaxzn vsa filmrh bpm jxoh
//the greatest game ever played
//Sample Output
//
//fourth row behind the mark
//Explanation
//
//Here, by following the rules of the decryption, 'luaxzn' would be decrypted by decrementing each letter by 6 (by reversing
//the rule of encryption and since the key word 'played' is 6 letters long). Note that in this case, the letter a has to be
//cycled back. That is, a special character is not allowed in the decrypted output. So decrementing 'a' by 6 should give 
//'u'( a --> z --> y --> x --> w --> v --> u)

import java.io.*;

class Result {
	public static String decryptMessage(String encryptedMessage, String keyPhrase) {
		String[] encryptedWords = encryptedMessage.split(" ");
		String[] keyWords = keyPhrase.split(" ");
		if (encryptedWords.length != keyWords.length) {
			return "Invalid input";
		}
		StringBuilder decryptedMessage = new StringBuilder();

		for (int i = 0; i < encryptedWords.length; i++) {
			String encryptedWord = encryptedWords[i];
			String keyWord = keyWords[keyWords.length - 1 - i];
			int keyLength = keyWord.length();
			if (!encryptedWord.matches("[a-z]+")) {
				return "Invalid input";
			}

			StringBuilder decryptedWord = new StringBuilder();

			for (int j = 0; j < encryptedWord.length(); j++) {
				char encryptedChar = encryptedWord.charAt(j);
				char decryptedChar;

				if (keyLength % 2 == 0) {
					decryptedChar = (char) (encryptedChar - keyLength);
					if (decryptedChar < 'a') {
						decryptedChar = (char) (decryptedChar + 26);
					}
				} else {
					decryptedChar = (char) (encryptedChar + keyLength);
					if (decryptedChar > 'z') {
						decryptedChar = (char) (decryptedChar - 26);
					}
				}
				decryptedWord.append(decryptedChar);
			}
			decryptedMessage.append(decryptedWord).append(" ");
		}

		return decryptedMessage.toString().trim();
	}
}

public class IBM {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String encryptedMessage = bufferedReader.readLine();
		String keyPhrase = bufferedReader.readLine();

		String result = Result.decryptMessage(encryptedMessage, keyPhrase);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}

