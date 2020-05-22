import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * ArticleStructure class to hold an arraylist of articles and to initialize and construct the BinarySearchTree
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 * all getter/setter methods have O(1)
 */
public class ArticleStructure {


	/**
	 * threshold value
	 */
	public static double threshold;
	/**
	 * creating an array list of articles
	 */
	private ArrayList<Article> articles;
	
	/**
	 * creating a BinarySearchTree object
	 */
	public BinarySearchTree<BSTIndex> tree;
	
	/**
	 * constructor for the articleStructure class
	 */
	public ArticleStructure(){
		this.articles=new ArrayList<Article>();
		ArticleStructure.threshold = 0.00;
		this.tree = new BinarySearchTree<BSTIndex>();
	}
	
	/**
	 * @param hm
	//Methods that takes a hashmap containing documents URL and a list of terms
	//in it and compute the TFIDF of each term. Only keep terms with TFIDF > 0
	 * O(n^3)
	 */
	public void TFIDF(HashMap<String, ArrayList<String>> hm) {
		int articleindex = 0;
		for (String key : hm.keySet())
		{
			Article article = new Article(key);
			articles.add(article);
		}
		for (String key : hm.keySet())
        {
			ArrayList<Reference> refs = new ArrayList<Reference>();
            for (int i = 0; i < hm.get(key).size(); i++)
            {
            	String term = hm.get(key).get(i);
            	double numAppeared = 0;
            	for (String key2 : hm.keySet())
            	{
            		if (hm.get(key2).contains(term)){numAppeared+=1;}
            	}
            	double TF = ((double) Collections.frequency(hm.get(key), term)/ (double) hm.get(key).size());
                double IDF =  0;
                IDF = Math.log((double) hm.size()/numAppeared);
            	double TFIDF = TF * IDF;
            	Reference newref = new Reference(term, TF, IDF, TFIDF);
				if (newref.isAbove()){refs.add(newref);}
            }
            articles.get(articleindex).setRefs(refs);
            articleindex++;
        }
	}
	
	/**
	* creates the BST index based on the TFIDF value.
	* O(n^2 log(n))
	*/
	public void createIndex()
	{
		for (Article article : articles)
		{
			for (Reference reference : article.getRefs()){
				if (reference.isAbove())
				{
					BSTIndex index = new BSTIndex(reference.getTerm());
					if (tree.find(index) == null)
					{
						tree.insert(index);
					}
					else
					{
						ArrayList<String> newarticles = tree.find(index).getArticles();
						newarticles.addAll(index.getArticles());
						tree.find(index).setArticles(newarticles);
					}
				}
			}
		}
	}
	/**
	 * setter for the articles
	 * @param articles
	 */
	public void setArticles(ArrayList<Article> articles)
	{
		this.articles = articles;
	}
	/**
	 * getter for the articles
	 * @return articles
	 */
	public ArrayList<Article> getArticles()
	{
		return this.articles;
	}
	
	/**
	* Inorder traversal of the BST index, prints the terms
	* O(n)
	*/
	public void toInOrderIndex()
	{
		System.out.print(toInOrderIndex(tree.getRoot()));
	}
	/**
	 * Wrapper method for toInOrderIndex
	 * @param node
	 */
	private String toInOrderIndex(BinaryNode<BSTIndex> node)
	{
		String builder = "";
        if (node != null && node.getLeft() == null && node.getRight() == null)
        {
            builder += node.getElement().getTerm();
        }
        else if (node != null && node.getLeft() != null && node.getRight() == null)
        {
            builder += toInOrderIndex(node.getLeft()) + " " + node.getElement().getTerm() + " ";
        }
        else if (node != null && node.getLeft() == null && node.getRight() != null)
        {
            builder += node.getElement().getTerm() + " " + toInOrderIndex(node.getRight()) + " ";
        }
        else if (node != null) 
        {
            builder += toInOrderIndex(node.getLeft()) + " " + node.getElement().getTerm() + 
                    " " + toInOrderIndex(node.getRight());
        }
        return builder;
	}
	
	/**
	* find all the articles associated to keyword, calls the find method of the BST class
	* @param keyword the search key
	* @return the arraylist of articles
	* O(log(n))
	*/
	public ArrayList<String> search(String keyword)
	{
		createIndex();
		BSTIndex search = new BSTIndex(keyword);
		BSTIndex found = tree.find(search);
		if (found != null){return found.getArticles();}
		return null;
	}
	
	/**
	 * @return tree
	 */
	public BinarySearchTree<BSTIndex> getIndex()
	{
		return tree;
	}
	
}
