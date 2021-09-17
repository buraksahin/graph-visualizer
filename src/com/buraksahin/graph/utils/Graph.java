package com.buraksahin.graph.utils;

import java.util.ArrayList;
import java.util.List;

public class Graph implements IGraph {

	long lastId = 0;
	long totalVertex = 0;
	long totalEdge = 0;
	List<Vertex> nodes = new ArrayList<Vertex>();

	public void addVertex(String name, String color) {
		nodes.add(new Vertex(String.valueOf(lastId), name, color));
		totalVertex++;
		lastId++;
	}

	@Override
	public void addVertex(Vertex vertex) {
		vertex.setId(String.valueOf(lastId));
		lastId++;
		nodes.add(vertex);
	}

	@Override
	public void removeVertex(String id) {
		int removeVertexIndex = -1;
		
		for(int i = 0; i < nodes.size(); i++) {
			nodes.get(i).removeEdge(id);
			if(nodes.get(i).getId().equals(id)) {
				removeVertexIndex = i;
			}
		}
		
		nodes.remove(removeVertexIndex);
	}

	@Override
	public void addEdge(Vertex from, Vertex to, int weight) {
		for (Vertex v : nodes) {
			if (v.getId().compareTo(from.getId()) == 0) {
				v.addEdge(to, weight);
				totalEdge++;
				break;
			}
		}
	}

	@Override
	public void removeEdge(Vertex from, Vertex to) {
		for(Vertex v : nodes) {
			if(v.getId().compareTo(from.getId()) == 0) {
				v.removeEdge(to.getId());
			}
		}
	}

}
