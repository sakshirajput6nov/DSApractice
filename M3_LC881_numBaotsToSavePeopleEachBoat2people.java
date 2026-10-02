package monu1;
import java.util.Arrays;
public class M3_LC881_numBaotsToSavePeopleEachBoat2people {
	public static void main(String[]args) {
		int[]people= {1,2,3,2};
		System.out.print("Boats needed are ");
		System.out.println(numRescueBoats(people,3));
	}


    static public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int s=0;
        int e=people.length-1;
        while(s<=e){

            if(people[s]+people[e]<=limit){
                count++;
                s++;
                e--;
            }
            else{
                // end people sit alone 
                count++;
                e--;
            }
        }
        return count;

    }
}