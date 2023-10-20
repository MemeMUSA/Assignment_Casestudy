public class Driver {
    public static void main(String[]args){
        Management management = new Management();
        Product p1 = new Product(1200,"LAPTAP",200,2,ProductEnum.ELECTRONIC);
        Seat p2 = new Seat(1400,"Chair",100,20,ProductEnum.FURNITURE,"copper","2by2",2000);
        Laptop p3 = new Laptop(200000,"Lapi",20000,20,ProductEnum.ELECTRONIC,"High",new Date(2,3,2002),"Dualcore","2by2",4);
        Table p4 = new Table(20000,"TAAble",200,40,ProductEnum.FURNITURE,"Metal","4by4","REC");
        Product p5 = new Product(1200,"LAP",20,244,ProductEnum.ELECTRONIC);
        management.addProduct(p1);
        management.addProduct(p2);
        management.addProduct(p3);
        management.addProduct(p4);
        management.removeProduct(2);
        management.updateProduct(4,p5);
        management.getDetail();

    }
}

