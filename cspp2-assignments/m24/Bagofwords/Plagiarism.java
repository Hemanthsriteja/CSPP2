import java.util.*;
import java.io.*;
/**.
 * Class for plagiarism.
 */
class Plagiarism {
	/**.
	 * { var_description }
	 */
	private List<String> documentList;

	public Plagiarism() {
		documentList = new List<String>();
	}
	/**.
	 * Gets the document list.
	 *
	 * @return     The document list.
	 */
	public List<String> getDocumentList() {
		return this.documentList;
	}
	/**.
	 * Sets the document list.
	 *
	 * @param      document  The document
	 */
	public void setDocumentList(List<String> document) {
		this.documentList = document;
	}
	/**.
	 * Returns a string representation of the object.
	 *
	 * @param      filename   The filename
	 *
	 * @return     String representation of the object.
	 *
	 * @throws     Exception  { exception_description }
	 */
	public String toString(File filename) throws Exception {
		String s = "";
		Scanner sc = new Scanner(new FileReader(filename));
		StringBuffer sb = new StringBuffer();
		while(sc.hasNext()) {
			sb.append(sc.next());
			sb.append(" ");
		}
		sc.close();
		s = sb.toString();
		return s;
	}
	/**.
	 * Adds a document.
	 *
	 * @param      doc   The document
	 */
	public void addDocument(String doc) {
		documentList.add(doc);
	}
	/**.
	 * { function_description }
	 *
	 * @param      doc        The document
	 * @param      doc1       The document 1
	 *
	 * @return     { description_of_the_return_value }
	 *
	 * @throws     Exception  { exception_description }
	 */
	public int bagOfWords(String doc, String doc1) throws Exception {
		Hashtable<String, Integer> ht1 = count(doc);
		Hashtable<String, Integer> ht2 = count(doc1);
		double dotproduct = dotProduct(ht1, ht2);
		double sqrt = eculidean(ht1);
		double sqrt1 = eculidean(ht2);
		double res = dotproduct / (sqrt * sqrt1);
		return (int)(res*100);
	}
	/**.
	 * { function_description }
	 *
	 * @param      ht1   The height 1
	 * @param      ht2   The height 2
	 *
	 * @return     { description_of_the_return_value }
	 */
	public double dotProduct(Hashtable<String, Integer> ht1, Hashtable<String, Integer> ht2 ) {
		double product = 0.0;
		for (String element : ht1.keySet()) {
			for(String element1 : ht2.keySet()) {
				if(element.equals(element1)){
					product += ht1.get(element) * ht2.get(element);
				}
			}
		}
		return product;
	}

	/**.
	 * { function_description }
	 *
	 * @param      ht    The height
	 *
	 * @return     { description_of_the_return_value }
	 */
	public double eculidean(Hashtable<String, Integer> ht) {
		double sum = 0.0;
		for (String element : ht.keySet()) {
			sum += Math.pow(ht.get(element), 2);
		}
		double sq = Math.sqrt(sum);
		return sq;
	}

	/**.
	 * Loads stop words.
	 *
	 * @return     { description_of_the_return_value }
	 *
	 * @throws     Exception  { exception_description }
	 */
	public List<String> loadStopWords() throws Exception {
		List<String> stopWordsList = new List<String>();
		Scanner scan = new Scanner(new File("stopwords.txt"));
		while(scan.hasNext()) {
			String line = scan.nextLine();
			stopWordsList.add(line);
		}
		return stopWordsList;
	}

	/**.
	 * Removes stop words.
	 *
	 * @param      tokens     The tokens
	 *
	 * @return     { description_of_the_return_value }
	 *
	 * @throws     Exception  { exception_description }
	 */
	public List<String> removeStopWords(String[] tokens) throws Exception {
		List<String> resWords = new List<String>();
		List<String> stopWords = loadStopWords();
		for(String word : tokens) {
			if (!stopWords.contains(word)) {
				resWords.add(word);
			}
		}
		return resWords;
	}
	/**.
	 * { function_description }
	 *
	 * @param      doc        The document
	 *
	 * @return     { description_of_the_return_value }
	 *
	 * @throws     Exception  { exception_description }
	 */
	public Hashtable<String, Integer> count(String doc) throws Exception {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		doc = doc.toLowerCase();
		String token = doc.replaceAll("[^a-zA-Z ]", "");
		String[] tokens = token.split(" ");
		List<String> wrdList = removeStopWords(tokens);
		for (int i = 0;i < wrdList.size(); i++) {
			if (ht.containsKey(wrdList.get(i))) {
				ht.put(wrdList.get(i), ht.get(wrdList.get(i)) + 1);
			} else {
				ht.put(wrdList.get(i), 1);
			}
		}
		return ht;
	}
	/**.
	 * { function_description }
	 *
	 * @param      matrix     The matrix
	 * @param      listFiles  The list files
	 */
	public void print(int[][] matrix, File[] listFiles) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t\t");
		for(int i = 0; i < listFiles.length-1; i++) {
			sb.append(listFiles[i].getName() + "\t");
		}
		sb.append(listFiles[listFiles.length - 1].getName() + "\n");
		for(int i = 0; i < listFiles.length - 1; i++) {
			sb.append(listFiles[i].getName() + "\t");
			for(int k = 0; k < listFiles.length; k++) {
				sb.append(matrix[i][k] + "\t\t");
			}
			sb.append("\n");
		}
		sb.append(listFiles[listFiles.length - 1].getName() + "\t");
		for(int k = 0; k < listFiles.length; k++) {
			sb.append(matrix[listFiles.length - 1][k] + "\t\t");
		}
		System.out.println(sb.toString());
	}
}