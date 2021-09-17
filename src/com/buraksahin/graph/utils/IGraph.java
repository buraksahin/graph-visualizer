package com.buraksahin.graph.utils;

public interface IGraph {
	public void addVertex(Vertex vertex);

	public void removeVertex(String id);

	void addEdge(Vertex from, Vertex to, int weight);

	public void removeEdge(Vertex from, Vertex to);
}