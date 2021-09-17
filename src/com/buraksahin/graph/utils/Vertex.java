package com.buraksahin.graph.utils;

import java.util.HashMap;

public class Vertex {
	private String id;
	private String name;
	private String color = "white";
	private HashMap<String, Integer> edges = new HashMap<String, Integer>();
	
	

	public Vertex(String id, String name, String color, HashMap<String, Integer> edges) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.edges = edges;
	}

	public Vertex(String id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	
	public Vertex(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public HashMap<String, Integer> getEdges() {
		return edges;
	}

	public void setEdges(HashMap<String, Integer> edges) {
		this.edges = edges;
	}
	
	public void addEdge(Vertex vertex, int weight) {
		if(!edges.containsKey(vertex.getId())) {
			edges.put(vertex.getId(), weight);
		}
	}
	
	public void removeEdge(Vertex vertex) {
		if(edges.containsKey(vertex.getId())) {
			edges.remove(vertex.getId());
		}
	}
	
	public void removeEdge(String id) {
		if(edges.containsKey(id)) {
			edges.remove(id);
		}
	}
}