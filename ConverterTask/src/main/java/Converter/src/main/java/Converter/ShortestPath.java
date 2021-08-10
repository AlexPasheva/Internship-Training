package Converter;

import Converter.common.Pair;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class ShortestPath {
    private static ArrayList<Converter> BFS(ConverterFactory converter, Converter source, Converter destination){
        Map<Pair<Class<?>,Class<?>>, Converter> graph = converter.getSupportedConvertions();
        Deque<Pair<Class<?>,Class<?>>> myQ = new LinkedList<Pair<Class<?>,Class<?>>();
        ArrayList<Converter> pred = new ArrayList<>();
        ArrayList<Integer> dist = new ArrayList<>();
        int size = graph.size();
        LinkedList<Converter> queue = new LinkedList<Converter>();
        boolean visited[] = new boolean[size];

        for (int i = 0; i < size; i++) {
            visited[i] = false;
            dist.set(i, Integer.MAX_VALUE);
            pred.set(i, null);
        }

        visited[graph.]=
    }

    /*private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        ArrayList<Integer> pred = new ArrayList<>();
        ArrayList<Integer> dist = new ArrayList<>();
        int size = adj.size();

        LinkedList<Integer> queue = new LinkedList<Integer>();

        boolean visited[] = new boolean[size];

        for (int i = 0; i < size; i++) {
            visited[i] = false;
            dist.add(Integer.MAX_VALUE);
            pred.add(-1);
        }

        visited[src] = true;
        dist.set(src, 0);
        queue.add(src);

        while (!queue.isEmpty()) {
            int u = queue.remove();
            for (int i = 0; i < adj.get(u).size(); i++) {
                if (!visited[adj.get(u).get(i)]) {
                    visited[adj.get(u).get(i)] = true;
                    dist.set(adj.get(u).get(i), dist.get(u) + 1);
                    pred.set(adj.get(u).get(i), u);
                    queue.add(adj.get(u).get(i));

                    if (adj.get(u).get(i) == dest)
                        return true;
                }
            }
        }
        return false;
    }*/
}
