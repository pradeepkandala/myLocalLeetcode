package leetcode.medium;

public class GasStation {
    public static void main(String[] args){
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        // int[] gas = {1,2,3,4,5};
        // int[] cost = {3,4,5,1,2};

        int startPosition = canCompleteCircuit(gas,cost);
        System.out.println(startPosition);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int startPosition = 0;
        int actualPosition = 0;

        int tankGas = 0;

        while (startPosition < gas.length && actualPosition < 2 * gas.length) {
            int p = actualPosition % gas.length;

            tankGas += gas[p] - cost[p];

            actualPosition += 1;

            if (tankGas < 0) {
                startPosition = actualPosition;
                tankGas = 0;
            }
        }

        return startPosition >= gas.length ? -1 : startPosition;
    }
}
