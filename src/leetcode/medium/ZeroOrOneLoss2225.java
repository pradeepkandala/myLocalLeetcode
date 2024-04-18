package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class ZeroOrOneLoss2225 {

	public static void main(String[] args) {
		int[][] matches = new int[][] { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 },
				{ 10, 4 }, { 10, 9 } };
		//System.out.println(matches.length);

		List<List<Integer>> winnersAndRunners = findWinners(matches);

		for (int i = 0; i < winnersAndRunners.get(0).size(); i++) {
			System.out.println(winnersAndRunners.get(0).get(i));
		}
		
		for (int i = 0; i < winnersAndRunners.get(1).size(); i++) {
			System.out.println(winnersAndRunners.get(1).get(i));
		}

	}

	public static List<List<Integer>> findWinners(int[][] matches) {
		Set<Integer> winnersSet = new HashSet<>();

        Map<Integer, Integer> runnersCount = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {

            winnersSet.add(matches[i][0]);
            
            runnersCount.compute(matches[i][1], (key, value) -> (value == null) ? 1 : value + 1);
/*            if (runnersCount.containsKey(matches[i][1])) {
                int value = runnersCount.get(matches[i][1]);
                runnersCount.put(matches[i][1], value + 1);

            } else
                runnersCount.putIfAbsent(matches[i][1], 1);*/

        }

        List<Integer> runners = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : runnersCount.entrySet()) {

            if (entry.getValue() == 1) {
                runners.add(entry.getKey());
            }  
            	System.out.println("removing object :" + entry.getKey());
                winnersSet.remove(entry.getKey());
            

        }
        List<Integer> winners = new ArrayList<>(winnersSet);

        Collections.sort(runners);
        List<List<Integer>> winningPlayers = new ArrayList<>();

        winningPlayers.add(winners);
        winningPlayers.add(runners);

        return winningPlayers;
	}

}
