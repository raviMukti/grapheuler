//1. Buat Vertex/Node
//2. Buat Edge/Simpul antar Node
//3. Tentukan apakah Graph Euler atau Tidak?
//4. Jika Iya, tampilkan Path atau jalur Euler
package com.teori.graph;

import java.util.Scanner;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

/**
 *
 * @author ravi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x;
        Scanner sc = new Scanner(System.in);
        Graph graphBaru = new Graph();
        System.out.println("Masukan Jumlah Node");
        int jumlahVertex = sc.nextInt();
        
        for (int i = 0; i < jumlahVertex; i++) {
            System.out.println("Masukan Item Node "+i);
            graphBaru.addVertex(sc.next());
        }
        
        do {            
            System.out.println("Masukan Simpul ");
            String e1 = sc.next();
            String e2 = sc.next();
            graphBaru.addEdge(e1, e2);
            System.out.println("Lanjutkan????? 1 Untuk Lanjutkan, 0 Untuk Batal");
            x=sc.nextInt();
        } while (x==1);
        
        System.out.println("Graph\n"+graphBaru.getGraph().toString());
        System.out.println("\\n\\n**********Spanning Tree*********");
        graphBaru.getSpanningTree();
    }
    
}
