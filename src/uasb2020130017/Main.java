/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasb2020130017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Jonathan Krisna - 2020130017
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static GraphList g = new GraphList("JB", new Data("Jawa Barat", "Nasi Timbel", 25000, 12000, "Mie Kocok", 28000, 13000));
    static Scanner scn = new Scanner(System.in);
    static ArrayList<Inventory> inventory;
    static int uang, plc;
    
    public static void main(String[] args) {
        g.addVertex("AC", new Data("Aceh", "Kuah Masam Keu-eung", 120000, 50000, "Kuah Pliek U", 25000, 10000));
        g.addVertex("SU", new Data("Sumatra Utara", "Dali Ni Horbo", 25000, 9000, "Ayam Napinadar", 230000, 100000));
        g.addVertex("SB", new Data("Sumatra Barat", "Nasi Rendang", 22000, 10000, "Sate Padang", 20000, 10000));
        g.addVertex("SS", new Data("Sumatra Selatan", "Empek-Empek", 40000, 18000, "Kue Ragit", 15000, 8000));
        g.addVertex("BB", new Data("Bangka Belitung", "Lempah Kuning", 45000, 20000, "Mie Bangka", 35000, 15000));
        g.addVertex("BE", new Data("Bengkulu", "Pendap", 25000, 10000, "Lema Tongkol", 40000, 15000));
        g.addVertex("JA", new Data("Jambi", "Nasi Gemuk", 28000, 12000, "Gulai Tepek Ikan", 15000, 6000));
        g.addVertex("LA", new Data("Lampung", "Seruit", 55000, 25000, "Lapis Legit", 350000, 200000));
        g.addVertex("RI", new Data("Riau", "Roti Canai", 20000, 8000, "Terasi Belacan", 25000, 10000));
        g.addVertex("KR", new Data("Kepulauan Riau", "Otak-Otak", 45000, 20000,"Mie Lendir", 10000, 4000));
        
        g.addVertex("JK", new Data("DKI Jakarta", "Kerak Telor", 24000, 10000, "Roti Buaya", 520000, 200000));
        g.addVertex("JT", new Data("Jawa Tengah", "Lumpia Semarang", 120000, 50000, "Soto Kudus", 50000, 20000));
        g.addVertex("JI", new Data("Jawa Timur", "Rawon", 24000, 10000, "Rujak Petis", 15000, 7000));
        g.addVertex("BT", new Data("Banten", "Sate Bandeng", 38000, 16000, "Rabeg", 14000, 8000));
        g.addVertex("YO", new Data("DIY Yogyakarta", "Gudeg", 20000, 9000, "Bakpia", 72000, 30000));
        g.addVertex("BA", new Data("Bali", "Ayam Betutu", 85000, 40000, "Sate Lilit", 23000, 11000));
        g.addVertex("NB", new Data("Nusa Tenggara Barat", "Ayam Taliwang", 42000, 20000, "Nasi Balap Puyung", 15000, 7000));
        g.addVertex("NT", new Data("Nusa Tenggara Timur", "Kue Rambut", 25000, 11000, "Rumpu-Rampe", 5000, 2000));
       
        g.addVertex("KU", new Data("Kalimantan Utara", "Arsi Ikan Mas", 110000, 50000, "Apam Barabai", 10000, 4000));
        g.addVertex("KT", new Data("Kalimantan Tengah", "Wadi", 45000, 20000, "Bangamat", 35000, 22000));
        g.addVertex("KB", new Data("Kalimantan Barat", "Mie Sagu", 55000, 25000, "Bubur Pedas", 25000, 10000));
        g.addVertex("KS", new Data("Kalimantan Selatan", "Soto Banjar", 24000, 10000, "Nasi Itik Gambut", 75000, 30000));
        g.addVertex("KI", new Data("Kalimantan Timur", "Ayam Cincane", 58000, 30000, "Nasi Bekepor", 30000, 12000));
        
        g.addVertex("SA", new Data("Sulawesi Utara", "Tinutuan", 25000, 10000, "Kawok Tikus", 12000, 4000));
        g.addVertex("SR", new Data("Sulawesi Barat", "Ikan Terbang", 188000, 100000, "Golla Kambu", 10000, 3500));
        g.addVertex("ST", new Data("Sulawesi Tengah", "Palumara", 70000, 30000, "Uta Dada", 17000, 7500));
        g.addVertex("SG", new Data("Sulawesi Tenggara", "Lapa-Lapa", 15000, 7000, "Kasoami", 10000, 4000));
        g.addVertex("SN", new Data("Sulawesi Selatan", "Coto Makassar", 32000, 20000, "Kapurung", 15000, 6000));
        g.addVertex("GO", new Data("Gorontalo", "Binte Biluhuta", 10000, 4500, "Ilabulo", 3000, 1000));
        
        g.addVertex("MA", new Data("Maluku", "Nasi Lapola", 7000, 3000, "Ikan Komu Asar", 65000, 40000));
        g.addVertex("MU", new Data("Maluku Utara", "Gohu Ikan", 30000, 12500, "Papeda", 12000, 7000));
        g.addVertex("PA", new Data("Papua", "Ikan Bungkus", 60000, 28000, "Aunu Senebre", 25000, 10000));
        g.addVertex("PB", new Data("Papua Barat", "Papeda Papua Barat", 40000, 22000, "Ulat Sagu", 30000, 10000));
        

        g.addEdge("BT", "LA", 270);
        g.addEdge("JB", "JT", 440);
        g.addEdge("JB", "BT", 220);
        g.addEdge("JB", "JK", 150);
        g.addEdge("JK", "BB", 725);
        g.addEdge("JK", "KT", 1400);
        g.addEdge("JT", "JI", 780);
        g.addEdge("JT", "SN", 1180);
        g.addEdge("YO", "JT", 130);
        g.addEdge("JI", "BA", 430);
        g.addEdge("JI", "MA", 1965);
        g.addEdge("BA", "NB", 140);
        g.addEdge("NB", "SG", 1835);
        g.addEdge("NB", "NT", 1490);
        g.addEdge("NT", "MA", 1750);
        g.addEdge("NT", "PA", 4050);
        
        g.addEdge("AC", "SU", 600);
        g.addEdge("SU", "RI", 650);
        g.addEdge("SU", "SB", 770);
        g.addEdge("SB", "RI", 315);
        g.addEdge("SB", "BE", 530);
        g.addEdge("SB", "JA", 520);
        g.addEdge("RI", "JA", 415);
        g.addEdge("KR", "RI", 465);
        g.addEdge("JA", "SS", 280);
        g.addEdge("JA", "BE", 450);
        g.addEdge("BE", "SS", 450);
        g.addEdge("BE", "LA", 600);
        g.addEdge("SS", "LA", 240);
        g.addEdge("SS", "BB", 275);
        g.addEdge("BB", "KB", 430);
        
        g.addEdge("KU", "GO", 690);
        g.addEdge("KB", "KT", 1030);
        g.addEdge("KT", "KI", 700);
        g.addEdge("KT", "KS", 200);
        g.addEdge("KS", "KI", 570);
        g.addEdge("KS", "SR", 620);
        g.addEdge("KI", "KU", 580);
        g.addEdge("KI", "ST", 500);
        
        g.addEdge("SA", "MU", 320);
        g.addEdge("SA", "GO", 410);
        g.addEdge("GO", "ST", 600);
        g.addEdge("ST", "SR", 410);
        g.addEdge("ST", "MU", 980);
        g.addEdge("SR", "SN", 420);
        g.addEdge("SN", "SG", 365);
        g.addEdge("SG", "MA", 820);
        
        g.addEdge("MU", "MA", 625);
        g.addEdge("MU", "PB", 1030);
        g.addEdge("MA", "PB", 730);
        g.addEdge("PB", "PA", 825);

        int pil = 0;
        do {
            System.out.println("\nMENU UTAMA");
            System.out.println("1. Lihat Peta");
            System.out.println("2. BFS");
            System.out.println("3. DFS");
            System.out.println("4. Simulasi");
            System.out.println("0. Keluar\n");

            System.out.print("Pilihan: ");

            scn = new Scanner(System.in);
            pil = scn.nextInt();

            System.out.println("");

            switch (pil) {
                case 1:
                    g.print();
                    break;
                case 2:
                case 3:
                    input1(pil);
                    break;
                case 4:
                    simulasi();
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan salah");
            }
        } while (pil > 0);
    }
    
    public static void input1(int pil){
        System.out.println("Pilihan input yang dapat menjadi provinsi awal: ");
        for(int i = 0; i<g.dt.size();i++){
            System.out.println(i+". "+g.dt.get(i)+" "+g.vtx.get(i).toString());
        }
        System.out.print("Pilihan: ");
        scn = new Scanner(System.in);
        int pil2 = scn.nextInt();
        System.out.println("");
        if(pil2>=0 && pil2< g.dt.size()){
            if(pil == 2) g.BFS(g.dt.get(pil2));
            else g.DFS(g.dt.get(pil2));
        }
    }
    
    public static void simulasi(){
        plc = 0;
        int a;
        inventory = new ArrayList<>();
        
        System.out.println("Pilihan posisi awal: ");
        for(int i = 0; i<g.dt.size();i++){
            System.out.println(i+". "+g.dt.get(i)+" "+g.vtx.get(i).toString());
        }
        
        do{
            System.out.print("Pilihan angka posisi awal: ");
            scn = new Scanner(System.in);
            plc = scn.nextInt();
        } while (plc < 0 || plc > g.dt.size());
        
        System.out.println("");
        
        do{
            System.out.print("Uang awal player (disarankan diatas 1jt) : ");
            scn = new Scanner(System.in);
            uang = scn.nextInt();
        } while (uang < 0);
        
        do{
            System.out.println("\nAnda sekarang berada di provinsi " + g.vtx.get(plc).getProvinsi()
                + " dengan kuliner lokal "+g.vtx.get(plc).getBarang1().getNama()+" dan "+g.vtx.get(plc).getBarang2().getNama());
            System.out.println("Uang anda: "+uang);
            System.out.println("\nPilih aksi: ");
            System.out.println("1. Beli");
            System.out.println("2. Jual");
            System.out.println("3. Pindah Kota");
            System.out.println("0. Keluar Simulasi");
            
            System.out.print("Pilihan: ");
            scn = new Scanner(System.in);
            a = scn.nextInt();
            
            System.out.println("");
            switch(a){
                case 0:
                    break;
                case 1: 
                    beli();
                    break;
                case 2:
                    jual();
                    break;
                case 3:
                    pindah();
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan salah");
            }
        } while (a>0);
    }
    
    public static void beli(){
        int aa, j;
        Barang tmp1 = g.vtx.get(plc).getBarang1();
        Barang tmp2 = g.vtx.get(plc).getBarang2();
        
        System.out.println("Daftar kuliner yang dapat dibeli: ");
        System.out.println("1. "+tmp1.toString()+"\n");
        System.out.println("2. "+tmp2.toString()+"\n");
        
        do{
            System.out.print("Pilihan (ketik 0 untuk batal): ");
            scn = new Scanner(System.in);
            aa = scn.nextInt();
            
            switch(aa){
                case 0:
                    break;
                case 1:
                    cek(tmp1);
                    aa = 0;
                    break;
                case 2:
                    cek(tmp2);
                    aa = 0;
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid");
            }
        } while(aa > 0);
    }
    
    public static void cek(Barang tmp){
        System.out.print("Jumlah pembelian: ");
        scn = new Scanner(System.in);
        int j = scn.nextInt();
        int harga = tmp.getHarga();
        boolean ada = false;
        
        
        if(uang < (j*harga)) {
            System.out.println("Uang anda tidak mencukupi untuk membeli "
                + tmp.getNama()+ " dengan jumlah "+j);
        }
        else {
            System.out.println("Transaksi berhasil dilakukan!");
            uang -= (j*harga);
            if(inventory.isEmpty()) {
                inventory.add(new Inventory(tmp, plc, j)); 
                return;
            }
            
            for (Inventory inventory1 : inventory){
                if(tmp == inventory1.getBarang()) {
                    inventory1.updateJumlah(j, '+');
                    ada = true;
                    return;
                }
            }
            
            if(!ada) inventory.add(new Inventory(tmp, plc, j));
        }
    }
    
    public static void jual(){
        if(!list()) return;
        
        int aa,j;
        do{
            System.out.print("Pilihan barang yang ingin dijual (ketik 0 untuk batal): ");
            scn = new Scanner(System.in);
            aa = scn.nextInt();
        } while(aa < 0 || aa > inventory.size());
        aa -= 1;
        if(aa == -1) return;
        
        Barang tmp = inventory.get(aa).getBarang();
        
        do{
            System.out.print("Jumlah masakan "+tmp.getNama()+" yang ingin dijual (ketik 0 untuk batal): ");
            scn = new Scanner(System.in);
            j = scn.nextInt();
            if(j > 0 && j <= inventory.get(aa).getJumlah()){
                System.out.println("Masakan "+tmp.getNama()+" berhasil dijual sebanyak "+j);
                int untung = (tmp.getHarga()+kal(tmp, aa)) * j;
                uang += untung;
                System.out.println("Keuntungan yang anda peroleh: "+untung);
                
                if(j < inventory.get(aa).getJumlah()) inventory.get(aa).updateJumlah(j, '-');
                else if(j == inventory.get(aa).getJumlah()) inventory.remove(aa);
                
                j = 0;
            } else {
                System.out.println("Jumlah yang anda inputkan tidak valid!");
                j = -1;
            }
        } while (j != 0);
    }
    
    public static boolean list(){
        if(inventory.isEmpty()) {
            System.out.println("Anda belum memiliki barang di inventory");
            return false;
        }
        System.out.println("Barang yang ada di inventory anda: \n");
        int ut;
        for(int i = 0; i < inventory.size(); i++){
            Barang tmp = inventory.get(i).getBarang();
            
            ut = kal(tmp,i);
            
            System.out.println((i+1)+". "+tmp.getNama()+"\nHarga Beli: "+
                tmp.getHarga()+"\nJumlah: "+inventory.get(i).getJumlah()+
                "\nKeuntungan dasar: "+tmp.getUntung() + "\nKeuntungan total: " +(ut)
                +"\nHarga Jual: "+(tmp.getHarga()+ut)
                +"\nProvinsi Asal: "+g.vtx.get(inventory.get(i).getAsal()).getProvinsi()
                +"\n");
        }
        System.out.println("Cat 1: Keuntungan total dikalkulasi berdasarkan "
                + "seberapa jauh kuliner tersebut dari provinsi asalnya "
                + "(semakin jauh maka akan semakin mahal)");
        
        System.out.println("Cat 2: Barang yang dibeli di kota yang sama akan dijual dengan "
                + "harga 30% dari harga aslinya\n");
        
        return true;
    }
    
    public static int kal(Barang tmp, int i){
        int ut;
        int jauh = g.level(g.dt.get(inventory.get(i).getAsal()), g.dt.get(plc));
        if(jauh <= 0) ut = (int) -(tmp.getHarga() * 0.7);
        else ut = tmp.getUntung() * jauh;
        
        return ut;
    }
    
    public static void pindah(){
        int q;
        
        System.out.println("Pilih provinsi tujuan: (ketik 0 untuk batal)");
        
        for(int i = 0; i<g.adj.get(plc).size();i++){
            int tmp = g.adj.get(plc).get(i).getNo();
            System.out.println((i+1)+". "+g.vtx.get(tmp).toString()+" "+
                    g.adj.get(plc).get(i).getJarak());
        }
            
        do{
            System.out.print("Pilihan destinasi: ");
            scn = new Scanner(System.in);
            q = scn.nextInt() - 1;
            
            if (q < 0) return;
            else if(q >= 0 && q < g.dt.size()){
                int biaya = g.adj.get(plc).get(q).getJarak() * 1000;
                System.out.println("Perjalanan ini akan memakan biaya "+
                        biaya);
                System.out.print("Apakah anda yakin? (Y/N): ");
                scn = new Scanner(System.in);
                String pil = scn.nextLine();
                if(pil.equalsIgnoreCase("y")) {
                    if(uang < biaya) System.out.println("Maaf, uang anda tidak mencukupi\n");
                    else{
                        plc = g.adj.get(plc).get(q).getNo();
                        q = -1;
                        uang -= biaya;
                        System.out.println("Anda berhasil pindah ke "+g.vtx.get(plc).toString());
                    }
                }else if(pil.equalsIgnoreCase("n")) System.out.println("");
                else{
                    System.out.println("Pilihan yang anda masukkan salah!\n");
                }
            } 
        } while(q >= 0);

    }
}

