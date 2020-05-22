import java.util.ArrayList;

/**
 * Article class to hold the file name and an arraylist of references.
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 * all getter/setter methods have O(1)
 */
public class Article {
	private String fileName;
	private ArrayList<Reference> refs;
	
	/**
	 * constructor for the Article class
	 * @param fileName
	 */
	public Article(String fileName)
	{
		this.fileName = fileName;
		this.refs = new ArrayList<Reference>();
	}
	/**
	 * setter for the fileName
	 * @param fileName
	 */
	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
	/**
	 * getter for the fileName
	 * @return fileName
	 */
	public String getFileName()
	{
		return this.fileName;
	}
	/**
	 * setter for the refs
	 * @param refs
	 */
	public void setRefs(ArrayList<Reference> refs)
	{
		this.refs = refs;
	}
	/**
	 * getter for the refs
	 * @return refs
	 */
	public ArrayList<Reference> getRefs()
	{
		return this.refs;
	}
	
	
}
