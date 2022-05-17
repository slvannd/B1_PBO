/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

/**
 *
 * @author MSI Gaming
 */
public class UserJahitan {
    private Jahitan interfaceJahitan;

    public UserJahitan(Jahitan interfaceJahitan) {
        this.interfaceJahitan = interfaceJahitan;
    }

    void tampilkanLabel() {
        this.interfaceJahitan.labelData();
    }

    int pilihanMenu() {
        return this.interfaceJahitan.menuData();
    }

    void tampilkanData() {
        this.interfaceJahitan.showData();
    }

    void aksiKosong() {
        this.interfaceJahitan.aksiKosong();
    }

    void aksiTambah() {
        this.interfaceJahitan.addData();
    }

    void aksiEdit() {
        this.interfaceJahitan.editData();
    }

    void aksiHapus() {
        this.interfaceJahitan.deleteData();
    }
}
