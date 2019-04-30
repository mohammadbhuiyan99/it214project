package helloworld;
import java.util.*;

public class Poem {

	static String [] happylist = {"I woke up with a smile upon my face", "The morning has begun and I am awake", 
			                      "You were always there at my side", "Even when I was alone, and I cried,", "A single day is never long enough", 
			                       "Love is more than a single puff", "The world feels yellow, and orange", "Looking at you through a curtain of straight black hair"};
	static String [] sadlist = {"Hurt and pain", "There's much to gain.", "Peace and love.", "It's all the same.",
			                    "She smiles, I cry.", "She is outgoing, I am shy.", "She loves, I am alone.", "She is amazing, I am unknown.",
			                    "Who am I?", "You think you know...", "Behind this mask of a ", "smile is a desperate heart"}; 
	static String [] angrylist = {"My couch is a wasteland,", "Pulls me down, I cannot stand.", "It scares me that I’m drawn to gore,", "I see destruction, I want more.", 
								"I don’t know if its anger,", "Or if it’s something stranger.", "I want to shatter glass", "I need to make this feeling pass.", "I want to throw things and scream,"}; 
	static String [] nervouslist = {"a body filled with familiar dread", "you might say my body is already dead", "my head is said to be quite fretful", "took moments of quietude for granted;", 
			                        "and now i’m constantly regretful", "the restlessness of my emotions", "address my state of mind", "like a broken clock", "and my only wish is for all of this to stop"}; 
	static String [] excitedlist = {"The taste of bitter toxicity", "The feel of obsidian", "The sound of inhalation", "The excitement of exhalation", "Heart racing and it begins", "Butterflies start to dance", 
									"Rushing flow of ecstasy", "giddiness embracing", "Heart compressing", "Stampede of hysteria" };
	static String [] infatuatedlist = {"If you were my rose, then I'd be your sun,", "painting you rainbows when the rains come.", "I'd change my orbit to banish the night,", "as to keep you in my nurturing light.", 
										"If you were my world, then I'd be your moon,", "your silent protector, a night-light in the gloom.", "Our fates intertwined, two bodies in motion",
										"through time and space, our dance of devotion.", "If you were my island, then I'd be your sea,", "caressing your shores, soft and gentle I'd be."};
	static String [] contentlist = {"How do I mend a broken heart?", "My entire world has fallen apart.", "How do I find hope in a brand new day,", "when the one I love has gone away?", "My mind overflows with memories of you,", "of all that we've shared, all that we knew."};
	
	static Random rand = new Random();
	
	/* parameters a list of words 'list' is given
	   returns a random word from the list of words
	*/
	static String word(String [] list) {
		
		//s is a random number in the range is from 0 to n-1
		int s = rand.nextInt(list.length);
		
	  //print the s-th word from the list of words
		 return list[s] + " ";
	}
	
	//returns a random verb from hapylist
		static String happy() {
				return word(happylist);
		}
		
		static String sad() {
			return word(sadlist);
	}
		static String angry() {
			return word(angrylist);
	}
		static String nervous() {
			return word(nervouslist);
	}
		static String excited() {
			return word(excitedlist);
	}
		static String infatuated() {
			return word(infatuatedlist);
	}
		static String content() {
			return word(contentlist);
	}
		
		static void printPoem() {
			System.out.println(happy() + "\n" + sad() + "\n" + angry() + "\n" +nervous() + "\n" +excited() + "\n" +infatuated() + "\n" +content());
		}
		//generate a stanza
		static void  stanza() {
			int i=0; 
		
			while (i<2) {
				printPoem();
				i++;
			}
			System.out.println();
		}
		

		public static void main (String args[]) {

			stanza();		
		}

}
