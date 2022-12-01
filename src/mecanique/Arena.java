package mecanique;

public class Arena {
         public Robot fight(Robot rob1,Robot rob2){
        	 do {
        		 rob1.fire(rob2,rob1);
        		 rob2.fire(rob1,rob2);
        		 
        		 rob1.setNbrvie1(rob1.nbrvie);
        		 rob2.setNbrvie1(rob2.nbrvie);
        		 
        		 rob1.isDead(rob1);
        		 rob2.isDead(rob2);
        	 } while(rob1.nbrvie>0 && rob2.nbrvie>0);
        	 
        	 if(rob1.nbrvie>0) {
        		 return rob1;
        	 }
        	 else {
        		 return rob2;
        	 }
        	 
         }
         
}