class Barang{
    String nama;
    int harga, untung;
    
    public Barang(String n, int h, int u){
        nama = n;
        harga = h;
        untung = u;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getUntung() {
        return untung;
    }

    public void setUntung(int untung) {
        this.untung = untung;
    }
    
    @Override
    public String toString(){
        String tmp = String.format("%s\nHarga: %s\nKeuntungan: %s", 
                getNama(), getHarga(), getUntung());
        return (tmp);
    }
    
}

class Data{
    String provinsi;
    Barang barang1, barang2;
    
    public Data(String p, String n1, int h1, int u1, String n2, int h2, int u2){
        provinsi = p;
        barang1 = new Barang(n1, h1, u1);
        barang2 = new Barang(n2, h2, u2);
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Barang getBarang1() {
        return barang1;
    }

    public void setBarang1(Barang barang1) {
        this.barang1 = barang1;
    }

    public Barang getBarang2() {
        return barang2;
    }

    public void setBarang2(Barang barang2) {
        this.barang2 = barang2;
    }
    
    @Override
    public String toString(){
        String tmp = String.format("%20s (%s%20s)", getProvinsi(),
                getBarang1().getNama(), getBarang2().getNama());
        return (tmp);
    }
}

class Jalur{
    int jarak;
    int no;
    
