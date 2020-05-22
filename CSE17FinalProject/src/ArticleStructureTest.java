import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import student.TestCase;

/**
 * Testing for the ArticleStructure class
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 * all getter/setter methods have O(1)
 */
public class ArticleStructureTest extends TestCase{

	ArticleStructure aS1;
	FilesParser fp;
	File folder;
	HashMap<String, ArrayList<String>> hm;
	/**
	 * set up for the testing
	 */
	public void setUp() throws Exception {
		aS1 = new ArticleStructure();
		fp = new FilesParser();
		folder = new File(
	            "C:\\Users\\elloc_000\\Documents\\CSE17Project");
		fp.parse(folder);
		hm = fp.getContent();
	}
	/**
	 * testing for TFIDF method
	 */
	public void testTFIDF() {
		aS1.TFIDF(hm);
		Reference refs = aS1.getArticles().get(0).getRefs().get(0);
		assertEquals(0.050683139, refs.getTFIDF(), 0.01);
	}
	
	/**
	 * testing for the createIndex method
	 */
	public void testCreateIndex()
	{
		aS1.createIndex();
		assertNotNull(aS1.tree);
	}
	
	/**
	 * testing for the setArticles method
	 */
	public void testSetArticles()
	{
		ArrayList<Article> newArticles=new ArrayList<Article>();
		aS1.setArticles(newArticles);
		assertEquals(newArticles, aS1.getArticles());
	}
	/**
	 * testing for the getArticles method
	 */
	public void testGetArticles()
	{
		ArrayList<Article> newArticles=new ArrayList<Article>();
		aS1.setArticles(newArticles);
		assertEquals(newArticles, aS1.getArticles());
	}
	
	/**
	 * testing for the toInOrderIndex method
	 */
	public void testToInOrderIndex()
	{	
		aS1.TFIDF(hm);
		aS1.createIndex();
		aS1.toInOrderIndex();
		assertTrue(systemOut().getHistory()
                .contains("A Hate  Hello Hi Howdy I Logan Love No Please Thanks   We Yes You"));
	}
	
	/**
	 * testing for the search method
	 */
	public void testSearch()
	{
		aS1.TFIDF(hm);
		aS1.createIndex();
		assertNotNull(aS1.search("Logan"));
	}
	
}
