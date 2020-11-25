public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tim Cerdas = new Tim("Cerdas");
        
        //deklarasi member 
        member orang_1 = new member("Nandya", 20);
        member orang_2 = new member ("Budi", 20);
        member orang_3 = new member ("Dea" , 30);
        
        //deklarasi trainer
        
        member orang_4 = new Trainer ("Dito",25, 7);
        member orang_5 = new Trainer ("Citra,",32, 6);
        member orang_6 = new Trainer ("Dina",27, 12);
        
        //menambahkan data 
        Cerdas.addmember(orang_1);
        Cerdas.addmember(orang_2);
        Cerdas.addmember(orang_3);
        Cerdas.addmember(orang_4);
        Cerdas.addmember(orang_5);
        Cerdas.addmember(orang_6);
        
        //output
         Cerdas.displayFullmember();
         Cerdas.displayTrainer();
    }
    
}
