package mecanique;

public class Main {
           public static void main(String[] args) {
        	   System.out.println("test de combat entre k12 et alpha3 \n");
        	   Arena academie=new Arena();
        	   Robot kinles=new Robot("_k12",10);
        	   Robot andreas=new Robot("_alpha3",10);
        	   
        	   academie.fight(kinles, andreas);
           }
}
