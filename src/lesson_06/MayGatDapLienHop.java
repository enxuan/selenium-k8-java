package lesson_06;

public class MayGatDapLienHop {

    // What to solve

    public void gatLua(String cayLua) {
        System.out.println("dang gat: " + cayLua);
    }

    public void xayLua(String hatLua) {
        System.out.println("Dang xay: " + hatLua);
    }

    public static void main(String[] args) {
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
        mayGatDapLienHop.gatLua("cay lua");
        mayGatDapLienHop.xayLua("hat lua");
    }
}
