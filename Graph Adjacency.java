import java.util.*;

public class GraphAdjacencyList {
    public static Map<Integer, List<Integer>> buildAdjList(int[][] pairs) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();

        for (int[] edge : pairs) {
            int u = edge[0];
            int v = edge[1];

            adjList.putIfAbsent(u, new ArrayList<>());
            adjList.get(u).add(v);

            adjList.putIfAbsent(v, new ArrayList<>());
            adjList.get(v).add(u);
        }

        return adjList;
    }

    public static void main(String[] args) {
        int[][] pairs = {
            {0, 1},
            {0, 2},
            {1, 2},
            {2, 3}
        };

        Map<Integer, List<Integer>> adjList = buildAdjList(pairs);

        for (int node : adjList.keySet()) {
            System.out.println(node + " -> " + adjList.get(node));
        }
    }
}