    public Jalur(int no, int jarak) {
        this.no = no;
        this.jarak = jarak;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}

class Inventory{
    Barang barang;
    int asal, jumlah;
    
    public Inventory(){
        
    }
    
    public Inventory(Barang b, int a, int j){
        barang = b;
        asal = a;
        jumlah = j;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public int getAsal() {
        return asal;
    }

    public void setAsal(int asal) {
        this.asal = asal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public void updateJumlah(int update, char simbol){
        if (simbol == '+') jumlah += update;
        else if (simbol == '-') jumlah -= update;
    }
}

class GraphList{
    ArrayList<Data> vtx = new ArrayList<>();
    ArrayList<String> dt = new ArrayList<>();
    ArrayList<ArrayList<Jalur>> adj = new ArrayList<>();
    
    public GraphList(String p, Data d){
        addVertex(p,d);
    }
    
    public void addVertex(String p, Data d){
        dt.add(p);
        vtx.add(d);
        adj.add(new ArrayList<>());
    }
    
    public void addEdge(String s, String d, int j){
        int p1 = dt.indexOf(s);
        int p2 = dt.indexOf(d);
        adj.get(p1).add(new Jalur(p2, j));
        adj.get(p2).add(new Jalur(p1, j));
    }
    
    public boolean isEdge(String a, String b){
        int p1 = dt.indexOf(a);
        int p2 = dt.indexOf(b);

        int i = 0;
        boolean found = false;
        while (i < adj.get(i).size() && !found) {
            if (adj.get(p1).get(i).getNo() == p2) {
                found = true;
            }
            i++;
        }
        return found;
    }
    
    public void print(){
        for(int i = 0; i < adj.size(); i++){
            System.out.println("\nAdjacency list of vertex "+ vtx.get(i).toString());
            System.out.print("Head "+i);
            
            for(int j = 0; j<adj.get(i).size();j++){
                System.out.print(" -> " + vtx.get(adj.get(i).get(j).getNo()).toString()
                    +" "+adj.get(i).get(j).getJarak());
            }
            System.out.println("");
        }
    }
    
    public void BFS(String s){
        boolean visited[] = new boolean[vtx.size()];
        Queue<Integer> queue = new LinkedList<>();
        
        int p1 = dt.indexOf(s);
        visited[p1] = true;
        queue.add(p1);
        
        while(!queue.isEmpty()){
            p1 = queue.poll();
            System.out.println(vtx.get(p1).toString());

            Iterator<Jalur> i = adj.get(p1).listIterator();
            while(i.hasNext()){
                int n = i.next().getNo();
                
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println("");
    }
    
    public void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.println(vtx.get(v).toString());
        
        Iterator<Jalur> i = adj.get(v).listIterator();
        while(i.hasNext()){
            int n = i.next().getNo();
            if(!visited[n]) DFSUtil(n, visited);
        }
    }
    
    public void DFS(String v){
        boolean visited[] = new boolean[vtx.size()];
        int p = dt.indexOf(v);
        DFSUtil(p, visited);
        System.out.println("");
    }
    
    public int level(String s, String d){
        int lvl = 0, root = 1;
        
        boolean visited[] = new boolean[vtx.size()];
        Queue<Integer> queue = new LinkedList<>();

        int p1 = dt.indexOf(s);
        int p2 = dt.indexOf(d);
        visited[p1] = true;
        queue.add(p1);
        
        while (!queue.isEmpty()) {
            p1 = queue.poll();
            if(p1 == p2) return lvl;

            Iterator<Jalur> i = adj.get(p1).listIterator();
            while (i.hasNext()) {
                int n = i.next().getNo();
                //System.out.println(n);
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
            root--;
            if(root<=0){
                root = queue.size();
                lvl++;
            }
        }
        return -1;
    }
}