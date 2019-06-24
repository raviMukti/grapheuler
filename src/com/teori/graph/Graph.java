/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teori.graph;

import org.jgrapht.UndirectedGraph;
import org.jgrapht.alg.spanning.KruskalMinimumSpanningTree;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

/**
 *
 * @author ravi
 */
public class Graph {
    private UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
    
    public void addVertex(String name){
        g.addVertex(name);
    }
    
    public void addEdge(String v1, String v2){
        g.addEdge(v2, v1);
    }
    
    public UndirectedGraph<String, DefaultEdge> getGraph(){
        return g;
    }
    
    public void getSpanningTree(){
        KruskalMinimumSpanningTree k = new KruskalMinimumSpanningTree(g);
        System.out.println(k.getSpanningTree().toString());
    }
}
