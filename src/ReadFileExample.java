
import java.io.BufferedReader;
		import java.io.FileReader;
		import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
		

public class ReadFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<String> allWordInAL= new ArrayList<String>();
		 	String word;
		

		  BufferedReader objReader = null;
		  try {
		   String strCurrentLine;

		   objReader = new BufferedReader(new FileReader("C:\\Users\\azoli\\eclipse-workspace\\KataHashtag\\palabras.csv"));
		   
		   
		   
		   while ((strCurrentLine = objReader.readLine()) != null) {
			   
			   //System.out.println(strCurrentLine);
			
			   StringTokenizer st = new StringTokenizer(strCurrentLine);    
			   
			   while (st.hasMoreTokens()) {                                                                                       
			       	//System.out.println(st.nextToken(";"));
			   		word= st.nextToken(";");
			   		allWordInAL.add(word);	
			   		
			   }

		   }
		   System.out.println(allWordInAL);
		   
		   System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		   System.out.println(returnClasification ('@',allWordInAL ));
		   System.out.println("The size of NAMES are: "+returnClasification ('@',allWordInAL ).size());
		   
		   
		   System.out.println("#####################################");
		   System.out.println(returnClasification ('#',allWordInAL ));
		   System.out.println("The size of HASGTAGS are: "+returnClasification ('#',allWordInAL ).size());
		   
		   
		   
		   System.out.println("-------------PLACE----------------");
		   System.out.println(returnLugares ('#','@',allWordInAL ));
		   System.out.println("The PLACES are: "+returnLugares ('#','@',allWordInAL ).size());

		  } catch (IOException e) {

		   e.printStackTrace();

		  } finally {

		   try {
		    if (objReader != null)
		     objReader.close();
		   } catch (IOException ex) {
		    ex.printStackTrace();
		   }
		  } 
		 }
	
	static ArrayList<String> returnClasification (char character,ArrayList<String> allWordInAL ){
		
		ArrayList<String> returnALClasifi = new  ArrayList<String>();
		
		for (int i=0; i<allWordInAL.size(); i++ ) {
			if (allWordInAL.get(i).indexOf(character)==0) {
				returnALClasifi.add(allWordInAL.get(i));
				};
			}
		return returnALClasifi;
		}
	
	static ArrayList<String> returnLugares(char character1,char character2,ArrayList<String> allWordInAL ){
		
		ArrayList<String> returnALClasifi = new  ArrayList<String>();
		
		for (int i=0; i<allWordInAL.size(); i++ ) {
			if (allWordInAL.get(i).indexOf(character1)!=0 && allWordInAL.get(i).indexOf(character2)!=0 ) {
				returnALClasifi.add(allWordInAL.get(i));
				}
			}
		return returnALClasifi;
		
		
		}
	
	static void findHastag(String hastTags,ArrayList<String> listHastags ){
		boolean findTrueFalse= false;
		int index=0;
		
		while (findTrueFalse < false && index < listHastags.size()) {
		  System.out.println("The word is in the hastTagsList: ");
		  i++;
		}

		
		}
	
	
	
}
	

