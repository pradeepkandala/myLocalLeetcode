package sampleleetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindTheTownJudge997 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**********************BELOW CODE IS WRONG AS OF NOW.**********************
		//AS IT DONOT ADDRESS THE ONE PERSON TRUSTS MULTIPLE ***************aa*********
		
		// my answer is correct and the test case below is wrong submitted but they have issue.
		int[][] trust = {{1,2},{2,3}};
		int found = findJudge(2,trust);
		System.out.println(found);

	}

	public static int findJudge(int n, int[][] trust) {
		int judge = -1;
		Set<Integer> people = new HashSet<>();
		Set<Integer> probableJudge = new HashSet<>();
		
		for(int i=0;i<trust.length;i++) {
			people.add(trust[i][0]);
			probableJudge.add(trust[i][1]);
		}
		
		Iterator<Integer> it = probableJudge.iterator();
		while(it.hasNext()) {
			if(people.contains(it.next()))
					probableJudge.remove(it.next());
		}
		
		
		if(probableJudge.isEmpty())
			return judge;
		
		if(probableJudge.size() > 1)
			return judge;
		
		Iterator<Integer> it2 = probableJudge.iterator();
		while(it2.hasNext()) {
	
			judge = it2.next();
					
		}
		
	
		for (int i = 1; i < trust.length; i++) {
			if (judge != trust[i][1]) {
				return -1;
			}
		}
		for (int j = 0; j < trust.length; j++) {
			if (judge == trust[j][0])
				return -1;
		}

		return judge;
	
	}

}
