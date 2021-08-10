
import java.util. * ;
import java.io. * ;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ISAGSSplitterISASplitter{
/** START SET/GET METHOD, DO NOT MODIFY ***/
	protected int bufferSize = 0;
	protected String inputFilePath = "/Users/abhishekgupta/Documents/vinita/demo/7861495092.I834.DemoChange_20190715_153024.OUT";
	protected String inputDirectory = "/Users/abhishekgupta/Documents/vinita/demo";
	public int getbufferSize() {
		return bufferSize;
	}
	public void setbufferSize(int val) {
		bufferSize = val;
	}
	public String getinputFilePath() {
		return inputFilePath;
	}
	public void setinputFilePath(String val) {
		inputFilePath = val;
	}
	public String getinputDirectory() {
		return inputDirectory;
	}
	public void setinputDirectory(String val) {
		inputDirectory = val;
	}
/** END SET/GET METHOD, DO NOT MODIFY ***/

	public int shift = 0;
	public int tokenCount = 0;
	public InputStream is = null;
	public BufferedReader buf = null;
	public StringBuilder stack = null;
	public BufferedWriter bw = null;
	public String tokenMatchingPattern;
	public String tokenIndexPattern;
	public String edgeCasePattern;
	public String splitToken;
	public ISAGSSplitterISASplitter() {}
	

	public void invoke() throws Exception {


		try {
			is = new FileInputStream(inputFilePath);
			buf = new BufferedReader(new InputStreamReader(is));
			stack = new StringBuilder();

			splitOnToken("ISA");

		}
		catch (Exception e) {
         
		 System.out.println(e);
        }
		finally {
			is.close();
			buf.close();
			bw.close();
			System.gc();
		}
	}

	public void splitOnToken(String token) throws Exception {

		splitToken = token;
		tokenMatchingPattern = "(?s).~\\s" + splitToken + "\\(?s).";
		tokenIndexPattern = "~\\s*" + splitToken + "\\*";
		edgeCasePattern = "~* \n" + splitToken;

		int intValue;
		int count = 0;
		tokenCount = 1;
		bw = new BufferedWriter(new FileWriter(inputDirectory + "EDISplitter" + token + "Split" + tokenCount + ".txt"));

		while ((intValue = buf.read()) != -1) {
			stack.append((char) intValue);
			count++;

			if (count == bufferSize) {
				checkForEdgeCase(stack, buf);
				System.out.println("count=buffer");

				if (stack.toString().matches(tokenMatchingPattern)) {
					System.out.println("token matched pattern");
					//write everything before token to current file
					System.out.println("stack:" + stack.toString());
					System.out.println("tokenIndexPattern:" + RegExUtil.getIndexOf(stack.toString(), tokenIndexPattern));
					bw.write(stack.toString().substring(0, (RegExUtil.getIndexOf(stack.toString(), tokenIndexPattern))+1 ));
					bw.flush();
					// write everything after token to next file
					tokenCount++;
					bw = new BufferedWriter(new FileWriter(inputDirectory + "EDISplitter" + token + "Split" + tokenCount + ".txt"));
					bw.write((stack.toString().substring((RegExUtil.getIndexOf(stack.toString(), tokenIndexPattern) + 1), bufferSize + shift)).replaceAll("^\\s+", ""));

				} else {
					// write to current file
					bw.write(stack.toString());

				}
				bw.flush();
				stack.setLength(0);
				count = 0;
			}
		}
		bw.write(stack.toString());
		bw.flush();
	}

	public void checkForEdgeCase(StringBuilder stack, BufferedReader buf) throws IOException {

		shift = 0;
		String lastChar = stack.toString().substring(stack.toString().length() - 1);

		while ((edgeCasePattern.contains(lastChar)) || (lastChar.trim().length() == 0)) {
			stack.append((char)(buf.read()));
			lastChar = stack.toString().substring(stack.toString().length() - 1);
			shift++;
		}
	}

	public static class RegExUtil {

		static int getIndexOf(String buffer, String regex) {

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(buffer);
			int index = -1;
			if (matcher.find()) {

				index = matcher.start();
			}
			return index;
		}
	}
}