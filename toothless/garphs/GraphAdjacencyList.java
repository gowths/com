package com.toothless.garphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*My first graph program :D:D:D*/

public class GraphAdjacencyList {

	private Map<Integer, List<Integer>> AdjacencyList;

	public GraphAdjacencyList(int number_of_vertices) {

		AdjacencyList = new HashMap<Integer, List<Integer>>();

		for (int i = 1; i <= number_of_vertices; i++) {

			AdjacencyList.put(i, new LinkedList<Integer>());

		}

	}

	public void setEdge(int source, int destination) {

		List<Integer> slist = AdjacencyList.get(source);
		slist.add(destination);
		List<Integer> dlist = AdjacencyList.get(destination);
		dlist.add(source);

	}

	public List<Integer> getEdge(int vertex) {

		List<Integer> templist = AdjacencyList.get(vertex);
		return templist;

	}

}
